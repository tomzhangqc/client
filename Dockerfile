FROM openjdk:8-jdk-alpine
COPY ./target/client.jar client.jar
EXPOSE 11120
ENV APP_OPTS=""
ENTRYPOINT ["sh", "-c", "java -jar /client.jar $APP_OPTS"]
