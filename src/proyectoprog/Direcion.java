/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprog;

import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class Direcion {

    public String selCalle() {
        String[] cp = {"30124", "62474", "47757", "78251", "31247", "32604"};
        String input = (String) JOptionPane.showInputDialog(null, "Cual es tu codigo postal?", "Codigo Postal", JOptionPane.QUESTION_MESSAGE, null, cp, cp[1]);
        System.out.println(input);
        return input;
    }

    public String selRest(String calle) {
        String local = "";
        switch (calle) {
            case "30124":
                local = Direcion.this.selector("Kebab", "Americano", "", "");
                break;

            case "62474":
                local = Direcion.this.selector("Italiano", "Chino", "Espanol", "Pizzeria");
                break;

            case "47757":
                local = Direcion.this.selector("Americano", "Chino", "Pizzeria", "");
                break;

            case "78251":
                local = Direcion.this.selector("Chino", "Italiano", "Americano", "");
                break;

            case "31247":
                local = Direcion.this.selector("Chino", "", "", "");
                break;

            case "32604":
                local = Direcion.this.selector("", "", "", "");
                break;

            default:
                break;
        }

        return local;

    }

    public String selector(String local1, String local2, String local3, String local4) {
        String input = "";
        if (local1.equalsIgnoreCase("") && local2.equalsIgnoreCase("") && local3.equalsIgnoreCase("") && local4.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Ningun local en la zona");
        } else {
            String[] rest = {local1, local2, local3, local4};
            input = (String) JOptionPane.showInputDialog(null, "Elije restaurante", "Restaurante", JOptionPane.QUESTION_MESSAGE, null, rest, rest[1]);
        }
        return input;
    }
}
