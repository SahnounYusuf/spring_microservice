## Use a Java base image
#FROM adoptopenjdk:8-jdk-hotspot
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the Configuration Server JAR file to the container
#COPY target/config-server-0.0.1-SNAPSHOT.jar /app
#
## Expose the port on which the Configuration Server will run
#EXPOSE 8888
#
## Set the entry point to run the Configuration Server
#ENTRYPOINT ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar"]

# Use a Java base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Config Server JAR file to the container
COPY target/config-server-0.0.1-SNAPSHOT.jar .

# Set the entry point to run the Config Server
ENTRYPOINT ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar"]
