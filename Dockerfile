FROM openjdk:14-alpine
COPY build/libs/graphql-error-*-all.jar graphql-error.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "graphql-error.jar"]