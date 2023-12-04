package Functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class requests_sql{
    public static String[] sql_unRegistro(String consulta_sql) {
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();
        String[] resultado = null;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement(consulta_sql);
            rs = ps.executeQuery();
            int columnCount = rs.getMetaData().getColumnCount();
            String[] registro = new String[columnCount];
            if (!rs.isBeforeFirst()){
                    JOptionPane.showMessageDialog(null, "No existe registro.");
            }
            while (rs.next()) {
                for (int i = 0; i < columnCount; i++) {
                    registro[i] = rs.getString(i + 1);
                }
            }
            resultado = registro;
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
        return resultado;
    }
    
    public static void executeStatement(String sql) {
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
}