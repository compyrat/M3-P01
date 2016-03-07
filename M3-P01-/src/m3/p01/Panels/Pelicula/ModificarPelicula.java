/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3.p01.Panels.Pelicula;

import m3.p01.Genero;
import m3.p01.MainFrame;
import m3.p01.Pelicula;

/**
 *
 * @author albertmarnun
 */
public class ModificarPelicula extends javax.swing.JPanel {

    /**
     * Creates new form CrearPelicula
     */
    int indexPelicula = 0;
    Pelicula pelicula;
    public ModificarPelicula(int index) {
        initComponents();
        indexPelicula = index;
        this.pelicula = MainFrame.peliculas.get(index);
        modificarPeliculaGeneroCombo.addItem(Genero.ACCION);
        modificarPeliculaGeneroCombo.addItem(Genero.CIENCIA_FICCION);
        modificarPeliculaGeneroCombo.addItem(Genero.COMEDIA);
        modificarPeliculaGeneroCombo.addItem(Genero.TERROR);
        modificarPeliculaTituloTxt.setText(pelicula.getTitulo());
        modificarPeliculaDirectorTxt.setText(pelicula.getDirector());
        modificarPeliculaAnyoTxt.setText(String.valueOf(pelicula.getAnyo()));
        modificarPeliculaGeneroCombo.setSelectedItem(pelicula.getGenero());
        modificarPeliculaDuracionTxt.setText(String.valueOf(pelicula.getDuracion()));
        modificarPeliculaSinopsisTxtArea.setText(pelicula.getSinopsis());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modificarPeliculaTituloTxt = new javax.swing.JTextField();
        modificarPeliculaDirectorTxt = new javax.swing.JTextField();
        modificarPeliculaGeneroCombo = new javax.swing.JComboBox();
        modificarPeliculaAnyoTxt = new javax.swing.JTextField();
        modificarPeliculaDuracionTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        modificarPeliculaSinopsisTxtArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 279));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Titulo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel2.setText("Director");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setText("Año");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jLabel4.setText("Genero");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, -1, -1));

        jLabel5.setText("Duración");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, -1, -1));

        jLabel6.setText("Sinopsis");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, -1, -1));
        add(modificarPeliculaTituloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 11, 260, -1));
        add(modificarPeliculaDirectorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 37, 260, -1));

        modificarPeliculaGeneroCombo.setMinimumSize(new java.awt.Dimension(200, 20));
        modificarPeliculaGeneroCombo.setPreferredSize(new java.awt.Dimension(260, 20));
        add(modificarPeliculaGeneroCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 89, 260, -1));
        add(modificarPeliculaAnyoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 63, 60, -1));
        add(modificarPeliculaDuracionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 115, 60, -1));

        modificarPeliculaSinopsisTxtArea.setColumns(20);
        modificarPeliculaSinopsisTxtArea.setRows(5);
        jScrollPane1.setViewportView(modificarPeliculaSinopsisTxtArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, -1));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame.peliculas.get(indexPelicula).setTitulo(modificarPeliculaTituloTxt.getText());
        MainFrame.peliculas.get(indexPelicula).setDirector(modificarPeliculaDirectorTxt.getText());
        MainFrame.peliculas.get(indexPelicula).setGenero(Genero.valueOf(modificarPeliculaGeneroCombo.getSelectedItem().toString().toUpperCase().replace(" ", "_")));
        MainFrame.peliculas.get(indexPelicula).setAnyo(Integer.parseInt(modificarPeliculaAnyoTxt.getText()));
        MainFrame.peliculas.get(indexPelicula).setSinopsis(modificarPeliculaSinopsisTxtArea.getText());
        MainFrame.peliculas.get(indexPelicula).setDuracion(Integer.parseInt(modificarPeliculaDuracionTxt.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modificarPeliculaAnyoTxt;
    private javax.swing.JTextField modificarPeliculaDirectorTxt;
    private javax.swing.JTextField modificarPeliculaDuracionTxt;
    private javax.swing.JComboBox modificarPeliculaGeneroCombo;
    private javax.swing.JTextArea modificarPeliculaSinopsisTxtArea;
    private javax.swing.JTextField modificarPeliculaTituloTxt;
    // End of variables declaration//GEN-END:variables
}
