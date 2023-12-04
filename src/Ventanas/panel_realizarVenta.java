package Ventanas;

import javax.swing.table.DefaultTableCellRenderer;
import Functions.Dates;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class panel_realizarVenta extends javax.swing.JPanel {
    Integer CantOriginal = 0;
    Integer ValorOriginal = 0;
    boolean edit = false;
    int fila_seleccionada = -1;
    public panel_realizarVenta() {
        initComponents();
        setLayout(new GridBagLayout());
        
        Color gris = new Color(88, 88, 88);
        setBackground(gris);
        
        //posicionamos absolutamente todo
        add(label_usuario1, gridBagConstrints.modificar_posición //label usuario
        (0, 0, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        label_usuario1.setPreferredSize(new Dimension(30, 20)); 
        add(label_fecha1, gridBagConstrints.modificar_posición //label fecha
        (0, 1, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        label_fecha1.setPreferredSize(new Dimension(30, 20));
        add(label_hora1, gridBagConstrints.modificar_posición //label hora
        (0, 2, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        label_hora1.setPreferredSize(new Dimension(30, 20));
        add(txtfield_codigo, gridBagConstrints.modificar_posición //txt codigo
        (0, 3, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        txtfield_codigo.setPreferredSize(new Dimension(175, 25));
        add(spinner_cantidad, gridBagConstrints.modificar_posición //sp cantidad
        (1, 3, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        spinner_cantidad.setPreferredSize(new Dimension(25, 25));
        add(boton_agregarProducto, gridBagConstrints.modificar_posición //boton agregar
        (0, 4, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        boton_agregarProducto.setPreferredSize(new Dimension(30, 10));
        add(boton_finalizarVenta, gridBagConstrints.modificar_posición //boton finalizar
        (0, 5, 5, 5, 5, 5, 2, 2, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        boton_finalizarVenta.setPreferredSize(new Dimension(30, 100));
        add(x_label_x, gridBagConstrints.modificar_posición //boton finalizar
        (0, 5, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        x_label_x.setPreferredSize(new Dimension(30, 100));
        add(x_label_montoTotal, gridBagConstrints.modificar_posición //x label unidades
        (5, 6, 5, 5, 5, 5, 1, 2, 10, 50, 1.0, 0, GridBagConstraints.EAST));
        x_label_montoTotal.setPreferredSize(new Dimension(50, 100));
        add(x_label_totalUnidades, gridBagConstrints.modificar_posición //x label unidades
        (2, 6, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.EAST));
        x_label_totalUnidades.setPreferredSize(new Dimension(50, 100));
        add(label_montoTotal, gridBagConstrints.modificar_posición // label monto
        (6, 6, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 0, GridBagConstraints.WEST));
        label_montoTotal.setPreferredSize(new Dimension(100, 100));
        add(label_totalUnidades, gridBagConstrints.modificar_posición //label unidades
        (3, 6, 5, 5, 5, 5, 2, 1, 10, 50, 1.0, 0, GridBagConstraints.WEST));
        label_totalUnidades.setPreferredSize(new Dimension(50, 100));
        add(x_label_efectivo, gridBagConstrints.modificar_posición //x label efectivo
        (2, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.EAST));
        x_label_efectivo.setPreferredSize(new Dimension(100, 10));
        add(x_label_vuelto, gridBagConstrints.modificar_posición //x label vuelto
        (4, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.EAST));
        x_label_vuelto.setPreferredSize(new Dimension(100, 10));
        add(txtfield_cantidadEfectivo, gridBagConstrints.modificar_posición //txt cantidad efectivo
        (3, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.WEST));
        txtfield_cantidadEfectivo.setPreferredSize(new Dimension(100, 10));
        add(label_vuelto, gridBagConstrints.modificar_posición //txt cantidad efectivo
        (5, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.WEST));
        label_vuelto.setPreferredSize(new Dimension(100, 10));
        add(boton_eliminarProducto, gridBagConstrints.modificar_posición //boton eliminar producto
        (6, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        boton_eliminarProducto.setPreferredSize(new Dimension(100, 10));
        add(boton_eliminarVenta, gridBagConstrints.modificar_posición //boton eliminar venta
        (7, 0, 5, 5, 5, 5, 1, 1, 10, 50, 1.0, 0, GridBagConstraints.CENTER));
        boton_eliminarVenta.setPreferredSize(new Dimension(100, 10));
        add(tabla_ventas, gridBagConstrints.modificar_posición //tabla venta
        (2, 1, 5, 5, 5, 5, 6, 5, 50, 50, 1.0, 1.0, GridBagConstraints.CENTER));
        add(jScrollPane1, gridBagConstrints.modificar_posición //tabla venta
        (2, 1, 5, 5, 5, 5, 6, 5, 50, 50, 0, 0, GridBagConstraints.CENTER));
        jScrollPane1.setPreferredSize(new Dimension(JLabel.HORIZONTAL, 10));
        jScrollPane1.setViewportView (tabla_ventas);
        // Configurar el layout para que se ajuste automáticamente al cambiar el tamaño de la ventana
        login login = new login();
        label_usuario1.setText("Usuario: " + login.username_usuario);
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacemos editable solo la columna que tenga el índice 1
                CantOriginal = Integer.parseInt(getValueAt(row, 6).toString());
                ValorOriginal = Integer.parseInt(getValueAt(row, 7).toString());
                boton_agregarProducto.requestFocus();
                return (column == 6);
                
            }
            // Validamos que solo se puedan ingresar números en la columna editable
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 1) {
                    return Integer.class;
                }
                boton_agregarProducto.requestFocus();
                return super.getColumnClass(columnIndex);
                
            }
            
            public void setValueAt_v2(Object value, int row, int column) {
                if (edit == true){
                    if (column == 6 && value instanceof String) {
                        try {
                            Integer newValue = Integer.parseInt((String) value);
                            if (newValue > 0) {
                                super.setValueAt(newValue.toString(), row, column);
                                return;
                            }
                        } catch (NumberFormatException e) {
                            // El valor no es un entero válido
                        }
                    }
                    if (column == 7 && value instanceof String) {
                        try {
                            Integer newValue = Integer.parseInt((String) value);
                            if (newValue > 0) {
                                super.setValueAt(newValue.toString(), row, column);
                                return;
                            }
                        } catch (NumberFormatException e) {
                            // El valor no es un entero válido
                        }
                    }
                    // Si el valor es inválido, se mantiene el valor original en la celda
                    super.setValueAt(CantOriginal.toString(), row, column);
                    edit = false;
                } else {
                    super.setValueAt(value.toString(), row, column);
                }   
                boton_agregarProducto.requestFocus();
                
            }
            
        };
        tabla_ventas.setModel(modelo);
        tabla_ventas.addMouseListener(new MouseAdapter() {

            
        
        });
        
        tabla_ventas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Verifica si se hizo doble clic y si no se está editando manualmente ya
                if (e.getClickCount() == 2 && !edit) {
                    edit = true; // Marca que se está editando manualmente
                }
            }
        });
        // Agregar un TableModelListener al modelo de la tabla
        modelo.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                // Verificar si se está realizando una edición manual
                if (edit){
                    
                    if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 6) {

                        // Obtener el valor editado
                        Integer valorEditado = Integer.parseInt(modelo.getValueAt(e.getFirstRow(), e.getColumn()).toString());

                        // Imprimir los valores original y editado
                        Integer cantidad_antigua, precio_producto, precio_oferta, cantidad_oferta, oferta_aplicada, oferta_cantidad_productos;
                        Integer valor_oferta_aplicada, valor_oferta_no_aplicada, total_a_pagar, fila = e.getFirstRow(), monto_total, monto_antiguo = 0, unidad_total;
                        Integer cantidad_agregar;
                        float oferta_total;
                        boolean producto_oferta = false;
                        cantidad_antigua = CantOriginal;
                        Integer cantidad_nueva = Integer.parseInt((String)modelo.getValueAt(e.getFirstRow(), e.getColumn()));
                        String oferta = tabla_ventas.getValueAt(fila, 5).toString();
                        if (oferta != ""){
                            producto_oferta = true;
                        }
                        precio_producto = Integer.parseInt(tabla_ventas.getValueAt(fila, 4).toString());
                        cantidad_nueva = Integer.parseInt(tabla_ventas.getValueAt(fila, 6).toString());
                        monto_antiguo = ValorOriginal;
                        if (producto_oferta == true){ //si está repetido y tiene oferta
                            String[] datos = oferta.split(" X ");
                            cantidad_oferta = Integer.parseInt(datos[0]);
                            precio_oferta = Integer.parseInt(datos[1]);
                            oferta_total = cantidad_nueva/cantidad_oferta;
                            if (oferta_total >= 1){ //si aplica la oferta al menos 1 vez
                                oferta_aplicada = (int) oferta_total; //aquí se le quitan los decimales a la oferta total
                                oferta_cantidad_productos = oferta_aplicada * cantidad_oferta;
                                valor_oferta_aplicada = oferta_aplicada * precio_oferta;
                                valor_oferta_no_aplicada = (cantidad_nueva - oferta_cantidad_productos) * precio_producto;
                                total_a_pagar = valor_oferta_aplicada + valor_oferta_no_aplicada;
                            } else { //si la oferta no aplica
                                total_a_pagar = cantidad_nueva * precio_producto;

                            }
                        } else { //si el producto está repetido y no tiene oferta
                            total_a_pagar = cantidad_nueva * precio_producto;
                        }
                        monto_total = Integer.parseInt(label_montoTotal.getText()) - monto_antiguo + total_a_pagar;
                        label_montoTotal.setText(String.valueOf(monto_total));
                        unidad_total = Integer.parseInt(label_totalUnidades.getText()) + cantidad_nueva - cantidad_antigua;
                        label_totalUnidades.setText(String.valueOf(unidad_total));
                        
                        edit = true;
                        modelo.removeTableModelListener(this);
                        modelo.setValueAt(cantidad_nueva.toString(), fila, 6);
                        modelo.setValueAt(total_a_pagar.toString(), fila, 7);
                        modelo.addTableModelListener(this);
                        // Restablecer la bandera para indicar que se ha completado la edición manual
                        edit = false;
                        
                    }
                }
            }
        });
        //add(panel_realizarVenta,BorderLayout.CENTER);
        Dates.fechaYhora(label_fecha1, label_hora1);
        String filas[] = {"Código", "Nombre", "Categoría", "Cantidad", "Precio unitario", "Oferta", "Cantidad venta", "Precio total"};
        for (String fila1 : filas) {
            modelo.addColumn(fila1);
        }
        tabla_ventas.setFont(new Font("Tahoma", Font.PLAIN, 18));
        tabla_ventas.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14)); 
        tabla_ventas.getColumnModel().getColumn(0).setPreferredWidth(140);
        tabla_ventas.getColumnModel().getColumn(0).setMinWidth(140);
        tabla_ventas.getColumnModel().getColumn(0).setMaxWidth(140);
        tabla_ventas.getColumnModel().getColumn(0).setResizable(false);
        tabla_ventas.getColumnModel().getColumn(2).setPreferredWidth(120);
        tabla_ventas.getColumnModel().getColumn(2).setMinWidth(120);
        tabla_ventas.getColumnModel().getColumn(2).setMaxWidth(120);
        tabla_ventas.getColumnModel().getColumn(2).setResizable(false);
        tabla_ventas.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabla_ventas.getColumnModel().getColumn(3).setMinWidth(80);
        tabla_ventas.getColumnModel().getColumn(3).setMaxWidth(80);
        tabla_ventas.getColumnModel().getColumn(3).setResizable(false);
        tabla_ventas.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabla_ventas.getColumnModel().getColumn(4).setMinWidth(110);
        tabla_ventas.getColumnModel().getColumn(4).setMaxWidth(110);
        tabla_ventas.getColumnModel().getColumn(4).setResizable(false);
        tabla_ventas.getColumnModel().getColumn(5).setPreferredWidth(85);
        tabla_ventas.getColumnModel().getColumn(5).setMinWidth(85);
        tabla_ventas.getColumnModel().getColumn(5).setMaxWidth(85);
        tabla_ventas.getColumnModel().getColumn(5).setResizable(false);
        tabla_ventas.getColumnModel().getColumn(6).setPreferredWidth(115);
        tabla_ventas.getColumnModel().getColumn(6).setMinWidth(115);
        tabla_ventas.getColumnModel().getColumn(6).setMaxWidth(115);
        tabla_ventas.getColumnModel().getColumn(6).setResizable(false);
        tabla_ventas.getColumnModel().getColumn(7).setPreferredWidth(90    );
        tabla_ventas.getColumnModel().getColumn(7).setMinWidth(90);
        tabla_ventas.getColumnModel().getColumn(7).setMaxWidth(90);
        tabla_ventas.getColumnModel().getColumn(7).setResizable(false);
        tabla_ventas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla_ventas.getColumnModel().getColumn(1).setResizable(true);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tabla_ventas.setDefaultRenderer(Object.class, centerRenderer);
        tabla_ventas.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        spinner_cantidad.setValue(1); 
        txtfield_codigo.requestFocus(); // se establece en la entrada de código
        addKeyListener(new KeyAdapter() { //esto es para la respuesta de la página
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        int valor_actual = (int) spinner_cantidad.getValue();
                        spinner_cantidad.setValue(valor_actual + 1);
                        txtfield_codigo.requestFocus();
                        break;
                    case KeyEvent.VK_DOWN:
                        valor_actual = (int) spinner_cantidad.getValue();
                        if (valor_actual == 1){
                            return;
                        } else {
                            spinner_cantidad.setValue(valor_actual - 1);
                        }
                        txtfield_codigo.requestFocus();
                    default:
                        
                        break;
                }
            }
        });
        KeyListener myKeyListener = new KeyAdapter() { //esto es para la respuesta de componentes
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        int valor_actual = (int) spinner_cantidad.getValue();
                        spinner_cantidad.setValue(valor_actual + 1);
                    break;
                    case KeyEvent.VK_DOWN:
                        valor_actual = (int) spinner_cantidad.getValue();
                        if (valor_actual == 1) {
                        return;
                        } else {
                        spinner_cantidad.setValue(valor_actual - 1);
                        }
                        break;
                    case KeyEvent.VK_ENTER:
                        boton_agregarProducto.doClick();
                        break;
                    case KeyEvent.VK_SPACE:
                        boton_finalizarVenta.doClick();
                        break;
                    default:
                        
                        break;
                }
            }
        };  
        
        // Establecer el foco en el JFrame
        setFocusable(true);
        requestFocusInWindow();
        txtfield_codigo.addKeyListener(myKeyListener);
        txtfield_cantidadEfectivo.addKeyListener(myKeyListener);
        boton_eliminarProducto.addKeyListener(myKeyListener);
        boton_eliminarProducto.addKeyListener(myKeyListener);
        boton_agregarProducto.addKeyListener(myKeyListener);
        boton_finalizarVenta.addKeyListener(myKeyListener);    
        Color gris_dark = new Color(50, 50, 50);
        tabla_ventas.getTableHeader().setBackground(gris_dark);
        tabla_ventas.getTableHeader().setForeground(Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label_usuario1 = new javax.swing.JLabel();
        label_hora1 = new javax.swing.JLabel();
        label_fecha1 = new javax.swing.JLabel();
        txtfield_codigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        spinner_cantidad = new javax.swing.JSpinner();
        x_label_montoTotal = new javax.swing.JLabel();
        x_label_totalUnidades = new javax.swing.JLabel();
        label_montoTotal = new javax.swing.JLabel();
        label_totalUnidades = new javax.swing.JLabel();
        x_label_efectivo = new javax.swing.JLabel();
        label_vuelto = new javax.swing.JLabel();
        txtfield_cantidadEfectivo = new javax.swing.JTextField();
        boton_eliminarProducto = new javax.swing.JButton();
        boton_eliminarVenta = new javax.swing.JButton();
        boton_agregarProducto = new javax.swing.JButton();
        boton_finalizarVenta = new javax.swing.JButton();
        x_label_vuelto = new javax.swing.JLabel();
        x_label_x = new javax.swing.JLabel();

        setBackground(new java.awt.Color(80, 80, 80));
        setForeground(new java.awt.Color(255, 51, 102));
        setLayout(new java.awt.GridBagLayout());

        label_usuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        label_usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_usuario1.setText("usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        add(label_usuario1, gridBagConstraints);

        label_hora1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_hora1.setForeground(new java.awt.Color(255, 255, 255));
        label_hora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_hora1.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 16, 0, 0);
        add(label_hora1, gridBagConstraints);

        label_fecha1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_fecha1.setForeground(new java.awt.Color(255, 255, 255));
        label_fecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_fecha1.setText("fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 16, 0, 0);
        add(label_fecha1, gridBagConstraints);

        txtfield_codigo.setBackground(new java.awt.Color(60, 60, 60));
        txtfield_codigo.setForeground(new java.awt.Color(255, 255, 255));
        txtfield_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_codigoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 6, 0, 0);
        add(txtfield_codigo, gridBagConstraints);

        tabla_ventas.setBackground(new java.awt.Color(60, 60, 60));
        tabla_ventas.setForeground(new java.awt.Color(255, 255, 255));
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
        tabla_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_ventas.setFocusable(false);
        tabla_ventas.setGridColor(new java.awt.Color(80, 80, 80));
        tabla_ventas.setSelectionBackground(new java.awt.Color(100, 100, 100));
        tabla_ventas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ventas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 660;
        gridBagConstraints.ipady = 489;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 0, 6, 6);
        add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 10, 0, 0);
        add(spinner_cantidad, gridBagConstraints);

        x_label_montoTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        x_label_montoTotal.setForeground(new java.awt.Color(255, 255, 255));
        x_label_montoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_montoTotal.setText("Monto total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 26, 0, 0);
        add(x_label_montoTotal, gridBagConstraints);

        x_label_totalUnidades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        x_label_totalUnidades.setForeground(new java.awt.Color(255, 255, 255));
        x_label_totalUnidades.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_totalUnidades.setText("Total unidades:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 26, 0, 0);
        add(x_label_totalUnidades, gridBagConstraints);

        label_montoTotal.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        label_montoTotal.setForeground(new java.awt.Color(255, 255, 255));
        label_montoTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_montoTotal.setText("$$$$$$$");
        label_montoTotal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(label_montoTotal, gridBagConstraints);

        label_totalUnidades.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        label_totalUnidades.setForeground(new java.awt.Color(255, 255, 255));
        label_totalUnidades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_totalUnidades.setText("######");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        add(label_totalUnidades, gridBagConstraints);

        x_label_efectivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        x_label_efectivo.setForeground(new java.awt.Color(255, 255, 255));
        x_label_efectivo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_efectivo.setText("Efectivo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 103, 0, 0);
        add(x_label_efectivo, gridBagConstraints);

        label_vuelto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_vuelto.setForeground(new java.awt.Color(255, 255, 255));
        label_vuelto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_vuelto.setText("$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 64, 0, 0);
        add(label_vuelto, gridBagConstraints);

        txtfield_cantidadEfectivo.setBackground(new java.awt.Color(60, 60, 60));
        txtfield_cantidadEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        txtfield_cantidadEfectivo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfield_cantidadEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_cantidadEfectivoActionPerformed(evt);
            }
        });
        txtfield_cantidadEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfield_cantidadEfectivoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 53, 0, 0);
        add(txtfield_cantidadEfectivo, gridBagConstraints);

        boton_eliminarProducto.setBackground(new java.awt.Color(60, 60, 60));
        boton_eliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminarProducto.setText("Eliminar producto");
        boton_eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 56, 0, 0);
        add(boton_eliminarProducto, gridBagConstraints);

        boton_eliminarVenta.setBackground(new java.awt.Color(60, 60, 60));
        boton_eliminarVenta.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminarVenta.setText("Eliminar venta");
        boton_eliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 67, 0, 0);
        add(boton_eliminarVenta, gridBagConstraints);

        boton_agregarProducto.setBackground(new java.awt.Color(51, 51, 51));
        boton_agregarProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton_agregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregarProducto.setText("Agregar producto (enter)");
        boton_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        add(boton_agregarProducto, gridBagConstraints);

        boton_finalizarVenta.setBackground(new java.awt.Color(60, 60, 60));
        boton_finalizarVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton_finalizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        boton_finalizarVenta.setText("Finalizar venta (espacio)");
        boton_finalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_finalizarVentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(113, 6, 0, 0);
        add(boton_finalizarVenta, gridBagConstraints);

        x_label_vuelto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        x_label_vuelto.setForeground(new java.awt.Color(255, 255, 255));
        x_label_vuelto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_vuelto.setText("Vuelto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 103, 0, 0);
        add(x_label_vuelto, gridBagConstraints);
        add(x_label_x, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void txtfield_cantidadEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_cantidadEfectivoKeyReleased
        if (label_montoTotal.equals("$$$$$$$")){
            return;
        }
        int efectivo;
        int monto_total = Integer.parseInt(label_montoTotal.getText());
        if (txtfield_cantidadEfectivo.toString().equals("")){
            label_vuelto.setText("$$$$$");
        } else {
            efectivo = parseInt(txtfield_cantidadEfectivo.getText());
            Integer resultado = efectivo-monto_total;
            label_vuelto.setText(resultado.toString());
        }
    }//GEN-LAST:event_txtfield_cantidadEfectivoKeyReleased

    private void boton_eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarProductoActionPerformed
        if (fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un producto a eliminar.");
            return;
        }
        int unidad_alimada = parseInt(tabla_ventas.getValueAt(fila_seleccionada, 6).toString());
        int monto_eliminado = parseInt(tabla_ventas.getValueAt(fila_seleccionada, 7).toString());
        Integer nuevo_unidades = parseInt(label_totalUnidades.getText()) - unidad_alimada;
        Integer nuevo_monto = parseInt(label_montoTotal.getText()) - monto_eliminado;
        if (parseInt(label_totalUnidades.getText()) == 0){
            label_totalUnidades.setText("#####");
            label_montoTotal.setText("$$$$$");
        } else {
            label_totalUnidades.setText(nuevo_unidades.toString());
            label_montoTotal.setText(nuevo_monto.toString());
        }
        DefaultTableModel modelo = (DefaultTableModel)tabla_ventas.getModel();
        modelo.removeRow(fila_seleccionada);
    }//GEN-LAST:event_boton_eliminarProductoActionPerformed

    private void boton_eliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarVentaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_ventas.getModel();
        modelo.setRowCount(0); // elimina todas las filas
        modelo.fireTableDataChanged(); // actualiza la vista de la tabla
        fila_seleccionada = -1;
        txtfield_codigo.setText("");
        spinner_cantidad.setValue(1);
        label_totalUnidades.setText("######");
        label_montoTotal.setText("$$$$$$$");
        label_vuelto.setText("$$$$$");
    }//GEN-LAST:event_boton_eliminarVentaActionPerformed

    private void boton_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarProductoActionPerformed
        //fila_seleccionada = null;

        //declaramos las variable a usar
        String codigo = (txtfield_codigo.getText()).replace(" ", "");;
        txtfield_codigo.setText("");
        Integer cantidad_agregar = Integer.parseInt(spinner_cantidad.getValue().toString());
        spinner_cantidad.setValue(1);
        Integer cantidad_antigua, cantidad_nueva, precio_producto, precio_oferta, cantidad_oferta, oferta_aplicada, oferta_cantidad_productos;
        Integer valor_oferta_aplicada, valor_oferta_no_aplicada, total_a_pagar, fila = 0, monto_total, monto_antiguo = 0, unidad_total;
        float oferta_total;
        boolean producto_oferta = false, producto_repetido = false;
        Object[] fila_producto = new Object[8];
        DefaultTableModel modelo = (DefaultTableModel) tabla_ventas.getModel();
        if ("".equals(codigo)){ //si la entrada de código está vacía
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un código.");
            return;
        } else { // si la entrada no está vacía
            String[] producto = requests_sql.sql_unRegistro("SELECT codigo, nombre, categoria, cantidad, precio, off_cant, off_precio FROM productos WHERE codigo='"+codigo+"';");
            if (producto[5] != null & producto[6] != null){ //para saber si el producto tiene oferta
                producto_oferta = true;
            }
            for (int i=0; i<tabla_ventas.getRowCount(); i++){ //para saber si el producto está ya ingresado
                if (codigo.equals(tabla_ventas.getValueAt(i, 0))){
                    producto_repetido = true;
                    fila = i;
                    break;
                }
            }
            precio_producto = Integer.parseInt(producto[4]);
            if (producto_repetido == true){ //si el producto está repetido
                cantidad_antigua = Integer.parseInt(tabla_ventas.getValueAt(fila, 6).toString());
                cantidad_nueva = cantidad_agregar + cantidad_antigua;
                monto_antiguo = Integer.parseInt(tabla_ventas.getValueAt(fila, 7).toString());
                if (producto_oferta == true){ //si está repetido y tiene oferta
                    precio_oferta = Integer.parseInt(producto[6]);
                    cantidad_oferta = Integer.parseInt(producto[5]);
                    oferta_total = cantidad_nueva/cantidad_oferta;
                    if (oferta_total >= 1){ //si aplica la oferta al menos 1 vez
                        oferta_aplicada = (int) oferta_total; //aquí se le quitan los decimales a la oferta total
                        oferta_cantidad_productos = oferta_aplicada * cantidad_oferta;
                        valor_oferta_aplicada = oferta_aplicada * precio_oferta;
                        valor_oferta_no_aplicada = (cantidad_nueva - oferta_cantidad_productos) * precio_producto;
                        total_a_pagar = valor_oferta_aplicada + valor_oferta_no_aplicada;
                    } else { //si la oferta no aplica
                        total_a_pagar = cantidad_nueva * precio_producto;

                    }
                } else { //si el producto está repetido y no tiene oferta
                    total_a_pagar = cantidad_nueva * precio_producto;
                }
                
                modelo.setValueAt(cantidad_nueva.toString(), fila, 6);
                modelo.setValueAt(total_a_pagar.toString(), fila, 7);
            } else { //si el producto no está repetido
                if (producto_oferta == true){ //si no está repetido y tiene oferta
                    precio_oferta = Integer.parseInt(producto[5]);
                    cantidad_oferta = Integer.parseInt(producto[6]);
                    oferta_total = cantidad_agregar/cantidad_oferta;
                    if (oferta_total >= 1){ //si la oferta aplica al menos 1 vez
                        oferta_aplicada = (int) oferta_total; //aquí se le quitan los decimales a la oferta total
                        oferta_cantidad_productos = oferta_aplicada * cantidad_oferta;
                        valor_oferta_aplicada = oferta_aplicada * precio_oferta;
                        valor_oferta_no_aplicada = (cantidad_agregar - oferta_cantidad_productos) * precio_producto;
                        total_a_pagar = valor_oferta_aplicada + valor_oferta_no_aplicada;
                    } else { //si la oferta no aplica
                        total_a_pagar = cantidad_agregar * precio_producto;
                    }
                }else{ //si no está repetido y no tiene oferta
                    total_a_pagar = cantidad_agregar * precio_producto;
                }
                fila_producto[0] = producto[0];
                fila_producto[1] = producto[1];
                fila_producto[2] = producto[2];
                fila_producto[3] = producto[3];
                fila_producto[4] = producto[4];
                if (producto_oferta == true){
                    fila_producto[5] = producto[5] + " X " + producto[6];
                } else {
                    fila_producto[5] = "";
                }
                fila_producto[6] = cantidad_agregar;
                fila_producto[7] = total_a_pagar;
                
                modelo.addRow(fila_producto);                
            }
        }
        if ("$$$$$$$".equals(label_montoTotal.getText())){
            label_montoTotal.setText(String.valueOf(total_a_pagar));
        } else {
            monto_total = Integer.parseInt(label_montoTotal.getText()) - monto_antiguo + total_a_pagar;
            label_montoTotal.setText(String.valueOf(monto_total));
        }

        if ("######".equals(label_totalUnidades.getText())){
            label_totalUnidades.setText(String.valueOf(cantidad_agregar));
        } else {
            unidad_total = Integer.parseInt(label_totalUnidades.getText()) + cantidad_agregar;
            label_totalUnidades.setText(String.valueOf(unidad_total));
        }

        
        Color originalColor = boton_agregarProducto.getBackground();
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton_agregarProducto.setBackground(originalColor);
            }
        });
        boton_agregarProducto.setBackground(Color.GREEN);
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_boton_agregarProductoActionPerformed

    private void boton_finalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_finalizarVentaActionPerformed
        String nombre_prod = "", cod_prod = "", monto_prod = "", cant_prod = "", cat_prod = "", precio_prod = "", oferta_prod = "", cantidad_prod = "";
        if (tabla_ventas.getRowCount() == 0){ //aquí se ve si hay productos en la tabla
            JOptionPane.showMessageDialog(null, "No hay productos para realizar la venta.");
            return;
        }
        Integer cigarros_venta = 0;
        for (int i = 0; i < tabla_ventas.getRowCount(); i++){ //aquí se guardan los datos de la venta
            cat_prod = cat_prod + tabla_ventas.getValueAt(i, 2).toString()+",";
            precio_prod = precio_prod + tabla_ventas.getValueAt(i, 4).toString()+",";
            oferta_prod = oferta_prod + tabla_ventas.getValueAt(i, 5).toString()+",";
            cantidad_prod = cantidad_prod + tabla_ventas.getValueAt(i, 3).toString()+",";
            nombre_prod = nombre_prod + tabla_ventas.getValueAt(i, 1).toString()+",";
            cod_prod = cod_prod + tabla_ventas.getValueAt(i, 0).toString()+",";
            monto_prod = monto_prod + tabla_ventas.getValueAt(i, 7).toString()+",";
            cant_prod = cant_prod + tabla_ventas.getValueAt(i, 6).toString()+",";
            if ("cigarros".equals(tabla_ventas.getValueAt(i, 2).toString())){
                cigarros_venta = cigarros_venta + Integer.parseInt(tabla_ventas.getValueAt(i, 7).toString());
            }
        }
        String sql = "SELECT cigarros FROM var WHERE id=1;";
        String[] cigarros = requests_sql.sql_unRegistro(sql);
        Integer cigarros_total = Integer.parseInt(cigarros[0]) + cigarros_venta;
        sql = "UPDATE var SET cigarros = " + cigarros_total + " WHERE id = 1;";
        requests_sql.executeStatement(sql);
        DateFormat hora = new SimpleDateFormat("HH:mm:ss");
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        String hh = hora.format(new Date());
        String ff = fecha.format(new Date());
        String total_precio = label_montoTotal.getText();
        sql = "insert into ventas (nombre_prod, id_prod, monto_prod, cant_prod, monto_total, hora, fecha, cat_prod, precio_prod, oferta_prod, cantidad_prod)"
        + " values('"+nombre_prod+"','"+cod_prod+"','"+monto_prod+"','"+cant_prod+"',"+total_precio+",'"+hh+"','"
        +ff+"','"+cat_prod+"','"+precio_prod+"','"+oferta_prod+"','"+cantidad_prod+"');";
        requests_sql.executeStatement(sql);
        // hasta aquí se guarda la venta en la base de datos
        //desde aquí se empiezan a modificar los datos para el cierre
        sql = "SELECT dinero_total FROM var WHERE id = 1";
        String[] dinero_antiguo = requests_sql.sql_unRegistro(sql);
        int dinero_total = Integer.parseInt(dinero_antiguo[0]) + Integer.parseInt(total_precio);
        sql = "UPDATE var SET dinero_total = " + dinero_total;
        requests_sql.executeStatement(sql); //hasta aquí actualizamos el dinero para el cierre, le sumamos la actual venta
        //ahora se descontará el stock vendido del stock total de cada producto de la venta
        String codigo_producto;
        for (int i = 0; i < tabla_ventas.getRowCount(); i++){
            codigo_producto = tabla_ventas.getValueAt(i, 0).toString();
            int stock_vendido = Integer.parseInt(tabla_ventas.getValueAt(i, 6).toString());
            sql = "SELECT stock FROM productos WHERE codigo = '" + codigo_producto + "'";
            String[] stock_antiguo = requests_sql.sql_unRegistro(sql);
            int stock_nuevo = Integer.parseInt(stock_antiguo[0]) - stock_vendido;
            sql = "UPDATE productos SET stock = "+ stock_nuevo +" WHERE codigo = '" + codigo_producto + "'";
            requests_sql.executeStatement(sql);
        }
        DefaultTableModel modelo = (DefaultTableModel) tabla_ventas.getModel();
        modelo.setRowCount(0); // elimina todas las filas
        modelo.fireTableDataChanged(); // actualiza la vista de la tabla
        fila_seleccionada = -1;
        spinner_cantidad.setValue(1);
        label_totalUnidades.setText("######");
        label_montoTotal.setText("$$$$$$$");
        JOptionPane.showMessageDialog(null, "Venta realizada con éxito!");
        txtfield_codigo.setText("");
        label_vuelto.setText("");
        txtfield_cantidadEfectivo.setText("");
    }//GEN-LAST:event_boton_finalizarVentaActionPerformed

    private void txtfield_cantidadEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_cantidadEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_cantidadEfectivoActionPerformed

    private void txtfield_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_codigoActionPerformed

    private void tabla_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventasMouseClicked
        fila_seleccionada = tabla_ventas.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tabla_ventasMouseClicked

    
