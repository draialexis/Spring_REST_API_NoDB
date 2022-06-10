package com.safetynet.safetynetalerts.controller;

import com.safetynet.safetynetalerts.model.PersonModel;
import com.safetynet.safetynetalerts.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/persons")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@Valid @NonNull @RequestBody PersonModel person) {
        personService.addPerson(person);
    }

    // TODO remove before prod or make private
    @GetMapping
    public List<PersonModel> getAllPersons()
    {
        return personService.getAllPersons();
    }

    // TODO remove before prod or make private
    @GetMapping(path = "{firstName}_{lastName}")
    public PersonModel getPerson(
            @PathVariable("firstName") String firstName,
            @PathVariable("lastName") String lastName)
    {
        return personService.getPerson(firstName, lastName);
    }

    @DeleteMapping(path = "{firstName}_{lastName}")
    public void deletePerson(
            @PathVariable("firstName") String firstName,
            @PathVariable("lastName") String lastName)
    {
        personService.deletePerson(firstName, lastName);
    }

    @PutMapping(path = "{firstName}_{lastName}")
    public PersonModel updatePerson(
            @PathVariable("firstName") String firstName,
            @PathVariable("lastName") String lastName,
            @Valid @NonNull @RequestBody PersonModel newPerson)
    {
        return personService.updatePerson(firstName, lastName, newPerson);
    }
}
