
package logica;

import igu.Peluqueria;

public class TestTpo {
    
    public static void main(String[] args){
      
        Controladora control = new Controladora();
        Peluqueria peluqueria = new Peluqueria(control);
        peluqueria.setVisible(true);
        peluqueria.setLocationRelativeTo(null);
        
    }
}
