/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tanvi
 */
public class ProfileInfoHistory {
    
    private ArrayList<ProfileInfo> history;
    
    public ProfileInfoHistory(){
         this.history = new ArrayList<ProfileInfo>();
        }

    public ArrayList<ProfileInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ProfileInfo> history) {
        this.history = history;
    }
    
    
}
