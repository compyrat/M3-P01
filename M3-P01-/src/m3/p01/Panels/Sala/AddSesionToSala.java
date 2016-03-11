/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Sala;

import Exceptions.ArrayListException;
import Exceptions.SesionSolapada;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.p01.MainFrame;
import m3.p01.Sala;
import m3.p01.Sesion;

/**
 *
 * @author albertmarnun
 */
public class AddSesionToSala extends javax.swing.JPanel {

    /**
     * Creates new form AddSesionToSala
     */
    ArrayList<Sala> salas = new ArrayList<Sala>();
    ArrayList<Sesion> sesiones = new ArrayList<Sesion>();
    private boolean firstTime = true;
    
    public AddSesionToSala() {
        initComponents();
        addSesionToSalaSesionCombo.setEnabled(false);
        cargarSesionesSalas();
        firstTime = false;
    }
    private void cargarSesionesSalas(){
        for(int i = 0; i<MainFrame.cines.get(0).getSala().size(); i++){
            addSesionToSalaSalaCombo.addItem((i+1) + " - Sala: " + MainFrame.cines.get(0).getSala().get(i).getNumSala());
            salas.add(MainFrame.cines.get(0).getSala().get(i));
            for(int i2 = 0; i2<MainFrame.cines.get(0).getSala().get(i).getSesion().size(); i2++){
                sesiones.add(MainFrame.cines.get(0).getSala().get(i).getSesion().get(i2));
            }
        }
    }

    private void cargarAux(){
        
        sesiones = null;
        sesiones = new ArrayList<Sesion>();
        addSesionToSalaSesionCombo.removeAllItems();
        for(int i = 0; i<MainFrame.cines.get(0).getSala().size(); i++){
            for(int i2 = 0; i2<MainFrame.cines.get(0).getSala().get(i).getSesion().size(); i2++){
                sesiones.add(MainFrame.cines.get(0).getSala().get(i).getSesion().get(i2));
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addSesionToSalaSalaCombo = new javax.swing.JComboBox();
        addSesionToSalaSesionCombo = new javax.swing.JComboBox();
        addSesionToSalaAddBtn = new javax.swing.JButton();

        jLabel1.setText("Sala");

        jLabel2.setText("Sesion");

        addSesionToSalaSalaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSesionToSalaSalaComboActionPerformed(evt);
            }
        });

        addSesionToSalaAddBtn.setText("Añadir");
        addSesionToSalaAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSesionToSalaAddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSesionToSalaSalaCombo, 0, 160, Short.MAX_VALUE)
                    .addComponent(addSesionToSalaSesionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addSesionToSalaAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addSesionToSalaSalaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addSesionToSalaSesionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addSesionToSalaAddBtn)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSesionToSalaAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSesionToSalaAddBtnActionPerformed
        try {
            // TODO add your handling code here:
            Sesion sesion = sesiones.get(addSesionToSalaSesionCombo.getSelectedIndex());
            System.out.println("************************");
            System.out.println(sesion.toString());
            MainFrame.cines.get(0).getSala().get(addSesionToSalaSalaCombo.getSelectedIndex()).addSesion(sesion);
            MainFrame.infoCorrect("Sesion cambiada correctamente");

            for(Sesion ses: sesiones){
                System.out.println(ses.toString());
            }
            //cargarAux();
        } catch (SesionSolapada ex) {
            MainFrame.infoFail(ex.getMessage());
        } catch (ArrayListException ex) {
            MainFrame.infoFail(ex.getMessage());
        } catch (Exception e){
            MainFrame.infoFail("No puedes dejar campos vacios.");
        } catch (Throwable ex) {
            Logger.getLogger(AddSesionToSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addSesionToSalaAddBtnActionPerformed

    private void addSesionToSalaSalaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSesionToSalaSalaComboActionPerformed
        
        addSesionToSalaSesionCombo.removeAllItems();
        int contador = 0;
        for(Sesion ses: sesiones){
            if (salas.get(addSesionToSalaSalaCombo.getSelectedIndex()).getNumSala() != ses.getSala().getNumSala()){
                Calendar cal = Calendar.getInstance();
                cal.setTime(ses.getDate());
                addSesionToSalaSesionCombo.addItem("Sesion: ( Sala: " + 
                ses.getSala().getNumSala() + " - " + 
                cal.get(Calendar.DAY_OF_MONTH) + "/" +cal.get(Calendar.MONTH) + "/" 
                +cal.get(Calendar.YEAR)  + " - " + cal.get(Calendar.HOUR_OF_DAY) + ":" + 
                cal.get(Calendar.MINUTE) + ")");
            }
        }
        if (!firstTime){
            addSesionToSalaSesionCombo.setEnabled(true);
            if (addSesionToSalaSesionCombo.getItemCount() == 0){
                MainFrame.infoCorrect("No hay Sesiones disponibles para esta sala.");
            }
        }   
    }//GEN-LAST:event_addSesionToSalaSalaComboActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSesionToSalaAddBtn;
    private javax.swing.JComboBox addSesionToSalaSalaCombo;
    private javax.swing.JComboBox addSesionToSalaSesionCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
