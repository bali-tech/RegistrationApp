FROM openjdk:latest
#LABEL maintainer="javaguides.net"
EXPOSE 8078
ADD UserRegistration-0.0.1-SNAPSHOT.jar user-regis.jar
ENTRYPOINT ["java", "-jar", "user-regis.jar"]