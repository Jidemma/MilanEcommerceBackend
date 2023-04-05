package com.MmaCodes.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItem {

    private String productId;
    private String userId;
    private Double totalPrice;
    private Integer quantity;
    private String size;
    private String productUrl;

}
