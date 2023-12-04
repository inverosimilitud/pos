package Ventanas;
import Functions.Dates;
import Functions.conexionSQL;
import Functions.fill_tables;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class panel_gestionusuario extends javax.swing.JPanel {
    ButtonGroup grupoRadio = new ButtonGroup();
    String sql = ""; 
    DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    
    int fila_seleccionada = -1;
    public panel_gestionusuario() {
        initComponents();
        setLayout(new GridBagLayout());
        tabla_usuarios.setModel(modelo);
        
        
       
        add(label_usuario, gridBagConstrints.modificar_posición //label usuario
        (0, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_usuario.setPreferredSize(new Dimension(100, 20)); 
        add(label_fecha, gridBagConstrints.modificar_posición //label fecha
        (0, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_fecha.setPreferredSize(new Dimension(100, 20));
        add(label_hora, gridBagConstrints.modificar_posición //label hora
        (0, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_hora.setPreferredSize(new Dimension(100, 20));
        add(label_nombre, gridBagConstrints.modificar_posición //label fecha
        (1, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(txt_nombre, gridBagConstrints.modificar_posición //label fecha
        (2, 0, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(label_apellido, gridBagConstrints.modificar_posición //label fecha
        (1, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(txt_apellido, gridBagConstrints.modificar_posición //label fecha
        (2, 1, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(label_username, gridBagConstrints.modificar_posición //label fecha
        (1, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(txt_username, gridBagConstrints.modificar_posición //label fecha
        (2, 2, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(label_nivel, gridBagConstrints.modificar_posición //label fecha
        (3, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(radio_1, gridBagConstrints.modificar_posición //label fecha
        (4, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(radio_2, gridBagConstrints.modificar_posición //label fecha
        (5, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(radio_3, gridBagConstrints.modificar_posición //label fecha
        (6, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(boton_agregar, gridBagConstrints.modificar_posición //label fecha
        (3, 1, 5, 5, 5, 5, 4, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(boton_eliminar, gridBagConstrints.modificar_posición //label fecha
        (3, 2, 5, 5, 5, 5, 4, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(tabla_usuarios, gridBagConstrints.modificar_posición //label fecha
        (0, 3, 5, 5, 5, 5,7, 1, 10, 30, 0, 1, GridBagConstraints.CENTER));
        add(jScrollPane1, gridBagConstrints.modificar_posición //label fecha
        (0, 3, 5, 5, 5, 5, 7, 1, 10, 30, 0, 1, GridBagConstraints.CENTER));
        jScrollPane1.setViewportView (tabla_usuarios);
        
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        Dates.fechaYhora(label_fecha, label_hora);
        
        grupoRadio.add(radio_1);
        grupoRadio.add(radio_2);
        grupoRadio.add(radio_3);
        String fila[] = {"Nombre", "Apellido", "Username", "Nivel", "Contraseña"};
        
        for (int i = 0; i < 5; i++){
            modelo.addColumn(fila[i]);
        }
        sql = "SELECT  nombre, apellido, username, nivel, contrasena FROM usuarios";
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();    
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Object[] filas = new Object[10];
                filas[0] = rs.getObject(1);
                filas[1] = rs.getObject(2);
                filas[2] = rs.getObject(3);
                filas[3] = rs.getObject(4);
                filas[4] = rs.getObject(5);
                if ("nulo".equals(filas[4].toString())){
                    filas[4] = "Pendiente";
                } else {
                    filas[4] = "Listo";
                }
                modelo.addRow(filas);
            }
            rs.close();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        }
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        label_nivel = new javax.swing.JLabel();
        radio_3 = new javax.swing.JRadioButton();
        radio_1 = new javax.swing.JRadioButton();
        radio_2 = new javax.swing.JRadioButton();
        boton_agregar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        label_usuario = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 537;
        gridBagConstraints.ipady = 288;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 110, 0, 0);
        add(jScrollPane1, gridBagConstraints);

        label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_nombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 169, 0, 0);
        add(label_nombre, gridBagConstraints);

        label_apellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_apellido.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 169, 0, 0);
        add(label_apellido, gridBagConstraints);

        label_username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_username.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 169, 0, 0);
        add(label_username, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 8, 0, 0);
        add(txt_nombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        add(txt_apellido, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 18, 0, 0);
        add(txt_username, gridBagConstraints);

        label_nivel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_nivel.setText("Nivel:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 44, 0, 0);
        add(label_nivel, gridBagConstraints);

        radio_3.setText("3");
        radio_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 6, 0, 469);
        add(radio_3, gridBagConstraints);

        radio_1.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 67, 0, 0);
        add(radio_1, gridBagConstraints);

        radio_2.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 18, 0, 0);
        add(radio_2, gridBagConstraints);

        boton_agregar.setText("Agregar usuario");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 0);
        add(boton_agregar, gridBagConstraints);

        boton_eliminar.setText("Eliminar Usuario");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 6, 0, 0);
        add(boton_eliminar, gridBagConstraints);

        label_usuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 24, 0, 0);
        add(label_usuario, gridBagConstraints);

        label_fecha.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 24, 0, 0);
        add(label_fecha, gridBagConstraints);

        label_hora.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 24, 0, 0);
        add(label_hora, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void radio_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_3ActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        fila_seleccionada = -1;
        String radio;
        if (radio_1.isSelected()){
            radio = "1";
        } else if (radio_2.isSelected()){
            radio = "2";
        } else if (radio_3.isSelected()){
            radio = "3";
        } else {
            radio = "4";
        }
        String pass = "nulo";
        String datos[] = {txt_nombre.getText(), txt_apellido.getText(), txt_username.getText(),radio, pass};
        sql = "INSERT INTO usuarios (nombre, apellido, username, nivel, contrasena)"
                + " VALUES ('"+datos[0]+"','"+datos[1]+"','"+datos[2]+"','"+datos[3]+"','"+datos[4]+"');";
        requests_sql.executeStatement(sql);
        modelo.setRowCount(0);

        sql = "SELECT  nombre, apellido, username, nivel, contrasena FROM usuarios";
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();    
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Object[] filas = new Object[10];
                filas[0] = rs.getObject(1);
                filas[1] = rs.getObject(2);
                filas[2] = rs.getObject(3);
                filas[3] = rs.getObject(4);
                filas[4] = rs.getObject(5);
                if ("nulo".equals(filas[4].toString())){
                    filas[4] = "Pendiente";
                } else {
                    filas[4] = "Listo";
                }
                modelo.addRow(filas);
            }
            rs.close();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        }
        
        
        
        JOptionPane.showMessageDialog(null,"Usuario agregado con exito!");
        
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        
        sql = "select id from usuarios where username = '" + tabla_usuarios.getValueAt(fila_seleccionada, 2).toString() +"';";
        
        String[] id_ahora = requests_sql.sql_unRegistro(sql);
        System.out.println(sql);
        System.out.println(id_ahora[0]);
        if (fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un producto para eliminar.");
            return;
        }
        String sql_delete = "DELETE FROM usuarios WHERE id=" + id_ahora[0];
        requests_sql.executeStatement(sql_delete);
        
        
        modelo.setRowCount(0);

        sql = "SELECT  nombre, apellido, username, nivel, contrasena FROM usuarios";
        conexionSQL cc = new conexionSQL();
        java.sql.Connection con = cc.conexion();    
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Object[] filas = new Object[10];
                filas[0] = rs.getObject(1);
                filas[1] = rs.getObject(2);
                filas[2] = rs.getObject(3);
                filas[3] = rs.getObject(4);
                filas[4] = rs.getObject(5);
                if ("nulo".equals(filas[4].toString())){
                    filas[4] = "Pendiente";
                } else {
                    filas[4] = "Listo";
                }
                modelo.addRow(filas);
            }
            rs.close();
            ps.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());       
        }
        requests_sql.executeStatement(sql_delete);
        JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente!");
  
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        fila_seleccionada = tabla_usuarios.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tabla_usuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_nivel;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JRadioButton radio_1;
    private javax.swing.JRadioButton radio_2;
    private javax.swing.JRadioButton radio_3;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
