# Use a Java base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Feign server (Eureka) JAR file to the container
COPY target/Eureka-Server-0.0.1-SNAPSHOT.jar /app

# Expose the port on which the Feign server (Eureka) will run
EXPOSE 8761

# Set the entry point to run the Feign server (Eureka)
ENTRYPOINT ["java", "-jar", "Eureka-Server-0.0.1-SNAPSHOT.jar"]
