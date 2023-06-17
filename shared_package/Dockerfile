#FROM maven:3.8.1-openjdk-8-slim AS builder
#WORKDIR /app
#COPY . .
#RUN mvn clean install
#
#FROM openjdk:8-jre-slim
#WORKDIR /app
#COPY --from=builder /app/target/shared_package-1.0-SNAPSHOT.jar /app/shared_package-1.0-SNAPSHOT.jar
#EXPOSE 8080
#CMD ["java", "-jar", "shared_package-1.0-SNAPSHOT.jar"]

# Use a Java base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file to the container
COPY target/shared_package-1.0-SNAPSHOT.jar /app/shared_package-1.0-SNAPSHOT.jar

# No need to expose any ports or define an entry point, as it's just a shared library

