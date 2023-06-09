package com.MmaCodes.ecommerce.repositories;

import com.MmaCodes.ecommerce.documents.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

}