public class MyTable extends JTable {

    private ArrayList<String> colors = new ArrayList<>();

    public MyTable() {
        super();
        String[] columnNames = {"Producto", "Cantidad", "Precio"};
        int rowCount = 0;
        MyTableModel model = new MyTableModel(columnNames, rowCount);
        setModel(model);
        setDefaultRenderer(Object.class, new MyTableCellRenderer());
    }

    public void addRow(Object[] rowData) {
        MyTableModel model = (MyTableModel) getModel();
        model.addRow(rowData);
        if (model.getRowCount() % 2 == 0) {
            colors.add("purple");
        } else {
            colors.add("blue");
        }
    }

    private class MyTableModel extends DefaultTableModel {

        public MyTableModel(String[] columnNames, int rowCount) {
            super(columnNames, rowCount);
        }

        @Override
        public void addRow(Object[] rowData) {
            super.addRow(rowData);
        }
    }

    private class MyTableCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            String color = colors.get(row);
            if (color.equals("blue")) {
                cell.setBackground(Color.BLUE);
            } else if (color.equals("purple")) {
                cell.setBackground(Color.MAGENTA);
            }
            return cell;
        }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregarProducto;
    private javax.swing.JButton boton_eliminarProducto;
    private javax.swing.JButton boton_eliminarVenta;
    private javax.swing.JButton boton_finalizarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_fecha1;
    private javax.swing.JLabel label_hora1;
    private javax.swing.JLabel label_montoTotal;
    private javax.swing.JLabel label_totalUnidades;
    private javax.swing.JLabel label_usuario1;
    private javax.swing.JLabel label_vuelto;
    private javax.swing.JSpinner spinner_cantidad;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JTextField txtfield_cantidadEfectivo;
    private javax.swing.JTextField txtfield_codigo;
    private javax.swing.JLabel x_label_efectivo;
    private javax.swing.JLabel x_label_montoTotal;
    private javax.swing.JLabel x_label_totalUnidades;
    private javax.swing.JLabel x_label_vuelto;
    private javax.swing.JLabel x_label_x;
    // End of variables declaration//GEN-END:variables
}
