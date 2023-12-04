package Ventanas;

import Functions.Dates;
import Functions.fill_tables;
import Functions.gridBagConstrints;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class panel_historialVentas extends javax.swing.JPanel {
    public static int id_venta;
    int fila_seleccionada = -1;
    public panel_historialVentas() {
        initComponents();
        setLayout(new GridBagLayout());
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla_ventas.setModel(modelo);
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
        add(boton_verVenta , gridBagConstrints.modificar_posición
        (2, 0, 5, 5, 5, 5, 1, 3, 10, 50, 0, 0, GridBagConstraints.CENTER));
        boton_verVenta.setPreferredSize(new Dimension(200, 20));
        add(tabla_ventas , gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane1 , gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        jScrollPane1.setViewportView (tabla_ventas);
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        Dates.fechaYhora(label_fecha, label_hora);
        String columnas[] = {"Id", "Cantidad de productos", "Cantidad de unidades", "Monto total", "Hora", "Fecha"};
        String sql ="SELECT  id, cant_prod, monto_total, hora, fecha FROM ventas order by id desc;";
        fill_tables.rellenar_tabla_hVentas(tabla_ventas, sql, columnas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label_usuario = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        boton_verVenta = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        label_usuario.setText("usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 23, 0, 0);
        add(label_usuario, gridBagConstraints);

        label_hora.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 23, 0, 0);
        add(label_hora, gridBagConstraints);

        label_fecha.setText("fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 23, 0, 0);
        add(label_fecha, gridBagConstraints);

        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ventas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 210;
        gridBagConstraints.ipady = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 31, 95, 81);
        add(jScrollPane1, gridBagConstraints);

        boton_verVenta.setText("Ver venta");
        boton_verVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_verVentaActionPerformed(evt);
            }
        });
        add(boton_verVenta, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventasMouseClicked
        fila_seleccionada = tabla_ventas.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tabla_ventasMouseClicked

    private void boton_verVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_verVentaActionPerformed
        JDialog dialog_showPanel = new JDialog();
        if (dialog_showPanel != null && dialog_showPanel.isVisible()) {
            return;
        }
        if (fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una venta para verla.");
            return;
        }
        id_venta = Integer.parseInt(tabla_ventas.getValueAt(fila_seleccionada, 0).toString());
        
        panel_verVenta panel = new panel_verVenta();
        dialog_showPanel.setTitle("Ver venta");
        dialog_showPanel.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog_showPanel.add(panel);
        dialog_showPanel.setPreferredSize(new Dimension(800, 500));
        dialog_showPanel.pack();
        dialog_showPanel.setLocationRelativeTo(null);
        dialog_showPanel.setResizable(false);
        dialog_showPanel.setVisible(true); 
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        parentFrame.setEnabled(false);
        dialog_showPanel.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Habilitar la página principal cuando se cierre el diálogo
                parentFrame.setEnabled(true);
            }
        });
    }//GEN-LAST:event_boton_verVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_verVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTable tabla_ventas;
    // End of variables declaration//GEN-END:variables
}
