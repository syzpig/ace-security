java -jar sentinel-core-example.jar


使用方式：
1.增加配置，在应用的 /src/main/resources/application.properties 中添加基本配置信息

spring.application.name=sentinel-example
server.port=18083
spring.cloud.sentinel.transport.dashboard=localhost:8080

2.启动应用，支持 IDE 直接启动和编译打包后启动。
(1).IDE直接启动：找到主类 ServiceApplication，执行 main 方法启动应用。
(2).打包编译后启动：首先执行 mvn clean package 将工程编译打包，然后执行 java -jar sentinel-core-example.jar启动应用。
