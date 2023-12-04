package Functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class fill_tables{
    
    
    public static void crear_tabla(String[] fila, JTable tabla) {
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(model);
        for (String fila1 : fila) {
            model.addColumn(fila1);
        }
    }
    
    public static void rellenar_tabla_stock(JTable tabla, String sql, JComboBox categorias){
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);
        PreparedStatement ps;
        ResultSet rs;
        String columnas[] = {"Id", "Nombre", "Categoría", "Cantidad", "Código", "Oferta", "precio", "Coste", "Ganancia", "Stock"};
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            for (String columna : columnas) {
                modelo.addColumn(columna);
            }
            while (rs.next()){
                Object[] filas = new Object[10];
                filas[0] = rs.getObject(1);
                filas[1] = rs.getObject(2);
                filas[2] = rs.getObject(3).toString();
                filas[3] = rs.getObject(4);
                filas[4] = rs.getObject(5);
                if (rs.getObject(6)==null || rs.getObject(7)==null || rs.getObject(6)==null && rs.getObject(7)==null){
                    filas[5] = " ";
                } else {
                    filas[5] = rs.getObject(6) + " X " + rs.getObject(7);
                }
                filas[6] = rs.getObject(8);
                filas[7] = rs.getObject(9);
                filas[8] = rs.getObject(10);
                filas[9] = rs.getObject(11);
                modelo.addRow(filas);
            }
            //aquí rellenamos el combobox con las categorías
            
            categorias.removeAllItems(); // vaciar comboBox
            categorias.addItem("Seleccionar");
            categorias.addItem("Nueva Categoria");
            PreparedStatement ps_categorias = con.prepareStatement("SELECT DISTINCT categoria FROM productos");
            ResultSet rs_categorias = ps_categorias.executeQuery();
            while (rs_categorias.next()) {
                categorias.addItem(rs_categorias.getObject(1));
                
            }

            
            rs.close();
            ps.close();
            rs_categorias.close();
            ps_categorias.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        }
        
        
        
    }
    
    
    public static void rellenar_tabla_hVentas(JTable tabla, String sql, String[] columnas){
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            for (int i = 0; i < columnas.length; i++) {
                modelo.addColumn(columnas[i]);
            }
            while (rs.next()){
                Object[] filas = new Object[columnas.length];
                filas[0] = rs.getObject(1);
                String productos = rs.getObject(2).toString();
                filas[3] = rs.getObject(3);
                filas[4] = rs.getObject(4);
                filas[5] = rs.getObject(5);
                
                int cantidad_unidades = 0;
                int cantidad_productos = 0;
                String char_producto = "";
                boolean primer_producto = false;
                for (int i = 0; i < productos.length(); i++){
                    //primero compruebo si se suma un producto nuevo
                    if (productos.charAt(i) == ','){
                        cantidad_productos = cantidad_productos + 1;
                        if (cantidad_productos == 1){
                            primer_producto = true;
                        }
                    }
                    if (primer_producto == true){
                        char_producto = char_producto + productos.charAt(i);
                        cantidad_unidades = Integer.parseInt(char_producto.replace(",", ""));
                        char_producto = "";
                        primer_producto = false;
                    } else if (productos.charAt(i) == ','){
                        cantidad_unidades = cantidad_unidades + Integer.parseInt(char_producto);
                        char_producto = "";
                    } else {
                        char_producto = char_producto + productos.charAt(i);
                    }                    
                }   
                filas[1] = cantidad_productos;
                filas[2] = cantidad_unidades;
                modelo.addRow(filas);
            }
            rs.close();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        } 
    }
    
    public static void rellenar_tabla_verVentas(JTable tabla, String sql, String[] columnas){
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);
        PreparedStatement ps;
        ResultSet rs;
        String variable_1 = "";
        String variable_2 = "";
        String variable_3 = "";
        String variable_4 = "";
        String variable_5 = "";
        String variable_6 = "";
        String variable_7 = "";
        String variable_8 = "";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            for (int i = 0; i < columnas.length; i++) {
                modelo.addColumn(columnas[i]);
            }
            int cantidad_productos = 0;
            while (rs.next()){
                //aquí se extraen las variables de la bd para trabajarlas
                variable_1 = rs.getString(1);
                variable_2 = rs.getString(2);
                variable_3 = rs.getString(3);
                variable_4 = rs.getString(4);
                variable_5 = rs.getString(5);
                variable_6 = rs.getString(6);
                variable_7 = rs.getString(7);
                variable_8 = rs.getString(8);
                //aquí se determinan cuantos productos hay en la venta
                for (int i = 0; i < variable_7.length(); i++){
                    if (variable_7.charAt(i) == ','){
                        cantidad_productos = cantidad_productos + 1;
                    }
                }
            }
            //en este for se separarán las variables para agregar los productos
            int numero_producto = 1;
            for (int i = 0; i < cantidad_productos; i++){
                Object[] filas = new Object[columnas.length];
                int producto_iteracion = 0; 
                String producto = "";
                for (int j = 0; j < variable_1.length(); j++){
                    if (variable_1.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_1.charAt(j);
                    }
                    
                } filas[0] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_2.length(); j++){
                    if (variable_2.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_2.charAt(j);
                    }
                    
                } filas[1] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_3.length(); j++){
                    if (variable_3.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_3.charAt(j);
                    }
                    
                } filas[2] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_4.length(); j++){
                    if (variable_4.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_4.charAt(j);
                    }
                    
                } filas[3] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_5.length(); j++){
                    if (variable_5.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_5.charAt(j);
                    }
                    
                } filas[4] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_6.length(); j++){
                    if (variable_6.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_6.charAt(j);
                    }
                    
                } filas[5] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_7.length(); j++){
                    if (variable_7.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_7.charAt(j);
                    }
                    
                } filas[6] = producto;
                producto_iteracion = 0; 
                producto = "";
                for (int j = 0; j < variable_8.length(); j++){
                    if (variable_8.charAt(j) == ','){
                        producto_iteracion++;
                        if (producto_iteracion == numero_producto){
                            break;
                        } else {
                            producto = "";
                        }
                    } else {
                        producto = producto + variable_8.charAt(j);
                    }
                    
                } filas[7] = producto;
                
                
                
                
                modelo.addRow(filas);
                numero_producto++;
            }
            rs.close();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        } 
    }
    
    
    public static void rellenar_tabla_hCierres(JTable tabla, String sql, String[] columnas){
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            for (int i = 0; i < columnas.length; i++) {
                modelo.addColumn(columnas[i]);
            }
            int cantidad_productos = 0;
            Integer retiro1, retiro2, retiro3, retiro_total;
            while (rs.next()){
                Object[] filas = new Object[columnas.length];
                filas[0] = rs.getObject(1);
                filas[1] = rs.getObject(2);
                filas[2] = rs.getObject(3);
                filas[3] = rs.getObject(4);
                filas[5] = rs.getObject(5);
                filas[6] = rs.getObject(6);
                if (rs.getObject(7) != null){
                    retiro1 = Integer.parseInt(rs.getObject(7).toString());
                } else {
                    retiro1 = 0;
                }
                if (rs.getObject(8) != null){
                    retiro2 = Integer.parseInt(rs.getObject(8).toString());
                } else {
                    retiro2 = 0;
                }
                if (rs.getObject(9) != null){
                    retiro3 = Integer.parseInt(rs.getObject(9).toString());
                } else {
                    retiro3 = 0;
                }
                retiro_total = retiro1 + retiro2 + retiro3;
                filas[4] = retiro_total;
                modelo.addRow(filas);
            }
            rs.close();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        } 
    }
    
}