FROM adoptopenjdk/openjdk14:latest

ADD build/libs/*.jar /opt/app/app.jar

VOLUME ["/opt/logs"]
WORKDIR /opt/app/

CMD ["java", "-jar", "/opt/app/app.jar"]

