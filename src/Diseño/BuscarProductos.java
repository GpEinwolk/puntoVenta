/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Daniel
 */
public final class BuscarProductos extends javax.swing.JDialog {

    Conexion conn = new Conexion();
    Connection cn = conn.getConnection();
    TableRowSorter<TableModel> tr;
    
   
    
    public BuscarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Buscar un producto");
        tablaProductos();

    }

    void tablaProductos() {
        DefaultTableModel modelo = new DefaultTableModel();

        String datos[] = new String[5];

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Existencias");
        modelo.addColumn("Descripción");

        String sql = "SELECT codigo,nombre,precio,stock,espef FROM producto";
        Statement st;
        try {
            jTable1.setModel(modelo);
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(new Object[]{datos[0], datos[1], datos[2], datos[3], datos[4]});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        tr = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(tr);
        TableColumnModel columnModel = jTable1.getColumnModel();
        for (int col = 0; col < jTable1.getColumnCount(); col++) {

            int maxwidth = 0;
            for (int row = 0; row < jTable1.getRowCount(); row++) {
                TableCellRenderer rend = jTable1.getCellRenderer(row, col);
                Object value = jTable1.getValueAt(row, col);
                Component comp = rend.getTableCellRendererComponent(jTable1, value, false, false, row, col);
                maxwidth = Math.max(comp.getPreferredSize().width, maxwidth);
            }
            TableColumn column = columnModel.getColumn(col);
            column.setPreferredWidth(maxwidth);
            pack();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        campo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 41, 41));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));

        jScrollPane2.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterTabla(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(46, 204, 113));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campo.setBorder(null);
        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 270, Short.MAX_VALUE)
                        .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addGap(0, 370, Short.MAX_VALUE)))
        );

        jScrollPane2.getAccessibleContext().setAccessibleDescription("");
        jScrollPane2.getAccessibleContext().setAccessibleParent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
        String codigo = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        Ventas.textBuscar.setText(codigo);
        this.dispose();
        Ventas.agregar();
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Producto no seleccionado", "Mensaje", JOptionPane.OK_OPTION);

            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKeyReleased
        // TODO add your handling code here:
        String filtro = "(?i)" + campo.getText();
        if (!filtro.equals("")) {
            tr.setRowFilter(RowFilter.regexFilter(filtro));
        } else {
            tr.setRowFilter(null);
        }
    }//GEN-LAST:event_campoKeyReleased

    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoActionPerformed

    private void enterTabla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterTabla
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           jButton1.doClick();
        }
    }//GEN-LAST:event_enterTabla

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
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarProductos dialog = new BuscarProductos((Ventas) new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField campo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
