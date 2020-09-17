
package mx.com.gm.vista;

import java.awt.*;
import javax.swing.*;


public class Panel_Valores {
    /* Metodo que se encara de poner el panel que va en la regilla de arriba del Panel pricipal */
    public void panelArriba(mx.com.gm.modelo.Modelo modelo) {
        /* Instancia del Objeto de tipo JPanel de arriba que va a contener el panel valores y resultados */
        modelo.panelArriba = new JPanel(); 
        /* panel de arriba le damos color */
        modelo.panelArriba.setBackground(new Color(223, 63, 12));
        /* panel de arriba le damos un layout de tipo GridLayout de 1 fila, dos columnas */
        modelo. panelArriba.setLayout(new GridLayout(1, 2, 5, 5));
        /* agreamos al panel principal el panel, panelArriba*/
        modelo.panel.add(modelo.panelArriba);
        
    }/* Final Metodo panelArriba */

    /* Metodo que se encarga de crear y colocar el panel, panelArriba */
    public void panelValores(mx.com.gm.modelo.Modelo modelo) {
        /* Instancia del Objeto de tipo JPanel de valores que va a contener los componentes JLabel y JTextField */
        modelo.valores = new JPanel();
        /* panel de arriba le damos un layout de tipo GridLayout de 1 fila, 2 columnas */
        modelo.valores.setLayout(new GridLayout(2, 2, 0, 22));
        /* panel de arriba le damos color */
        modelo.valores.setBackground(new Color(223, 63, 12));
        /* Al panel valores le damos un borde */
        modelo.valores.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        /* Colamos el panel valores dentro del panel, panelArriba */
        modelo.panelArriba.add(modelo.valores);

    }/* Final Metodo panelValores*/

    /* Metodo que se encarga de crear y colocar las etiquetas */
    public void colocarEtiqueta(JLabel etiqueta, String texto, mx.com.gm.modelo.Modelo modelo) {
        /* Instanciamos el panelEtiquetaValor */
        modelo.panelEtiquetaValor = new JPanel();
        /* Le damos un color al panel */
        modelo.panelEtiquetaValor.setBackground(new Color(223, 63, 12));
        /* Instaciamos la etiqueta y le damos un texto que se lo pasamos por el constructor */
        etiqueta = new JLabel(texto);
        /* Cambio el tipo de letra de la etiqueta */
        etiqueta.setFont(new Font("Times New Roman", 3, 13));
        /* Agrego al panel valores el panel, panelEtiquetaValor */
        modelo.valores.add(modelo.panelEtiquetaValor);
        /* Agrego al panel panelEtiquetaValor la etiqueta */
        modelo.panelEtiquetaValor.add(etiqueta);

    }/* Final Metodo colocarEtiqueta */
    
    /* Metodo que se encarga de crear y colocar los campos de texto */
    public void colocarCampoTexto(JTextField campo, mx.com.gm.modelo.Modelo modelo) {
        /* Instanciamos el panelCampoValor */
        modelo.panelCampoValor = new JPanel();
        /* Le damos un color al panel */
        modelo.panelCampoValor.setBackground(new Color(223, 63, 12));
        /* Agrego al panel valores el panel, panelCampoValor */
        modelo. valores.add(modelo.panelCampoValor);
        /* Agrego al panel panelCampoValor el campo de texto */
        modelo.panelCampoValor.add(campo);

    }/* Final Metodo colorCampoTexto */
    
}/* Final Clase */
