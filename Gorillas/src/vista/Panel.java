
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import modelo.Pelota;

public class Panel extends JPanel{
    
    public ArrayList<Pelota> pelota = new ArrayList<>();
    public int x = 85, y = 570;
    public int a;
    private Image imagen;
    
    @Override
    public void paint (Graphics g){
        super.paintComponent(g);
        
        imagen = new ImageIcon(getClass().getResource("/gorillas/Selva.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this );

        imagen = new ImageIcon(getClass().getResource("/gorillas/Donkey_kong.png")).getImage();
        g.drawImage(imagen, 0, 567, 120, 120,this );
        
        imagen = new ImageIcon(getClass().getResource("/gorillas/DK_Strong.png")).getImage();
        g.drawImage(imagen, 1110, 567, 120, 120,this );
        
        imagen = new ImageIcon(getClass().getResource("/gorillas/banana.png")).getImage();
        g.drawImage(imagen, x, y, 35, 35,this );
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 688, 1300, 26);
    }
    public void animacion(int b){
        a=0;
        Timer timer = new Timer(1, (ActionEvent e) -> {
            efectuar(b);
            repaint();
            a++;
        });
       timer.start(); 
    }
    public void efectuar(int b){
        if(a<pelota.size()){
            this.x = pelota.get(a).getX();
            this.y = pelota.get(a).getY();
        }
        
        if(a==pelota.size()){
            if(b==1){
                JOptionPane.showMessageDialog(null, "Felicidades, has alimentado al monito D:");
            }
            if(b==0){
             JOptionPane.showMessageDialog(null, "Mal tiro XD");
            }
        } 
    }
    public void setLista(ArrayList<Pelota> lista) {
        this.pelota = lista;
    }
}