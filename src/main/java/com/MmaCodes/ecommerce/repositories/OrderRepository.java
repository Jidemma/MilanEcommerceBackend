package com.MmaCodes.ecommerce.repositories;

import com.MmaCodes.ecommerce.documents.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
