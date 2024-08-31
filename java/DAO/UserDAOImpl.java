/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arpit
 */
public class UserDAOImpl implements UserDAO {
    private Connection con=null;
    public UserDAOImpl(Connection con) {
        super();
        this.con = con;
    }

    @Override
    public boolean userRegister(User us) {
        boolean f=false;
        try{
            String sql="insert into customer(name,email,phone,password) values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1,us.getName());
           ps.setString(2,us.getEmail());
           ps.setString(3,us.getPhone());
           ps.setString(4,us.getPassword());
           
          int i=ps.executeUpdate();
          //System.out.println("value of i="+i);
          if(i==1)
          {
              f=true;
          }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    @Override
   public User login(String email,String pass)
   {
       User us=null;
       try{
           String sql="select * from customer where email=? and password=?";
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1,email);
           ps.setString(2,pass);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               us=new User();
               us.setId(rs.getInt(1));
               us.setName(rs.getString(2));
               us.setEmail(rs.getString(3));
               us.setPhone(rs.getString(4));
               us.setPassword(rs.getString(5));
               us.setAddress(rs.getString(6));
               us.setLandmark(rs.getString(9));
               us.setCity(rs.getString(7));
               us.setState(rs.getString(8));

           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        return us;
       
   }

    @Override
    public List<User> getAllUser() {
       
        List<User>list=new ArrayList<User>();
        User us=null;
        try{
            String sql="select * from customer";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
               us=new User();
               us.setId(rs.getInt(1));
               us.setName(rs.getString(2));
               us.setEmail(rs.getString(3));
               us.setPhone(rs.getString(4));
//               us.setPassword(rs.getString(5));
//               us.setAddress(rs.getString(6));
//               us.setLandmark(rs.getString(9));
//               us.setCity(rs.getString(7));
//               us.setState(rs.getString(8));
               list.add(us);
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
           return list;
    }

    
}
