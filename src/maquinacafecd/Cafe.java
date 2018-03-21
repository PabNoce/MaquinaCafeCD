package maquinacafecd;

/**
 *
 * Clase cafe extiende de producto. contiene los distintos tipos de cafe
 *
 *
 */
public class Cafe extends Producto {

    /**
     * Selecciona cafe corto
     */
    public void seleccionadoCafeCorto() {
        nombreProducto = "Cafe Corto";
    }

    /**
     * Selecciona el cafe largo
     */
    public void seleccionadoCafeLargo() {
        nombreProducto = "Cafe Largo";
    }

    /**
     * Selecciona el cafe con leche.
     */
    public void seleccionadoCafeConLeche() {
        nombreProducto = "Cafe Con Leche";
    }

}
