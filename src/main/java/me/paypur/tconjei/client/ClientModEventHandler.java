package me.paypur.tconjei.client;

import com.mojang.logging.LogUtils;
import me.paypur.tconjei.ColorProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterClientReloadListenersEvent;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static me.paypur.tconjei.TConJEI.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventHandler {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        File folder = new File("resourcepacks");
        File copy = new File(folder, "tconjeidark.zip");

        try {
            Files.createDirectories(folder.toPath());
            ResourceLocation resource = ResourceLocation.fromNamespaceAndPath(MOD_ID, "tconjeidark.zip");
            try (InputStream in = Minecraft.getInstance().getResourceManager().getResourceOrThrow(resource).open()) {
                Files.copy(in, copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            LogUtils.getLogger().error("Failed to copy built-in resource pack", e);
        }
    }

    @SubscribeEvent
    public static void registerReloadListeners(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener((ResourceManagerReloadListener) ClientModEventHandler::loadPalette);
    }

    private static void loadPalette(ResourceManager resourceManager) {
        ResourceLocation palette = ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/gui/palette.png");
        try (InputStream stream = resourceManager.getResourceOrThrow(palette).open()) {
            BufferedImage image = ImageIO.read(stream);
            ColorProvider.TEXT = image.getRGB(0, 0);
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            LogUtils.getLogger().error("Error loading palette", e);
        }
    }

}
