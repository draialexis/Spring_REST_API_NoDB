package com.safetynet.safetynetalerts.service;

import com.safetynet.safetynetalerts.dao.PersonDao;
import com.safetynet.safetynetalerts.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fromJSON") PersonDao personDao) {
        this.personDao = personDao;
    }

    public PersonModel addPerson(PersonModel person) {
        return personDao.insertPerson(person);
    }

    public List<PersonModel> getAllPersons() {
        return personDao.selectAllPersons();
    }

    public PersonModel getPerson(String firstName, String lastName)
    {
        return personDao.selectPerson(firstName, lastName);
    }

    public PersonModel updatePerson(String firstName, String lastName, PersonModel newPerson) {
        return personDao.updatePerson(firstName, lastName, newPerson);
    }

    public void deletePerson(String firstName, String lastName)
    {
        personDao.deletePerson(firstName, lastName);
    }
}
