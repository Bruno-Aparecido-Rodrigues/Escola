/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.padrao.exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class Exercicio5 {

    public static void main(String[] args) {
        double base, altu, hipo;
        base=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da base do triangulo:: "));
        altu=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o valor d altura do triangulo:: " )); 
        hipo=hipotenusa(base, altu);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é:"+hipo);
    }
   static double hipotenusa(double b,double c)
   {
       double h;
       h=(b*b)+(c*c); 
       h=Math.sqrt(h);
       return (h);
   }
}
