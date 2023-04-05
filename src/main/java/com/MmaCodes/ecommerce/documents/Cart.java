package com.MmaCodes.ecommerce.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {

    @Id
    private String id;
    @DBRef
    private Product product;  // maybe should be list of products
    private String size;
    private Double totalPrice;
    private String productUrl;
    private Integer quantity;
    @CreatedDate
    private Instant createdDate;
}
