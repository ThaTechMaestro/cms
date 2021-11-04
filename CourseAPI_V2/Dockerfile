FROM openjdk:18-jdk-alpine3.13

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} cms_api.jar

ENTRYPOINT ["java","-jar","/cms_api.jar"]