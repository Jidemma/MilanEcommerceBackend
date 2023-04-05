package com.MmaCodes.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

    private String name;
    private String imageURL;
    private Double costPrice;
    private Double salePrice;
    private String description;
    private Integer quantity;
    private String categoryId;
    private String subCategoryId;
}
