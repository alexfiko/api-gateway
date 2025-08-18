FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/api-gateway.jar api-gateway.jar

ENV JAVA_OPTS="-Xmx512m -Xms256m"

EXPOSE 8080

CMD ["sh", "-c", "java $JAVA_OPTS -jar api-gateway.jar"]