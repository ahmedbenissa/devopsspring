FROM maven:3.6.3-jdk11 AS build

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn package

FROM openjdk11:latest

WORKDIR /app

COPY --from=build /build/target/*.jar /app/spring-boot-app.jar

ENTRYPOINT ["java", "-jar","/app/spring-boot-app.jar"]
