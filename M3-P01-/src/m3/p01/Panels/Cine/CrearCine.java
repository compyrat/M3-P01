/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Cine;

import m3.p01.Cine;
import m3.p01.MainFrame;

/**
 *
 * @author albertmarnun
 */
public class CrearCine extends javax.swing.JPanel {

    /**
     * Creates new form test
     */
    public CrearCine() {
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

        jLabel1 = new javax.swing.JLabel();
        crearCineNombreTxt = new javax.swing.JTextField();
        crearCineDireccionTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        crearCineBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 279));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));
        add(crearCineNombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, -1));
        add(crearCineDireccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, -1));

        jLabel2.setText("Dirección:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        crearCineBtn.setText("Crear");
        crearCineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCineBtnActionPerformed(evt);
            }
        });
        add(crearCineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void crearCineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCineBtnActionPerformed
        // TODO add your handling code here:
        Cine cine = new Cine(crearCineNombreTxt.getText(), crearCineDireccionTxt.getText());
        MainFrame.cines.add(cine);
        MainFrame.infoCorrect("Se ha creado correctamente.");
        
    }//GEN-LAST:event_crearCineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearCineBtn;
    private javax.swing.JTextField crearCineDireccionTxt;
    private javax.swing.JTextField crearCineNombreTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
