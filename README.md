# strict-json-webmvc-spring-boot-starter

#### 介绍
默认情况下，spring webmvc处理web请求时

对于接口函数返回值为`null`的，直接给前端返回空报文体

但空报文体不是有效的json值，若前端使用严格的json反序列化（例如fetch），则空报文体会引起错误

引入此starter后

`null`将被序列化为"null"(不包括引号)

#### 软件架构
spring cloud


#### 安装教程
添加jitpack到repositories中，再用maven引入
