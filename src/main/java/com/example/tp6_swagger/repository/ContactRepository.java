package com.example.tp6_swagger.repository;

import com.example.tp6_swagger.model.Contact;

import java.util.List;

public interface ContactRepository {
    List<Contact> getAll();
    Contact getByID(Long id);
    Contact save(Contact c);
    Contact update(Contact c);
    boolean delete(Long id);
}
