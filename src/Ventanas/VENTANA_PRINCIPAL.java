package Ventanas;

import Functions.images;
import Functions.requests_sql;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VENTANA_PRINCIPAL extends javax.swing.JFrame {
    
    public VENTANA_PRINCIPAL() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                String sql = "Update hist_user set hora_f = CURRENT_TIME, fecha_f = CURRENT_DATE ORDER BY id DESC LIMIT 1;";
                requests_sql.executeStatement(sql);
                System.exit(0);
            }
        });
        
                // Establecer tamaño máximo
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setMaximumSize(screenSize);
        Dimension minSize = new Dimension(400, 500); // Tamaño mínimo
        setMinimumSize(minSize);
        
        // aquí ponemos los iconos en el menú
        images img = new images();
        img.cargarImagen_menuItem(menu_realizarVenta, "realizar venta.png");
        img.cargarImagen_menuItem(menu_cerrarCaja, "cerrar caja.png");
        img.cargarImagen_menuItem(menu_inventario, "inventario.png");
        img.cargarImagen_menuItem(menu_administrativo, "administrativo.png"); //administrativo.png
        img.cargarImagen_menuItem(menu_ingresarPedido, "x.png"); //ingresar pedido.png
        img.cargarImagen_menuItem(menu_verInventario, "ver inventario.png");
        img.cargarImagen_menuItem(menu_historiales, "historiales.png");
        img.cargarImagen_menuItem(menu_historialVentas, "historial ventas.png"); //historial ventas.png
        img.cargarImagen_menuItem(menu_historialUsuarios, "x.png"); //historial usuarios.png
        img.cargarImagen_menuItem(menu_historialCierres, "historial cierres.png"); //historial cierres.png

        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // Posición horizontal del componente
        constraints.gridy = 0; // Posición vertical del componente
        constraints.gridwidth = GridBagConstraints.REMAINDER; // Ocupar todo el ancho del contenedor
        constraints.gridheight = GridBagConstraints.REMAINDER; // Ocupar todo el alto del contenedor
        constraints.fill = GridBagConstraints.BOTH; // Expandir el componente en ambas direcciones (horizontal y vertical)
        constraints.weightx = 1.0; // Peso horizontal para distribución automática
        constraints.weighty = 1.0; // Peso vertical para distribución automática
        
        panel_realizarVenta panel = new panel_realizarVenta();
        container.add(panel, constraints);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        container = new javax.swing.JPanel();
        menu_barra = new javax.swing.JMenuBar();
        menu_realizarVenta = new javax.swing.JMenu();
        menu_cerrarCaja = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenu();
        menu_ingresarPedido = new javax.swing.JMenuItem();
        menu_verInventario = new javax.swing.JMenuItem();
        menu_administrativo = new javax.swing.JMenu();
        menu_historiales = new javax.swing.JMenu();
        menu_historialVentas = new javax.swing.JMenuItem();
        menu_historialUsuarios = new javax.swing.JMenuItem();
        menu_historialCierres = new javax.swing.JMenuItem();
        menu_gestionusuario = new javax.swing.JMenuItem();
        menu_cerrarSesion = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);

        container.setLayout(new java.awt.GridBagLayout());

        menu_realizarVenta.setText("Realizar venta");
        menu_realizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_realizarVentaMouseClicked(evt);
            }
        });
        menu_barra.add(menu_realizarVenta);

        menu_cerrarCaja.setText("Cerrar caja");
        menu_cerrarCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_cerrarCajaMouseClicked(evt);
            }
        });
        menu_barra.add(menu_cerrarCaja);

        menu_inventario.setText("Inventario");

        menu_ingresarPedido.setText("Ingresar pedido");
        menu_ingresarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ingresarPedidoMouseClicked(evt);
            }
        });
        menu_ingresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ingresarPedidoActionPerformed(evt);
            }
        });
        menu_inventario.add(menu_ingresarPedido);

        menu_verInventario.setText("Ver inventario");
        menu_verInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_verInventarioActionPerformed(evt);
            }
        });
        menu_inventario.add(menu_verInventario);

        menu_barra.add(menu_inventario);

        menu_administrativo.setText("Administrativo");
        menu_administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_administrativoActionPerformed(evt);
            }
        });

        menu_historiales.setText("Historiales");

        menu_historialVentas.setText("Ventas");
        menu_historialVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_historialVentasActionPerformed(evt);
            }
        });
        menu_historiales.add(menu_historialVentas);

        menu_historialUsuarios.setText("Usuarios");
        menu_historialUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_historialUsuariosMouseClicked(evt);
            }
        });
        menu_historialUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_historialUsuariosActionPerformed(evt);
            }
        });
        menu_historiales.add(menu_historialUsuarios);

        menu_historialCierres.setText("Cierres");
        menu_historialCierres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_historialCierresMouseClicked(evt);
            }
        });
        menu_historialCierres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_historialCierresActionPerformed(evt);
            }
        });
        menu_historiales.add(menu_historialCierres);

        menu_administrativo.add(menu_historiales);

        menu_gestionusuario.setText("Gestión usuarios");
        menu_gestionusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_gestionusuarioMouseClicked(evt);
            }
        });
        menu_gestionusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gestionusuarioActionPerformed(evt);
            }
        });
        menu_administrativo.add(menu_gestionusuario);

        menu_barra.add(menu_administrativo);

        menu_cerrarSesion.setText("Cerrar sesión");
        menu_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_cerrarSesionMouseClicked(evt);
            }
        });
        menu_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cerrarSesionActionPerformed(evt);
            }
        });
        menu_barra.add(menu_cerrarSesion);

        setJMenuBar(menu_barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_verInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_verInventarioActionPerformed
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 2){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        container.removeAll();
        panel_verInventario panel = new panel_verInventario();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_verInventarioActionPerformed

    private void menu_realizarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_realizarVentaMouseClicked
        container.removeAll();
        panel_realizarVenta panel = new panel_realizarVenta();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_realizarVentaMouseClicked

    private void menu_cerrarCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_cerrarCajaMouseClicked
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 2){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JDialog dialog_showPanel = new JDialog();
        if (dialog_showPanel != null && dialog_showPanel.isVisible()) {
            return;
        }
        if (dialog_showPanel.isVisible()) {
            return;
        } 
        panel_cerrarCaja panel = new panel_cerrarCaja();
        dialog_showPanel.setTitle("Cerrar caja");
        dialog_showPanel.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog_showPanel.addWindowListener(new DialogWindowListener());
        dialog_showPanel.add(panel);
        dialog_showPanel.setPreferredSize(new Dimension(450, 740));
        dialog_showPanel.pack();
        dialog_showPanel.setLocationRelativeTo(null);
        dialog_showPanel.setResizable(false);
        dialog_showPanel.setVisible(true); 
        this.setEnabled(false);
        dialog_showPanel.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Habilitar la página principal cuando se cierre el diálogo
                setEnabled(true);
            }
        });
    }//GEN-LAST:event_menu_cerrarCajaMouseClicked

    private void menu_ingresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ingresarPedidoActionPerformed
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 2){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        container.removeAll();
        panel_ingresopedido panel = new panel_ingresopedido();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_ingresarPedidoActionPerformed

    private void menu_historialCierresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_historialCierresActionPerformed
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 3){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        container.removeAll();
        panel_historialCierres panel = new panel_historialCierres();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_historialCierresActionPerformed

    private void menu_historialCierresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_historialCierresMouseClicked

    }//GEN-LAST:event_menu_historialCierresMouseClicked

    private void menu_historialVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_historialVentasActionPerformed
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 3){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        container.removeAll();
        panel_historialVentas panel = new panel_historialVentas();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_historialVentasActionPerformed

    private void menu_cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_cerrarSesionMouseClicked
        String sql = "Update hist_user set hora_f = CURRENT_TIME, fecha_f = CURRENT_DATE ORDER BY id DESC LIMIT 1;";
        requests_sql.executeStatement(sql);
        dispose();
        login login = new login();
        Dimension d = new Dimension(250, 320);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setTitle("Inicio de sesión"); //cambia el titulo de la ventana
        login.setSize(d);
        login.setLocationRelativeTo(null); //centra la ventana en la pantalla}
        login.setVisible(true);
        login.setResizable(false);
    }//GEN-LAST:event_menu_cerrarSesionMouseClicked

    private void menu_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cerrarSesionActionPerformed
        String sql = "Update hist_user set hora_f = CURRENT_TIME, fecha_f = CURRENT_DATE ORDER BY id DESC LIMIT 1;";
        requests_sql.executeStatement(sql);
        dispose();
        login login = new login();
        Dimension d = new Dimension(250, 320);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setTitle("Inicio de sesión"); //cambia el titulo de la ventana
        login.setSize(d);
        login.setLocationRelativeTo(null); //centra la ventana en la pantalla}
        login.setVisible(true);
        login.setResizable(false);
        
    }//GEN-LAST:event_menu_cerrarSesionActionPerformed

    private void menu_historialUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_historialUsuariosMouseClicked
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 3){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_menu_historialUsuariosMouseClicked

    private void menu_gestionusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gestionusuarioActionPerformed
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 3){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JDialog dialog_showPanel = new JDialog();
        if (dialog_showPanel != null && dialog_showPanel.isVisible()) {
            return;
        }
        if (dialog_showPanel.isVisible()) {
            return;
        } 
        panel_gestionusuario panel = new panel_gestionusuario();
        dialog_showPanel.setTitle("Cerrar caja");
        dialog_showPanel.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog_showPanel.addWindowListener(new DialogWindowListener());
        dialog_showPanel.add(panel);
        dialog_showPanel.setPreferredSize(new Dimension(750, 400));
        dialog_showPanel.pack();
        dialog_showPanel.setLocationRelativeTo(null);
        dialog_showPanel.setResizable(false);
        dialog_showPanel.setVisible(true); 
        this.setEnabled(false);
        dialog_showPanel.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Habilitar la página principal cuando se cierre el diálogo
                setEnabled(true);
            }
        });
    }//GEN-LAST:event_menu_gestionusuarioActionPerformed

    private void menu_gestionusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_gestionusuarioMouseClicked
 
    }//GEN-LAST:event_menu_gestionusuarioMouseClicked

    private void menu_administrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_administrativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_administrativoActionPerformed

    private void menu_historialUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_historialUsuariosActionPerformed
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 3){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        container.removeAll();
        panel_historial_usuario panel = new panel_historial_usuario();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_historialUsuariosActionPerformed

    private void menu_ingresarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ingresarPedidoMouseClicked
        login login = new login();
        Integer nivel = Integer.parseInt(login.nivel_usuario);
        if (nivel < 2){
            JOptionPane.showMessageDialog(null, "No tienes el nivel suficiente", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        container.removeAll();
        panel_ingresopedido panel = new panel_ingresopedido();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.CENTER);
    }//GEN-LAST:event_menu_ingresarPedidoMouseClicked

    
    private class DialogWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            // Activar ventana principal si el dialogo se cierra
            setEnabled(true);
            super.windowClosing(e);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menu_administrativo;
    private javax.swing.JMenuBar menu_barra;
    private javax.swing.JMenu menu_cerrarCaja;
    private javax.swing.JMenu menu_cerrarSesion;
    private javax.swing.JMenuItem menu_gestionusuario;
    private javax.swing.JMenuItem menu_historialCierres;
    private javax.swing.JMenuItem menu_historialUsuarios;
    private javax.swing.JMenuItem menu_historialVentas;
    private javax.swing.JMenu menu_historiales;
    private javax.swing.JMenuItem menu_ingresarPedido;
    private javax.swing.JMenu menu_inventario;
    private javax.swing.JMenu menu_realizarVenta;
    private javax.swing.JMenuItem menu_verInventario;
    // End of variables declaration//GEN-END:variables
}
