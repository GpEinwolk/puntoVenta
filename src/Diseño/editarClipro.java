/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import static Diseño.Ventas.cn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class editarClipro extends javax.swing.JDialog {

    /**
     * Creates new form editarClipro
     *
     * @param parent
     * @param Codigo
     */
    public editarClipro(java.awt.Frame parent, boolean modal, String Codigo) {
        super(parent, modal);
        initComponents();
        llenarCampos(Codigo);
    }

    private editarClipro(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPcliente = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        txtID3 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtRFCCliente = new javax.swing.JFormattedTextField();
        txtDirCliente = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txtColCliente = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtPDcliente = new javax.swing.JTextField();
        txtNextCliente = new javax.swing.JFormattedTextField();
        jLabel105 = new javax.swing.JLabel();
        paisCliente = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        estadoCliente = new javax.swing.JComboBox<>();
        jLabel107 = new javax.swing.JLabel();
        txtCPcliente = new javax.swing.JFormattedTextField();
        jLabel108 = new javax.swing.JLabel();
        txtNintCliente = new javax.swing.JFormattedTextField();
        jLabel109 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        giroCliente = new javax.swing.JComboBox<>();
        botonEditar = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        txtCalleCliente = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPcliente.setBackground(new java.awt.Color(40, 41, 41));
        jPcliente.setAutoscrolls(true);
        jPcliente.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPcliente.setMinimumSize(new java.awt.Dimension(985, 613));

        jLabel98.setBackground(new java.awt.Color(40, 41, 41));
        jLabel98.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Nombre de la Empresa/Razon Social/Persona Fisica *");
        jLabel98.setOpaque(true);

        txtNombreC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtNombreC.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel99.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Modificar un Proveedor o Cliente");

        txtID3.setBackground(new java.awt.Color(40, 41, 41));
        txtID3.setForeground(new java.awt.Color(40, 41, 41));
        txtID3.setText("0");

        jLabel100.setBackground(new java.awt.Color(40, 41, 41));
        jLabel100.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("R.F.C. ");
        jLabel100.setOpaque(true);

        jLabel101.setBackground(new java.awt.Color(40, 41, 41));
        jLabel101.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Giro");
        jLabel101.setOpaque(true);

        txtRFCCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtRFCCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtRFCCliente.setText("");
        txtRFCCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtDirCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtDirCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtDirCliente.setText(" ");
        txtDirCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel102.setBackground(new java.awt.Color(40, 41, 41));
        jLabel102.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Direccion");
        jLabel102.setOpaque(true);

        txtColCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtColCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtColCliente.setText("");
        txtColCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel103.setBackground(new java.awt.Color(40, 41, 41));
        jLabel103.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Colonia");
        jLabel103.setOpaque(true);

        jLabel104.setBackground(new java.awt.Color(40, 41, 41));
        jLabel104.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("Poblacion y/o ");
        jLabel104.setOpaque(true);

        txtPDcliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtPDcliente.setForeground(new java.awt.Color(51, 51, 51));
        txtPDcliente.setText("");
        txtPDcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        txtNextCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtNextCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtNextCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNextCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNextClienteActionPerformed(evt);
            }
        });

        jLabel105.setBackground(new java.awt.Color(40, 41, 41));
        jLabel105.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("No. Ext");
        jLabel105.setOpaque(true);

        paisCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        paisCliente.setForeground(new java.awt.Color(51, 51, 51));
        paisCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico" }));

        jLabel106.setBackground(new java.awt.Color(40, 41, 41));
        jLabel106.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Pais");
        jLabel106.setOpaque(true);

        estadoCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        estadoCliente.setForeground(new java.awt.Color(51, 51, 51));
        estadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de México", "Coahuila", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jLabel107.setBackground(new java.awt.Color(40, 41, 41));
        jLabel107.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("Estado");
        jLabel107.setOpaque(true);

        txtCPcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtCPcliente.setForeground(new java.awt.Color(51, 51, 51));
        txtCPcliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel108.setBackground(new java.awt.Color(40, 41, 41));
        jLabel108.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Codigo Postal");
        jLabel108.setOpaque(true);

        txtNintCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtNintCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtNintCliente.setText(null);
        txtNintCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel109.setBackground(new java.awt.Color(40, 41, 41));
        jLabel109.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("No. Int");
        jLabel109.setOpaque(true);

        txtCorreoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtCorreoCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreoCliente.setText("");
        txtCorreoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel110.setBackground(new java.awt.Color(40, 41, 41));
        jLabel110.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Correo ");
        jLabel110.setOpaque(true);

        jLabel111.setBackground(new java.awt.Color(40, 41, 41));
        jLabel111.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("Los campos marcados con ( * ) son olbigatorios");
        jLabel111.setOpaque(true);

        jLabel112.setBackground(new java.awt.Color(40, 41, 41));
        jLabel112.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(153, 153, 153));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("Proporcione los datos de la persona Fisica o Moral");
        jLabel112.setOpaque(true);

        jLabel113.setBackground(new java.awt.Color(40, 41, 41));
        jLabel113.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Delegacion");
        jLabel113.setOpaque(true);

        giroCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        giroCliente.setForeground(new java.awt.Color(51, 51, 51));
        giroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Servicio de Software" }));

        botonEditar.setBackground(new java.awt.Color(29, 184, 83));
        botonEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.setFocusPainted(false);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        jLabel114.setBackground(new java.awt.Color(40, 41, 41));
        jLabel114.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Calle");
        jLabel114.setOpaque(true);

        txtCalleCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtCalleCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtCalleCliente.setText("");
        txtCalleCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel115.setBackground(new java.awt.Color(40, 41, 41));
        jLabel115.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Codigo de Cliente* ");
        jLabel115.setOpaque(true);

        txtCodCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtCodCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtCodCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPclienteLayout = new javax.swing.GroupLayout(jPcliente);
        jPcliente.setLayout(jPclienteLayout);
        jPclienteLayout.setHorizontalGroup(
            jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPclienteLayout.createSequentialGroup()
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPclienteLayout.createSequentialGroup()
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel104))
                                .addGap(10, 10, 10)
                                .addComponent(txtPDcliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createSequentialGroup()
                                        .addComponent(jLabel103)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtColCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createSequentialGroup()
                                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel114)
                                            .addComponent(jLabel100)
                                            .addComponent(jLabel102))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPclienteLayout.createSequentialGroup()
                                                .addComponent(txtRFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel101)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(giroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtNombreC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createSequentialGroup()
                                        .addComponent(jLabel106)
                                        .addGap(18, 18, 18)
                                        .addComponent(paisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(248, 248, 248)
                                        .addComponent(jLabel107)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(estadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createSequentialGroup()
                                        .addComponent(jLabel110)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPclienteLayout.createSequentialGroup()
                                            .addComponent(jLabel115)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel108)
                                .addComponent(txtCPcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPclienteLayout.createSequentialGroup()
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNintCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPclienteLayout.setVerticalGroup(
            jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclienteLayout.createSequentialGroup()
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112)
                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPclienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID3))
                    .addGroup(jPclienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101)
                            .addComponent(txtRFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPclienteLayout.createSequentialGroup()
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel102))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel114)))
                            .addGroup(jPclienteLayout.createSequentialGroup()
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel109))
                                .addGap(4, 4, 4)
                                .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNintCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103)
                            .addComponent(txtCPcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPclienteLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtPDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPclienteLayout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel113)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106)
                            .addComponent(estadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107))
                        .addGap(18, 18, 18)
                        .addGroup(jPclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel110)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNextClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNextClienteActionPerformed

    }//GEN-LAST:event_txtNextClienteActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed

    }//GEN-LAST:event_botonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(editarClipro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarClipro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarClipro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarClipro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editarClipro dialog = new editarClipro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JComboBox<String> estadoCliente;
    private javax.swing.JComboBox<String> giroCliente;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPcliente;
    private javax.swing.JComboBox<String> paisCliente;
    private javax.swing.JFormattedTextField txtCPcliente;
    private javax.swing.JTextField txtCalleCliente;
    private javax.swing.JFormattedTextField txtCodCliente;
    private javax.swing.JTextField txtColCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDirCliente;
    private javax.swing.JLabel txtID3;
    private javax.swing.JFormattedTextField txtNextCliente;
    private javax.swing.JFormattedTextField txtNintCliente;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtPDcliente;
    private javax.swing.JFormattedTextField txtRFCCliente;
    // End of variables declaration//GEN-END:variables

    private void llenarCampos(String codigo) {
        String sql = "SELECT * FROM clipro WHERE codigo = '" + codigo + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                txtCodCliente.setText((String) rs.getObject(2));
                txtNombreC.setText((String) rs.getObject(3));
                txtDirCliente.setText((String) rs.getObject(4));
                txtCalleCliente.setText((String) rs.getObject(5));
                txtNintCliente.setText(Integer.toString((int) rs.getObject(6)));
                txtNextCliente.setText(Integer.toString((int) rs.getObject(7)));
                txtColCliente.setText((String) rs.getObject(8));
                txtCPcliente.setText(Integer.toString((int) rs.getObject(9)));
                txtPDcliente.setText((String) rs.getObject(10));
                estadoCliente.setSelectedItem(rs.getObject(11));
                paisCliente.setSelectedItem(rs.getObject(12));
                txtRFCCliente.setText((String) rs.getObject(13));
                txtCorreoCliente.setText((String) rs.getObject(14));
                if(rs.getObject(15).equals(1)){
                jLabel99.setText("Modificar un Cliente");
                jLabel115.setText("Codigo de Cliente* ");
                }else{
                jLabel99.setText("Modificar un Proveedor");
                jLabel115.setText("Codigo de Proveedor* ");
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
