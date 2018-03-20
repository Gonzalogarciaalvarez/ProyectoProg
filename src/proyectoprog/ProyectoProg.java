/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprog;

import ficheros.Carta;
import ficheros.TratarCarta;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class ProyectoProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Direcion dir = new Direcion();
        TratarCarta carta = new TratarCarta();
        ArrayList<Carta> cartas = new ArrayList<>();

        String calle = dir.selCalle();
        String local = dir.selRest(calle);
        cartas = carta.cargarCarta(local);
        

    }

}
