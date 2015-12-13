
import org.postgresql.*;
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDB() {
        try {
        Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://10.1.88.88/AracTakip", "kenan", "kenan");
          //  JOptionPane.showMessageDialog(null, "basarili");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
