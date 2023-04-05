package com.MmaCodes.ecommerce.documents;

import com.MmaCodes.ecommerce.model.CartItem;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private String id;
//    @NotBlank(message = "Product must have name")
    private String name;
    private String imageURL;
    private String productUrl;
    private Double costPrice;
    private Double salePrice;
    private String description;
//    @NonNull
    private Integer quantity;
    @DBRef
//    @NotBlank(message = "Product must belong to a category")
    private Category category;
    @DBRef
//    @NotBlank(message = "Product must belong to a subCategory")
    private SubCategory subCategory;
    private List<CartItem> cartItemList;
}
