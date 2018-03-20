/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprog;

import ficheros.Carta;
import ficheros.TratarCarta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class Cuenta {

    ArrayList<Carta> cartas = new ArrayList<>();
    Carta carta = new Carta();
    Double precio = (double) 0;
    Boolean exit = false;

    public Double cuentaTotal() {
//        cartas = carta.cargarCarta(cartas);
        String producto;
        do {
            try {
                producto = JOptionPane.showInputDialog("Elija producto");
                switch (producto) {
                    case "Kebab":
                        precio = Cuenta.this.sumarCuenta(producto);
                        System.out.println(precio);
                        System.out.println("CACA");
                        break;

                    case "Durum":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Lahmacun":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Falafel":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Arroz":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Snacks":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Nuggets":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "7UP":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Nestea":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Agua":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Cerveza":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Minipizza":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Pizza":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Pizzote":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Hamburguesa":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Pepito":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Perrito":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Bocadillo":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Sandwitch":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Patatas":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Alitas":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Ensalada":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Kas":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Aquarius":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Trina":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Monster":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    case "Sidra":
                        precio = Cuenta.this.sumarCuenta(producto);
                        break;

                    default:
                        producto = "";
                        break;
                }
            } catch (NullPointerException ex) {
                exit = true;
            }
        } while (exit == false);

        return precio;
    }

    public Double sumarCuenta(String producto) {
        cartas = carta.cargarCarta(cartas);
        Double suma = (double) 0;
        for (int i = 0; i < cartas.size(); i++) {
            if (cartas.get(i).getNombre().equalsIgnoreCase(producto)) {
                suma = precio + cartas.get(i).getPrecio();
                System.out.println(cartas.get(i).getPrecio());
            }
        }
        return suma;
    }
}
