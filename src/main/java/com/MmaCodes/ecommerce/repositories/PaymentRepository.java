package com.MmaCodes.ecommerce.repositories;

import com.MmaCodes.ecommerce.documents.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
