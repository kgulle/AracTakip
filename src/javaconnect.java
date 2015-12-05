/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenan
 */
import org.postgresql.*;
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDB() {
        try {
        Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/AracTakip", "kenan", "kenan");
            JOptionPane.showMessageDialog(null, "basarili");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
