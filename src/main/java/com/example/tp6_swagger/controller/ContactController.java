package com.example.tp6_swagger.controller;

import com.example.tp6_swagger.model.Contact;
import com.example.tp6_swagger.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ContactController {

    private final ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return this.contactRepository.getAll();
    }

    @GetMapping("/contacts/{id}")
    public Contact getContactByID(@PathVariable Long id){
        return this.contactRepository.getByID(id);
    }

    @PostMapping("/contacts")
    public Contact saveContact(@RequestBody Contact c){
        return this.contactRepository.save(c);
    }

    @PutMapping("/contacts/{id}")
    public Contact updateContact(@RequestBody Contact c){
        return this.contactRepository.update(c);
    }

    @DeleteMapping("/contacts/{id}")
    public boolean deleteContact(@PathVariable Long id){
        return this.contactRepository.delete(id);
    }
}
