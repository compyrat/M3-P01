/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Pelicula;

import javax.swing.JOptionPane;
import m3.p01.MainFrame;

/**
 *
 * @author albertmarnun
 */
public class EliminarPelicula extends javax.swing.JPanel {

    /**
     * Creates new form EliminarPelicula
     */
    public EliminarPelicula() {
        initComponents();
        cargarPeliculas();
    }

    public void cargarPeliculas(){
        for(int i = 0; i<MainFrame.cines.get(0).getPelicula().size(); i++){
            eliminarPeliculaSeleccionCombo.addItem(MainFrame.cines.get(0).getPelicula().get(i).getTitulo());
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

        eliminarPeliculaSeleccionCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona la pelicula");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarPeliculaSeleccionCombo, 0, 186, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarPeliculaSeleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        if (MainFrame.infoComprobar("Desea eliminar la película: "+eliminarPeliculaSeleccionCombo.getSelectedItem().toString())==JOptionPane.YES_OPTION){
            MainFrame.cines.get(0).delPelicula(eliminarPeliculaSeleccionCombo.getSelectedItem().toString());    
            eliminarPeliculaSeleccionCombo.removeAllItems();
            MainFrame.infoCorrect("Película eliminada correctamente.");
            this.removeAll();
            EliminarPelicula mP = new EliminarPelicula();
            mP.setBounds(0, 0, 450, 279);
            this.add(mP);
            this.revalidate();
            this.repaint();
        }
        }catch(NullPointerException NPE){
            MainFrame.infoFail("No hay nada seleccionado.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox eliminarPeliculaSeleccionCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
