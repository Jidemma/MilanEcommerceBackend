package com.MmaCodes.ecommerce.documents;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wishlist {
    @Id
    private String id;
    private String userId;
    private String productId;
    @CreatedDate
    private Instant createdDate;
    @LastModifiedDate
    private Instant updatedDate;
}
