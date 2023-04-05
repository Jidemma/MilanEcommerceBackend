package com.MmaCodes.ecommerce.repositories;

import com.MmaCodes.ecommerce.documents.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
