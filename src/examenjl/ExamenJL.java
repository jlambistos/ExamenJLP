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
 * @author Jorge Lambistos Perez
 */
public class ExamenJL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FuncionesJLP.MetodoSumar(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2:"), JOptionPane.showInputDialog("Ingresa valor 3 :"));

        FuncionesJLP.MetodoRestar(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2 :"), JOptionPane.showInputDialog("Ingresa valor 3 :"));

        FuncionesJLP.MetodoMultiplicar(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2:"), JOptionPane.showInputDialog("Ingresa valor 3 :"));
        
        FuncionesJLP.MetodoDividir(JOptionPane.showInputDialog("Ingresa valor 1 :"), JOptionPane.showInputDialog("Ingresa valor 2 :"), JOptionPane.showInputDialog("Ingresa valor 3 :"));
        
    }

    

}
