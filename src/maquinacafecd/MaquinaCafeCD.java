package maquinacafecd;

import javax.swing.JOptionPane;

/**
 * Clase principal del programa que contiene el menu
 *
 *
 */
public class MaquinaCafeCD implements Azucar {

    /**
     * @param args the command line arguments
     *
     * En el metodo main esta el menu de la maquina de café.
     */
    public static void main(String[] args) {

        int select;
        MaquinaCafeCD maquina = new MaquinaCafeCD();
        Display display = new Display();
        Monedero monedero = new Monedero();
        Producto producto = new Producto();

        do {
            select = Integer.parseInt(JOptionPane.showInputDialog(" 1.Introduce monedas. \n 2.Selecciona producto. "
                    + "\n 3.Seleccione azúcar. " + "\n 4.Elaborar producto. "));

            switch (select) {
                case 1:
                    monedero.pedirCredito(Float.parseFloat(JOptionPane.showInputDialog("Introduce credito")));
                    break;
                case 2:
                    maquina.selecProducto();
                    break;
                case 3:
                    maquina.anhadirAzucar(3);
                    break;
                case 4:
                    display.productoElavorando();
                    display.productoFinalizado();
                    break;
                case 5:
                    System.exit(0);

            }

        } while (select != 5);

    }

    /**
     * Sobreescribimos el metodo añadirAzucar
     *
     * @param azucar Pasamo como parametro el azucar actual de la maquina
     */
    @Override
    public void anhadirAzucar(int azucar) {

        int select;
        do {
            select = Integer.parseInt(JOptionPane.showInputDialog("Selecciona cantidad azúcar "
                    + "\n 1. Añadir azúcar  \n  2. Quitar azúcar  \n 3.Elaborar producto"));
            switch (select) {

                case 1:
                    azucar++;
                    break;
                case 2:
                    azucar--;
                    break;
                case 3:
                    Display dis = new Display();
                    dis.productoElavorando();
                    break;
                case 4:
                    break;
            }

        } while (select != 4);

    }

    /**
     * Menu para seleccionar el producto.
     */
    public void selecProducto() {
        Cafe cafe = new Cafe();
        Leche leche = new Leche();
        Te te = new Te();
        int select;
        Chocolate chocolate = new Chocolate();
        select = Integer.parseInt(JOptionPane.showInputDialog("--Menu Producto-- \n 1.Cafe Corto "
                + "\n 2.Cafe Largo \n 3.Cafe Con Leche \n 4.Chocolate \n 5.Leche "
                + "\n 6.Leche Manchada \n 7.Te \n 8.Salir"));

        switch (select) {
            case 1:
                cafe.seleccionadoCafeCorto();
                break;
            case 2:
                cafe.seleccionadoCafeLargo();
                break;
            case 3:
                cafe.seleccionadoCafeConLeche();
                break;
            case 4:
                chocolate.seleccionadoChocolate();
                break;
            case 5:
                leche.seleccionadoLecheSola();
                break;
            case 6:
                leche.seleccionadoLecheManchada();
                break;
            case 7:
                te.seleccionadoTe();
                break;
            case 8:
                break;

        }
        while (select != 8) {
            break;
        }

    }

}
