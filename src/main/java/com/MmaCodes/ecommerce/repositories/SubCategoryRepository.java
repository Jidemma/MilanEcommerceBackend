package com.MmaCodes.ecommerce.repositories;

import com.MmaCodes.ecommerce.documents.SubCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubCategoryRepository extends MongoRepository<SubCategory, String> {
}
