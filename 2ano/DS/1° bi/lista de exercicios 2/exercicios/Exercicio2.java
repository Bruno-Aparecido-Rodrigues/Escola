/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.padrao.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Exercicio2 {
    
    //puxa o método//
    public static void main(String[] args)
    {
        float num1, num2;
        num1=Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro valor:: "));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo valor:: "));
        diferenca(num1, num2);
    }
    
    //exibe e faz a comparação//
    static void diferenca(float n1, float n2)
    {
         if(n1>n2)
         {
            JOptionPane.showMessageDialog(null,"O valor:"+n1+" é maior que o valor:"+n2);
         }
         else
           if(n1<n2)
         {
            JOptionPane.showMessageDialog(null,"O valor:"+n2+" é maior que o valor:"+n1);
         }
         else
               JOptionPane.showMessageDialog(null,"Os valores são iguais");
    }
}
