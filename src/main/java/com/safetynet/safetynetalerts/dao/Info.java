package com.safetynet.safetynetalerts.dao;

import com.safetynet.safetynetalerts.model.PersonModel;
import lombok.Data;

import java.util.List;

@Data
public class Info {

    private List<PersonModel> persons;
    //    private List<FirestationModel> firestations;
    //    private List<MedicalRecordModel> medicalrecords;

}
