package analizadorcorreo;

import java.awt.event.*;
import javax.swing.JMenuItem;

/**
 *
 * @author Arturo M
 */
public class OyenteEditor extends WindowAdapter implements ActionListener {

    private final VentanaEditor ventana;
    private final PanelEditor panel;

    public OyenteEditor(PanelEditor panel, VentanaEditor ventana) {
        this.ventana = ventana;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JMenuItem origen = (JMenuItem) ae.getSource();
        switch (origen.getName()) { //Pasa el nombre de la clase que escucho el oyente
            case "nuevo":
                if(panel.confirmarGuardado()){
                    panel.limpiarPantalla();
                }
                break;
            case "abrir":
                panel.abrirArchivo();
                break;
            case "guardar":
                panel.guardarArchivo();
                break;
            case "copiar":
                panel.getAreaTexto().copy();
                break;
            case "cortar":
                panel.getAreaTexto().cut();
                break;
            case "pegar":
                panel.getAreaTexto().paste();
                break;
            case "limpiar":
                panel.getAreaConsola().setText("");
                break;
            case "lexico":
                panel.analisisLexico();
                break;
            case "sintactico":
                panel.analisisSintactico();
                break;
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if(panel.confirmarGuardado()){
            ventana.salirDePrograma();
        }
    }
}
