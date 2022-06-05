package com.safetynet.safetynetalerts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PersonModel {
    @NotBlank
    private final String firstName;
    @NotBlank
    private final String lastName;
    private       String address;
    private       String city;
    private       int    zip;
    private       String phone;
    private       String email;

    public PersonModel(@JsonProperty("firstName") String firstName,
                       @JsonProperty("lastName") String lastName,
                       @JsonProperty("address") String address,
                       @JsonProperty("city") String city,
                       @JsonProperty("zip") int zip,
                       @JsonProperty("phone") String phone,
                       @JsonProperty("email") String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
}