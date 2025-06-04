package com.eazybytes.example18.service;

import com.eazybytes.example18.controller.ContactController;
import com.eazybytes.example18.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ContactService {
    private static Logger log = Logger.getLogger(ContactService.class.getName());

    public boolean saveMessage(Contact contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
