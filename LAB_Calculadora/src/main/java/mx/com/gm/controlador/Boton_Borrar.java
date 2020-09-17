
package mx.com.gm.controlador;

import java.awt.event.*;
import javax.swing.*;
import mx.com.gm.modelo.Modelo;

public class Boton_Borrar {
    /* Metodo que se encarga de poner en blanco los campos de texto */
    public void eventoBorrar(JButton boton, Modelo modelo){
        /* 
            ponemos a la escucha el boton, ya con la expresion lambda nos referimos al unico metodo de la Interfaz ActionListener 
            para darle la funcionalidad al boton
        */ 
        boton.addActionListener((ActionEvent e) -> {
            /* Si presiona el boton lo que hacer es poner en blaco todos los campos de texto, campo del valor 1, el del 2 y el del resultado */   
            modelo.campoValor1.setText("");
            modelo.campoValor2.setText("");
            modelo.campoResultado.setText("");

            }/* Final clase anonima */
        );/* Final Metodo addActionListener */
    }/* Final metodo eventoBorrar */
}/* Final Clase */
