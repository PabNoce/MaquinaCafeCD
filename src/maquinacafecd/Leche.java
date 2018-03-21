package maquinacafecd;

/**
 *
 * Clase leche que extiende de producto. En esta clase hay varios metodos con
 * distintos tipos de leche.
 *  
 */
public class Leche extends Producto {
    /**
     * Nos permite seleccionar leche sola.
     */
    public void seleccionadoLecheSola() {
        nombreProducto = "Leche";
    }

    /**
     * Nos permite seleccionar la leche manchada.
     */
    public void seleccionadoLecheManchada() {
        nombreProducto = "Leche manchada";
    }
}
