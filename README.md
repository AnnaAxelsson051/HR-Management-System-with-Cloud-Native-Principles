# HR System with Microservices and Spring Cloud


## Description

A HR Management System built with Spring Boot, microservices and Spring Cloud.

---

## Technologies and design

- Spring Boot
- Cloud Native 
- Domain Driven Design
- Microservices
- Spring Cloud Open Feign for microservice communication
- Eureka and Service discovery to manage and locate services
- Spring Cloud Gateway for client request routing, load balancing and security
- MVC
- Spring Cloud config server for centralized externalized configuration management,
  (loading config files from git repo)
- Spring Cloud bus for auto refreshing config changes, to simplify the process 
- of broadcasting configuration changes and events across multiple instances of microservices
- Using RabbitMQ as message broker
- Installed and set up RabbitMQ with Docker
- Spring Cloud Sleuth for distributed tracing to monitor and analyze the flow of requests as they travel through different services
- RESTful web services
- Spring Data Jpa
- MySQL
