/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.EventDtls;
import classes.VanueDtls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arpit
 */
public class VanueDAOImpl implements VanueDAO {
    private Connection conn;

    public VanueDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }
    

    @Override
    public List<VanueDtls> getAllVanue() {
          List<VanueDtls>list=new ArrayList<VanueDtls>();
        VanueDtls e=null;
        try{
            String sql="select * from vanue";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
              e=new VanueDtls();
              e.seteType(rs.getString(1));
              e.setCapacity(rs.getString(2));
              e.setCost(rs.getString(3));
              e.setLocation(rs.getString(4));
              e.setContact(rs.getString(5));
              e.setDate(rs.getString(6));
              list.add(e);
            }
        }
        catch(Exception ed)
        {
            ed.printStackTrace();
        }
        return list;
    }
    
}
