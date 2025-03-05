FROM openjdk:17

WORKDIR /app

COPY build/libs/reto-aws-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]