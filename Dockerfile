FROM openjdk:17-alpine
MAINTAINER com.project.consumer
WORKDIR /opt/dockerapp
EXPOSE 8082
ARG JAR_FILE=target/consumer-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} consumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","consumer-0.0.1-SNAPSHOT.jar"]