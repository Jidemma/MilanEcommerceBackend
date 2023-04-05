package com.MmaCodes.ecommerce.model;

import com.MmaCodes.ecommerce.documents.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetails {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String imageURL;
    private String phone;
    private Address shippingAddress;
    private Address billingAddress;
}
