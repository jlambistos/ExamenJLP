/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjl;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Lambistos Perez
 */
public class ExamenJL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializacion de variables introducidas por JOptionPane

        String sum1 = JOptionPane.showInputDialog("Ingresa valor 1º :");

        double sum1double = Double.parseDouble(sum1);
        String sum2 = JOptionPane.showInputDialog("Ingresa valor 2º :");

        double sum2double = Double.parseDouble(sum2);
        String sum3 = JOptionPane.showInputDialog("Ingresa valor 3º :");

        double sum3double = Double.parseDouble(sum3);

        double sumar = sum1double + sum2double + sum3double;
        JOptionPane.showConfirmDialog(null, "Operación Suma " + sumar);
        /////////////////////////////////////////////

        String res1 = JOptionPane.showInputDialog("Ingresa valor 1º :");

        double res1double = Double.parseDouble(res1);
        String res2 = JOptionPane.showInputDialog("Ingresa valor 2º :");

        double res2double = Double.parseDouble(res2);
        String res3 = JOptionPane.showInputDialog("Ingresa valor 3º :");

        double res3double = Double.parseDouble(res3);

        double res = res1double - res1double - res1double;
        JOptionPane.showConfirmDialog(null, "Operación Resta " + res);
        ////////////////////////////////////////////

        String mult1 = JOptionPane.showInputDialog("Ingresa valor 1º :");

        double mult1double = Double.parseDouble(mult1);
        String mult2 = JOptionPane.showInputDialog("Ingresa valor 2º :");

        double mult2double = Double.parseDouble(mult2);
        String mult3 = JOptionPane.showInputDialog("Ingresa valor 3º :");

        double mult3double = Double.parseDouble(mult3);

        double mult = mult1double * mult1double * mult1double;
        JOptionPane.showConfirmDialog(null, "Operación Multiplicación " + mult);
        
        /////////////////////////////////////////////
        
        String div1 = JOptionPane.showInputDialog("Ingresa valor 1º :");

        double div1double = Double.parseDouble(div1);
        String div2 = JOptionPane.showInputDialog("Ingresa valor 2º :");

        double div2double = Double.parseDouble(div2);
        String div3 = JOptionPane.showInputDialog("Ingresa valor 3º :");

        double div3double = Double.parseDouble(div3);

        double div = div1double / div1double / div1double;
        JOptionPane.showConfirmDialog(null, "Operación Dividir " + div);
        
    }

}
