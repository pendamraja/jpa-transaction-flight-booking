package com.flight.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JpaTransactionFlightBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaTransactionFlightBookingApplication.class, args);
	}

}
