FROM alpine:3.13

RUN apk add openjdk8
COPY build/libs/kuber-admin.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]