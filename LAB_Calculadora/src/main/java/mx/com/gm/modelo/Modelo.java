
package mx.com.gm.modelo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Modelo {
    
    
    /* Objeto JFrame para crear la interfaz grafica (Ventana) del programa */
    public JFrame ventana = new JFrame();

    
                            /* Paneles principales */
    /* Objeto JPanel para poner encima de la ventana, es el panel principal */
    public JPanel panel = new JPanel();
    /* Objeto JPanel en donde van a ir los componentes para pedir los datos que cacularemos */
    public JPanel valores = new JPanel();
    /* Objeto JPanel en donde va el resultado de la operacion */
    public JPanel resultado = new JPanel();
    /* Objeto JPanel en donde van las opciones de la caculadora */
    public JPanel opciones = new JPanel();
    
    
                             /* Panel de arriba */
    /* Objeto JPanel en donde van los paneles de valores y resultados */
    public JPanel panelArriba;
    
    
                            /* Panel Valores */
    /* Objeto JLabel que esta en el panel etiquetaValor que ese esta dentro de valores */
    public JLabel etiquetaValor1 = new JLabel();
    public JLabel etiquetaValor2 = new JLabel();
        /* Objeto JTextField que esta en el panel campoValor */
    public final JTextField campoValor1 = new JTextField(6);
    public final JTextField campoValor2 = new JTextField(6);
    /* Objeto JPanel que esta dentro del panel valores y en el panel estan las dos etiquetas que ese esta dentro de valores*/
    public JPanel panelEtiquetaValor;
    /* Objeto JPanel que esta dentro del panel valores y en el panel estan los dos campos de texto que ese esta dentro de valores*/
    public JPanel panelCampoValor;
    
    
                            /* Panel resultado */
    public JPanel panelResultado = new JPanel();
    /* Objeto JLabel que esta en el panelEResultado (panel de Etiqueta) */
    public JLabel etiquetaResultado = new JLabel();
     /* Objeto JTextField que esta en el panelCResultado (panel de Campo de texto) */
    public JTextField campoResultado = new JTextField(8);
    /* Objeto JPanel que esta dentro de panel resultado en donde va ir la etiqueta del resultado*/
    public JPanel panelEResultado = new JPanel();
    /* Objeto JPanel que esta dentro de panel resultado en donde va ir el campo de texto en donde va ir el resultado */
    public JPanel panelCResultado = new JPanel();
   
    
                            /* Panel opciones */
    /* Objeto JPanel que esta dentro de panel opciones */
    public JPanel panelOpciones= new JPanel();
    /* Objeto JButton que esta dentro de panelOpciones*/
    public JButton borrar = new JButton("Borrar");
    /* Objetos JButton que estan dentro de panelOpciones */
    public final JButton botonSuma = new JButton("+");
    public final JButton botonResta = new JButton("-");
    public final JButton botonMultiplicacion = new JButton("*");
    public final JButton botonDivision = new JButton("/");
    
    
}/* Fin Clase */
