/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.EventDtls;
import java.util.List;

/**
 *
 * @author arpit
 */
public interface EventDAO {
    public boolean addEvents(EventDtls e);
    public List<EventDtls> getAllEvents();
    public EventDtls getEventById(int id);
    public boolean updateEditEvents(EventDtls e);
}
