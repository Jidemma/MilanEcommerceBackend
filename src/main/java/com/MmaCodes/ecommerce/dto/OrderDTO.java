package com.MmaCodes.ecommerce.dto;

import com.MmaCodes.ecommerce.enums.PaymentMethod;
import com.MmaCodes.ecommerce.model.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {

    private Integer totalQuantity;
    private Double totalAmount;
    private String productId;
    private String userId;
    private UserDetails userDetails;
    private PaymentMethod paymentMethod;
    private String paymentId;
}
