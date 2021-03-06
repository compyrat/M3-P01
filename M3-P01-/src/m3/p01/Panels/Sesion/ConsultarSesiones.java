/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Sesion;

import javax.swing.table.DefaultTableModel;
import m3.p01.MainFrame;

/**
 *
 * @author albertribgar
 */
public class ConsultarSesiones extends javax.swing.JPanel {

    /**
     * Creates new form ConsultarSesiones
     */
    private boolean fechacond;
    public ConsultarSesiones() {
        initComponents();
        inicio();
    }
    private void inicio(){
        ConsultarSesionesTxtDia.setVisible(false);
        ConsultarSesionesTxtMes.setVisible(false);
        ConsultarSesionesTxtAño.setVisible(false);
        ConsultarSesionesTxtSala.setVisible(false);
        ConsultarSesionesBtBuscar.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultarSesionesTxtDia = new javax.swing.JTextField();
        ConsultarSesionesTxtMes = new javax.swing.JTextField();
        ConsultarSesionesTxtAño = new javax.swing.JTextField();
        ConsultarSesionesTxtSala = new javax.swing.JTextField();
        ConsultarSesionesRadioFecha = new javax.swing.JRadioButton();
        ConsultarSesionesRadioSala = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ConsultarSesionesBtBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsultarSesionesTxtArea = new javax.swing.JTextArea();
        ConsultarSesionesRadioPelicula = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        ConsultarSesionesTxtPelicula = new javax.swing.JTextField();

        ConsultarSesionesRadioFecha.setText("Fecha");
        ConsultarSesionesRadioFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSesionesRadioFechaActionPerformed(evt);
            }
        });

        ConsultarSesionesRadioSala.setText("Num Sala");
        ConsultarSesionesRadioSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSesionesRadioSalaActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha:");

        jLabel2.setText("Sala:");

        ConsultarSesionesBtBuscar.setText("Buscar");
        ConsultarSesionesBtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSesionesBtBuscarActionPerformed(evt);
            }
        });

        ConsultarSesionesTxtArea.setColumns(20);
        ConsultarSesionesTxtArea.setRows(5);
        jScrollPane1.setViewportView(ConsultarSesionesTxtArea);

        ConsultarSesionesRadioPelicula.setText("Título");
        ConsultarSesionesRadioPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSesionesRadioPeliculaActionPerformed(evt);
            }
        });

        jLabel3.setText("Título:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ConsultarSesionesRadioFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultarSesionesRadioSala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsultarSesionesRadioPelicula))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ConsultarSesionesTxtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ConsultarSesionesTxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ConsultarSesionesTxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ConsultarSesionesTxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ConsultarSesionesTxtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(ConsultarSesionesBtBuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarSesionesRadioFecha)
                    .addComponent(ConsultarSesionesRadioSala)
                    .addComponent(ConsultarSesionesRadioPelicula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarSesionesTxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarSesionesTxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarSesionesTxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarSesionesTxtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ConsultarSesionesTxtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarSesionesBtBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarSesionesRadioFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSesionesRadioFechaActionPerformed
        // TODO add your handling code here:
        ConsultarSesionesTxtDia.setVisible(true);
        ConsultarSesionesTxtMes.setVisible(true);
        ConsultarSesionesTxtAño.setVisible(true);
        ConsultarSesionesBtBuscar.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(false);
        ConsultarSesionesTxtSala.setVisible(false);
        ConsultarSesionesTxtPelicula.setVisible(false);
        jLabel3.setVisible(false);
        ConsultarSesionesRadioSala.setSelected(false);
        ConsultarSesionesRadioPelicula.setSelected(false);
        ConsultarSesionesTxtArea.setText("");

    }//GEN-LAST:event_ConsultarSesionesRadioFechaActionPerformed

    private void ConsultarSesionesRadioSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSesionesRadioSalaActionPerformed
        // TODO add your handling code here:
        ConsultarSesionesTxtDia.setVisible(false);
        ConsultarSesionesTxtMes.setVisible(false);
        ConsultarSesionesTxtAño.setVisible(false);
        ConsultarSesionesBtBuscar.setVisible(true);
        jLabel1.setVisible(false);
        jLabel2.setVisible(true);
        ConsultarSesionesTxtSala.setVisible(true);
        ConsultarSesionesTxtPelicula.setVisible(false);
        jLabel3.setVisible(false);
        ConsultarSesionesRadioPelicula.setSelected(false);
        ConsultarSesionesRadioFecha.setSelected(false);
        ConsultarSesionesTxtArea.setText("");
    }//GEN-LAST:event_ConsultarSesionesRadioSalaActionPerformed

    private void ConsultarSesionesBtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSesionesBtBuscarActionPerformed
        // TODO add your handling code here:
        //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        if (ConsultarSesionesRadioFecha.isSelected()){
            int dia = Integer.parseInt(ConsultarSesionesTxtDia.getText());
            int mes = Integer.parseInt(ConsultarSesionesTxtMes.getText())-1;
            int año = Integer.parseInt(ConsultarSesionesTxtAño.getText());
            ConsultarSesionesTxtArea.setText(MainFrame.cines.get(0).listaSesiones(dia, mes, año));
            //model.addRow(new String[]{MainFrame.cines.get(0).listaSesiones(dia, mes, año)});
        }else if (ConsultarSesionesRadioSala.isSelected()){
            int nSala = Integer.parseInt(ConsultarSesionesTxtSala.getText());
            ConsultarSesionesTxtArea.setText(MainFrame.cines.get(0).listaSesiones(nSala));
        }else{
            String titulo = ConsultarSesionesTxtPelicula.getText();
            ConsultarSesionesTxtArea.setText(MainFrame.cines.get(0).listaSesiones(titulo));
        }

    }//GEN-LAST:event_ConsultarSesionesBtBuscarActionPerformed

    private void ConsultarSesionesRadioPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSesionesRadioPeliculaActionPerformed
        // TODO add your handling code here:
        ConsultarSesionesTxtDia.setVisible(false);
        ConsultarSesionesTxtMes.setVisible(false);
        ConsultarSesionesTxtAño.setVisible(false);
        ConsultarSesionesBtBuscar.setVisible(true);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        ConsultarSesionesTxtSala.setVisible(false);
        ConsultarSesionesTxtPelicula.setVisible(true);
        jLabel3.setVisible(true);
        ConsultarSesionesRadioSala.setSelected(false);
        ConsultarSesionesRadioFecha.setSelected(false);
        ConsultarSesionesTxtArea.setText("");
    }//GEN-LAST:event_ConsultarSesionesRadioPeliculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarSesionesBtBuscar;
    private javax.swing.JRadioButton ConsultarSesionesRadioFecha;
    private javax.swing.JRadioButton ConsultarSesionesRadioPelicula;
    private javax.swing.JRadioButton ConsultarSesionesRadioSala;
    private javax.swing.JTextArea ConsultarSesionesTxtArea;
    private javax.swing.JTextField ConsultarSesionesTxtAño;
    private javax.swing.JTextField ConsultarSesionesTxtDia;
    private javax.swing.JTextField ConsultarSesionesTxtMes;
    private javax.swing.JTextField ConsultarSesionesTxtPelicula;
    private javax.swing.JTextField ConsultarSesionesTxtSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
