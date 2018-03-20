/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoprog.Direcion;

/**
 *
 * @author jdominguezdominguez
 */
public class TratarCarta {

    ArrayList<Carta> cartas = new ArrayList<>();

//    Scanner sc = new Scanner(new File (""));
//    String[] ref = sc.nextLine().split(" * ");
    /**
     *
     * @param local
     */
    public void cargarCarta(String local) {
        Integer nombre = 0, precio = 1;
        switch (local) {
            case "Kebab":
                try (Scanner sc = new Scanner(new File("Kebab.txt"))) {
                    while (sc.hasNextLine()) {
                    String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));
                        cartas.add(carta);
//                        System.out.println(cartas.get(0));
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(cartas.get(0).getNombre()+" "+ cartas.get(0).getPrecio());
                break;

            default:
                break;
        }
    }
}
