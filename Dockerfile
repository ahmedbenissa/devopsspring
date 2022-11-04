FROM openjdk:11
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "demo-0.0.1.jar"]
