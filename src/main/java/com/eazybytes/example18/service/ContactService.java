package com.eazybytes.example18.service;

import com.eazybytes.example18.controller.ContactController;
import com.eazybytes.example18.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Slf4j
@Service
public class ContactService {

    public boolean saveMessage(Contact contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
