/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjl;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Lambistos Pérez
 */
public class FuncionesJLP {

    static void MetodoSumar() throws NumberFormatException, HeadlessException {
        //Inicializacion de variables introducidas por JOptionPane
        String sum1 = JOptionPane.showInputDialog("Ingresa valor 1\u00ba :");
        double sum1double = Double.parseDouble(sum1);
        String sum2 = JOptionPane.showInputDialog("Ingresa valor 2\u00ba :");
        double sum2double = Double.parseDouble(sum2);
        String sum3 = JOptionPane.showInputDialog("Ingresa valor 3\u00ba :");
        double sum3double = Double.parseDouble(sum3);
        double sumar = sum1double + sum2double + sum3double;
        JOptionPane.showConfirmDialog(null, "Operaci\u00f3n Suma " + sumar);
    }

    static void MetodoMultiplicar() throws NumberFormatException, HeadlessException {
        String mult1 = JOptionPane.showInputDialog("Ingresa valor 1\u00ba :");
        double mult1double = Double.parseDouble(mult1);
        String mult2 = JOptionPane.showInputDialog("Ingresa valor 2\u00ba :");
        double mult2double = Double.parseDouble(mult2);
        String mult3 = JOptionPane.showInputDialog("Ingresa valor 3\u00ba :");
        double mult3double = Double.parseDouble(mult3);
        double mult = mult1double * mult1double * mult1double;
        JOptionPane.showConfirmDialog(null, "Operaci\u00f3n Multiplicaci\u00f3n " + mult);
    }

    static void MetodoRestar() throws NumberFormatException, HeadlessException {
        String res1 = JOptionPane.showInputDialog("Ingresa valor 1\u00ba :");
        double res1double = Double.parseDouble(res1);
        String res2 = JOptionPane.showInputDialog("Ingresa valor 2\u00ba :");
        double res2double = Double.parseDouble(res2);
        String res3 = JOptionPane.showInputDialog("Ingresa valor 3\u00ba :");
        double res3double = Double.parseDouble(res3);
        double res = res1double - res1double - res1double;
        JOptionPane.showConfirmDialog(null, "Operaci\u00f3n Resta " + res);
        ////////////////////////////////////////////
    }

    static void MetodoDividir() throws NumberFormatException, HeadlessException {
        /////////////////////////////////////////////
        String div1 = JOptionPane.showInputDialog("Ingresa valor 1\u00ba :");
        double div1double = Double.parseDouble(div1);
        String div2 = JOptionPane.showInputDialog("Ingresa valor 2\u00ba :");
        double div2double = Double.parseDouble(div2);
        String div3 = JOptionPane.showInputDialog("Ingresa valor 3\u00ba :");
        double div3double = Double.parseDouble(div3);
        double div = div1double / div1double / div1double;
        JOptionPane.showConfirmDialog(null, "Operaci\u00f3n Dividir " + div);
    }
    
}
