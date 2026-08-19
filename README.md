# TConJEI 1.21.1

TConJEI 是 **Tinkers' Construct（匠魂）** 的 **Just Enough Items（JEI）** 附属模组，面向 **Minecraft 1.21.1 + NeoForge**。它将匠魂材料和部件的关键属性整合到 JEI 浏览界面中，方便在游戏内比较材料并查询其获取方式。

## 主要功能

- 在 JEI 中显示匠魂材料的采掘、远程、盔甲、弹药与黏液头颅属性。
- 展示材料可用于制作的对应部件类型。
- 将材料配方、可用流体和铸造来源关联到 JEI 查询结果。
- 以工具装配台、匠人砧、焦灼砧和铸造盆等方块作为对应分类的查询入口。

## 项目信息

- Mod ID：`tconjei`
- 游戏版本：`Minecraft 1.21.1`
- 模组加载器：`NeoForge`
- 当前模组版本：`1.6.0`
- 运行环境：仅客户端
- Java 版本：`JDK 21`

## 依赖

安装时需要同时提供以下模组的兼容版本：

- `Mantle 1.12.3` 或更高兼容版本
- `Tinkers' Construct 3.12.3` 或更高兼容版本
- `JEI 19.0.0` 或更高兼容版本

## 安装

1. 安装适用于 Minecraft `1.21.1` 的 NeoForge。
2. 在客户端的 `mods` 文件夹中放入 TConJEI、JEI、Tinkers' Construct 和 Mantle。
3. 进入游戏后，打开 JEI 并查看匠魂材料、工具部件或相关工作站，即可访问材料属性分类。

## 开发构建

请先安装 JDK 21，并在项目根目录执行：

```powershell
.\gradlew.bat build
```

构建生成的模组文件位于 `build/libs/`。

## 上游

- TConJEI 上游：[https://github.com/zhuchuovo/TConJEI-1.21.1](https://github.com/zhuchuovo/TConJEI-1.21.1)
- 依赖的匠魂项目：[https://github.com/zhuchuovo/TinkersConstruct-1.21.1](https://github.com/zhuchuovo/TinkersConstruct-1.21.1)

## 许可证

本项目遵循仓库内 [LICENSE](LICENSE) 文件列出的 MIT 许可证。
