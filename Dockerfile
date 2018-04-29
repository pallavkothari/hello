FROM openjdk:8-jre-alpine
COPY target/hello*.jar /app.jar

## remember that expose is not supported by heroku

# run the image as a non-root user
RUN adduser -D myuser
USER myuser

CMD java -jar ./app.jar