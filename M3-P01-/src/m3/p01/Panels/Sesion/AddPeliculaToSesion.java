/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Sesion;

import Exceptions.ArrayListException;
import Exceptions.SesionSolapada;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.p01.MainFrame;
import m3.p01.Sesion;

/**
 *
 * @author albertmarnun
 */
public class AddPeliculaToSesion extends javax.swing.JPanel {

    /**
     * Creates new form AddSesionToSala
     */
       ArrayList<Sesion> sesiones = new ArrayList<Sesion>();

    public AddPeliculaToSesion() {
        initComponents();
        cargarSesiones();
        cargarPeliculas();
    }
    
    private void cargarSesiones(){
       for(int i = 0; i<MainFrame.cines.get(0).getSala().size(); i++){
            for(int i2 = 0; i2<MainFrame.cines.get(0).getSala().get(i).getSesion().size(); i2++){
                Calendar cal = Calendar.getInstance();
                cal.setTime(MainFrame.cines.get(0).getSala().get(i).getSesion().get(i2).getDate());
                addPeliculaToSesionSesionCombo.addItem(i + " - Sesion: " + 
                    MainFrame.cines.get(0).getSala().get(i).getSesion().get(i2).getSala().getNumSala() + " - " + 
                    cal.get(Calendar.DAY_OF_MONTH) + "/" +cal.get(Calendar.MONTH) + "/" +
                    cal.get(Calendar.YEAR)  + " - " + cal.get(Calendar.HOUR_OF_DAY) + ":" + 
                    cal.get(Calendar.MINUTE));
                sesiones.add(MainFrame.cines.get(0).getSala().get(i).getSesion().get(i2));
            }
        }
    }
    private void cargarPeliculas(){
        for (int i = 0; i<MainFrame.cines.get(0).getPelicula().size(); i++){
            addPeliculaToSesionPeliculaCombo.addItem((i+1)+" - "+MainFrame.cines.get(0).getPelicula().get(i).getTitulo());
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
        addPeliculaToSesionSesionCombo = new javax.swing.JComboBox();
        addPeliculaToSesionPeliculaCombo = new javax.swing.JComboBox();
        addPeliculaToSesionAddBtn = new javax.swing.JButton();

        jLabel1.setText("Sesion");

        jLabel2.setText("Pelicula");

        addPeliculaToSesionAddBtn.setText("Añadir");
        addPeliculaToSesionAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPeliculaToSesionAddBtnActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPeliculaToSesionSesionCombo, 0, 160, Short.MAX_VALUE)
                    .addComponent(addPeliculaToSesionPeliculaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPeliculaToSesionAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addPeliculaToSesionSesionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addPeliculaToSesionPeliculaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addPeliculaToSesionAddBtn)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPeliculaToSesionAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPeliculaToSesionAddBtnActionPerformed
        // TODO add your handling code here:
        int sesi = addPeliculaToSesionSesionCombo.getSelectedIndex();
        int pel = addPeliculaToSesionPeliculaCombo.getSelectedIndex();
           try {
               MainFrame.cines.get(0).asignarPelicula(MainFrame.cines.get(0).getPelicula().get(pel), sesiones.get(sesi).getDate(), sesiones.get(sesi).getSala());
               MainFrame.infoCorrect("Se ha Añadido correctamente.");
           } catch (SesionSolapada ex) {
               Logger.getLogger(AddPeliculaToSesion.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ArrayListException ex) {
               Logger.getLogger(AddPeliculaToSesion.class.getName()).log(Level.SEVERE, null, ex);
           }
           this.removeAll();
           AddPeliculaToSesion aPTS= new AddPeliculaToSesion();
        aPTS.setBounds(0, 0, 450, 279);
        this.add(aPTS);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_addPeliculaToSesionAddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPeliculaToSesionAddBtn;
    private javax.swing.JComboBox addPeliculaToSesionPeliculaCombo;
    private javax.swing.JComboBox addPeliculaToSesionSesionCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
