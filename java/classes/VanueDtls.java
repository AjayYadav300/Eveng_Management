/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author arpit
 */
public class VanueDtls {
    private String eType;
    private String capacity;
    private String cost;
    private String location;
    private String contact;
    private String date;

    public VanueDtls(String eType, String capacity, String cost, String location, String contact, String date) {
        this.eType = eType;
        this.capacity = capacity;
        this.cost = cost;
        this.location = location;
        this.contact = contact;
        this.date = date;
    }

    public VanueDtls() {
        super();
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
