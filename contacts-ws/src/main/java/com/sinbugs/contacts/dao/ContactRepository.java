package com.sinbugs.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinbugs.contacts.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
