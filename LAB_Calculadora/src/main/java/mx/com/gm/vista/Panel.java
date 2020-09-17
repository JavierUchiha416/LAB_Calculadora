
package mx.com.gm.vista;

import java.awt.*;

public class Panel {
    
    /* Metod que se encarga de crear el panel principal */
    public void panel(mx.com.gm.modelo.Modelo modelo) {
        /* Se le da un layout de tipo GridLayout con 2 filas y 1 columna */
        modelo.panel.setLayout(new GridLayout(2, 1, 5, 5));
        /* Se le da un color al panel */
        modelo.panel.setBackground(new Color(223, 63, 12));
        /* Colocamos dentro de la ventana el panel */
        modelo.ventana.add(modelo.panel);
        
    }/* Fin Metodo panel */
    
}/* Fin Clase */
