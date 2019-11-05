
## 项目说明

本项目为spring cloud 的 demo项目，用于理解 spring cloud 的使用。

eureka-server 是服务中心
product       是一个服务提供者
user          是一个服务提供者



## bootstrap.yml 和 application.yml 的区别

bootstrap.yml is loaded before application.yml.

It is typically used for the following:
> when using Spring Cloud Config Server, you should specify spring.application.name and spring.cloud.config.server.git.uri inside bootstrap.yml
  some encryption/decryption information

Technically, bootstrap.yml is loaded by a parent Spring ApplicationContext. 
That parent ApplicationContext is loaded before the one that uses application.yml.