/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author Tanvi
 */
public class Patient extends Person  {
    
    int patientId=0;
    Encounterhistory encounterhistory;  
    
    String healthStatus;
    
    public Patient(String name, long phone, String email,int age,String houseNumber,String streetName, String communityName, int zipCode, int patientId) {
        super(name,phone,email, age, houseNumber, streetName, communityName, zipCode);
        
        this.encounterhistory = new Encounterhistory();
        this.healthStatus = "Normal";
        this.patientId = patientId;
       }
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Encounterhistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(Encounterhistory encounterHistory) {
        this.encounterhistory = encounterHistory;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    public void updateHealthStatus(){
        int lastEncounterCount = encounterhistory.getEncounterhistory().size();
        setHealthStatus(encounterhistory.getEncounterhistory().get(lastEncounterCount - 1).getCurrentHealthStatus());
    }
    
    @Override
    public String toString(){
        return name;
    }

    public Object getEncounterHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
}

    

