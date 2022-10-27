/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Tanvi
 */
public class Patient extends Person  {
    private int patientId;
    private int encounterCount;
    private ArrayList<Encounter> encounters;


    public Patient(int patientId, String ssn, String name, Date dateOfBirth, String email, String password, String phoneNumber, String gender) {
        super(ssn, name, dateOfBirth, email, password, phoneNumber, gender, Role.PATIENT);
        this.patientId = patientId;
        this.encounters = new ArrayList<>();
        encounterCount = 1;
   
    
}

    private static class Encounter {

        public Encounter() {
        }
    }
}
