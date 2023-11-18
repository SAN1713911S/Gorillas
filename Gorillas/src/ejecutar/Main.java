
package ejecutar;

import controlador.Controlador;
import modelo.Modelo;
import vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        Modelo m = new Modelo(v);
        Controlador c = new Controlador(m, v) {};
    }
}
