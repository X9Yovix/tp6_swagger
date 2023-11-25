package com.example.tp6_swagger.service;

import com.example.tp6_swagger.model.Contact;
import com.example.tp6_swagger.repository.ContactRepository;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ContactService implements ContactRepository {
    private List<Contact> contacts = new ArrayList<>();

    public ContactService() {
        contacts.addAll(List.of(
                new Contact(1L, "F1", "L1", "test1@gmail.com", "+216 23 454 443", "adr1"),
                new Contact(2L, "F2", "L2", "test2@gmail.com", "+216 23 124 763", "adr2"),
                new Contact(3L, "F3", "L3", "test3@gmail.com", "+216 23 554 743", "adr3")
        ));
    }
    @Override
    public List<Contact> getAll() {
        return this.contacts;
    }

    @Override
    public Contact getByID(Long id) {
        return this.contacts.stream()
                .filter(index -> index.getId().equals(id))
                .findAny()
                .orElseThrow(EmptyStackException::new);
    }

    @Override
    public Contact save(Contact c) {
        this.contacts.add(c);
        return c;
    }

    @Override
    public Contact update(Contact c) {
        Contact updateContact = this.contacts.stream()
                .filter( index -> index.getId().equals(c.getId()))
                .findAny()
                .orElseThrow(EmptyStackException::new);

        updateContact.setFirstName(c.getFirstName());
        updateContact.setLastName(c.getLastName());
        updateContact.setEmail(c.getEmail());
        updateContact.setPhone(c.getPhone());
        updateContact.setAddress(c.getAddress());

        return updateContact;
    }

    @Override
    public boolean delete(Long id) {
        Contact contact = this.contacts.stream()
                .filter(index -> index.getId().equals(id))
                .findAny()
                .orElseThrow(EmptyStackException::new);
        ;
        return this.contacts.remove(contact);
    }
}
