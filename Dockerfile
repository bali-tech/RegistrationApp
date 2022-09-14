FROM openjdk:latest
#LABEL maintainer="javaguides.net"
EXPOSE 8078
ADD ./build/libs/UserRegistration-0.0.1-SNAPSHOT.jar user-regis.jar
ENTRYPOINT ["java", "-jar", "user-regis.jar"]