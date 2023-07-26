FROM amazoncorretto:11-alpine-jdk //de que imagen de java partimos
MAINTAINER LUCHO //quien es el dueño
COPY target/agendaVirtual-0.0.1-SNAPSHOT.jar  agenda-app.jar //copiamos de nuestro proyecto el empaquetado a github
entrypoint ["java", "-jar", "/agenda-app.jar"] //es la instruccion que se va a ejecutar primero