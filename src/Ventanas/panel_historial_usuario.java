package Ventanas;

import Functions.Dates;
import Functions.conexionSQL;
import Functions.fill_tables;
import Functions.gridBagConstrints;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panel_historial_usuario extends javax.swing.JPanel {


    public panel_historial_usuario() {
        initComponents();
        setLayout(new GridBagLayout());
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla_sesiones.setModel(modelo);
        //posicionamos absolutamente todo
        add(label_usuario, gridBagConstrints.modificar_posición //label usuario
        (0, 0, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        label_usuario.setPreferredSize(new Dimension(200, 20)); 
        add(label_fecha, gridBagConstrints.modificar_posición //label fecha
        (0, 1, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        label_fecha.setPreferredSize(new Dimension(200, 20));
        add(label_hora, gridBagConstrints.modificar_posición //label hora
        (0, 2, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        label_hora.setPreferredSize(new Dimension(200, 20));
        add(new JLabel(), gridBagConstrints.modificar_posición
        (1, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(tabla_sesiones , gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane1 , gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        jScrollPane1.setViewportView (tabla_sesiones);
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        Dates.fechaYhora(label_fecha, label_hora);
        String columnas[] = {"Usuario", "Fecha inicio", "Fecha fin", "Hora inicio", "Hora fin"};
        for (int i = 0; i < 5; i++){
            modelo.addColumn(columnas[i]);
        }
        String sql ="SELECT  usuario, fecha_i, fecha_f, hora_i, hora_f FROM hist_user order by id desc;";
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

        label_usuario = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_sesiones = new javax.swing.JTable();

        label_usuario.setText("usuario");

        label_hora.setText("Hora");

        label_fecha.setText("fecha");

        tabla_sesiones.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_sesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_sesionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_sesiones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_usuario)
                        .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_hora)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 65, Short.MAX_VALUE)
                    .addComponent(label_usuario)
                    .addGap(14, 14, 14)
                    .addComponent(label_fecha)
                    .addGap(14, 14, 14)
                    .addComponent(label_hora)
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_sesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_sesionesMouseClicked

    }//GEN-LAST:event_tabla_sesionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTable tabla_sesiones;
    // End of variables declaration//GEN-END:variables
}
