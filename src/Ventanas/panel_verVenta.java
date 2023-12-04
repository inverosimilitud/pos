package Ventanas;

import Functions.Dates;
import Functions.fill_tables;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class panel_verVenta extends javax.swing.JPanel {
    int id_venta = panel_historialVentas.id_venta;
    public panel_verVenta() {
        initComponents();
        
        setLayout(new GridBagLayout());
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla_venta.setModel(modelo);
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
        add(label1, gridBagConstrints.modificar_posición //label hora
        (1, 0, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        add(label2, gridBagConstrints.modificar_posición //label hora
        (1, 1, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        add(label3, gridBagConstrints.modificar_posición //label hora
        (1, 2, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        add(label_cantidadProductos, gridBagConstrints.modificar_posición //label hora
        (2, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cantidadUnidades, gridBagConstrints.modificar_posición //label hora
        (2, 1, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(label_totalVentas, gridBagConstrints.modificar_posición //label hora
        (2, 2, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(label4, gridBagConstrints.modificar_posición //label hora
        (3, 0, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        
        add(label5, gridBagConstrints.modificar_posición //label hora
        (3, 1, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        
        add(label6, gridBagConstrints.modificar_posición //label hora
        (3, 2, 5, 5, 5, 5, 1, 1, 10, 50, 0, 0, GridBagConstraints.CENTER));
        
        add(label_horaVenta, gridBagConstrints.modificar_posición //label hora
        (4, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(label_fechaVenta, gridBagConstrints.modificar_posición //label hora
        (4, 1, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(label_idVenta, gridBagConstrints.modificar_posición //label hora
        (4, 2, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_anularVenta, gridBagConstrints.modificar_posición //label hora
        (5, 0, 5, 5, 5, 5, 1, 3, 10, 50, 0, 0, GridBagConstraints.CENTER));
        boton_anularVenta.setPreferredSize(new Dimension(200, 20)); 
        add(tabla_venta, gridBagConstrints.modificar_posición //label hora
        (0, 3, 5, 5, 5, 5, 6, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane1, gridBagConstrints.modificar_posición //label hora
        (0, 3, 5, 5, 5, 5, 6, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        
        jScrollPane1.setViewportView (tabla_venta);
        Dates.fechaYhora(label_fecha, label_hora);
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        String sql_tabla ="SELECT id_prod, nombre_prod, cat_prod, cantidad_prod, precio_prod, oferta_prod, cant_prod, monto_prod FROM ventas where id="+id_venta+";";
        String columnas[] = {"Código", "Nombre", "Categoría", "Cantidad", "Precio unitario", "Oferta", "Unidades", "Precio "};
        fill_tables.rellenar_tabla_verVentas(tabla_venta, sql_tabla, columnas);
        
        String sql_label ="SELECT  id, monto_total, hora, fecha, cant_prod FROM ventas where id="+id_venta+";";
        String[] labels = requests_sql.sql_unRegistro(sql_label);
        label_idVenta.setText(labels[0]);
        label_totalVentas.setText(labels[1]);
        label_horaVenta.setText(labels[2]);
        label_fechaVenta.setText(labels[3]);
        String productos = labels[4];
        
        Integer cantidad_unidades = 0;
        Integer cantidad_productos = 0;
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
                cantidad_unidades = Integer.valueOf(char_producto.replace(",", ""));
                char_producto = "";
                primer_producto = false;
            } else if (productos.charAt(i) == ','){
                cantidad_unidades = cantidad_unidades + Integer.valueOf(char_producto);
                char_producto = "";
            } else {
                char_producto = char_producto + productos.charAt(i);
            }                    
        }   
        label_cantidadProductos.setText(cantidad_productos.toString());
        label_cantidadUnidades.setText(cantidad_unidades.toString());
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label5 = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label_horaVenta = new javax.swing.JLabel();
        label_fechaVenta = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label_idVenta = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        label3 = new javax.swing.JLabel();
        label_cantidadProductos = new javax.swing.JLabel();
        boton_anularVenta = new javax.swing.JButton();
        label_cantidadUnidades = new javax.swing.JLabel();
        label_totalVentas = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 61, 0, 0);
        add(label5, gridBagConstraints);

        label_fecha.setText("fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 0, 0);
        add(label_fecha, gridBagConstraints);

        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("Id_venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 61, 0, 0);
        add(label6, gridBagConstraints);

        label_horaVenta.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        add(label_horaVenta, gridBagConstraints);

        label_fechaVenta.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 6, 0, 0);
        add(label_fechaVenta, gridBagConstraints);

        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label1.setText("Cantidad productos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 77, 0, 0);
        add(label1, gridBagConstraints);

        label_idVenta.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 0, 0);
        add(label_idVenta, gridBagConstraints);

        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("Cantidad unidades:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 77, 0, 0);
        add(label2, gridBagConstraints);

        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_venta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 567;
        gridBagConstraints.ipady = 132;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 19, 0);
        add(jScrollPane1, gridBagConstraints);

        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("Total venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 77, 0, 0);
        add(label3, gridBagConstraints);

        label_cantidadProductos.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        add(label_cantidadProductos, gridBagConstraints);

        boton_anularVenta.setText("Anular venta");
        boton_anularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_anularVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        add(boton_anularVenta, gridBagConstraints);

        label_cantidadUnidades.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 18, 0, 0);
        add(label_cantidadUnidades, gridBagConstraints);

        label_totalVentas.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        add(label_totalVentas, gridBagConstraints);

        label_usuario.setText("usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(label_usuario, gridBagConstraints);

        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("Hora:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 61, 0, 0);
        add(label4, gridBagConstraints);

        label_hora.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(label_hora, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_anularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_anularVentaActionPerformed
        
        String sql_select = "SELECT dinero_total FROM var WHERE id = 1";
        String[] dinero_total = requests_sql.sql_unRegistro(sql_select);
        Integer dinero_nuevo = Integer.valueOf(dinero_total[0]);
        dinero_nuevo = dinero_nuevo - Integer.valueOf(label_totalVentas.getText());
        String sql_nuevo = "UPDATE var SET dinero_total = " + dinero_nuevo + " WHERE id = 1";
        requests_sql.executeStatement(sql_nuevo);
        String sql_delte = "DELETE FROM ventas WHERE id = " + id_venta;
        requests_sql.executeStatement(sql_delte);
        JOptionPane.showMessageDialog(null, "Venta anulada con éxito!");
        String sql_consulta;
        String sql_update;
        Integer stock_actual;
        Integer stock_nuevo;
        String[] stock_antiguo;
        for (int i = 0; i < tabla_venta.getRowCount(); i++){
            sql_consulta = "SELECT stock FROM productos WHERE codigo = '" + tabla_venta.getValueAt(i, 0) + "'";
            stock_antiguo = requests_sql.sql_unRegistro(sql_consulta);
            stock_actual = Integer.valueOf(tabla_venta.getValueAt(i, 6).toString());
            stock_nuevo = Integer.valueOf(stock_antiguo[0]) + stock_actual;
            sql_update = "UPDATE productos SET stock = " + stock_nuevo + " WHERE codigo = '" + tabla_venta.getValueAt(i, 0) + "'";
            requests_sql.executeStatement(sql_update);
        }
        JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        dialog.dispose();

    }//GEN-LAST:event_boton_anularVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_anularVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label_cantidadProductos;
    private javax.swing.JLabel label_cantidadUnidades;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_fechaVenta;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_horaVenta;
    private javax.swing.JLabel label_idVenta;
    private javax.swing.JLabel label_totalVentas;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTable tabla_venta;
    // End of variables declaration//GEN-END:variables
}
