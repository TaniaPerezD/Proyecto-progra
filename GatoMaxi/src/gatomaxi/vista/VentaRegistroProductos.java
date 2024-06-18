/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gatomaxi.vista;
import gatomaxi.modelo.Venta;
/**
 *
 * @author usuario
 */
public class VentaRegistroProductos extends javax.swing.JFrame {
    public int index=0;
    /**
     * Creates new form VentaRegistroProductos
     */
    public VentaRegistroProductos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        COMPRA = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AGREGAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        CANTIDAD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        STOCK = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        GENERAR = new javax.swing.JButton();
        CANTIDAD2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CANTIDAD3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PAGAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 224, 211));
        setForeground(new java.awt.Color(246, 224, 211));

        jPanel1.setBackground(new java.awt.Color(244, 159, 154));
        jPanel1.setForeground(new java.awt.Color(244, 159, 154));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/user_icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        COMPRA.setBackground(new java.awt.Color(246, 190, 175));
        COMPRA.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        COMPRA.setForeground(new java.awt.Color(51, 51, 51));
        COMPRA.setText("Compra registro");
        COMPRA.setEnabled(false);
        COMPRA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        COMPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRAActionPerformed(evt);
            }
        });

        SALIR.setBackground(new java.awt.Color(246, 190, 175));
        SALIR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(51, 51, 51));
        SALIR.setText("SALIR");
        SALIR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/compra_icon.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("CAJERO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(COMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanel5.setBackground(new java.awt.Color(246, 190, 175));
        jPanel5.setForeground(new java.awt.Color(244, 159, 154));

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel3.setText("ID Producto:");

        AGREGAR.setBackground(new java.awt.Color(245, 161, 128));
        AGREGAR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AGREGAR.setForeground(new java.awt.Color(51, 51, 51));
        AGREGAR.setText("AGREGAR");
        AGREGAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(245, 161, 128));
        BUSCAR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BUSCAR.setForeground(new java.awt.Color(51, 51, 51));
        BUSCAR.setText("BUSCAR");
        BUSCAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        CANTIDAD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CANTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel6.setText("Cantidad:");

        CODIGO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODIGOActionPerformed(evt);
            }
        });

        STOCK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        STOCK.setEnabled(false);
        STOCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOCKActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel7.setText("Stock:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BUSCAR)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGREGAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jTable1.setForeground(new java.awt.Color(255, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre Producto", "Cantidad", "Precio Unitacio"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBackground(new java.awt.Color(246, 190, 175));
        jPanel6.setForeground(new java.awt.Color(244, 159, 154));

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel8.setText("ID Cliente:");

        GENERAR.setBackground(new java.awt.Color(245, 161, 128));
        GENERAR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        GENERAR.setForeground(new java.awt.Color(51, 51, 51));
        GENERAR.setText("GENERAR");
        GENERAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERARActionPerformed(evt);
            }
        });

        CANTIDAD2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CANTIDAD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDAD2ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 153, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel9.setText("Pagar con:");

        CANTIDAD3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CANTIDAD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDAD3ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 153, 153));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel10.setText("Vuelto:");

        PAGAR.setBackground(new java.awt.Color(245, 161, 128));
        PAGAR.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        PAGAR.setForeground(new java.awt.Color(51, 51, 51));
        PAGAR.setText("PAGAR");
        PAGAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(CANTIDAD2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CANTIDAD3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(PAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PAGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CANTIDAD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CANTIDAD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COMPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMPRAActionPerformed

    private void CANTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
        
        Venta venta = new Venta(CODIGO.getText(),Integer.parseInt(CANTIDAD.getText()));
        venta.buscar(CODIGO.getText());
    }//GEN-LAST:event_BUSCARActionPerformed

    private void CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODIGOActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        // TODO add your handling code here:
        Venta venta = new Venta(CODIGO.getText(),Integer.parseInt(CANTIDAD.getText()));
        venta.actualizarStock();
        
        jTable1.setValueAt((venta.getCodigo()), index, 1);
        jTable1.setValueAt((venta.getNombreProducto()), index, 2);
        jTable1.setValueAt((venta.getCantidad()), index, 3);
        jTable1.setValueAt((venta.getPrecioUnitario()), index, 4);
        //jTable1.
    }//GEN-LAST:event_AGREGARActionPerformed

    private void STOCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOCKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STOCKActionPerformed

    private void GENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GENERARActionPerformed

    private void CANTIDAD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDAD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDAD2ActionPerformed

    private void CANTIDAD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDAD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDAD3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentaRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaRegistroProductos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JTextField CANTIDAD;
    private javax.swing.JTextField CANTIDAD2;
    private javax.swing.JTextField CANTIDAD3;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JButton COMPRA;
    private javax.swing.JButton GENERAR;
    private javax.swing.JButton PAGAR;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField STOCK;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
