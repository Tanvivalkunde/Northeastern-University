/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tanvi
 */
public class Encounterhistory {
    
    List<Encounter> encounterhistory;
    
    public Encounterhistory() {   
        this.encounterhistory = new ArrayList<>();
    }
    
    public List<Encounter> getEncounterhistory() {
        return encounterhistory;
    }
    public void setEncounterhistory(List<Encounter> encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
    
    public int size(){
        return encounterhistory.size();
    }
    
}
