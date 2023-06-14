# Use a Java base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the microservice JAR file to the container
COPY target/Ms-Stock-0.0.1-SNAPSHOT.jar /app

# Expose the port on which the microservice will run
EXPOSE 8090

# Set the entry point to run the microservice
ENTRYPOINT ["java", "-jar", "Ms-Stock-0.0.1-SNAPSHOT.jar"]