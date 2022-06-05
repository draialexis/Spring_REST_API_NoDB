package com.safetynet.safetynetalerts.service;

import com.safetynet.safetynetalerts.dao.PersonAccessible;
import com.safetynet.safetynetalerts.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonAccessible personAccessible;

    @Autowired
    public PersonService(@Qualifier("personDao") PersonAccessible personAccessible) {
        this.personAccessible = personAccessible;
    }

    public PersonModel addPerson(PersonModel person) {
        return personAccessible.insertPerson(person);
    }

    public List<PersonModel> getAllPersons() {
        return personAccessible.selectAllPersons();
    }

    public PersonModel getPerson(String firstName, String lastName)
    {
        return personAccessible.selectPerson(firstName, lastName);
    }

    public PersonModel updatePerson(String firstName, String lastName, PersonModel newPerson) {
        return personAccessible.updatePerson(firstName, lastName, newPerson);
    }

    public void deletePerson(String firstName, String lastName)
    {
        personAccessible.deletePerson(firstName, lastName);
    }
}
