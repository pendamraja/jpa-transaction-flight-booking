package com.flight.booking.resource;

import com.flight.booking.dto.FlightBookingAcknowledgement;
import com.flight.booking.dto.FlightBookingRequest;
import com.flight.booking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingResource {

   private final String BOOK_FLIGHT_TICKET ="/bookFlightTicket";

    @Autowired
    private FlightBookingService flightBookingService;


    @PostMapping(BOOK_FLIGHT_TICKET)
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest bookingrequest)
    {
        return flightBookingService.bookFlightTicket(bookingrequest);
    }
}
