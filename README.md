# cdp4j

> 该项目用于，对 cdp4j 项目进行研究学习分析，对源码进行注释梳理。在项目 [cdp4j](https://github.com/fucora/cdp4j.git) 基础上，对其源码建立版本跟踪并进行研究学习和分析。

- 郑重声明：本项目来自互联网，仅供个人研究学习整理之用，版权归发行公司所有，任何组织和个人不得公开传播或用于任何商业盈利用途，否则一切后果由该组织或个人承担。本站和制作者不承担任何法律及连带责任！联系侵删！

- [cdp4j](https://github.com/fucora/cdp4j.git) commit id 772619a522365f75b32fcebf9c24be4270ff9cc0, webfolderio <support@webfolder.io> on 2019/12/9 at 14:49, prepare for next development iteration

- 3 stars，47 forks

## 资源

> [cdp4j](https://github.com/fucora/cdp4j)

## 架构

> 核心问题 / 主题
- 1. 外部依赖，框架库。
  - 网络通信库、核心依赖库
  - com.neovisionaries:nv-websocket-client@2.9 // WebSocket client implementation in Java.
  - com.jcabi:jcabi-ssh@1.6 // Simple SSH Client
  - com.github.markusbernhardt:proxy-vole@1.0.5 // Proxy Vole is a Java library to auto detect the platform network proxy settings.
  - 一般依赖库
  - org.jvnet.winp:winp@1.28 // Kill process tree in Windows
  - com.squareup:javapoet@1.9.0 // Use beautiful Java code to generate beautiful Java code.
  - 通用工具库
  - uk.com.robust-it:cloning1.9.5
  - org.apache.commons:commons-compress@1.18
  - com.google.code.gson:gson@2.8.5
- 2. 如何实现 CDP 协议，以及如何与 Chrome 通信。
  - CDP 协议，基于 Websocket 进行通信，依赖于  Websocket 通信库通信。
- 3. 启动、加载流程
  - 通过启动器 Launcher/ 远程启动器 RemoteLauncher 加载启动入口，从而进入启动流程。
    - AbstractLauncher: findChrome (查找Chrome) -> launch (启动入口) -> internalLaunch (内部启动业务) ->
      - Launcher -> 拉起 chrome 进程
      - RemoteLauncher -> SSH 远程启动流程
    - SessionFactory -> ping 检测连接 -> 主动调用 SessionFactory:create 进入初始化流程。
- 4. 初始化流程，主业务、数据流程
  - SessionFactory:create 创建 Session，初始化Websocket；执行 Connect -> 
    - 1. 创建获取Session，并初始化连接websocket
      - 1.1 HTTP请求获取信息
      - 1.2 创建 websocket 连接
        - 初始化 WSAdapter 适配器，并设置 websocket Listener
        - 连接 websocket
      - 1.3 构建Session实例，设置 session id 和 target id
        - Session添加目标监听器
        - Session添加关闭事件处理
      - 2. 等待Websocket完成，获取或创建一个标签页
      - 3. 执行连接
        - 3.1 获取主会话，未存在则创建
        - 3.2 会话ID，并初始化一个会话
  - Session 初始化完成，主动调用命令，指向相关命令。
- 5. 命令执行发送流程，主业务、数据流程
  - Session/Command，所用命令执行，都是通过代理 SessionInvocationHandler 调用 Websocket 库并实现发送 CDP 协议来进行，代理得到结果，从而返回相关数据。
  - Session:navigate -> Command:Page:navigate -> Command:getProxy -> session.getProxy -> SessionInvocationHandler:invoke
- 6. 事件流程，主业务、数据流程
  - 浏览器通过 CDP 协议，通过 websocket 接口，主动发送事件数据。
  - 
- 6. 模块、包分析，对核心包进行分析。
  - cdp         # CDP协议实现包，定义入口启动器和相关配置
  - annotation  # 注解包，定义 CDP 协议，域注解、事件注解、参数注解、返回注解
  - command     # 命令包，定义 CDP 协议，交互命令，协议，按照域分类
  - event       # 事件包，定义 CDP 协议，事件类型，协议，按照域分类
  - exception   # 异常包
  - listener    # 监听器包，事件监听器
  - logger      # 日志包
  - session     # 会话包，协议通信、协议会话、功能命令
  - type        # 类型包，参数实体、返回实体

## 简介

CDP，Chrome DevTools，其实 Java 语言 基于浏览器使用Google Chrome DevTools协议来自动化Chrome / Chromium。

> 特性
- 支持 Chrome DevTools 协议的全部功能（tip-of-tree）。
- 执行 JavaScript。
- 调用 JavaScript 函数。
- 支持本地 CSS 选择器引擎。
- 支持 XPath 查询。
- 隐身浏览（私人标签页）。
- 全屏截图。
- 触发鼠标事件（点击等...）。
- 发送按键（文本、制表符、回车等...）。
- 将浏览器中的日志条目（JavaScript、网络、存储等）重定向到 slf4j 中。
- 拦截网络请求和响应。
- 在不需要第三方解决方案的情况下以编程方式上传文件（不需要 AWT Robot 等...）。
- 获取并设置元素属性。
- 支持无头Chrome/Chromium。
- 导航后退，前进，停止，重新加载。
- 清除缓存，清除Cookie，列出Cookie。
- 设置和获取表单元素的值。
- 支持事件处理。

> 原则
- 尽可能避免使用外部依赖。
- 仅支持基于 Chrome/Chromium 的浏览器。
- 支持 Chrome DevTools 协议的全部功能。
- API 设计简单易用。
- 支持 GraalVM。

## 安装

> Chrome Debian/Ubuntu

```sh
# https://askubuntu.com/questions/79280/how-to-install-chrome-browser-properly-via-command-line
sudo apt-get install libxss1 libappindicator1 libappindicator3-1 libindicator7

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

sudo dpkg -i google-chrome*.deb # 可能会显示“错误”，通过下一行命令修复。
sudo apt-get install -f
```

> Chrome RHEL/CentOS/Fedora

```sh
wget https://dl.google.com/linux/direct/google-chrome-stable_current_x86_64.rpm
sudo yum install google-chrome-stable_current_*.rpm
```

