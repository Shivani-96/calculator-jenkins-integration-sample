FROM openjdk:8
EXPOSE 8080
ADD target/calculator-jenkins-integration-sample.jar calculator-jenkins-integration-sample.jar
ENTRYPOINT ["java","-jar","/calculator-jenkins-integration-sample.jar"]