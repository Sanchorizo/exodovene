FROM maven:3.8.1-jdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/myapp.jar /app/helloworld.jar
ENTRYPOINT ["java", "-jar", "/app/helloworld.jar"]


