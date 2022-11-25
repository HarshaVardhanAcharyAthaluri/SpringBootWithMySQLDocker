FROM openjdk:11
COPY target/springbootwithmysqldocker.jar springbootwithmysqldocker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springbootwithmysqldocker.jar"]