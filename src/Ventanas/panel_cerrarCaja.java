package Ventanas;

import Functions.TextPrompt;
import Functions.Dates;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class panel_cerrarCaja extends javax.swing.JPanel {
    
    public panel_cerrarCaja() {
        initComponents();
        setLayout(new GridBagLayout());
        add(label_usuario, gridBagConstrints.modificar_posición //label usuario
        (0, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_usuario.setPreferredSize(new Dimension(100, 20)); 
        add(label_fecha, gridBagConstrints.modificar_posición //label fecha
        (0, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_fecha.setPreferredSize(new Dimension(100, 20));
        add(label_hora, gridBagConstrints.modificar_posición //label hora
        (0, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_hora.setPreferredSize(new Dimension(100, 20));
        add(label1, gridBagConstrints.modificar_posición //label hora
        (0, 4, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label2, gridBagConstrints.modificar_posición //label hora
        (0, 6, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label3, gridBagConstrints.modificar_posición //label hora
        (0, 7, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label4, gridBagConstrints.modificar_posición //label hora
        (0, 8, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label5, gridBagConstrints.modificar_posición //label hora
        (0, 9, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label6, gridBagConstrints.modificar_posición //label hora
        (0, 11, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label7, gridBagConstrints.modificar_posición //label hora
        (0, 12, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label8, gridBagConstrints.modificar_posición //label hora
        (0, 13, 5, 5, 5, 5,1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label9, gridBagConstrints.modificar_posición //label hora
        (0, 14, 5, 5, 5, 5,1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(boton_cerrarCaja, gridBagConstrints.modificar_posición //label hora
        (1, 0, 5, 5, 5, 5, 2, 3, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_dineroTotal, gridBagConstrints.modificar_posición //label hora
        (1, 4, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_dineroTransbank, gridBagConstrints.modificar_posición //label hora
        (1, 6, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_dineroEfectivo, gridBagConstrints.modificar_posición //label hora
        (1, 7, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cajaAnterior, gridBagConstrints.modificar_posición //label hora
        (1, 8, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_ventasHoy, gridBagConstrints.modificar_posición //label hora
        (1, 9, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_montoRetiro1, gridBagConstrints.modificar_posición //label hora
        (1, 11, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        txtfield_montoRetiro1.setPreferredSize(new Dimension(50, 20)); 
        add(txtfield_montoRetiro2, gridBagConstrints.modificar_posición //label hora
        (1, 12, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        txtfield_montoRetiro2.setPreferredSize(new Dimension(50, 20)); 
        add(txtfield_montoRetiro3, gridBagConstrints.modificar_posición //label hora
        (1, 13, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        txtfield_montoRetiro3.setPreferredSize(new Dimension(50, 20)); 
        add(txtfield_justificacionRetiro1, gridBagConstrints.modificar_posición //label hora
        (2, 11, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_justificacionRetiro2, gridBagConstrints.modificar_posición //label hora
        (2, 12, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_justificacionRetiro3, gridBagConstrints.modificar_posición //label hora
        (2, 13, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cajaMañana, gridBagConstrints.modificar_posición //label hora
        (1, 14, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtarea_comentario, gridBagConstrints.modificar_posición //label hora
        (0, 15, 5, 5, 5, 5, 3, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(jScrollPane1, gridBagConstrints.modificar_posición //label hora
        (0, 15, 5, 5, 5, 5, 3, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(x_label_cigarros, gridBagConstrints.modificar_posición //label hora
        (0, 3, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cigarros, gridBagConstrints.modificar_posición //label hora
        (1, 3, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(x_label_dinerosc, gridBagConstrints.modificar_posición //label hora
        (0, 5, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_dinerosc, gridBagConstrints.modificar_posición //label hora
        (1, 5, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(x_label_ventasc, gridBagConstrints.modificar_posición //label hora
        (0, 10, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_venta_sc, gridBagConstrints.modificar_posición //label hora
        (1, 10, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        jScrollPane1.setViewportView (txtarea_comentario);
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        txtarea_comentario.setCaretPosition(0);
        txtarea_comentario.setLineWrap(true);
        txtarea_comentario.setWrapStyleWord(true);
        TextPrompt tp1 = new TextPrompt("Ingrese monto que hay en transbank", txtfield_dineroTransbank);
        TextPrompt tp2 = new TextPrompt("Ingrese monto a retirar", txtfield_montoRetiro1);
        TextPrompt tp3 = new TextPrompt("Ingrese monto a retirar", txtfield_montoRetiro2);
        TextPrompt tp4 = new TextPrompt("Ingrese monto a retirar", txtfield_montoRetiro3);
        TextPrompt tp5 = new TextPrompt("Ingrese justificación", txtfield_justificacionRetiro1);
        TextPrompt tp6 = new TextPrompt("Ingrese justificación", txtfield_justificacionRetiro2);
        TextPrompt tp7 = new TextPrompt("Ingrese justificación", txtfield_justificacionRetiro3);
        TextPrompt tp8 = new TextPrompt("Ingrese un comentario respectivo al cierre del día (opcional)", txtarea_comentario);

        

        Dates.fechaYhora(label_fecha, label_hora);
        
        
        String sql = "SELECT dinero_total FROM var WHERE id = 1";
        String[] dinero_total = requests_sql.sql_unRegistro(sql);
        sql = "SELECT caja_mañana FROM cierres ORDER BY id DESC LIMIT 1";
        String[] caja_anterior = requests_sql.sql_unRegistro(sql);
        label_dineroTotal.setText("$" + dinero_total[0]);
        label_cajaAnterior.setText("$" + caja_anterior[0]);
        Integer ventas_hoy = Integer.parseInt(dinero_total[0]) - Integer.parseInt(caja_anterior[0]);
        label_ventasHoy.setText("$" + ventas_hoy.toString());
        sql = "SELECT cigarros FROM var WHERE id = 1";
        String[] cigarros = requests_sql.sql_unRegistro(sql);
        label_cigarros.setText("$" + cigarros[0]);
        Integer dinerosc = Integer.parseInt(dinero_total[0]) - Integer.parseInt(cigarros[0]);
        label_dinerosc.setText("$" + dinerosc.toString());
        Integer ventassc = ventas_hoy - Integer.parseInt(cigarros[0]);
        label_venta_sc.setText("$" + ventassc.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label_usuario = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        boton_cerrarCaja = new javax.swing.JButton();
        label_cajaMañana = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label_dineroEfectivo = new javax.swing.JLabel();
        label_cajaAnterior = new javax.swing.JLabel();
        label_ventasHoy = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label_dineroTotal = new javax.swing.JLabel();
        txtfield_dineroTransbank = new javax.swing.JTextField();
        txtfield_montoRetiro1 = new javax.swing.JTextField();
        txtfield_montoRetiro2 = new javax.swing.JTextField();
        txtfield_montoRetiro3 = new javax.swing.JTextField();
        txtfield_justificacionRetiro1 = new javax.swing.JTextField();
        txtfield_justificacionRetiro2 = new javax.swing.JTextField();
        txtfield_justificacionRetiro3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_comentario = new javax.swing.JTextArea();
        x_label_cigarros = new javax.swing.JLabel();
        label_cigarros = new javax.swing.JLabel();
        x_label_dinerosc = new javax.swing.JLabel();
        label_dinerosc = new javax.swing.JLabel();
        x_label_ventasc = new javax.swing.JLabel();
        label_venta_sc = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        label_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_usuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(label_usuario, gridBagConstraints);

        label_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_fecha.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        add(label_fecha, gridBagConstraints);

        label_hora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_hora.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 1, 0, 0);
        add(label_hora, gridBagConstraints);

        boton_cerrarCaja.setText("Cerrar caja");
        boton_cerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarCajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 53;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 22, 0, 264);
        add(boton_cerrarCaja, gridBagConstraints);

        label_cajaMañana.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 0);
        add(label_cajaMañana, gridBagConstraints);

        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("Dinero transbank:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 11, 0, 0);
        add(label2, gridBagConstraints);

        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("Dinero en efectivo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 11, 0, 0);
        add(label3, gridBagConstraints);

        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("Caja anterior:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 11, 0, 0);
        add(label4, gridBagConstraints);

        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("Ventas hoy:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 11, 0, 0);
        add(label5, gridBagConstraints);

        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("Retiro efectivo 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 11, 0, 0);
        add(label6, gridBagConstraints);

        label7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label7.setText("Retiro efectivo 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 11, 0, 0);
        add(label7, gridBagConstraints);

        label8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label8.setText("Retiro efectivo 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 11, 0, 0);
        add(label8, gridBagConstraints);

        label9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label9.setText("Caja mañana:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 11, 0, 0);
        add(label9, gridBagConstraints);

        label_dineroEfectivo.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 0);
        add(label_dineroEfectivo, gridBagConstraints);

        label_cajaAnterior.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 1, 0, 0);
        add(label_cajaAnterior, gridBagConstraints);

        label_ventasHoy.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 1, 0, 0);
        add(label_ventasHoy, gridBagConstraints);

        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label1.setText("Dinero total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 11, 0, 0);
        add(label1, gridBagConstraints);

        label_dineroTotal.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 22;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 1, 0, 0);
        add(label_dineroTotal, gridBagConstraints);

        txtfield_dineroTransbank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfield_dineroTransbankKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 11, 0, 0);
        add(txtfield_dineroTransbank, gridBagConstraints);

        txtfield_montoRetiro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfield_montoRetiro1KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 1, 0, 0);
        add(txtfield_montoRetiro1, gridBagConstraints);

        txtfield_montoRetiro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfield_montoRetiro2KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 0);
        add(txtfield_montoRetiro2, gridBagConstraints);

        txtfield_montoRetiro3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfield_montoRetiro3KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 0);
        add(txtfield_montoRetiro3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        add(txtfield_justificacionRetiro1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        add(txtfield_justificacionRetiro2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        add(txtfield_justificacionRetiro3, gridBagConstraints);

        txtarea_comentario.setColumns(20);
        txtarea_comentario.setRows(5);
        jScrollPane1.setViewportView(txtarea_comentario);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 53;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 82;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);

        x_label_cigarros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_cigarros.setText("Dinero cigarros:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 52;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = -79;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 39, 0, 0);
        add(x_label_cigarros, gridBagConstraints);

        label_cigarros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_cigarros.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 53;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 17, 0, 0);
        add(label_cigarros, gridBagConstraints);

        x_label_dinerosc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_dinerosc.setText("Dinero total s/c:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 10, 0, 0);
        add(x_label_dinerosc, gridBagConstraints);

        label_dinerosc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_dinerosc.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 0, 0, 0);
        add(label_dinerosc, gridBagConstraints);

        x_label_ventasc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_ventasc.setText("Venta hoy s/c:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 93, 0);
        add(x_label_ventasc, gridBagConstraints);

        label_venta_sc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_venta_sc.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 29;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 93, 0);
        add(label_venta_sc, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarCajaActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Por favor, corrobore todos los datos de cierre, si no está seguro, presione 'No'.");
        if (opc == JOptionPane.NO_OPTION){
            return;
        }
        DateFormat hora = new SimpleDateFormat("HH:mm:ss");
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        String hh = hora.format(new Date());
        String ff = fecha.format(new Date());
        String efectivo = label_dineroEfectivo.getText().replace("$", "");
        String transbank = txtfield_dineroTransbank.getText();
        String dinero_total = label_dineroTotal.getText().replace("$", "");
        String venta_hoy = label_ventasHoy.getText().replace("$", "");
        String caja_anterior = label_cajaAnterior.getText().replace("$", "");
        String retiro1 = txtfield_montoRetiro1.getText();
        if (txtfield_montoRetiro1.getText().isBlank()){
            retiro1 = "0";
        }
        String retiro2 = txtfield_montoRetiro2.getText();
        if (txtfield_montoRetiro2.getText().isBlank()){
            retiro2 = "0";
        }
        String retiro3 = txtfield_montoRetiro3.getText();
        if (txtfield_montoRetiro3.getText().isBlank()){
            retiro3 = "0";
        }
        String comentario1 = txtfield_justificacionRetiro1.getText();
        String comentario2 = txtfield_justificacionRetiro2.getText();
        String comentario3 = txtfield_justificacionRetiro3.getText();
        String comentario = txtarea_comentario.getText();
        String caja_mañana = label_cajaMañana.getText().replace("$", "");
        String cigarros = label_cigarros.getText().replace("$", "");
        String sql = "INSERT INTO cierres (fecha, hora, efectivo, trans, total, venta, caja_anterior, retiro1, comentario1,"
        + " retiro2, comentario2, retiro3, comentario3, comentario, caja_mañana, cigarros) VALUES ('"+ff+"','"+hh+"',"
        +efectivo+","+transbank+","+dinero_total+","+venta_hoy+","+caja_anterior+","+retiro1+",'"+comentario1+"',"
        +retiro2+",'"+comentario2+"',"+retiro3+",'"+comentario3+"','"+comentario+"',"+caja_mañana+","+cigarros+")";
        requests_sql.executeStatement(sql);
        String sql_update = "UPDATE var SET dinero_total = "+caja_mañana+" , cigarros = 0 WHERE id = 1";
        requests_sql.executeStatement(sql_update);
        
        JOptionPane.showMessageDialog(null, "Cierre con fecha "+ ff +" realizado con éxito!");
        // Cerrar el JDialog
        JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        dialog.dispose();
    }//GEN-LAST:event_boton_cerrarCajaActionPerformed

    private void txtfield_dineroTransbankKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_dineroTransbankKeyReleased
        int trans;
        if (txtfield_dineroTransbank.getText().equals("")){
            trans = 0;
        } else {
            trans = Integer.parseInt(txtfield_dineroTransbank.getText());
        }
        int dinero_total = Integer.parseInt(label_dineroTotal.getText().replace("$", ""));
        Integer dinero_efectivo = dinero_total - trans;
        label_dineroEfectivo.setText(dinero_efectivo.toString());

        Integer ret1, ret2, ret3;
        if ( txtfield_montoRetiro1.getText().isBlank()){
            ret1 = 0;
        } else {
            ret1 = Integer.parseInt(txtfield_montoRetiro1.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro2.getText().isBlank()){
            ret2 = 0;
        } else {
            ret2 = Integer.parseInt(txtfield_montoRetiro2.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro3.getText().isBlank()){
            ret3 = 0;
        } else {
            ret3 = Integer.parseInt(txtfield_montoRetiro3.getText().replace("$", ""));
        }
        Integer caja_mañana = dinero_total - ret1 - ret2 - ret3 - parseInt(txtfield_dineroTransbank.getText());
        label_cajaMañana.setText(caja_mañana.toString());
    }//GEN-LAST:event_txtfield_dineroTransbankKeyReleased

    private void txtfield_montoRetiro1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_montoRetiro1KeyReleased
        Integer ret1, ret2, ret3;
        if ( txtfield_montoRetiro1.getText().isBlank()){
            ret1 = 0;
        } else {
            ret1 = Integer.parseInt(txtfield_montoRetiro1.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro2.getText().isBlank()){
            ret2 = 0;
        } else {
            ret2 = Integer.parseInt(txtfield_montoRetiro2.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro3.getText().isBlank()){
            ret3 = 0;
        } else {
            ret3 = Integer.parseInt(txtfield_montoRetiro3.getText().replace("$", ""));
        }
        int dinero_total = Integer.parseInt(label_dineroTotal.getText().replace("$", ""));
        Integer caja_mañana = dinero_total - ret1 - ret2 - ret3 - parseInt(txtfield_dineroTransbank.getText());
        label_cajaMañana.setText(caja_mañana.toString());
    }//GEN-LAST:event_txtfield_montoRetiro1KeyReleased

    private void txtfield_montoRetiro2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_montoRetiro2KeyReleased
        Integer ret1, ret2, ret3;
        if ( txtfield_montoRetiro1.getText().isBlank()){
            ret1 = 0;
        } else {
            ret1 = Integer.parseInt(txtfield_montoRetiro1.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro2.getText().isBlank()){
            ret2 = 0;
        } else {
            ret2 = Integer.parseInt(txtfield_montoRetiro2.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro3.getText().isBlank()){
            ret3 = 0;
        } else {
            ret3 = Integer.parseInt(txtfield_montoRetiro3.getText().replace("$", ""));
        }
        int dinero_total = Integer.parseInt(label_dineroTotal.getText().replace("$", ""));
        Integer caja_mañana = dinero_total - ret1 - ret2 - ret3 - parseInt(txtfield_dineroTransbank.getText());
        label_cajaMañana.setText(caja_mañana.toString());
    }//GEN-LAST:event_txtfield_montoRetiro2KeyReleased

    private void txtfield_montoRetiro3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfield_montoRetiro3KeyReleased
        Integer ret1, ret2, ret3;
        if ( txtfield_montoRetiro1.getText().isBlank()){
            ret1 = 0;
        } else {
            ret1 = Integer.parseInt(txtfield_montoRetiro1.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro2.getText().isBlank()){
            ret2 = 0;
        } else {
            ret2 = Integer.parseInt(txtfield_montoRetiro2.getText().replace("$", ""));
        }
        if ( txtfield_montoRetiro3.getText().isBlank()){
            ret3 = 0;
        } else {
            ret3 = Integer.parseInt(txtfield_montoRetiro3.getText().replace("$", ""));
        }
        int dinero_total = Integer.parseInt(label_dineroTotal.getText().replace("$", ""));
        Integer caja_mañana = dinero_total - ret1 - ret2 - ret3 - parseInt(txtfield_dineroTransbank.getText());
        label_cajaMañana.setText(caja_mañana.toString());
    }//GEN-LAST:event_txtfield_montoRetiro3KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cerrarCaja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel label_cajaAnterior;
    private javax.swing.JLabel label_cajaMañana;
    private javax.swing.JLabel label_cigarros;
    private javax.swing.JLabel label_dineroEfectivo;
    private javax.swing.JLabel label_dineroTotal;
    private javax.swing.JLabel label_dinerosc;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel label_venta_sc;
    private javax.swing.JLabel label_ventasHoy;
    private javax.swing.JTextArea txtarea_comentario;
    private javax.swing.JTextField txtfield_dineroTransbank;
    private javax.swing.JTextField txtfield_justificacionRetiro1;
    private javax.swing.JTextField txtfield_justificacionRetiro2;
    private javax.swing.JTextField txtfield_justificacionRetiro3;
    private javax.swing.JTextField txtfield_montoRetiro1;
    private javax.swing.JTextField txtfield_montoRetiro2;
    private javax.swing.JTextField txtfield_montoRetiro3;
    private javax.swing.JLabel x_label_cigarros;
    private javax.swing.JLabel x_label_dinerosc;
    private javax.swing.JLabel x_label_ventasc;
    // End of variables declaration//GEN-END:variables
}
