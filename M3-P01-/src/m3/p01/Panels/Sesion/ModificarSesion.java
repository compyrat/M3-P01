/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Sesion;

import m3.p01.MainFrame;
import m3.p01.Sesion;

/**
 *
 * @author albertmarnun
 */
public class ModificarSesion extends javax.swing.JPanel {

    /**
     * Creates new form CrearSesion
     */
    Sesion sesion = null;
    public ModificarSesion(Sesion ses) {
        initComponents();
        sesion = ses;
        cargarDatos();
    }
    private void cargarDatos(){
        modificarSesionSalaCombo.removeAllItems();
        for (int i = 0; i < MainFrame.cines.get(0).getSala().size(); i++){
            modificarSesionSalaCombo.addItem(" - Sala Numero: " + MainFrame.cines.get(0).getSala().get(i).getNumSala());
        }
        modificarSesionSalaCombo.setSelectedItem(" - Sala Numero: " + sesion.getSala().getNumSala());
        for (int i = 0; i< MainFrame.cines.get(0).getPelicula().size(); i++){
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modificarSesionSalaCombo = new javax.swing.JComboBox();
        modificarSesionPeliculaCombo = new javax.swing.JComboBox();
        modificarSesionButacasVendidasTxt = new javax.swing.JTextField();
        modificarSesionFechaDiaTxt = new javax.swing.JTextField();
        modificarSesionFechaMesTxt = new javax.swing.JTextField();
        modificarSesionFechaAnyoTxt = new javax.swing.JTextField();
        modificarSesionFechaHoraTxt = new javax.swing.JTextField();
        modificarSesionFechaMinTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        modificarSesionCrearBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 279));

        jLabel1.setText("Sala");

        jLabel2.setText("Pelicula");

        jLabel3.setText("Butacas Vendidas");

        jLabel4.setText("Fecha");

        modificarSesionFechaDiaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        modificarSesionFechaMesTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarSesionFechaMesTxt.setPreferredSize(new java.awt.Dimension(15, 20));

        modificarSesionFechaAnyoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarSesionFechaAnyoTxt.setPreferredSize(new java.awt.Dimension(15, 20));

        modificarSesionFechaHoraTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarSesionFechaHoraTxt.setPreferredSize(new java.awt.Dimension(15, 20));

        modificarSesionFechaMinTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarSesionFechaMinTxt.setPreferredSize(new java.awt.Dimension(15, 20));

        jLabel5.setText("Dia");

        jLabel6.setText("Mes");

        jLabel7.setText("Año");

        jLabel8.setText("Hora");

        jLabel9.setText("Min");

        modificarSesionCrearBtn.setText("Crear");
        modificarSesionCrearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSesionCrearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(modificarSesionFechaDiaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(modificarSesionFechaMesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(modificarSesionFechaAnyoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(modificarSesionFechaHoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(modificarSesionFechaMinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modificarSesionButacasVendidasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(modificarSesionPeliculaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarSesionSalaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(modificarSesionCrearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {modificarSesionFechaAnyoTxt, modificarSesionFechaDiaTxt, modificarSesionFechaHoraTxt, modificarSesionFechaMesTxt, modificarSesionFechaMinTxt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(modificarSesionSalaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modificarSesionPeliculaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modificarSesionButacasVendidasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(modificarSesionFechaDiaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(1, 1, 1)
                            .addComponent(modificarSesionFechaMesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(1, 1, 1)
                            .addComponent(modificarSesionFechaAnyoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(1, 1, 1)
                            .addComponent(modificarSesionFechaHoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(modificarSesionFechaMinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(modificarSesionCrearBtn)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {modificarSesionFechaAnyoTxt, modificarSesionFechaDiaTxt, modificarSesionFechaHoraTxt, modificarSesionFechaMesTxt, modificarSesionFechaMinTxt});

    }// </editor-fold>//GEN-END:initComponents

    private void modificarSesionCrearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSesionCrearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarSesionCrearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField modificarSesionButacasVendidasTxt;
    private javax.swing.JButton modificarSesionCrearBtn;
    private javax.swing.JTextField modificarSesionFechaAnyoTxt;
    private javax.swing.JTextField modificarSesionFechaDiaTxt;
    private javax.swing.JTextField modificarSesionFechaHoraTxt;
    private javax.swing.JTextField modificarSesionFechaMesTxt;
    private javax.swing.JTextField modificarSesionFechaMinTxt;
    private javax.swing.JComboBox modificarSesionPeliculaCombo;
    private javax.swing.JComboBox modificarSesionSalaCombo;
    // End of variables declaration//GEN-END:variables
}
