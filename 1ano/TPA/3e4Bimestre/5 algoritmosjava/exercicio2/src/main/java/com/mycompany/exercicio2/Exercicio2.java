/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio2 {
 
///var///    
public static Scanner teclado = new Scanner(System.in);
    
     public static float altura;
     
     public static float peso;
      
     public static float imc;
       
    public static void main(String[] args) {
    
    ///entrada e calculo///
    
        System.out.println("Informe sua altura");
         System.out.println("(use ',' e não '.'):");
        
        altura = teclado.nextFloat();
        
        System.out.println("Informe seu peso:");
         System.out.println("(use ',' e não '.'):");
        
        peso = teclado.nextFloat();
        
        imc = peso/(altura*altura);
        
   ///IMC///
   
        System.out.println("Seu IMC é:"+imc);
       
        if(imc<18.5){
            System.out.println("Você está abaixo do peso."); 
        }
        else{
           if(imc<=24.9){
                 System.out.println("Você está com o peso ideal."); 
           }
           else{
               if(imc<=29.9){
                   System.out.println("Você está com Sobrepeso.");
               }
               else{
                   if(imc<=34.9){
                       System.out.println("Você está em Obesidade Grau I.");
                   }
                   else{
                       if(imc<=39.9){
                           System.out.println("Você está em Obesidade Grau II.");
                       }
                       else{
                           if(imc>=40){
                               System.out.println("Você está em Obesidade Grau III ou Mórbida.");
                           }
                       }
                   }
               }
           }
        }           
    }
}
