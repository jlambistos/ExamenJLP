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
 * @version 05/06/2019
 * @since 18:39 horas
 */
public class FuncionesJLP {

    /**
     * Metodo que realiza sumas de tres valores introducidos por el usuario
     *
     * @param numero1 the value of numero1
     * @param sum2 the value of sum2
     * @param sum3 the value of sum3
     * @since 18:20horas
     * @throws NumberFormatException 
     * @throws HeadlessException
     */
    public static void Sumar(String numero1, String sum2, String sum3) throws NumberFormatException, HeadlessException {

        double sum1double = Double.parseDouble(numero1);
        double sum2double = Double.parseDouble(sum2);
        double sum3double = Double.parseDouble(sum3);
        double sumar = sum1double + sum2double + sum3double;
        
        JOptionPane.showMessageDialog(null, "Operación Suma " + sumar);
    }

    /**
     * Metodo que realiza Restas de tres valores introducidos por el usuario
     *
     * @param mult1 the value of mult1
     * @param mult2 the value of mult2
     * @param mult3 the value of mult3
     * @since 18:30horas
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    public static void MetodoMultiplicar(String mult1, String mult2, String mult3) throws NumberFormatException, HeadlessException {

        double mult1double = Double.parseDouble(mult1);
        double mult2double = Double.parseDouble(mult2);
        double mult3double = Double.parseDouble(mult3);
        double mult = mult1double * mult1double * mult1double;
        JOptionPane.showMessageDialog(null, "Operación multiplicació " + mult);
    }

    /**
     * Metodo que realiza multiplicaciones de tres valores introducidos por el
     * usuario
     *
     * @param numresta1 the value of numresta1
     * @param res2 the value of res2
     * @param res3 the value of res3
     * @since 18:31horas
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    public static void MetodoRestar(String numresta1, String res2, String res3) throws NumberFormatException, HeadlessException {
        double res1double = Double.parseDouble(numresta1);
        double res2double = Double.parseDouble(res2);
        double res3double = Double.parseDouble(res3);
        double res = res1double - res1double - res1double;
        JOptionPane.showMessageDialog(null, "Operación Resta " + res);

    }

    /**
     * Metodo que realiza sumas de tres valores introducidos por el usuario
     *
     * @param div1 the value of div1
     * @param div2 the value of div2
     * @param div3 the value of div3
     * @since 18:32horas
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    public static void MetodoDividir(String div1, String div2, String div3) throws NumberFormatException, HeadlessException {

        double div1double = Double.parseDouble(div1);
        double div2double = Double.parseDouble(div2);
        double div3double = Double.parseDouble(div3);
        double div = div1double / div1double / div1double;
        JOptionPane.showMessageDialog(null, "Operación Dividir " + div);
    }

}
