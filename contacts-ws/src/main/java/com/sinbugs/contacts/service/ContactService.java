package com.sinbugs.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinbugs.contacts.api.ContactRequest;
import com.sinbugs.contacts.api.ContactResponse;
import com.sinbugs.contacts.dao.ContactRepository;
import com.sinbugs.contacts.dto.Contact;

@Service
public class ContactService {
    @Autowired
    ContactRepository dao;
     
    public Contact save(Contact contact){
        return dao.saveAndFlush(contact);
    }
}
