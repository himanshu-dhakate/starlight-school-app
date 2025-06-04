package com.eazybytes.example18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class ContactController {
    private static Logger log = Logger.getLogger(ContactController.class.getName());
    @RequestMapping("/contact")
    public String displayContact() {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email, @RequestParam String subject,
                                    @RequestParam String message) {
        log.info("Name: " + name);
        log.info("mobileNum: " + mobileNum);
        log.info("email: " + email);
        log.info("subject: " + subject);
        log.info("message: " + message);
        return new ModelAndView("redirect:/contact");
    }
}
