package com.MmaCodes.ecommerce.repositories;

import com.MmaCodes.ecommerce.documents.Wishlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends MongoRepository<Wishlist, String> {
}
