FROM openjdk:8-jre-alpine
MAINTAINER rashmit.rathod@gmail.com
ADD springboot-hello-world-1.0.jar /opt/
RUN chmod 777 /opt/springboot-hello-world-1.0.jar
CMD ["java","-jar","/opt/springboot-hello-world-1.0.jar"]