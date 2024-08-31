/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.BookingDtls;
import classes.EventDtls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arpit
 */
public class BookImpl implements Booking {
      private Connection conn;

    public BookImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public List<BookingDtls> admin() {
            List<BookingDtls>list=new ArrayList<BookingDtls>();
        BookingDtls event=null;
        try{
            String sql="select * from booking";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
              event=new BookingDtls();
              event.setId(rs.getInt(1));
              event.setpName(rs.getString(2));
              event.setcNumber(rs.getString(3));
              event.setExpiry(rs.getString(4));
                event.setCvv(rs.getString(5));
                  event.setEmail(rs.getString(6));
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
    public List<BookingDtls> users(int id) {
             List<BookingDtls>list=new ArrayList<BookingDtls>();
        BookingDtls event=null;
        try{
            String sql="select * from booking where id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
              event=new BookingDtls();
              event.setId(rs.getInt(1));
              event.setpName(rs.getString(2));
              event.setcNumber(rs.getString(3));
              event.setExpiry(rs.getString(4));
                event.setCvv(rs.getString(5));
                  event.setEmail(rs.getString(6));
              list.add(event);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    
}
