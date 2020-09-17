
package mx.com.gm.vista;

import java.awt.*;
import javax.swing.*;


public class Panel_Opciones {
    
    /* Metodo que se encarga de crear el panelOpciones */
    public void panelOpciones(mx.com.gm.modelo.Modelo modelo) {
        /* Al panelOpciones le damos un layout de gridLayout de 3 filas y 1 columna */
        modelo.panelOpciones.setLayout(new GridLayout(3, 1, 10, 10));
        /* Le damos un color al panelOpciones */
        modelo.panelOpciones.setBackground(new Color(223, 63, 12));
        /* Le damos un borde al panel, panelOpciones */
        modelo.panelOpciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        /* Al panel, opciones en donde va ir los botones de suma, resta, multuplicacion y divion le damos un color */
        modelo.opciones.setBackground(new Color(223, 63, 12, 200));
        /* Le doy un layout de tipo GridLayout en 1 fila y 4 columnas*/
        modelo.opciones.setLayout(new GridLayout(1, 4, 4, 4));
        /* en el panel principal agregamos el panelOpciones */
        modelo.panel.add(modelo.panelOpciones);
        /* Mandamos a llamar el metodo colocar boton borrar */
        colocarBotonBorrar(modelo);
        /* Colocamos dentro del panel, panelOpciones el panel opciones */
        modelo.panelOpciones.add(modelo.opciones);


    }/* Fin Metodo panelOpciones */
    /* Metodo que se encarga de crear y colocar los botones (sumar, restar, multiplicar y dividir) en el panel de opciones */
    public void colocarBoton(JButton boton, mx.com.gm.modelo.Modelo modelo) {
        /* Le damos un color a las letras del boton */
        boton.setForeground(Color.BLACK);
        /* Le ponemos un borde a los botones */
        boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        /* Cambio de color al boton */
        boton.setBackground(new Color(236, 223, 19));
        /* Agrega al panel opcione los botones */
        modelo.opciones.add(boton);
        
        /* Instancia de la clase Botones para poder llamar al metodo eventoBotones */
        mx.com.gm.controlador.Botones controlador = new mx.com.gm.controlador.Botones();
        /* Se llama al metodo eventoBotones */
        controlador.eventoBotones(boton, modelo);
    }/* Fin Metodo colocarBoton */
    /* Metodo que se encarga de crear y darle funcionalidad al boton borrar*/
    public void colocarBotonBorrar(mx.com.gm.modelo.Modelo modelo){
        
        /* Le ponemos un borde al boton */
        modelo.borrar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
        /* Cambio de color al boton */
        modelo.borrar.setBackground(new Color(236, 223, 19));
        /* Agrega al panel opciones el boton borrar */
        modelo.panelOpciones.add(modelo.borrar);
        
        /* Instancia de la clase Botones para poder llamar al metodo eventoBotones */
        mx.com.gm.controlador.Boton_Borrar controlador = new mx.com.gm.controlador.Boton_Borrar();
        /* Se llama al metodo eventoBorrar */
        controlador.eventoBorrar(modelo.borrar, modelo);
        
    }/* Fin Metodo colocarBotonBorrar */
    
}/* Fin Clase */
