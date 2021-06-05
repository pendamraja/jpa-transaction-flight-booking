package com.flight.booking.repository;

import com.flight.booking.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
