package com.safetynet.safetynetalerts.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.safetynet.safetynetalerts.model.PersonModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Repository("fromJSON")
public class PersonDao implements PersonAccessible {

    private final Logger       logger       = LogManager.getLogger(PersonDao.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Value("${app.realpath}")
    private String path;

    @Override
    public PersonModel insertPerson(PersonModel person) {
        // TODO make sure that the fname lname combo is unique
        // TODO
        return person;
    }

    @Override
    public List<PersonModel> selectAllPersons() {
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader     = new FileReader(path);
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            Info       info       = objectMapper.readValue(jsonObject.toString(), Info.class);

            return info.getPersons();
        } catch (ParseException | IOException e) {
            logger.error("Error while reading database file." + e);
        }

        return null;
    }

    @Override
    public PersonModel selectPerson(String firstName, String lastName) {
        // TODO
        return null;
    }

    @Override
    public PersonModel updatePerson(String firstName, String lastName, PersonModel newPerson) {
        // TODO make sure that the fname lname combo is unique
        // TODO
        return newPerson;
    }

    @Override
    public void deletePerson(String firstName, String lastName) {
        // TODO
    }
}
