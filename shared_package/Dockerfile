FROM openjdk:8-jdk-slim
WORKDIR /app
COPY target/shared_package-1.0-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "shared_package-1.0-SNAPSHOT.jar"]
