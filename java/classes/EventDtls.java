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
public class EventDtls {
 private int eventId;
 private String eventName;
 private String eventDiscription;
 private String photoName;
 
    public EventDtls(){
        super();
    }
    public EventDtls(String eventName, String eventDiscription,String photoName) {
        super();
        this.eventName = eventName;
        this.eventDiscription=eventDiscription;
        this.photoName = photoName;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDiscription(String eventDiscription) {
        this.eventDiscription = eventDiscription;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDiscription() {
        return eventDiscription;
    }

    public String getPhotoName() {
        return photoName;
    }

    @Override
    public String toString() {
        return "EventDtls{" + "eventId=" + eventId + ", eventName=" + eventName + ", eventDiscription=" + eventDiscription + ", photoName=" + photoName + '}';
    }
 
}
