package Ventanas;

import Functions.Dates;
import Functions.fill_tables;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panel_verInventario extends javax.swing.JPanel {
    String sql = ""; 
    int fila_seleccionada;
    public panel_verInventario() {
        initComponents();
        setLayout(new GridBagLayout());
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla_stock.setModel(modelo);
       
        add(label_usuario, gridBagConstrints.modificar_posición //label usuario
        (0, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_usuario.setPreferredSize(new Dimension(100, 20)); 
        add(label_fecha, gridBagConstrints.modificar_posición //label fecha
        (0, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_fecha.setPreferredSize(new Dimension(100, 20));
        add(label_hora, gridBagConstrints.modificar_posición //label hora
        (0, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_hora.setPreferredSize(new Dimension(100, 20));
        add(x_label_nombre, gridBagConstrints.modificar_posición //x label nombre
        (1, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.EAST));
        add(x_label_categoria, gridBagConstrints.modificar_posición //x label cat
        (1, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.EAST));
        add(x_label_codigo, gridBagConstrints.modificar_posición //x label cod
        (1, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.EAST));
        add(x_label_cantidad, gridBagConstrints.modificar_posición //x label cant
        (1, 3, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.EAST));
        add(txtfield_nombre, gridBagConstrints.modificar_posición //txt nombre
        (2, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(combobox_categoria, gridBagConstrints.modificar_posición //combo cat
        (2, 1, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_codigo, gridBagConstrints.modificar_posición //txt cod
        (2, 2, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_cantidad, gridBagConstrints.modificar_posición //txt cant
        (2, 3, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(x_label_oferta, gridBagConstrints.modificar_posición //x lab off
        (3, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(x_label_precio, gridBagConstrints.modificar_posición //x lab precio
        (3, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(x_label_coste, gridBagConstrints.modificar_posición //x lab coste
        (3, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(x_label_stock, gridBagConstrints.modificar_posición //x lab stock
        (3, 3, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(spinner_cantidad_off, gridBagConstrints.modificar_posición //sp cant off
        (4, 0, 5, 5, 5, 5, 1, 1, 10, 10, 0.3, 0, GridBagConstraints.CENTER));
        add(x_label_x, gridBagConstrints.modificar_posición //x lab x
        (5, 0, 5, 5, 5, 5, 1, 1, 10, 5, 0, 0, GridBagConstraints.CENTER));
        x_label_x.setPreferredSize(new Dimension(1, 10));
        add(txtfield_precio_off, gridBagConstrints.modificar_posición //txt precio off
        (6, 0, 5, 5, 5, 5, 1, 1, 10, 50, 0.3, 0, GridBagConstraints.CENTER));
        add(txtfield_precio, gridBagConstrints.modificar_posición //txt precio
        (4, 1, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_coste, gridBagConstrints.modificar_posición //txt coste
        (4, 2, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_stock, gridBagConstrints.modificar_posición //txt stock
        (4, 3, 5, 5, 5, 5, 3, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_buscarProducto, gridBagConstrints.modificar_posición //boton buscar
        (7, 0, 5, 5, 5, 5, 1, 1, 10, 10, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_borrarDatos, gridBagConstrints.modificar_posición //boton borrar datos
        (7, 1, 5, 5, 5, 5, 1, 1, 10, 10, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_resetTabla, gridBagConstrints.modificar_posición //boton reset
        (7, 2, 5, 5, 5, 5, 1, 1, 10, 10, 1.0, 0, GridBagConstraints.CENTER));
        add(combobox_ordenarPor, gridBagConstrints.modificar_posición //combo ordenar
        (7, 3, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_agregarProducto, gridBagConstrints.modificar_posición //boton agregar
        (8, 0, 5, 5, 5, 5, 1, 1, 10, 10, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_modificarProducto, gridBagConstrints.modificar_posición //boton modificar
        (8, 1, 5, 5, 5, 5, 1, 1, 10, 10, 1.0, 0, GridBagConstraints.CENTER));
        add(boton_eliminarProducto, gridBagConstrints.modificar_posición //boton eliminar
        (8, 2, 5, 5, 5, 5, 1, 1, 10, 10, 1.0, 0, GridBagConstraints.CENTER));
        add(tabla_stock, gridBagConstrints.modificar_posición //tabla 
        (0, 4, 5, 5, 5, 5, 9, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane1, gridBagConstrints.modificar_posición //Scroll
        (0, 4, 5, 5, 5, 5, 9, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        jScrollPane1.setViewportView (tabla_stock);
        
            login login = new login();
            label_usuario.setText("Usuario: " + login.username_usuario);
            Dates.fechaYhora(label_fecha, label_hora);
        String filas[] = {"Id", "Nombre", "Categoría", "Cantidad", "Código", "Oferta", "precio", "Coste", "Ganancia", "Stock"};
        fill_tables.crear_tabla(filas, tabla_stock); //se añaden columnas
        sql = "SELECT  id, nombre, categoria, cantidad, codigo, off_cant, off_precio, precio, coste, (precio-coste), stock FROM productos";
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label_usuario = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        x_label_nombre = new javax.swing.JLabel();
        x_label_categoria = new javax.swing.JLabel();
        x_label_codigo = new javax.swing.JLabel();
        x_label_cantidad = new javax.swing.JLabel();
        txtfield_nombre = new javax.swing.JTextField();
        txtfield_codigo = new javax.swing.JTextField();
        txtfield_cantidad = new javax.swing.JTextField();
        x_label_oferta = new javax.swing.JLabel();
        x_label_precio = new javax.swing.JLabel();
        x_label_coste = new javax.swing.JLabel();
        x_label_stock = new javax.swing.JLabel();
        txtfield_precio = new javax.swing.JTextField();
        txtfield_coste = new javax.swing.JTextField();
        txtfield_stock = new javax.swing.JTextField();
        x_label_x = new javax.swing.JLabel();
        spinner_cantidad_off = new javax.swing.JSpinner();
        txtfield_precio_off = new javax.swing.JTextField();
        boton_buscarProducto = new javax.swing.JButton();
        boton_borrarDatos = new javax.swing.JButton();
        boton_resetTabla = new javax.swing.JButton();
        boton_agregarProducto = new javax.swing.JButton();
        boton_modificarProducto = new javax.swing.JButton();
        boton_eliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_stock = new javax.swing.JTable();
        combobox_categoria = new javax.swing.JComboBox<>();
        combobox_ordenarPor = new javax.swing.JComboBox<>();

        setLayout(new java.awt.GridBagLayout());

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

        x_label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_nombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 79, 0, 0);
        add(x_label_nombre, gridBagConstraints);

        x_label_categoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_categoria.setText("Categoría:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 79, 0, 0);
        add(x_label_categoria, gridBagConstraints);

        x_label_codigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_codigo.setText("Código:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 79, 0, 0);
        add(x_label_codigo, gridBagConstraints);

        x_label_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_cantidad.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 79, 0, 0);
        add(x_label_cantidad, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 0, 0);
        add(txtfield_nombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 2, 0, 0);
        add(txtfield_codigo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 2, 0, 0);
        add(txtfield_cantidad, gridBagConstraints);

        x_label_oferta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_oferta.setText("Oferta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 52, 0, 0);
        add(x_label_oferta, gridBagConstraints);

        x_label_precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_precio.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 52, 0, 0);
        add(x_label_precio, gridBagConstraints);

        x_label_coste.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_coste.setText("Coste:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 52, 0, 0);
        add(x_label_coste, gridBagConstraints);

        x_label_stock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_stock.setText("Stock:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 52, 0, 0);
        add(x_label_stock, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 7, 0, 0);
        add(txtfield_precio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 7, 0, 0);
        add(txtfield_coste, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        add(txtfield_stock, gridBagConstraints);

        x_label_x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x_label_x.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 0);
        add(x_label_x, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        add(spinner_cantidad_off, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(txtfield_precio_off, gridBagConstraints);

        boton_buscarProducto.setText("Buscar producto");
        boton_buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 0, 0);
        add(boton_buscarProducto, gridBagConstraints);

        boton_borrarDatos.setText("Borrar datos");
        boton_borrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarDatosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 43, 0, 0);
        add(boton_borrarDatos, gridBagConstraints);

        boton_resetTabla.setText("Reset tabla");
        boton_resetTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_resetTablaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 49, 0, 0);
        add(boton_resetTabla, gridBagConstraints);

        boton_agregarProducto.setText("Agregar producto");
        boton_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        add(boton_agregarProducto, gridBagConstraints);

        boton_modificarProducto.setText("Modificar producto");
        boton_modificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 14, 0, 0);
        add(boton_modificarProducto, gridBagConstraints);

        boton_eliminarProducto.setText("Eliminar producto");
        boton_eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        add(boton_eliminarProducto, gridBagConstraints);

        tabla_stock.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_stockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_stock);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 827;
        gridBagConstraints.ipady = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 104, 6);
        add(jScrollPane1, gridBagConstraints);

        combobox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        add(combobox_categoria, gridBagConstraints);

        combobox_ordenarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orden por defecto", "Por nombre", "Por categoría" }));
        combobox_ordenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_ordenarPorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 56, 0, 0);
        add(combobox_ordenarPor, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarProductoActionPerformed
        fila_seleccionada = -1;
        String[] codigo_sql = new String[9];
        codigo_sql[0] = " nombre LIKE '%" + txtfield_nombre.getText() + "%' ";
        codigo_sql[1] = " categoria = '" + combobox_categoria.getSelectedItem().toString() + "' ";
        codigo_sql[2] = " codigo = '" + txtfield_codigo.getText() + "' ";
        codigo_sql[3] = " cantidad LIKE '%" + txtfield_cantidad.getText() + "%' ";
        codigo_sql[4] = " off_cant = '" + spinner_cantidad_off.getValue() + "' ";
        codigo_sql[5] = " off_precio = '" + txtfield_precio_off.getText() + "' ";
        codigo_sql[6] = " precio LIKE '%" + txtfield_precio.getText() + "%' ";
        codigo_sql[7] = " coste LIKE '%" + txtfield_coste.getText() + "%' ";
        codigo_sql[8] = " stock LIKE '%" + txtfield_stock.getText() + "%' ";
        sql ="SELECT  id, nombre, categoria, cantidad, codigo, off_cant, off_precio, precio, coste, (precio-coste), stock FROM productos";
        String[] variables = new String[9];
        variables[0] = txtfield_nombre.getText();
        variables[1] = combobox_categoria.getSelectedItem().toString();
        variables[2] = txtfield_codigo.getText();
        variables[3] = txtfield_cantidad.getText();
        variables[4] = spinner_cantidad_off.getValue().toString();
        variables[5] = txtfield_precio_off.getText();
        variables[6] = txtfield_precio.getText();
        variables[7] = txtfield_coste.getText();
        variables[8] = txtfield_stock.getText();
        int numero_variable = 1;
        if ("Seleccionar".equals(variables[1]) || "Nueva categoría".equals(variables[1])){
            variables[1] = "";
        }
        for (int i = 0; i < 9; i++){
            if (i == 4 & variables[i] != "0"){
                if (!variables[5].isBlank()){
                    if (numero_variable == 1){
                        sql = sql + " WHERE" + codigo_sql[i];
                        numero_variable++;
                    } else {
                        sql = sql + "AND" + codigo_sql[i];
                    }
                }
            } else if (!variables[i].isBlank()){
                if (numero_variable == 1){
                    sql = sql + " WHERE" + codigo_sql[i];
                    numero_variable++;
                } else {
                    sql = sql + "AND" + codigo_sql[i];
                }
            }
        }
        System.out.println(sql);
        System.out.println(variables[1]);
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
    }//GEN-LAST:event_boton_buscarProductoActionPerformed

    private void boton_borrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarDatosActionPerformed
        fila_seleccionada = -1;
        txtfield_nombre.setText("");
        combobox_categoria.setSelectedItem("Seleccionar");
        txtfield_cantidad.setText("");
        txtfield_codigo.setText("");
        spinner_cantidad_off.setValue(0);
        txtfield_precio_off.setText("");
        txtfield_precio.setText("");
        txtfield_coste.setText("");
        txtfield_stock.setText("");
    }//GEN-LAST:event_boton_borrarDatosActionPerformed

    private void boton_resetTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_resetTablaActionPerformed
        fila_seleccionada = -1;
        sql = "SELECT  id, nombre, categoria, cantidad, codigo, off_cant, off_precio, precio, coste, (precio-coste), stock FROM productos";
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
        combobox_ordenarPor.setSelectedItem("Orden por defecto");
    }//GEN-LAST:event_boton_resetTablaActionPerformed

    private void boton_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarProductoActionPerformed
        fila_seleccionada = -1;
        String sql_update = "INSERT INTO productos (";
        String[] variables = new String[9];
        String[] codigo = new String[9];
        codigo[0] = "nombre";
        codigo[1] = "categoria";
        codigo[2] = "codigo";
        codigo[3] = "cantidad";
        codigo[4] = "off_cant";
        codigo[5] = "off_precio";
        codigo[6] = "precio";
        codigo[7] = "coste";
        codigo[8] = "stock";
        variables[0] = txtfield_nombre.getText();
        variables[1] = combobox_categoria.getSelectedItem().toString();
        variables[2] = txtfield_codigo.getText();
        variables[3] = txtfield_cantidad.getText();
        variables[4] = spinner_cantidad_off.getValue().toString();
        variables[5] = txtfield_precio_off.getText();
        variables[6] = txtfield_precio.getText();
        variables[7] = txtfield_coste.getText();
        variables[8] = txtfield_stock.getText();
        if ("0".equals(variables[4]) || variables[5].isBlank()){ //si algún campo de la oferta está vacío se elimina
            variables[4] = "";
            variables[5] = "";
        }
        if ("Seleccionar".equals(variables[1])){
            JOptionPane.showMessageDialog(null, "Seleccione una categoría válida.");
            return;
        }
        System.out.println(variables[1]);
        if ("Nueva Categoria".equals(variables[1])){
            String newcat = JOptionPane.showInputDialog("Ingrese la nueva categoría.");
            variables[1] = newcat;
            System.out.println(variables[1]);
        }
        int variables_noVacias = 0;
        for (int i = 0; i < 9; i++){
            if (!variables[i].isBlank()){
                variables_noVacias++;
            }
        }

        Integer iteracion_noVacia = 1;
        for (int i = 0; i<9; i++){ //se agregan los valores a insertar
            if (!"".equals(variables[i])){
                if (iteracion_noVacia == variables_noVacias){
                    sql_update = sql_update + codigo[i] + ") ";
                    break;
                } else {sql_update = sql_update + codigo[i] + ", ";}
                iteracion_noVacia = iteracion_noVacia + 1;
            }
        }
        iteracion_noVacia = 1;
        sql_update = sql_update + "VALUES('";
        for (int i = 0; i<9; i++){
            if (!"".equals(variables[i])){
                if (iteracion_noVacia == variables_noVacias){
                    sql_update = sql_update + variables[i] + "');";
                    break;
                } else {sql_update = sql_update + variables[i] + "', '";}
                iteracion_noVacia = iteracion_noVacia + 1;
            }
        }
        requests_sql.executeStatement(sql_update);
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
        combobox_categoria.setSelectedItem(variables[1]);
        JOptionPane.showMessageDialog(null, "Producto '" + variables[0] + "' agregado exitosamente!");
    }//GEN-LAST:event_boton_agregarProductoActionPerformed

    private void boton_modificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarProductoActionPerformed
        if (fila_seleccionada < 0){
            JOptionPane.showMessageDialog(null, "Seleccione un producto para a modificar!");
            return;
        }
        String sql_update = "UPDATE productos SET ";
        String[] variables = new String[9];
        String[] codigo = new String[9];
        codigo[0] = "nombre";
        codigo[1] = "categoria";
        codigo[2] = "codigo";
        codigo[3] = "cantidad";
        codigo[4] = "off_cant";
        codigo[5] = "off_precio";
        codigo[6] = "precio";
        codigo[7] = "coste";
        codigo[8] = "stock";
        variables[0] = txtfield_nombre.getText();
        variables[1] = combobox_categoria.getSelectedItem().toString();
        variables[2] = txtfield_codigo.getText();
        variables[3] = txtfield_cantidad.getText();
        variables[4] = spinner_cantidad_off.getValue().toString();
        variables[5] = txtfield_precio_off.getText();
        variables[6] = txtfield_precio.getText();
        variables[7] = txtfield_coste.getText();
        variables[8] = txtfield_stock.getText();
        int variables_noVacias = 0;
        boolean modificar_precioOff = false;
        if ("0".equals(variables[4]) || variables[5].isBlank()){ //si algún campo de la oferta está vacío se elimina
            variables[4] = "";
            variables[5] = "";
            variables_noVacias = variables_noVacias + 1;
            modificar_precioOff = true;
        }
        if ("Seleccionar".equals(variables[1]) || "Nueva categoría".equals(variables[1])){
            JOptionPane.showMessageDialog(null, "Seleccione una categoría válida.");
            return;
        }

        for (int i = 0; i < 9; i++){
            if (!variables[i].isBlank()){
                variables_noVacias++;
            }
        }
        int iteracion_noVacia = 1;
        for (int i = 0; i<9; i++){
            if (modificar_precioOff == true){
                if (variables_noVacias == 1){
                    sql_update = sql_update + "off_cant = null, off_precio = null WHERE id="+tabla_stock.getValueAt(fila_seleccionada, 0);
                    break;
                } else {
                    sql_update = sql_update + "off_cant = null, off_precio = null ,";
                    iteracion_noVacia++;
                }
                modificar_precioOff =  false;
            }
            if (!variables[i].isBlank()){
                if (iteracion_noVacia == variables_noVacias){
                    sql_update = sql_update + codigo[i] + "='" + variables[i] +"' WHERE id="+tabla_stock.getValueAt(fila_seleccionada, 0);
                } else {sql_update = sql_update + codigo[i] + "='"+variables[i] + "' ,";}
                iteracion_noVacia++;
            }
        }
        requests_sql.executeStatement(sql_update);
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
        combobox_categoria.setSelectedItem(variables[1]);
        JOptionPane.showMessageDialog(null, "El producto '" + variables[0] + "' ha sido modificado con exito!");
    }//GEN-LAST:event_boton_modificarProductoActionPerformed

    private void boton_eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarProductoActionPerformed
        if (fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un producto para eliminar.");
            return;
        }
        String nombre_producto = tabla_stock.getValueAt(fila_seleccionada, 1).toString();
        String categoria_seleccionada = combobox_categoria.getSelectedItem().toString();
        String sql_delete = "DELETE FROM productos WHERE id=" + tabla_stock.getValueAt(fila_seleccionada, 0);
        requests_sql.executeStatement(sql_delete);
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
        combobox_categoria.setSelectedItem(categoria_seleccionada);
        JOptionPane.showMessageDialog(null, "Producto '" + nombre_producto + "' eliminado exitosamente!");
    }//GEN-LAST:event_boton_eliminarProductoActionPerformed

    private void tabla_stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_stockMouseClicked
        fila_seleccionada = tabla_stock.rowAtPoint(evt.getPoint());

        if (tabla_stock.getValueAt(fila_seleccionada, 1)==null){
            txtfield_nombre.setText("");
        } else {txtfield_nombre.setText(tabla_stock.getValueAt(fila_seleccionada, 1).toString());}

        if (tabla_stock.getValueAt(fila_seleccionada, 2)==null){
            combobox_categoria.setSelectedItem("Seleccionar");
        } else {combobox_categoria.setSelectedItem(tabla_stock.getValueAt(fila_seleccionada, 2).toString());}

        if (tabla_stock.getValueAt(fila_seleccionada, 3)==null){
            txtfield_cantidad.setText("");
        } else {txtfield_cantidad.setText(tabla_stock.getValueAt(fila_seleccionada, 3).toString());}

        if (tabla_stock.getValueAt(fila_seleccionada, 4)==null){
            txtfield_codigo.setText("");
        } else {txtfield_codigo.setText(tabla_stock.getValueAt(fila_seleccionada, 4).toString());}

        if (tabla_stock.getValueAt(fila_seleccionada, 6)==null){
            txtfield_precio.setText("");
        } else {txtfield_precio.setText(tabla_stock.getValueAt(fila_seleccionada, 6).toString());}
        ;
        if (tabla_stock.getValueAt(fila_seleccionada, 7)==null){
            txtfield_coste.setText("");
        } else {txtfield_coste.setText(tabla_stock.getValueAt(fila_seleccionada, 7).toString());}
        ;
        if (tabla_stock.getValueAt(fila_seleccionada, 9)==null){
            txtfield_stock.setText("");
        } else {txtfield_stock.setText(tabla_stock.getValueAt(fila_seleccionada, 9).toString());}

        if (tabla_stock.getValueAt(fila_seleccionada, 5)==" "){
            spinner_cantidad_off.setValue(0);
            txtfield_precio_off.setText("");
        } else { //aquí, si tiene oferta, se separan sus componentes
            String oferta = tabla_stock.getValueAt(fila_seleccionada, 5).toString();
            String texto = "";
            for (int i = 0; i < oferta.length(); i++){
                char letra = oferta.charAt(i);
                if (i == oferta.length()-1){
                    texto = texto + letra;
                    txtfield_precio_off.setText(texto);
                } else if (letra == 'X'){
                    spinner_cantidad_off.setValue(Integer.valueOf(texto));
                    texto = "";
                } else if (letra == ' '){
                } else {
                    texto = texto + letra;
                }
            }
        }
    }//GEN-LAST:event_tabla_stockMouseClicked

    private void combobox_ordenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_ordenarPorActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_stock.getModel();
        modelo.setRowCount(0); // elimina todas las filas
        modelo.fireTableDataChanged(); // actualiza la vista de la tabla
        String criterio_orden = (String) combobox_ordenarPor.getSelectedItem();
        String sql_criterio = "";
        switch (criterio_orden){ //aquí se revisan los criterios de orden y se escoje el indicado
            case "Orden por defecto":
            sql_criterio = "";
            break;
            case "Por nombre":
            sql_criterio = " ORDER BY nombre ASC";
            break;
            case "Por categoría":
            sql_criterio = " ORDER BY categoria ASC";
            break;
        }
        sql = sql.replace(" ORDER BY nombre ASC", "");
        sql = sql.replace(" ORDER BY categoria ASC", "");
        sql = sql + sql_criterio;
        System.out.println(sql);
        fill_tables.rellenar_tabla_stock(tabla_stock, sql, combobox_categoria);
    }//GEN-LAST:event_combobox_ordenarPorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregarProducto;
    private javax.swing.JButton boton_borrarDatos;
    private javax.swing.JButton boton_buscarProducto;
    private javax.swing.JButton boton_eliminarProducto;
    private javax.swing.JButton boton_modificarProducto;
    private javax.swing.JButton boton_resetTabla;
    private javax.swing.JComboBox<String> combobox_categoria;
    private javax.swing.JComboBox<String> combobox_ordenarPor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JSpinner spinner_cantidad_off;
    private javax.swing.JTable tabla_stock;
    private javax.swing.JTextField txtfield_cantidad;
    private javax.swing.JTextField txtfield_codigo;
    private javax.swing.JTextField txtfield_coste;
    private javax.swing.JTextField txtfield_nombre;
    private javax.swing.JTextField txtfield_precio;
    private javax.swing.JTextField txtfield_precio_off;
    private javax.swing.JTextField txtfield_stock;
    private javax.swing.JLabel x_label_cantidad;
    private javax.swing.JLabel x_label_categoria;
    private javax.swing.JLabel x_label_codigo;
    private javax.swing.JLabel x_label_coste;
    private javax.swing.JLabel x_label_nombre;
    private javax.swing.JLabel x_label_oferta;
    private javax.swing.JLabel x_label_precio;
    private javax.swing.JLabel x_label_stock;
    private javax.swing.JLabel x_label_x;
    // End of variables declaration//GEN-END:variables
}
