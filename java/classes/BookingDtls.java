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
public class BookingDtls {
    private String pName;
    private String cNumber;
    private String expiry;
    private String cvv;
    private int id;
    private String email;
    public BookingDtls(){
        super();
    }

    public BookingDtls(String pName, String cNumber, String expiry, String cvv, int id, String email) {
        this.pName = pName;
        this.cNumber = cNumber;
        this.expiry = expiry;
        this.cvv = cvv;
        this.id = id;
        this.email = email;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
