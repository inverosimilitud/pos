package Ventanas;

import Functions.Dates;
import Functions.gridBagConstrints;
import Functions.requests_sql;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class panel_verCierre extends javax.swing.JPanel {
    
    public panel_verCierre(int id_cierre) {
        initComponents();
        setLayout(new GridBagLayout());
        login login = new login();
        label_usuario.setText("Usuario: " + login.username_usuario);
        add(label_usuario, gridBagConstrints.modificar_posición //label usuario
        (0, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_usuario.setPreferredSize(new Dimension(100, 20)); 
        add(label_fecha, gridBagConstrints.modificar_posición //label fecha
        (0, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_fecha.setPreferredSize(new Dimension(100, 20));
        add(label_hora, gridBagConstrints.modificar_posición //label hora
        (0, 2, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        label_hora.setPreferredSize(new Dimension(100, 20));
        add(label10, gridBagConstrints.modificar_posición //label hora
        (1, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label12, gridBagConstrints.modificar_posición //label hora
        (1, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label_horaCierre, gridBagConstrints.modificar_posición //label hora
        (2, 0, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label_fechaCierre, gridBagConstrints.modificar_posición //label hora
        (2, 1, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        
        add(label1, gridBagConstrints.modificar_posición //label hora
        (0, 4, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label2, gridBagConstrints.modificar_posición //label hora
        (0, 5, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label3, gridBagConstrints.modificar_posición //label hora
        (0, 6, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label4, gridBagConstrints.modificar_posición //label hora
        (0, 7, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label5, gridBagConstrints.modificar_posición //label hora
        (0, 8, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label6, gridBagConstrints.modificar_posición //label hora
        (0, 9, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label7, gridBagConstrints.modificar_posición //label hora
        (0, 10, 5, 5, 5, 5, 1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label8, gridBagConstrints.modificar_posición //label hora
        (0, 11, 5, 5, 5, 5,1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label9, gridBagConstrints.modificar_posición //label hora
        (0, 12, 5, 5, 5, 5,1, 1, 10, 30, 0, 0, GridBagConstraints.CENTER));
        add(label_dineroTotal, gridBagConstrints.modificar_posición //label hora
        (1, 4, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_dineroTransbank, gridBagConstrints.modificar_posición //label hora
        (1, 5, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_dineroEfectivo, gridBagConstrints.modificar_posición //label hora
        (1, 6, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cajaAnterior, gridBagConstrints.modificar_posición //label hora
        (1, 7, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_ventasHoy, gridBagConstrints.modificar_posición //label hora
        (1, 8, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_retiro1, gridBagConstrints.modificar_posición //label hora
        (1, 9, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        label_retiro1.setPreferredSize(new Dimension(50, 20)); 
        add(label_retiro2, gridBagConstrints.modificar_posición //label hora
        (1, 10, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        label_retiro2.setPreferredSize(new Dimension(50, 20)); 
        add(label_retiro3, gridBagConstrints.modificar_posición //label hora
        (1, 11, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        label_retiro3.setPreferredSize(new Dimension(50, 20)); 
        add(txtfield_justificacionRetiro1, gridBagConstrints.modificar_posición //label hora
        (2, 9, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_justificacionRetiro2, gridBagConstrints.modificar_posición //label hora
        (2, 8, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtfield_justificacionRetiro3, gridBagConstrints.modificar_posición //label hora
        (2, 11, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cajaMañana, gridBagConstrints.modificar_posición //label hora
        (1, 12, 5, 5, 5, 5, 2, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(txtarea_comentario, gridBagConstrints.modificar_posición //label hora
        (0, 13, 5, 5, 5, 5, 3, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(jScrollPane1, gridBagConstrints.modificar_posición //label hora
        (0, 13, 5, 5, 5, 5, 3, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(x_label_cigarros, gridBagConstrints.modificar_posición //label hora
        (0, 3, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        add(label_cigarros, gridBagConstrints.modificar_posición //label hora
        (1, 3, 5, 5, 5, 5, 1, 1, 10, 30, 1.0, 0, GridBagConstraints.CENTER));
        
        jScrollPane1.setViewportView (txtarea_comentario);
        
        Dates.fechaYhora(label_fecha, label_hora);
        
        String sql = "SELECT  total, trans, efectivo, venta, retiro1, retiro2, retiro3, comentario1, comentario2, comentario3, caja_mañana, comentario, fecha, hora, caja_anterior, cigarros FROM cierres WHERE id =" + id_cierre;
        String[] cierre = requests_sql.sql_unRegistro(sql);
        label_dineroTotal.setText(cierre[0]);
        label_dineroTransbank.setText(cierre[1]);
        label_dineroEfectivo.setText(cierre[2]);
        label_ventasHoy.setText(cierre[3]);
        label_retiro1.setText(cierre[4]);
        label_retiro2.setText(cierre[5]);
        label_retiro3.setText(cierre[6]);
        txtfield_justificacionRetiro1.setText(cierre[7]);
        txtfield_justificacionRetiro2.setText(cierre[8]);
        txtfield_justificacionRetiro3.setText(cierre[9]);
        txtarea_comentario.setText(cierre[11]);
        label_cajaMañana.setText(cierre[10]);
        label_fechaCierre.setText(cierre[12]);
        label_horaCierre.setText(cierre[13]);
        label_cajaAnterior.setText(cierre[14]);
        label_cigarros.setText(cierre[15]);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        label_usuario = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
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
        txtfield_justificacionRetiro1 = new javax.swing.JTextField();
        txtfield_justificacionRetiro2 = new javax.swing.JTextField();
        txtfield_justificacionRetiro3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_comentario = new javax.swing.JTextArea();
        label_retiro1 = new javax.swing.JLabel();
        label_retiro2 = new javax.swing.JLabel();
        label_retiro3 = new javax.swing.JLabel();
        label_dineroTransbank = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label_horaCierre = new javax.swing.JLabel();
        label_fechaCierre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_comentario1 = new javax.swing.JTextArea();
        x_label_cigarros = new javax.swing.JLabel();
        label_cigarros = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        label_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_usuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = -9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        add(label_usuario, gridBagConstraints);

        label_fecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_fecha.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        add(label_fecha, gridBagConstraints);

        label_hora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_hora.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        add(label_hora, gridBagConstraints);

        label_cajaMañana.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 0);
        add(label_cajaMañana, gridBagConstraints);

        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("Dinero transbank:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 16, 0, 0);
        add(label2, gridBagConstraints);

        label3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label3.setText("Dinero en efectivo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 16, 0, 0);
        add(label3, gridBagConstraints);

        label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label4.setText("Caja anterior:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 16, 0, 0);
        add(label4, gridBagConstraints);

        label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label5.setText("Ventas hoy:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 16, 0, 0);
        add(label5, gridBagConstraints);

        label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label6.setText("Retiro efectivo 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 16, 0, 0);
        add(label6, gridBagConstraints);

        label7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label7.setText("Retiro efectivo 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        add(label7, gridBagConstraints);

        label8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label8.setText("Retiro efectivo 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        add(label8, gridBagConstraints);

        label9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label9.setText("Caja mañana:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 16, 0, 0);
        add(label9, gridBagConstraints);

        label_dineroEfectivo.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 1, 0, 0);
        add(label_dineroEfectivo, gridBagConstraints);

        label_cajaAnterior.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 1, 0, 0);
        add(label_cajaAnterior, gridBagConstraints);

        label_ventasHoy.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 1, 0, 0);
        add(label_ventasHoy, gridBagConstraints);

        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label1.setText("Dinero total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        add(label1, gridBagConstraints);

        label_dineroTotal.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 1, 0, 0);
        add(label_dineroTotal, gridBagConstraints);

        txtfield_justificacionRetiro1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 23, 0, 0);
        add(txtfield_justificacionRetiro1, gridBagConstraints);

        txtfield_justificacionRetiro2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 23, 0, 0);
        add(txtfield_justificacionRetiro2, gridBagConstraints);

        txtfield_justificacionRetiro3.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 23, 0, 0);
        add(txtfield_justificacionRetiro3, gridBagConstraints);

        txtarea_comentario.setColumns(20);
        txtarea_comentario.setRows(5);
        txtarea_comentario.setEnabled(false);
        jScrollPane1.setViewportView(txtarea_comentario);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -234;
        gridBagConstraints.ipady = -86;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);

        label_retiro1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 8, 0, 0);
        add(label_retiro1, gridBagConstraints);

        label_retiro2.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 0);
        add(label_retiro2, gridBagConstraints);

        label_retiro3.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 0);
        add(label_retiro3, gridBagConstraints);

        label_dineroTransbank.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        add(label_dineroTransbank, gridBagConstraints);

        label10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label10.setText("Hora:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 7, 0, 0);
        add(label10, gridBagConstraints);

        label12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label12.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 7, 0, 0);
        add(label12, gridBagConstraints);

        label_horaCierre.setText("$$$$$$$$$$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 35;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 14, 0, 0);
        add(label_horaCierre, gridBagConstraints);

        label_fechaCierre.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 35;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 24, 0, 0);
        add(label_fechaCierre, gridBagConstraints);

        txtarea_comentario1.setColumns(20);
        txtarea_comentario1.setRows(5);
        jScrollPane2.setViewportView(txtarea_comentario1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane2, gridBagConstraints);

        x_label_cigarros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        x_label_cigarros.setText("Dinero cigarros:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 7, 0, 0);
        add(x_label_cigarros, gridBagConstraints);

        label_cigarros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_cigarros.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 55;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 42;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 17, 0, 33);
        add(label_cigarros, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label12;
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
    private javax.swing.JLabel label_dineroTransbank;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_fechaCierre;
    private javax.swing.JLabel label_hora;
    private javax.swing.JLabel label_horaCierre;
    private javax.swing.JLabel label_retiro1;
    private javax.swing.JLabel label_retiro2;
    private javax.swing.JLabel label_retiro3;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel label_ventasHoy;
    private javax.swing.JTextArea txtarea_comentario;
    private javax.swing.JTextArea txtarea_comentario1;
    private javax.swing.JTextField txtfield_justificacionRetiro1;
    private javax.swing.JTextField txtfield_justificacionRetiro2;
    private javax.swing.JTextField txtfield_justificacionRetiro3;
    private javax.swing.JLabel x_label_cigarros;
    // End of variables declaration//GEN-END:variables
}
