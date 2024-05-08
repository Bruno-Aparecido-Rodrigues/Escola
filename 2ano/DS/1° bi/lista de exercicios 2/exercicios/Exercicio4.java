/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.padrao.exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Exercicio4 {

    public static void main(String[] args) {
        int num,equ;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro:: "));
        equ=Integer.parseInt(JOptionPane.showInputDialog(null," digite o número referente a equação desejada  1–Soma   2–Subtração   3–Divisão   4–Multiplicação   5–RestodaDivisão   6–Dobro   7–Quadrado   8–Cubo   9–RaizQuadrada  0–Sair"));
        JOptionPane.showMessageDialog(null, "Leve em consideração que as equações serão feitas tendo em conta apenas o número digitado ex:n+n e não n+x");
        num=calculos(num, equ);
        JOptionPane.showMessageDialog(null, "O resultado da equação é:"+num);
          }
    
    static int calculos(int n, int e) 
    {
      if(e==0)
          System.exit(0);
      else
         if(e==1)
              n=n + n;
         else
            if(e==2)
                 n=n - n;
            else
              if(e==3)
                   n=n / n;
              else
                if(e==4)
                    n=n * n;
                else
                   if(e==5)
                      n=n % 2;
                   else
                      if(e==6)
                          n=n * 2;
                      else
                         if(e==7)
                             n=n * n;
                         else
                            if(e==8)
                                 n=n * n * n;
                            else
                               if(e==9)
                              n=(int) Math.sqrt(n);
      return (n);
    }
    
}
