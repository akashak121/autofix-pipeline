# Use lightweight Java image
FROM eclipse-temurin:21-jre

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
