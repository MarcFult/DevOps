# ---------- Build stage ----------
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copy wrapper & build files first (caching)
COPY gradlew ./
COPY gradle gradle
COPY build.gradle* settings.gradle* gradle.properties* ./
# Fix Windows line endings + executable (important if building on Windows)
RUN sed -i 's/\r$//' gradlew && chmod +x gradlew

# Download Gradle, resolve deps
RUN ./gradlew --no-daemon -v
RUN ./gradlew --no-daemon dependencies

# Copy source and build WITH TESTS
COPY src src
RUN ./gradlew --no-daemon clean test bootJar

# ---------- Runtime stage ----------
FROM eclipse-temurin:21-jre AS runtime
WORKDIR /app

ENV SPRING_PROFILES_ACTIVE=prod \
    JAVA_OPTS="-XX:MaxRAMPercentage=75.0 -XX:+ExitOnOutOfMemoryError"

# Copy the fat jar
COPY --from=build /app/build/libs/*.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
