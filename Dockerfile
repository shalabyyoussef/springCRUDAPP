FROM openjdk:8
EXPOSE 8082
ADD target/spring-boot-hrdocker.jar spring-boot-hrdocker.jar 
ENTRYPOINT ["java","-jar","/spring-boot-hrdocker.jar"]

