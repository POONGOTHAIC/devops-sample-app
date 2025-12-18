FROM eclipse-temurin:8-jdk

COPY app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
