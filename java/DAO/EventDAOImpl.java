/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.EventDtls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arpit
 */
public class EventDAOImpl implements EventDAO{

    private Connection conn;

    public EventDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

   
    
    @Override
    public boolean addEvents(EventDtls e) {
        boolean f=false;
        try{
            String sql="insert into event(EventName,Description,Picture) values(?,?,?)";
            PreparedStatement pmt=conn.prepareStatement(sql);
            pmt.setString(1,e.getEventName());
            pmt.setString(2,e.getEventDiscription());
            pmt.setString(3,e.getPhotoName());
            int i=pmt.executeUpdate();
            if(i==1)
                f=true;
           
        } catch (SQLException ex) {
            Logger.getLogger(EventDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         return f;
    }

    @Override
    public List<EventDtls> getAllEvents() {
        List<EventDtls>list=new ArrayList<EventDtls>();
        EventDtls event=null;
        try{
            String sql="select * from event";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
              event=new EventDtls();
              event.setEventId(rs.getInt(1));
              event.setEventName(rs.getString(2));
              event.setEventDiscription(rs.getString(3));
              event.setPhotoName(rs.getString(4));
              list.add(event);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public EventDtls getEventById(int id) {
       EventDtls event=null;
       try{
           String sql="select * from event where idEvent=?";
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setInt(1,id);
           
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               event=new EventDtls();
              event.setEventId(rs.getInt(1));
              event.setEventName(rs.getString(2));
              event.setEventDiscription(rs.getString(3));
              event.setPhotoName(rs.getString(4));
           }
       }
       catch(Exception e){
           e.printStackTrace();
    }
    return event; 
    }

    @Override
    public boolean updateEditEvents(EventDtls e) {
        boolean f=false;
        try{
            String sql="update event set idEvent=?,EventName=?,Description=?,Picture=? where idEvent=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, e.getEventName());
            ps.setString(2,e.getEventDiscription());
            ps.setInt(3,e.getEventId());
            int i=ps.executeUpdate();
            if(i==1){
                f=true;
            }
        }
        catch(Exception ez){
            ez.printStackTrace();
        }
        return f;
    }
}
