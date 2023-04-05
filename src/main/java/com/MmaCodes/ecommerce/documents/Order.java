package com.MmaCodes.ecommerce.documents;

import com.MmaCodes.ecommerce.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    private String id;
    private Integer totalQuantity;
    private Double totalAmount;
    private Address shippingAddress;
    private Address billingAddress;
    private OrderStatus status;   // maybe this should be under delivery
    @CreatedDate
    private Instant createdDate;
    @LastModifiedDate
    private Instant updateDate;
    @DBRef
    private Payment payment; // might need to revisit
    @DBRef
    private Product product;
//    @DBRef
//    private User user;



}
