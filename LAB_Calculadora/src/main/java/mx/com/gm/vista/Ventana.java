
package mx.com.gm.vista;

import java.awt.*;
import javax.swing.*;

public class Ventana {
    
    /* Metodo que se encarga de Crear la ventana de la aplicacion grafica */
    public void ventana(mx.com.gm.modelo.Modelo modelo) {
        /* Le damos ua tamaño a la ventana */
        modelo.ventana.setSize(300, 200);
        /* Para poner en el centro de la pantalla el Ventana */
        modelo.ventana.setLocationRelativeTo(null);
        /* Para darle un tamaño pre establecido minimo */
        modelo.ventana.setMinimumSize(new Dimension(280, 190));
        /* Para detener la ejecucion del programa en cuenta cerremos la ventana */
        modelo.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }/* Fin Metodo ventana*/
    
}/* Fin Clase */
