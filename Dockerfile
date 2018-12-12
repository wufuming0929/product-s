FROM    hub.c.163.com/library/java:8-alpine
ADD     server/target/*.jar    app.jar
ENV PARAMS=""
ENTRYPOINT ["sh","-c","java $PARAMS -jar /app.jar"]
