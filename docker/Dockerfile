FROM openjdk:8-jdk-alpine AS executer
WORKDIR app
COPY GreetingApp-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","GreetingApp-0.0.1.jar","&"]
