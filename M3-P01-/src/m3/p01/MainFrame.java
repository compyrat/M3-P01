/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import m3.p01.Panels.Cine.*;
import m3.p01.Panels.Sesion.*;
import m3.p01.Panels.Sala.*;
import m3.p01.Panels.Pelicula.*;
import javax.swing.JPanel;

/**
 *
 * @author albertmarnun
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    JPanel jp = null;
    public static ArrayList<Cine> cines = new ArrayList<Cine>(1);

    public MainFrame() {
        initComponents();
        inicio();
    }
    public void prueba(int almondigas){
        
    }
    private void inicio(){
        this.setBounds(0, 0, 450, 300);
        this.setLocationRelativeTo(null);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCine = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuSala = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuSesion = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuPelicula = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 300));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cines Management");

        jLabel3.setText("Albert Ribas");

        jLabel4.setText("Eric Caballero");

        jLabel5.setText("Albert Marlet");

        jMenuCine.setText("Cine");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCine.add(jMenuItem1);

        jMenuItem7.setText("Modificar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuCine.add(jMenuItem7);

        jMenuBar1.add(jMenuCine);

        jMenuSala.setText("Sala");

        jMenuItem5.setText("Crear");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuSala.add(jMenuItem5);

        jMenuItem2.setText("Añadir Sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuSala.add(jMenuItem2);

        jMenuItem14.setText("Consultar Salas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenuSala.add(jMenuItem14);

        jMenuItem9.setText("Modificar Sala");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuSala.add(jMenuItem9);

        jMenuItem12.setText("Eliminar Sala");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenuSala.add(jMenuItem12);

        jMenuBar1.add(jMenuSala);

        jMenuSesion.setText("Sesion");

        jMenuItem3.setText("Crear");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuSesion.add(jMenuItem3);

        jMenuItem6.setText("Añadir Pelicula");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuSesion.add(jMenuItem6);

        jMenuItem15.setText("Mostrar Sesiones");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenuSesion.add(jMenuItem15);

        jMenuItem10.setText("Modificar Sesion");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuSesion.add(jMenuItem10);

        jMenuItem13.setText("Eliminar Sesion");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenuSesion.add(jMenuItem13);

        jMenuBar1.add(jMenuSesion);

        jMenuPelicula.setText("Pelicula");

        jMenuItem4.setText("Crear");
        jMenuItem4.setMinimumSize(new java.awt.Dimension(400, 300));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItem4);

        jMenuItem16.setText("Monstrar Cartelera");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItem16);

        jMenuItem8.setText("Modificar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItem8);

        jMenuItem11.setText("Eliminar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuPelicula.add(jMenuItem11);

        jMenuBar1.add(jMenuPelicula);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (cines.size()>= 1 ){
            infoFail("No puedes crear mas de un cine");
        }else{
            if (jp != null){
                this.remove(jp);
            }
            CrearCine cC= new CrearCine();
            cC.setBounds(0, 0, 450, 279);
            jp = cC;
            this.add(cC);
            this.revalidate();
            this.repaint();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
        if (jp != null){
            this.remove(jp);
        }
        CrearPelicula cP= new CrearPelicula();
        cP.setBounds(0, 0, 450, 279);
        jp = cP;
        this.add(cP);
        this.revalidate();
        this.repaint();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getPelicula().size() >= 1){
                if (cines.get(0).getSala().size() >= 1){
                    if (jp != null){
                        this.remove(jp);
                    }
                    CrearSesion cSes= new CrearSesion();
                    cSes.setBounds(0, 0, 450, 279);
                    jp = cSes;
                    this.add(cSes);
                    this.revalidate();
                    this.repaint();
                }else{
                    infoFail("No puedes acceder a esta opcion porque no hay ninguna sala creada.");
                }
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna pelicula creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
        if (jp != null){
            this.remove(jp);
        }
        CrearSala cS= new CrearSala();
        cS.setBounds(0, 0, 450, 279);
        jp = cS;
        this.add(cS);
        this.revalidate();
        this.repaint();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getSala().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                AddSesionToSala aSTS= new AddSesionToSala();
                aSTS.setBounds(0, 0, 450, 279);
                jp = aSTS;
                this.add(aSTS);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sala creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            boolean haySesion = false;
            for (Sala sala: cines.get(0).getSala()){
                if (sala.getSesion().size() > 0){
                    haySesion = true;
                }
            }
            if (haySesion){
                if (cines.get(0).getSala().size() >= 1){
                    if (jp != null){
                        this.remove(jp);
                    }
                    AddPeliculaToSesion aPTS= new AddPeliculaToSesion();
                    aPTS.setBounds(0, 0, 450, 279);
                    jp = aPTS;
                    this.add(aPTS);
                    this.revalidate();
                    this.repaint();
                }
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sesion creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
        if (jp != null){
            this.remove(jp);
        }
        ModificarCine mC= new ModificarCine();
        mC.setBounds(0, 0, 450, 279);
        jp = mC;
        this.add(mC);
        this.revalidate();
        this.repaint();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getPelicula().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                ModificarPeliculaSeleccion mP= new ModificarPeliculaSeleccion();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna Pelicula creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getSala().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                ModificarSalaSeleccion mP= new ModificarSalaSeleccion();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sala creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            boolean haySesion = false;
            for (Sala sala: cines.get(0).getSala()){
                if (sala.getSesion().size() > 0){
                    haySesion = true;
                }
            }
            if (haySesion){
                if (jp != null){
                    this.remove(jp);
                }
                ModificarSesionSeleccion mP= new ModificarSesionSeleccion();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sesion creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getPelicula().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                EliminarPelicula mP = new EliminarPelicula();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna Pelicula creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getSala().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                EliminarSala mP = new EliminarSala();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sala creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            boolean haySesion = false;
            for (Sala sala: cines.get(0).getSala()){
                if (sala.getSesion().size() > 0){
                    haySesion = true;
                }
            }
            if (haySesion){
                if (jp != null){
                    this.remove(jp);
                }
                EliminarSesion mP = new EliminarSesion();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sesion creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getSala().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                ConsultarSalas mP = new ConsultarSalas();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sala creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            boolean haySesion = false;
            for (Sala sala: cines.get(0).getSala()){
                if (sala.getSesion().size() > 0){
                    haySesion = true;
                }
            }
            if (haySesion){
                if (jp != null){
                    this.remove(jp);
                }
                ConsultarSesiones mP = new ConsultarSesiones();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna sesion creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        if (cines.size() < 1 ){
            infoFail("No puedes acceder a esta opcion porque no hay ningun cine creado.");
        }else{
            if (cines.get(0).getPelicula().size() >= 1){
                if (jp != null){
                    this.remove(jp);
                }
                MostrarCartelera mP = new MostrarCartelera();
                mP.setBounds(0, 0, 450, 279);
                jp = mP;
                this.add(mP);
                this.revalidate();
                this.repaint();
            }else{
                infoFail("No puedes acceder a esta opcion porque no hay ninguna Pelicula creada.");
            }
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    public static Boolean isNumeric(String aux){
        try{
            Integer.parseInt(aux);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public static void infoCorrect(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Correct", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void infoFail(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static int infoComprobar(String infoMessage)
    {
        int result = JOptionPane.showConfirmDialog(null, infoMessage, "Eliminar", JOptionPane.YES_NO_OPTION);
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCine;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuPelicula;
    private javax.swing.JMenu jMenuSala;
    private javax.swing.JMenu jMenuSesion;
    // End of variables declaration//GEN-END:variables
}
