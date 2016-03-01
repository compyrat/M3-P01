/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Sala;

import m3.p01.Panels.Pelicula.*;
import m3.p01.MainFrame;

/**
 *
 * @author albertmarnun
 */
public class ModificarSalaSeleccion extends javax.swing.JPanel  {

    /**
     * Creates new form EliminarPelicula
     */
    public ModificarSalaSeleccion() {
        initComponents();
        cargarPeliculas();
        
    }
    public void cargarPeliculas(){
        for(int i = 0; i<MainFrame.salas.size(); i++){
            modificarSalaSeleccionCombo.addItem(i + " - Sala: " + MainFrame.salas.get(i).getNumSala());
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

        modificarSalaSeleccionCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        modificarPeliculaSeleccionBtn = new javax.swing.JButton();

        jLabel1.setText("Selecciona la sala");

        modificarPeliculaSeleccionBtn.setText("Modificar");
        modificarPeliculaSeleccionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPeliculaSeleccionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modificarPeliculaSeleccionBtn)
                            .addComponent(modificarSalaSeleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarSalaSeleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarPeliculaSeleccionBtn)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modificarPeliculaSeleccionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPeliculaSeleccionBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_modificarPeliculaSeleccionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modificarPeliculaSeleccionBtn;
    private javax.swing.JComboBox modificarSalaSeleccionCombo;
    // End of variables declaration//GEN-END:variables
}
