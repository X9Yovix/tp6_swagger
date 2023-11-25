package com.example.tp6_swagger.controller;

import com.example.tp6_swagger.model.Contact;
import com.example.tp6_swagger.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ContactController {
    private final ContactRepository contactRepository;
}
