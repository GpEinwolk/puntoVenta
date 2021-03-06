/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniel
 */
public class importarBD extends javax.swing.JDialog {

    /**
     * Creates new form importarBD
     */
    public importarBD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImportar = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        textRuta = new javax.swing.JTextField();
        botonImportar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botonSeleccionar = new javax.swing.JButton();
        iconBD = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelImportar.setBackground(new java.awt.Color(40, 41, 41));

        labelTitulo.setBackground(new java.awt.Color(40, 41, 41));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Importar Base de Datos");
        labelTitulo.setMaximumSize(new java.awt.Dimension(111, 23));
        labelTitulo.setMinimumSize(new java.awt.Dimension(111, 23));
        labelTitulo.setOpaque(true);
        labelTitulo.setPreferredSize(new java.awt.Dimension(111, 23));

        textRuta.setEditable(false);
        textRuta.setBackground(new java.awt.Color(40, 41, 41));
        textRuta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        textRuta.setForeground(new java.awt.Color(255, 255, 255));
        textRuta.setBorder(null);
        textRuta.setCaretColor(new java.awt.Color(255, 255, 255));

        botonImportar.setBackground(new java.awt.Color(29, 184, 83));
        botonImportar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonImportar.setForeground(new java.awt.Color(255, 255, 255));
        botonImportar.setText("Importar");
        botonImportar.setBorder(null);
        botonImportar.setFocusPainted(false);
        botonImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importar(evt);
            }
        });

        botonSeleccionar.setBackground(new java.awt.Color(29, 184, 83));
        botonSeleccionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        botonSeleccionar.setText("Seleccionar Archivo");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarArchivo(evt);
            }
        });

        iconBD.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        iconBD.setForeground(new java.awt.Color(255, 255, 255));
        iconBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/database  (8).png"))); // NOI18N

        botonAtras.setBackground(new java.awt.Color(29, 184, 83));
        botonAtras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras(evt);
            }
        });

        javax.swing.GroupLayout panelImportarLayout = new javax.swing.GroupLayout(panelImportar);
        panelImportar.setLayout(panelImportarLayout);
        panelImportarLayout.setHorizontalGroup(
            panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImportarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImportarLayout.createSequentialGroup()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelImportarLayout.createSequentialGroup()
                        .addGroup(panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSeleccionar)
                            .addGroup(panelImportarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(iconBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonAtras))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelImportarLayout.setVerticalGroup(
            panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImportarLayout.createSequentialGroup()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeleccionar)
                    .addComponent(textRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImportarLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(botonImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAtras))
                    .addComponent(iconBD, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void importar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importar
        // TODO add your handling code here:
        String ruta = textRuta.getText();
        String backup = "";
        if(ruta.trim().length()!=0){
            try{
                backup = "cmd /c C:\\xampp\\mysql\\bin\\mysql -u"+Conexion.getuser()+" -p"+Conexion.getpassword()+" "+Conexion.getdb()+" < "+ruta;
                Runtime rt = Runtime.getRuntime();
                rt.exec(backup);
                JOptionPane.showMessageDialog(null, "Backup Importado: "+ruta);
                dispose();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_importar

    private void seleccionarArchivo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarArchivo
        // TODO add your handling code here:
        JFileChooser ch = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("SQL","sql");
        ch.setFileFilter(fil);
        int se = ch.showSaveDialog(null);
        if(se == JFileChooser.APPROVE_OPTION){
            String ruta = ch.getSelectedFile().getPath();
            textRuta.setText(ruta);
        }
    }//GEN-LAST:event_seleccionarArchivo

    private void atras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras
        // TODO add your handling code here:
        dispose();
        System.out.println(evt);
    }//GEN-LAST:event_atras

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
            java.util.logging.Logger.getLogger(importarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(importarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(importarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(importarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                importarBD dialog = new importarBD(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonImportar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JLabel iconBD;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelImportar;
    private javax.swing.JTextField textRuta;
    // End of variables declaration//GEN-END:variables
}
