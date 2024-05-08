/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio9;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio9 {
   
///var///    
    public static Scanner teclado = new Scanner(System.in);
    
    public static float nota1;
    public static float nota2;
    public static float nota3;
    public static float nota4;
    public static float media;

    public static void main(String[] args) {
        
  ///entrada e calculo///      
        System.out.println("Digite sua primeira nota de 0 a 10:");
        
        System.out.println("Em caso de necessidade use ',' e não '.'");
        nota1 = teclado.nextFloat();
        
        System.out.println("Digite sua segunda nota de 0 a 10:");
        nota2 = teclado.nextFloat();
        
        System.out.println("Digite sua terceira nota de 0 a 10:");
        nota3 = teclado.nextFloat();
        
        System.out.println("Digite sua quarta nota de 0 a 10:");
        nota4 = teclado.nextFloat();
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("sua média foi de:"+media);
    ///if (media)///

          if(media<2.5){
              System.out.println("Você foi reprovado");
          }  
          else{
              if(media<5){
                  System.out.println("Você foi reprovado");
              }
              else{
                  if(media<7){
                      System.out.println("Você foi aprovado");
                  }
                  else{
                      if(media<9){
                          System.out.println("Você foi aprovado");
                      }
                      else{
                          if(media>=10){
                              System.out.println("Você foi aprovado");
                          }
                      }
                  }
              }
          }
    }
}
