FROM openjdk:8-jdk-alpine
MAINTAINER "Nelson Garcia" 

# Variables de entorno para el build. Para usar las variables, ejecuta por ejemplo: 
# docker build --build-arg APP_JAR=nombre-del-jar.jar Dockerfile
ARG APP_JAR=target/contacts-ws-0.0.1-SNAPSHOT.jar

ADD $APP_JAR app.jar

# Variables de entorno durante la ejecución  del contenedor. Se pueden establecer 
# desde el comando "docker run" con la opción "-e VARIABLE=valor"
ENV SPRING_PROFILES_ACTIVE=""
ENV JAVA_OPTS=""
ENV MY_ENV_VAR=""

# Opcional e inseguro: permite copiar los archivos de configuración fuera del 
# contenedor al iniciar con un named/unnamed volume (no bind volume)
VOLUME /config
ADD src/main/resources/*.properties /config/

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]