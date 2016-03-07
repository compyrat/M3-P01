/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Sala;

import Exceptions.noNumeric;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.p01.MainFrame;
import m3.p01.Sala;

/**
 *
 * @author albertmarnun
 */
public class CrearSala extends javax.swing.JPanel {

    /**
     * Creates new form CrearSala
     */
    public CrearSala() {
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
        jLabel2 = new javax.swing.JLabel();
        crearSalaNumeroButacasTxt = new javax.swing.JTextField();
        crearSalaNumeroSalaTxt = new javax.swing.JTextField();
        crearSalaCrearBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 279));

        jLabel1.setText("Nº de Sala ");

        jLabel2.setText("Nº de Butacas");

        crearSalaCrearBtn.setText("Crear");
        crearSalaCrearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSalaCrearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearSalaCrearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(crearSalaNumeroButacasTxt)
                            .addComponent(crearSalaNumeroSalaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearSalaNumeroSalaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearSalaNumeroButacasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(crearSalaCrearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void crearSalaCrearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSalaCrearBtnActionPerformed
        // TODO add your handling code here:
        if (MainFrame.isNumeric(crearSalaNumeroSalaTxt.getText()) && MainFrame.isNumeric(crearSalaNumeroButacasTxt.getText())){
            MainFrame.salas.add(new Sala(Integer.parseInt(crearSalaNumeroSalaTxt.getText()), Integer.parseInt(crearSalaNumeroButacasTxt.getText())));
        }else{
            try {
                throw new noNumeric("El numero de butacas y la sala ha de ser un texto Numerico");
            } catch (noNumeric ex) {
                Logger.getLogger(CrearSala.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_crearSalaCrearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearSalaCrearBtn;
    private javax.swing.JTextField crearSalaNumeroButacasTxt;
    private javax.swing.JTextField crearSalaNumeroSalaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}