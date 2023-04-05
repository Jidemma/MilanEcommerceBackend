package com.MmaCodes.ecommerce.documents;


import com.MmaCodes.ecommerce.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    private String id;
    private Double totalAmount;
    private String productId;
    private String shippingFee; // might need to leave
    private String tax;
    private PaymentMethod paymentMethod;
    @CreatedDate
    private Instant createdDate;

}
