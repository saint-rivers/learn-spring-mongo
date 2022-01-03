FROM openjdk:11
ADD target/resume-api.jar resume-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/resume-api.jar"]
