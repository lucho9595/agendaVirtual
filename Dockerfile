FROM amazoncorretto:11-alpine-jdk 
MAINTAINER LUCHO 
COPY target/agendaVirtual-0.0.1-SNAPSHOT.jar  agenda-app.jar 
entrypoint ["java", "-jar", "/agenda-app.jar"]