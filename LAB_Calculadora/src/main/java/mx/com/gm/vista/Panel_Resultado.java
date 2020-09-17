
package mx.com.gm.vista;

import java.awt.*;
import javax.swing.*;

public class Panel_Resultado {
    
    /* Metodo que se encarga de crear el panel, panelResultado */
    public void panelResultado(mx.com.gm.modelo.Modelo modelo){
        /* Se le da layotu de tipo GridLayout de 2 fila y 1 columna */
        modelo.resultado.setLayout(new GridLayout(2, 1, 0, 22));
        /* Se le da un color al panel resultado */
        modelo.resultado.setBackground(new Color(223, 63, 12));
        /* Se le da un borde al panel resultado*/
        modelo.resultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        /* Agregamos al panel resultado dentro del panel, panelArriba */
        modelo.panelArriba.add(modelo.resultado);
        
    }/* Fin Metodo colocarEtiquetaResultado */
    
    /* Metodo que se encarga de crear la etiqueta, etiquetaResultado */
    public void colocarEtiquetaResultado(mx.com.gm.modelo.Modelo modelo){
        /* Se le da un layout al panelEResultado de tipo FlowLayout, aunque ta lo trae por defecto */
        modelo.panelEResultado.setLayout(new FlowLayout());
        /* Se le da un color al panelEResultado */
        modelo.panelEResultado.setBackground(new Color(223, 63, 12));
        /* Le agregamos texto a la etiqueta, etiquetaResultado */
        modelo.etiquetaResultado.setText("Resultado");
        /* Se le da un nuevo tipo de letra a la etiqueta, etiquetaResultado*/
        modelo.etiquetaResultado.setFont(new Font("Times New Roman", 3, 15));
        /* Se agrega al panel Resultado el panel, etiquetaEResultado*/
        modelo.resultado.add(modelo.panelEResultado);
        /* Se agrega al panel, etiquetaEResultado la etiqueta, etiquetaResultado*/
        modelo.panelEResultado.add(modelo.etiquetaResultado);
        
    }/* Fin Metodo colocarEtiquetaResultado */
    
    /* Metodo que se encargar de crear el campo de texto, */
    public void colocarCampoResultado(mx.com.gm.modelo.Modelo modelo) {
        /* Se le da un layout al panelCResultado de tipo FlowLayout, aunque ta lo trae por defecto */
        modelo.panelCResultado.setLayout(new FlowLayout());
        /* Se le da un color al panelEResultado */
        modelo.panelCResultado.setBackground(new Color(223, 63, 12));
        /* Se agrega al paenl resultado el panel, panelCResultado*/
        modelo.resultado.add(modelo.panelCResultado);
        /* Se agrega al panel, panelCResultado el campo de texto, campoResultado*/
        modelo.panelCResultado.add(modelo.campoResultado);
    }/* Fin Metodo colocarCampoResultado */
    
}/* Fin Clase */
