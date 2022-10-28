/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tanvi
 */
public class Hospital {
    private int id;
    private String name;
    private String city;
    private int zipcode;
    private Community community;
//    private ArrayList<Doctor> doctors;


    public Hospital(int id, String name, String city, int zipcode, Community community) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
        this.community = community;
        
        

    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
}
