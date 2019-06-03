FROM openjdk:8
ADD target/dynamic-sparkjob-process-0.0.1-SNAPSHOT.jar .
EXPOSE 9000
ENTRYPOINT ["java","-jar","dynamic-sparkjob-process-0.0.1-SNAPSHOT.jar"]