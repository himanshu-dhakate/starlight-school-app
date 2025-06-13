package com.eazybytes.example18.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contact {
    @NotBlank(message = "Name must not be blank")
    @Size(min = 3, message = "Name must be atleast 3 characters long")
    private String name;

    @NotBlank(message = "Mobile number must not be blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid mobile number")
    private String mobileNum;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Subject cannot be blank")
    @Size(min = 5, message = "Subject must be atleast 5 characters long")
    private String subject;

    @NotBlank(message = "Message cannot be blank")
    @Size(min = 10, message = "Message must be atleast 10 characters long")
    private String message;
}
