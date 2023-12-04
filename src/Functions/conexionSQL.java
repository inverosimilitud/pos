package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {
    Connection conectar = null;
    public Connection conexion(){     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pdv","root","0912");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion con el servior: "+ex.getMessage());  
        }
        return conectar;
    }
}