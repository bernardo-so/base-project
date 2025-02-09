FROM gradle:8.5-jdk21 AS build
WORKDIR /app

COPY . .

RUN ./gradlew :entrypoint:bootJar

FROM openjdk:21-jdk-slim
WORKDIR /app

COPY --from=build /app/entrypoint/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
