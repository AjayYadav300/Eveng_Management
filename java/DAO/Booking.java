/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.BookingDtls;
import java.util.List;

/**
 *
 * @author arpit
 */
public interface Booking {
    public List<BookingDtls> admin();
     public List<BookingDtls> users(int id);
}
