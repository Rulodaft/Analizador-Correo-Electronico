/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorcorreo;

/**
 *
 * @author Arturo
 */
public class VentanaEditor extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEditor
     */
    public VentanaEditor() {
        initComponents();        
    }

    public void addEventos(OyenteEditor oyente) {
        opcionAbrir.addActionListener(oyente);
        opcionGuardar.addActionListener(oyente);
        opcionCopiar.addActionListener(oyente);
        opcionPegar.addActionListener(oyente);
        opcionCortar.addActionListener(oyente);
        opcionLimpiar.addActionListener(oyente);
        opcionNuevo.addActionListener(oyente);
        opcionAnalisisLexico.addActionListener(oyente);
        opcionAnalisisSintactico.addActionListener(oyente);        
        addWindowListener(oyente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        opcionNuevo = new javax.swing.JMenuItem();
        opcionAbrir = new javax.swing.JMenuItem();
        opcionGuardar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        opcionCortar = new javax.swing.JMenuItem();
        opcionCopiar = new javax.swing.JMenuItem();
        opcionPegar = new javax.swing.JMenuItem();
        opcionLimpiar = new javax.swing.JMenuItem();
        menuAnalizar = new javax.swing.JMenu();
        opcionAnalisisLexico = new javax.swing.JMenuItem();
        opcionAnalisisSintactico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        barraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuArchivo.setText("Archivo");

        opcionNuevo.setText("Nuevo");
        opcionNuevo.setName("nuevo"); // NOI18N
        menuArchivo.add(opcionNuevo);

        opcionAbrir.setText("Abrir");
        opcionAbrir.setName("abrir"); // NOI18N
        menuArchivo.add(opcionAbrir);

        opcionGuardar.setText("Guardar");
        opcionGuardar.setName("guardar"); // NOI18N
        menuArchivo.add(opcionGuardar);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");

        opcionCortar.setText("Cortar");
        opcionCortar.setName("cortar"); // NOI18N
        menuEditar.add(opcionCortar);

        opcionCopiar.setText("Copiar");
        opcionCopiar.setName("copiar"); // NOI18N
        menuEditar.add(opcionCopiar);

        opcionPegar.setText("Pegar");
        opcionPegar.setName("pegar"); // NOI18N
        menuEditar.add(opcionPegar);

        opcionLimpiar.setText("Limpiar Consola");
        opcionLimpiar.setName("limpiar"); // NOI18N
        menuEditar.add(opcionLimpiar);

        barraMenu.add(menuEditar);

        menuAnalizar.setText("Analizar");

        opcionAnalisisLexico.setText("Análisis Léxico");
        opcionAnalisisLexico.setName("lexico"); // NOI18N
        menuAnalizar.add(opcionAnalisisLexico);

        opcionAnalisisSintactico.setText("Análisis Sintáctico");
        opcionAnalisisSintactico.setName("sintactico"); // NOI18N
        menuAnalizar.add(opcionAnalisisSintactico);

        barraMenu.add(menuAnalizar);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void salirDePrograma() {
        System.exit(0);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAnalizar;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem opcionAbrir;
    private javax.swing.JMenuItem opcionAnalisisLexico;
    private javax.swing.JMenuItem opcionAnalisisSintactico;
    private javax.swing.JMenuItem opcionCopiar;
    private javax.swing.JMenuItem opcionCortar;
    private javax.swing.JMenuItem opcionGuardar;
    private javax.swing.JMenuItem opcionLimpiar;
    private javax.swing.JMenuItem opcionNuevo;
    private javax.swing.JMenuItem opcionPegar;
    // End of variables declaration//GEN-END:variables
}