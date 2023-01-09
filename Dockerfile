FROM openjdk:8-jdk-alpine
EXPOSE 7080
VOLUME /tmp
COPY target/libraryApplication.jar library.jar
ENTRYPOINT ["java","-jar","/library.jar"]
