
package mx.com.gm.controlador;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;
import mx.com.gm.modelo.Modelo;

public class Botones {
    /* Metodo que se encarga de darle la funcion a los botones de suma, resta, multiplicacion y division */
    public void eventoBotones(JButton boton, Modelo modelo) {
        /* 
            ponemos a la escucha el boton que presione, cualquiera, ya sea el de sumar, restar, multiplicar y dividir, ya con la
            expresion lambda nos referimos al unico metodo de la Interfaz ActionListener para darle la funcionalidad al boton
        */
        boton.addActionListener ( (ActionEvent e) -> {
                /* Tratamos la Excepcion NumberFormatException con el try que lo genera el casting de campoValor1 que es de tipo String a double */
                try{
                    
                     /* 
                        Aguardamo dentro de las variables double valor1 y valor2 el numero o letra que digite el usuario en el campo de texto que
                        es de tipo String y la convertimos con el metodo statico de la clase Double a tipo double
                    */ 
                    double valor1 =  Double.parseDouble(modelo.campoValor1.getText());
                    double valor2 =  Double.parseDouble(modelo.campoValor2.getText());
                    
                    DecimalFormat df = new DecimalFormat("#0.00");
                    
                    /* Evaluamos con un if si el valor que digite el usuario es diferente de 0 */
                    if(valor1 != 0 && valor2 != 0){
                        /* 
                            Con el metodo equals de clase Object evaluamos si la direccion de memoria apunta el boton (boton) es mismo lugar que el botonSuma si lo hace es que son
                            el mismo y sabemos que tenemos que sumar
                        */
                        if (boton.equals(modelo.botonSuma)) {
                            /* Se genera la suma y la mostramos por el campo de texto en donde va el resultado */
                            modelo.campoResultado.setText("       " + df.format((valor1 + valor2)));
                        /* Evaluamos si el boton que fue presionado es el de restar */
                        }else if(boton.equals(modelo.botonResta)){
                            /* Se genera la resta y la mostramos por el campo de texto en donde va el resultado */
                            modelo.campoResultado.setText("       " + df.format((valor1 - valor2)));
                        /* Evaluamos si el boton que fue presionado es el de Multiplicar */
                        }else if(boton.equals(modelo.botonMultiplicacion)){
                            /* Se genera la multiplicacion y la mostramos por el campo de texto en donde va el resultado */
                            modelo.campoResultado.setText("       " + df.format((valor1 * valor2)));
                        /* Evaluamos si el boton que fue presionado es el de Dividir */
                        }else if(boton.equals(modelo.botonDivision)){
                            /* Se genera la division y la mostramos por el campo texto en donde va el resultado */
                            modelo.campoResultado.setText("       " + df.format((valor1 / valor2)));

                        }
                        /* Si la operacion se hizo con exito entonces los cuadros de texto en donde van los valores regresar a su 
                           valor original el cual es blanco 
                        */  
                        modelo.campoValor1.setBackground(new Color(255, 255, 255));
                        modelo.campoValor2.setBackground(new Color(255, 255, 255));

                    }else{
                        /* Si los valores que digito en los campos de texto son 0 entonces se le muestra una venta
                           advirtiendole que se a producido un error y los campos de texto se ponen de color rojo 
                        */
                        JOptionPane.showMessageDialog(null, "       Syntax Error", "", 0);
                        modelo.campoValor1.setBackground(new Color(200, 111, 111));
                        modelo.campoValor2.setBackground(new Color(200, 111, 111));

                    }/* Final else */
                                
                }/* Final try */
                catch(NumberFormatException ex){
                    /* Si se propaga la exception de tipo NumberFormatException ya sea por general algun caracter no valio,
                       se le muestra una venta advirtiendole que se a producido un error y los campos de texto se ponen de color rojo
                    */
                    JOptionPane.showMessageDialog(null, "       Syntax Error", "", 0);
                    modelo.campoValor1.setBackground(new Color(200, 111, 111));
                    modelo.campoValor2.setBackground(new Color(200, 111, 111));

              }/* Final catch */
                
            }/* Final clase anonima */
                
        );/* Final Metodo addActionListener */
        
    }/* Final Metodo */
    
}/* Final clase */
