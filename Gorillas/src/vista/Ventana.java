
package vista;

import controlador.Controlador;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    
    public Panel panel = new Panel();
    
    public JLabel jlabel1 = new JLabel("Velocidad inicial:");
    public JLabel jlabel2 = new JLabel("Ángulo inicial:");
    public JButton boton1 = new JButton("Aceptar");
    public JTextField texto1 = new JTextField();
    public JTextField texto2 = new JTextField();
    private Controlador c;
    
    public Ventana(){
        setTitle("Gorillas");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        setLocationRelativeTo(null);
        this.setVisible(true);
        setResizable(false);
        initComponents();
    }
    private void initComponents(){
        this.panel.setBounds(0, 0, 1220, 720);
        this.add(panel);
        this.panel.setVisible(true);
        this.setLayout(null);
        
        this.jlabel1.setBounds(1250, 150, 100, 100);
        this.add(jlabel1);
        this.jlabel2.setBounds(1250, 240, 100, 100);
        this.add(jlabel2);
        
        this.texto1.setBounds(1270, 230, 40, 30);
        this.add(texto1);
        this.texto2.setBounds(1270, 320, 40, 30);
        this.add(texto2);
        
        this.boton1.setBounds(1245, 380, 98, 38);
        this.add(boton1); 
        boton1.setBackground(Color.ORANGE); 
    }
    public Ventana(Controlador c) {
        this.c = c;
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public JLabel getJlabel1() {
        return jlabel1;
    }

    public void setJlabel1(JLabel jlabel1) {
        this.jlabel1 = jlabel1;
    }

    public JLabel getJlabel2() {
        return jlabel2;
    }

    public void setJlabel2(JLabel jlabel2) {
        this.jlabel2 = jlabel2;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }

    public JTextField getTexto1() {
        return texto1;
    }

    public void setTexto1(JTextField texto1) {
        this.texto1 = texto1;
    }

    public JTextField getTexto2() {
        return texto2;
    }

    public void setTexto2(JTextField texto2) {
        this.texto2 = texto2;
    }

    public Controlador getC() {
        return c;
    }

    public void setC(Controlador c) {
        this.c = c;
    }
    public void setControlador(Controlador cont){
        this.c=cont;
        this.boton1.setActionCommand(utils.Utils.ACEPTAR);
        this.boton1.addActionListener(c);
    }
}
