/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gatomaxi.vista;

import javax.swing.SwingUtilities;

/**
 *
 * @author pdmor
 */
public class PantallaCarga extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCarga
     */
    public PantallaCarga() {
        initComponents();
        iniciarCarga();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        porcentaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 224, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatomaxi/icon/pushen.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 580, 420));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 40)); // NOI18N
        jLabel2.setText("¡Bienvenido a GatoMaxi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("^-˕-^!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        jLabel5.setText("(=^‥^=)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        jProgressBar1.setForeground(new java.awt.Color(245, 159, 154));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 730, 20));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabel4.setText("Cargando...");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        porcentaje.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        porcentaje.setText("0%");
        jPanel1.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaCarga().setVisible(true);
        });
      
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel porcentaje;
    // End of variables declaration//GEN-END:variables

    private void iniciarCarga() {
        Thread thread = new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    final int progreso = i;
                    // Actualizar el JProgressBar en el EDT usando SwingUtilities.invokeLater
                    SwingUtilities.invokeLater(() -> {
                        jProgressBar1.setValue(progreso);
                        porcentaje.setText(progreso + " %");
                    });
                    Thread.sleep(100); // Simula carga
                }
                // Aquí deberías iniciar tu aplicación principal o abrir la siguiente ventana
                //abrirVentanaPrincipal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }



}

