FROM openjdk:21
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} cbr.jar
ENTRYPOINT ["java","-jar","/app.jar"]