package com.MmaCodes.ecommerce.documents;

import com.MmaCodes.ecommerce.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    private String username;
    private String email;
    private String password;
    private List<UserRole> roles;
    private String firstname;
    private String lastname;
    private String imageURL;
    private String phone;
    private Address address;
    private Cart cart;
    private Payment payment;
}
