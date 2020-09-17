
package mx.com.gm.vista;

public class Inicializadora {
    
    /* Metodo que se encarga de llamar todos los demas metodos */
    public void inicializarComponentes() {
        
        /* Metodo que se encarga de crear la ventana */
        ventana.ventana(modelo);
        /* Metodo que se encarga de crear el panel  */
        panel.panel(modelo);
        /* Metodo que se encarga de crear el panel, panel arriba, en donde ira el panel, panelValores */
        valores.panelArriba(modelo);
        /* Metodo que se encarga de crear el panelValores en donde iran las etiquetas y campos para registrar los valores a calcular */
        valores.panelValores(modelo);
        /* Metodo que se encarga de crear la etiqueta */
        valores.colocarEtiqueta(modelo.etiquetaValor1, "Valor 1:", modelo);
        /* Metodo que se encarga de crear el campos de texto */
        valores.colocarCampoTexto(modelo.campoValor1, modelo);
        /* Metodo que se encarga de crear la etiqueta */
        valores.colocarEtiqueta(modelo.etiquetaValor2, "Valor 2:", modelo);
        /* Metodo que se encarga de crear el campo de texto  */
        valores.colocarCampoTexto(modelo.campoValor2, modelo);
        /* Metodo que se encarga de crear el panel, panelResultado en donde iran la etiqueta y el campo de texto del resultado */
        resultado.panelResultado(modelo);
        /* Metodo que se encarga de crear el panel, panelOpcion en donde ira los botones */
        opciones.panelOpciones(modelo);
        /* Metodo que se encarga de crear  la etiqueta, etiquetaResultado */
        resultado.colocarEtiquetaResultado(modelo);
        /* Metodo que se encarga de crear el campo de texto, campoResultado */
        resultado.colocarCampoResultado(modelo);
        /* Metodo que se encarga de crear el Boton, BotonSuma */
        opciones.colocarBoton(modelo.botonSuma, modelo);
        /* Metodo que se encarga de crear el Boton, BotonResta */
        opciones.colocarBoton(modelo.botonResta, modelo);
        /* Metodo que se encarga de crear el Boton, BotonMultiplicar */
        opciones.colocarBoton(modelo.botonMultiplicacion, modelo);
        /* Metodo que se encarga de crear el Boton, BotonDivision */
        opciones.colocarBoton(modelo.botonDivision, modelo);
        /* Metodo que se encarga de hacer visible la ventana */
        /* Nota: Siempre se pone al ultimo para que carguen todos los componentes */
        modelo.ventana.setVisible(true);

    }/* Fin Metodo inicializarComponentes */
    
    /* Varibales que nos sirven para poder llamar los metodos de otras clases o paquetes */
    private final mx.com.gm.modelo.Modelo modelo = new mx.com.gm.modelo.Modelo();
    private final Panel_Valores valores = new Panel_Valores();
    private final Panel_Resultado resultado = new Panel_Resultado();
    private final Panel_Opciones opciones = new Panel_Opciones();
    private final Panel panel = new Panel();
    private final Ventana ventana = new Ventana();
    
}/* Fin Clase*/
