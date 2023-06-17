## Use a Java base image
#FROM adoptopenjdk:8-jdk-hotspot
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the microservice JAR file to the container
#COPY target/Ms-Stock-0.0.1-SNAPSHOT.jar /app
#
## Expose the port on which the microservice will run
#EXPOSE 8090
#
## Set the entry point to run the microservice
#ENTRYPOINT ["java", "-jar", "Ms-Stock-0.0.1-SNAPSHOT.jar"]

# Use a Maven base image for building the project
FROM maven:3.8.4-openjdk-8 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the source code to the container
COPY . /app

# Build the Maven project
RUN mvn clean install -DskipTests

# Use a Java base image for the final image
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the builder stage to the final image
COPY --from=builder /app/target/Ms-Stock-0.0.1-SNAPSHOT.jar /app

# Copy the shared_package JAR file to the final image
COPY target/shared_package-1.0-SNAPSHOT.jar /app

# Set the entry point to run the application
ENTRYPOINT ["java", "-cp", "Ms-Stock-0.0.1-SNAPSHOT.jar:shared_package-1.0-SNAPSHOT.jar", "tn.sahnoun.msstock.MsStockApplication"]
