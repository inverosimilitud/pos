package Ventanas;


import Functions.Dates;
import Functions.fill_tables;
import Functions.gridBagConstrints;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;  
import javax.swing.table.DefaultTableModel;

public class panel_historialCierres extends javax.swing.JPanel {
    int fila_seleccionada = -1;
    public panel_historialCierres() {
        initComponents();
        setLayout(new GridBagLayout());
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla_cierres.setModel(modelo);
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
        add(boton_verCierre , gridBagConstrints.modificar_posición
        (2, 0, 5, 5, 5, 5, 1, 3, 10, 50, 0, 0, GridBagConstraints.CENTER));
        boton_verCierre.setPreferredSize(new Dimension(200, 20));
        add(tabla_cierres, gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane2 , gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane2 , gridBagConstrints.modificar_posición
        (0, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        jScrollPane2.setViewportView (tabla_cierres);

        Dates.fechaYhora(label_fecha, label_hora);
        String columnas[] = {"Id", "Dinero total", "Venta total", "Caja mañana", "Retiros", "Hora", "Fecha"};
        String sql ="SELECT  id, total, venta, caja_mañana, hora, fecha, retiro1, retiro2, retiro3 FROM cierres order by id desc;";
        fill_tables.rellenar_tabla_hCierres(tabla_cierres, sql, columnas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label_usuario = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        boton_verCierre = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_cierres = new javax.swing.JTable();

        setLayout(new java.awt.GridBagLayout());

        label_usuario.setText("usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 0, 0);
        add(label_usuario, gridBagConstraints);

        label_hora.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        add(label_hora, gridBagConstraints);

        label_fecha.setText("fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 6, 0, 0);
        add(label_fecha, gridBagConstraints);

        boton_verCierre.setText("Ver cierre");
        boton_verCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_verCierreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 255, 0, 0);
        add(boton_verCierre, gridBagConstraints);

        tabla_cierres.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_cierres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_cierresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_cierres);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 347;
        gridBagConstraints.ipady = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 4, 51, 6);
        add(jScrollPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_verCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_verCierreActionPerformed
        JDialog dialog_showPanel = new JDialog();
        if (dialog_showPanel != null && dialog_showPanel.isVisible()) {
            return;
        }
        if (fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un cierre para ver.");
            return;
        }
        int id_cierre = Integer.parseInt(tabla_cierres.getValueAt(fila_seleccionada, 0).toString());
        panel_verCierre panel = new panel_verCierre(id_cierre);
        dialog_showPanel.setTitle("Ver cierre");
        dialog_showPanel.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog_showPanel.add(panel);
        dialog_showPanel.setPreferredSize(new Dimension(450, 600));
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
        
        
        
    }//GEN-LAST:event_boton_verCierreActionPerformed

    private void tabla_cierresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_cierresMouseClicked
        fila_seleccionada = tabla_cierres.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tabla_cierresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_verCierre;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTable tabla_cierres;
    // End of variables declaration//GEN-END:variables
}
