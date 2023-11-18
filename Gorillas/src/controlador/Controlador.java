
package controlador;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Ventana;

public class Controlador implements ActionListener {
    private final Modelo modelo;
    private final Ventana vista;
    
    public Controlador (Modelo modelo, Ventana vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(utils.Utils.ACEPTAR)){
            modelo.operacion();
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Sonido.wav"));
            sonido.play();
        }
    }
}
