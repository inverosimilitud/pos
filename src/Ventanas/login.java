package Ventanas;

import Functions.Dates;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    public static String id_usuario, nivel_usuario, username_usuario;
    public login() {
        initComponents();
        setLayout(new GridBagLayout());
        
        add(label_fecha, gridBagConstrints.modificar_posición //label fecha
        (0, 0, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        label_fecha.setPreferredSize(new Dimension(100, 20));
        add(label_hora, gridBagConstrints.modificar_posición //label hora
        (0, 1, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        label_hora.setPreferredSize(new Dimension(100, 20));
        add(x_label_usuario, gridBagConstrints.modificar_posición //label hora
        (0, 3, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(x_label_contraseña, gridBagConstrints.modificar_posición //label hora
        (0, 5, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(txtfield_usuario, gridBagConstrints.modificar_posición //label hora
        (0, 4, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(txtfield_contraseña, gridBagConstrints.modificar_posición //label hora
        (0, 6, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        add(boton_ingresar, gridBagConstrints.modificar_posición //label hora
        (0, 7, 5, 5, 5, 5, 1, 1, 10, 30, 1, 0, GridBagConstraints.CENTER));
        
        
        Dates.fechaYhora(label_fecha, label_hora);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        boton_ingresar = new javax.swing.JButton();
        txtfield_contraseña = new javax.swing.JPasswordField();
        x_label_contraseña = new javax.swing.JLabel();
        txtfield_usuario = new javax.swing.JTextField();
        x_label_usuario = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        boton_ingresar.setText("Ingresar");
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });
        boton_ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boton_ingresarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boton_ingresarKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 6, 72, 0);
        getContentPane().add(boton_ingresar, gridBagConstraints);

        txtfield_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfield_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_contraseñaActionPerformed(evt);
            }
        });
        txtfield_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfield_contraseñaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 97, 0, 98);
        getContentPane().add(txtfield_contraseña, gridBagConstraints);

        x_label_contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x_label_contraseña.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 97, 0, 98);
        getContentPane().add(x_label_contraseña, gridBagConstraints);

        txtfield_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfield_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_usuarioActionPerformed(evt);
            }
        });
        txtfield_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfield_usuarioKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 97, 0, 98);
        getContentPane().add(txtfield_usuario, gridBagConstraints);

        x_label_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x_label_usuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 97, 0, 98);
        getContentPane().add(x_label_usuario, gridBagConstraints);

        label_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_fecha.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 36, 0, 0);
        getContentPane().add(label_fecha, gridBagConstraints);

        label_hora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_hora.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 36, 0, 0);
        getContentPane().add(label_hora, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
        String usuario = txtfield_usuario.getText(), contraseña = txtfield_contraseña.getText();
        String sql = "Select nivel, id, contrasena FROM usuarios where username = '" + usuario + "';";
        String[] registro_usuario = requests_sql.sql_unRegistro(sql);
        String sql_time = "Insert into hist_user (usuario, fecha_i, hora_i) values ('"+usuario+"',CURRENT_DATE, CURRENT_TIME);";
        boolean pass;
        if (registro_usuario[0] == null){ // si los datos de ingreso están incorrectos
            txtfield_contraseña.setText("");
            txtfield_usuario.setText("");
            return;
        } else if ("nulo".equals(registro_usuario[2].toString())){
                sql = "UPDATE usuarios SET contrasena ='"+txtfield_contraseña.getText()+"' WHERE id ="+registro_usuario[1]+";";
                requests_sql.executeStatement(sql);
                pass = false;
                id_usuario = registro_usuario[1];
                nivel_usuario = registro_usuario[0];
                username_usuario = usuario;
                requests_sql.executeStatement(sql_time);
                VENTANA_PRINCIPAL principal = new VENTANA_PRINCIPAL();
                principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                principal.setTitle("Punto de venta Licorería donde Franco"); //cambia el titulo de la ventana
                principal.setLocationRelativeTo(null); //centra la ventana en la pantalla}
                principal.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximiza la ventana
                principal.setVisible(true);
                this.dispose();
        }else if (txtfield_contraseña.getText().equals(registro_usuario[2]) ){
            id_usuario = registro_usuario[1];
            nivel_usuario = registro_usuario[0];
            username_usuario = usuario;
            requests_sql.executeStatement(sql_time);
            VENTANA_PRINCIPAL principal = new VENTANA_PRINCIPAL();
            principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            principal.setTitle("Punto de venta Licorería donde Franco"); //cambia el titulo de la ventana
            principal.setLocationRelativeTo(null); //centra la ventana en la pantalla}
            principal.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximiza la ventana
            principal.setVisible(true);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            txtfield_contraseña.setText("");
        }
        
    }//GEN-LAST:event_boton_ingresarActionPerformed

    private void boton_ingresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_ingresarKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            boton_ingresar.doClick();
        }
    }//GEN-LAST:event_boton_ingresarKeyReleased

    private void boton_ingresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_ingresarKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            boton_ingresar.doClick();
        }
    }//GEN-LAST:event_boton_ingresarKeyTyped

    private void txtfield_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_contraseñaActionPerformed

    private void txtfield_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_contraseñaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            boton_ingresar.doClick();
        }
    }//GEN-LAST:event_txtfield_contraseñaKeyTyped

    private void txtfield_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_usuarioActionPerformed

    private void txtfield_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_usuarioKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            boton_ingresar.doClick();
        }
    }//GEN-LAST:event_txtfield_usuarioKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JPasswordField txtfield_contraseña;
    private javax.swing.JTextField txtfield_usuario;
    private javax.swing.JLabel x_label_contraseña;
    private javax.swing.JLabel x_label_usuario;
    // End of variables declaration//GEN-END:variables
}
