/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Pelicula;

import m3.p01.MainFrame;

/**
 *
 * @author albertmarnun
 */
public class ModificarPeliculaSeleccion extends javax.swing.JPanel  {

    /**
     * Creates new form EliminarPelicula
     */
    public ModificarPeliculaSeleccion() {
        initComponents();
        cargarPeliculas();
        
    }
    public void cargarPeliculas(){
        for(int i = 0; i<MainFrame.peliculas.size(); i++){
            modificarPeliculaSeleccionCombo.addItem(i + "- " + MainFrame.peliculas.get(i).getTitulo());
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

        modificarPeliculaSeleccionCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        modificarPeliculaSeleccionBtn = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona la pelicula");

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
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarPeliculaSeleccionBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modificarPeliculaSeleccionCombo, 0, 186, Short.MAX_VALUE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarPeliculaSeleccionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarPeliculaSeleccionBtn)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modificarPeliculaSeleccionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPeliculaSeleccionBtnActionPerformed
        // TODO add your handling code here:

        ModificarPelicula mP= new ModificarPelicula(modificarPeliculaSeleccionCombo.getSelectedIndex());
        mP.setBounds(0, 0, 450, 279);
        this.add(mP);
        this.revalidate();
        this.repaint();
        this.jLabel1.setVisible(false);
        this.modificarPeliculaSeleccionCombo.setVisible(false);
        this.modificarPeliculaSeleccionBtn.setVisible(false);
        
    }//GEN-LAST:event_modificarPeliculaSeleccionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modificarPeliculaSeleccionBtn;
    private javax.swing.JComboBox modificarPeliculaSeleccionCombo;
    // End of variables declaration//GEN-END:variables
}
