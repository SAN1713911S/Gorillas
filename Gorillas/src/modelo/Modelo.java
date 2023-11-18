
package modelo;

import static java.lang.Math.cos;
import static java.lang.Math.tan;
import java.util.ArrayList;
import vista.Ventana;

public class Modelo {
    
   private Ventana ventana;
    
    public Modelo(Ventana v){
        this.ventana = v;
    }
    private ArrayList<Pelota> pelota = new ArrayList<>();
    public Pelota p;
    public void operacion(){
        int y;
        int b = 0;
        double Velocidadi = Double.parseDouble(ventana.texto1.getText());
        double Angulo = Double.parseDouble(ventana.texto2.getText())*Math.PI/180.0;
        
        pelota.clear();
        
        for(int x=50;x<1220;x++){    
            y = (int) (575+((3*(Math.pow(x-50, 2)))/((Math.pow(Velocidadi,2))*(Math.pow(cos(Angulo), 2))))-((x-50)*(tan(Angulo)))); 
        
            Pelota p = new Pelota(x,y);
            pelota.add(p); 
            
            if(x>=1110 && x<=1300){
                if(y>=567){
                    b=1;    
                    break;
                }
            }
            if(x>=0 && x<=1300){
                if(y>=655){ 
                    b=0;
                    break;
                }
            }
            
        }
        ventana.getPanel().setLista(pelota);
        ventana.getPanel().animacion(b);
    }
}