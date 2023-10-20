#FROM maven:3.8.5-openjdk-17
#WORKDIR /46330799MoviesProject
#COPY . .
#RUN mvn clean install
#CMD mvn spring-boot:run
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/Movies-project.jar
WORKDIR .
COPY $(JAR_FILE) app.jar
ENTRYPOINT ["java","-jar","app.jar"]

