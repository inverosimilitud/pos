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
public class panel_ingresopedido extends javax.swing.JPanel {
    Integer CantOriginal = 0;
    Integer ValorOriginal = 0;
    boolean edit = false;
    int fila_seleccionada = -1;
    public panel_ingresopedido() {
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
        
        //add(panel_realizarVenta,BorderLayout.CENTER);
        Dates.fechaYhora(label_fecha1, label_hora1);
        String filas[] = {"Código", "Nombre", "Categoría", "Cantidad", "Cantidad pedido"};
        for (String fila1 : filas) {
            modelo.addColumn(fila1);
        }
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

        label_usuario1 = new javax.swing.JLabel();
        label_hora1 = new javax.swing.JLabel();
        label_fecha1 = new javax.swing.JLabel();
        txtfield_codigo = new javax.swing.JTextField();
        spinner_cantidad = new javax.swing.JSpinner();
        boton_agregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        boton_finalizarVenta = new javax.swing.JButton();
        boton_eliminarProducto = new javax.swing.JButton();
        boton_eliminarVenta = new javax.swing.JButton();
        x_label_x = new javax.swing.JLabel();

        label_usuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        label_usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_usuario1.setText("usuario");

        label_hora1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_hora1.setForeground(new java.awt.Color(255, 255, 255));
        label_hora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_hora1.setText("Hora");

        label_fecha1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_fecha1.setForeground(new java.awt.Color(255, 255, 255));
        label_fecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_fecha1.setText("fecha");

        txtfield_codigo.setBackground(new java.awt.Color(60, 60, 60));
        txtfield_codigo.setForeground(new java.awt.Color(255, 255, 255));
        txtfield_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_codigoActionPerformed(evt);
            }
        });

        boton_agregarProducto.setBackground(new java.awt.Color(51, 51, 51));
        boton_agregarProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton_agregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregarProducto.setText("Agregar producto (enter)");
        boton_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarProductoActionPerformed(evt);
            }
        });

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

        boton_finalizarVenta.setBackground(new java.awt.Color(60, 60, 60));
        boton_finalizarVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton_finalizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        boton_finalizarVenta.setText("Finalizar pedido (espacio)");
        boton_finalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_finalizarVentaActionPerformed(evt);
            }
        });

        boton_eliminarProducto.setBackground(new java.awt.Color(60, 60, 60));
        boton_eliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminarProducto.setText("Eliminar producto");
        boton_eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarProductoActionPerformed(evt);
            }
        });

        boton_eliminarVenta.setBackground(new java.awt.Color(60, 60, 60));
        boton_eliminarVenta.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminarVenta.setText("Eliminar venta");
        boton_eliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_finalizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(x_label_x)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfield_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(spinner_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_eliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_eliminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_usuario1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(label_hora1)
                        .addGap(48, 48, 48)
                        .addComponent(label_fecha1)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfield_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(boton_agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(boton_eliminarProducto)
                        .addGap(105, 105, 105)
                        .addComponent(boton_eliminarVenta)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(boton_finalizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(x_label_x)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfield_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_codigoActionPerformed

    private void boton_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarProductoActionPerformed
        //fila_seleccionada = null;

        //declaramos las variable a usar
        String codigo = (txtfield_codigo.getText()).replace(" ", "");;
        txtfield_codigo.setText("");
        spinner_cantidad.setValue(1);
        Object[] fila_producto = new Object[5];
        DefaultTableModel modelo = (DefaultTableModel) tabla_ventas.getModel();
        if ("".equals(codigo)){ //si la entrada de código está vacía
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un código.");
            return;
        } else { // si la entrada no está vacía
            String[] producto = requests_sql.sql_unRegistro("SELECT codigo, nombre, categoria, cantidad FROM productos WHERE codigo='"+codigo+"';");
            
        
            fila_producto[0] = producto[0];
            fila_producto[1] = producto[1];
            fila_producto[2] = producto[2];
            fila_producto[3] = producto[3];
            fila_producto[4] = spinner_cantidad.getValue();

            modelo.addRow(fila_producto);
            
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

    private void tabla_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventasMouseClicked
        fila_seleccionada = tabla_ventas.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tabla_ventasMouseClicked

    private void boton_finalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_finalizarVentaActionPerformed
        if (tabla_ventas.getRowCount() == 0){ //aquí se ve si hay productos en la tabla
            JOptionPane.showMessageDialog(null, "No hay productos para agregar.");
            return;
        }
        int rows = tabla_ventas.getRowCount();
        String sql;
        Integer stock;
        for (int i = 0; i == rows; i++){
            sql = "select stock from productos where codigo ='"+tabla_ventas.getValueAt(i, 0).toString()+"';";
            System.out.println(sql);
            String[] req = requests_sql.sql_unRegistro(sql);
            stock = Integer.parseInt(req[0].toString())+Integer.parseInt(tabla_ventas.getValueAt(i, 4).toString());
            System.out.println(req[0]);
            System.out.println(stock);
            sql = "update productos set stock = "+stock+" where codigo ='"+tabla_ventas.getValueAt(i, 0).toString()+"';";
            System.out.println(sql);
            requests_sql.executeStatement(sql);
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tabla_ventas.getModel();
        modelo.setRowCount(0); // elimina todas las filas
        modelo.fireTableDataChanged(); // actualiza la vista de la tabla
        fila_seleccionada = -1;
        spinner_cantidad.setValue(1);
        JOptionPane.showMessageDialog(null, "pidido ingresado con éxito!");
        txtfield_codigo.setText("");
    }//GEN-LAST:event_boton_finalizarVentaActionPerformed

    private void boton_eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarProductoActionPerformed
        if (fila_seleccionada == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un producto a eliminar.");
            return;
        }
        int unidad_alimada = parseInt(tabla_ventas.getValueAt(fila_seleccionada, 6).toString());
        int monto_eliminado = parseInt(tabla_ventas.getValueAt(fila_seleccionada, 7).toString());

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

    }//GEN-LAST:event_boton_eliminarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregarProducto;
    private javax.swing.JButton boton_eliminarProducto;
    private javax.swing.JButton boton_eliminarVenta;
    private javax.swing.JButton boton_finalizarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_fecha1;
    private javax.swing.JLabel label_hora1;
    private javax.swing.JLabel label_usuario1;
    private javax.swing.JSpinner spinner_cantidad;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JTextField txtfield_codigo;
    private javax.swing.JLabel x_label_x;
    // End of variables declaration//GEN-END:variables
}
