package maquinacafecd;

import javax.swing.JOptionPane;

/**
 * Display nos mostrara todo lo que sale por la pantalla
 * 
 *
 */
public class Display {

    /**
     * Muestra el cambio por pantalla
     */
    public void mostrarCambio() {
        JOptionPane.showMessageDialog(null, "Muetra el cambio");
    }

    /**
     * Muestra el saldo de la maquina
     */
    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Muetra el saldo");
    }

    /**
     * Muestra el azucar actual
     */
    public void mostrarCantidadAzucar() {
        JOptionPane.showMessageDialog(null, "Muetra la cantidad de azucar");
    }

    /**
     * Muestra el precio del producto
     */
    public void mostrarPrecio() {
        JOptionPane.showMessageDialog(null, "Muetra el precio del producto");
    }

    /**
     * Muestra una alarma de error por pantalla
     */
    public void alarma() {
        JOptionPane.showMessageDialog(null, "Alarma producto agotado u averia del sistema.");
    }

    /**
     * Muestra que el producto finalizo y se puede retirar
     */
    public void productoFinalizado() {
        JOptionPane.showMessageDialog(null, "Producto finalizado.");
    }

    /**
     * Muestra que el producto esta elvavorandose y hay que esperar.
     */
    public void productoElavorando() {
        JOptionPane.showMessageDialog(null, "El producto se esta elavorando");
    }

}
