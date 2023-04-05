package com.MmaCodes.ecommerce.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private String country;
    private String postalCode;
    private String streetName;
    private String stateName;
}
