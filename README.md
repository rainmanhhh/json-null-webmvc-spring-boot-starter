# strict-json-webmvc-spring-boot-starter

#### 介绍
默认情况下，spring webmvc处理web请求时

对于返回null的，直接返回空报文体

但空报文体不是有效的json值

引入此starter后

null将被序列化为`null`

#### 软件架构
spring cloud


#### 安装教程
添加jitpack到repositories中，再用maven引入
