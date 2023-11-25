package com.example.tp6_swagger.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
