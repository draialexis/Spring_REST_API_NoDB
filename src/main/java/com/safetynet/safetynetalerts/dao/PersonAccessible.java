package com.safetynet.safetynetalerts.dao;

import com.safetynet.safetynetalerts.model.PersonModel;

import java.util.List;

public interface PersonAccessible {
    PersonModel insertPerson(PersonModel person);

    List<PersonModel> selectAllPersons();

    PersonModel selectPerson(String firstName, String lastName);

    PersonModel updatePerson(String firstName, String lastName, PersonModel newPerson);

    void deletePerson(String firstName, String lastName);
}
