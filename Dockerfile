FROM openjdk:8
EXPOSE 8084
ADD target/flight-booking.jar flight-booking.jar
ENTRYPOINT ["java","-jar","/flight-booking.jar"]