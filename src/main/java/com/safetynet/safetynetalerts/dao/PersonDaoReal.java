package com.safetynet.safetynetalerts.dao;

import com.safetynet.safetynetalerts.model.PersonModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("real")
public class PersonDaoReal implements PersonAccessible {
    @Override
    public PersonModel insertPerson(PersonModel person) {
        return null;
    }

    @Override
    public List<PersonModel> selectAllPersons() {
        System.out.println("SUCCESS!");
        return null;
    }

    @Override
    public PersonModel selectPerson(String firstName, String lastName) {
        return null;
    }

    @Override
    public PersonModel updatePerson(String firstName, String lastName, PersonModel newPerson) {
        return null;
    }

    @Override
    public void deletePerson(String firstName, String lastName) {

    }
}
