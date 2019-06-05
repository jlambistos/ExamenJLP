/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjl;
//Importacion de librerias

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Lambistos Perez
 * @version 05/06/2019
 * @since 18:40 horas
 *
 */
public class ExamenJL {

    /**
     * El programa le solicitará al usuario que introduzca tres valores para
     * cada operacion, siendo estas una suma, una resta un multiplicacion y una
     * division.
     *
     * @param args the command line arguments
     * @version 05/06/2019
     * @since 18:57 horas
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa que realizará una suma. ");

        FuncionesJLP.Sumar(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2:"), JOptionPane.showInputDialog("Ingresa valor 3 :"));
        JOptionPane.showMessageDialog(null, "Programa que realizará una resta. ");
        FuncionesJLP.MetodoRestar(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2 :"), JOptionPane.showInputDialog("Ingresa valor 3 :"));
        JOptionPane.showMessageDialog(null, "Programa que realizará una multiplicacion. ");
        FuncionesJLP.MetodoMultiplicar(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2:"), JOptionPane.showInputDialog("Ingresa valor 3 :"));
        JOptionPane.showMessageDialog(null, "Programa que realizará una Division. ");
        FuncionesJLP.MetodoDividir(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2 :"), JOptionPane.showInputDialog("Ingresa valor 3 :"));

    }

}
