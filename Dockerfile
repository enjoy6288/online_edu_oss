FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/online_edu_oss-0.0.1-SNAPSHOT.jar online_edu_oss.jar
ENTRYPOINT ["java", "-jar", "online_edu_oss.jar","&"]