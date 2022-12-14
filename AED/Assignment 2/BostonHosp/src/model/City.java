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
public class City {
    private String name;
    private int id;
    private List<Community> communities;
    
    private static int cityCounter = 0;

    public City(String name, int id) {
        this.name = name;
        this.id = id;
        this.communities = new ArrayList<>();
    }
     public City(String name){
        this.name = name;
        this.communities = new ArrayList<>();
        
        
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }

    public static int getCityCounter() {
        return cityCounter;
    }

    public static void setCityCounter(int cityCounter) {
        City.cityCounter = cityCounter;
    }
}