FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/Productos-0.0.1-SNAPSHOT.jar Productos-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/Productos-0.0.1-SNAPSHOT.jar"]