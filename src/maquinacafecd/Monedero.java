package maquinacafecd;

/**
 * Aqui gestiono el pago y precio de productos
 * 
 *
 */
public class Monedero {

    float credito;
    final float COSTE = 0.50f;

    /**
     * Metodo que pide al cliente que inserte dinero
     *
     * @param dinero dinero introducido
     */
    public void pedirCredito(float dinero) {

    }

    /**
     * Muestra el saldo en la maquina.
     *
     * @return devuelve el saldo actual en la maquina.
     */
    public float mostrarCredito() {
        return credito;
    }

    /**
     * Metodo que realiza el calculo del cambio.
     *
     * @return devuelve el cambio tras realizar la compra.
     *
     */
    public float devolverCambio() {
        return credito - COSTE;
    }

}
