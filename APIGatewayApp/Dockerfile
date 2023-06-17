## Use a Java base image
#FROM adoptopenjdk:8-jdk-hotspot
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the API Gateway JAR file to the container
#COPY target/APIGatewayApp-0.0.1-SNAPSHOT.jar /app
#
## Expose the port on which the API Gateway will run
#EXPOSE 8093
#
## Set the entry point to run the API Gateway
#ENTRYPOINT ["java", "-jar", "APIGatewayApp-0.0.1-SNAPSHOT.jar"]


# Use a Java base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the API Gateway JAR file to the container
COPY target/APIGatewayApp-0.0.1-SNAPSHOT.jar .

# Set the entry point to run the API Gateway
ENTRYPOINT ["java", "-jar", "APIGatewayApp-0.0.1-SNAPSHOT.jar"]
