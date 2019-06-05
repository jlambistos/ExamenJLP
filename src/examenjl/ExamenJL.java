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
        
        double sumar = sum1double + sum1double + sum1double;
        JOptionPane.showConfirmDialog(null, "Operación Suma " + sumar);
        

        int rest1 = 10;

        int rest2 = 20;

        int rest3 = 30;

        int restar = rest1 - rest2 - rest3;

        System.out.println("Operación Restar =  " + restar);

        int mul1 = 10;

        int mul2 = 20;

        int mul3 = 30;

        int multiplicar = mul1 * mul2 * mul3;

        System.out.println("Operación Multiplicar = " + multiplicar);

        int div1 = 10;

        int div2 = 20;

        int div3 = 30;

        int dividir = div1 / div2 / div3;

        System.out.println("Operación dividir = " + dividir);

    }

}
