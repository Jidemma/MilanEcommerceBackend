package com.MmaCodes.ecommerce.documents;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubCategory {

    @Id
    private String id;
//    @NotBlank(message = "Name may not be blank")
    private String name;
    private String imageURL;
    private String description;
//    @NotBlank(message = "CategoryId may not be blank")
    private String categoryId;
}
