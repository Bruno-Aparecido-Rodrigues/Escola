/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio3 {
  
 ///var///   
 public static Scanner teclado = new Scanner(System.in);
    
 public static float peixekg;
 
 public static float multakg;
 
    public static void main(String[] args) {
        
    ///entrada///    
        System.out.println("Digite a quantidade de quilos de peixe que você possui (utilize ',' e não '.' em caso de necessidade) :");
        
        peixekg = teclado.nextFloat();
       
     ///if///   
          if(peixekg>50)
          {
            multakg = (peixekg-50)*4;
            
              System.out.println("A multa terá que ser paga referente a quantidadede peso excedido será R$:"+multakg);
          }
          else
          {    
              System.out.println("Não a multa a pagar.");
          }
    }
}
