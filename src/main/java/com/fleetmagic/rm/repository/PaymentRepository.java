package com.fleetmagic.rm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetmagic.rm.domain.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	public List<Payment> findByRentalPaymentId(int rentalPaymentId);
}
