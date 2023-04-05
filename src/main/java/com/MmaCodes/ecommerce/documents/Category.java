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
public class Category {

    @Id
    private String id;
//    @NotBlank(message = "Name is mandatory")
    private String name;
    private String imageURL;
    private String description;
}
