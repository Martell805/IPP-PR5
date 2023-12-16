FROM openjdk:21

WORKDIR /app

COPY target/IPP-PR5-0.0.1-SNAPSHOT.jar ./app.jar

CMD ["java", "-jar", "app.jar"]
