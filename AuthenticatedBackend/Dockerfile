FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ems.jar

ENTRYPOINT ["java", "-jar", "/serviceregistry.jar"]

EXPOSE 8000
