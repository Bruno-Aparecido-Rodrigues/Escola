/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer3dowhile;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class principal {
    
       public static Scanner teclado = new Scanner(System.in);
   
       public static int res=1;
    
  public static void main(String[] args) {
    
            System.out.println("Informe um número a ser fatorado");
            
             var fator = teclado.nextInt();
           
             if (fator==0){
              System.out.println("O fatorial de "+fator+"="+res);
              }   
         else{
             var a=fator;
             var i=a-1;
             
                   do
                   {
                   a=a*(fator-res);
                   res=res+1;
                   i--;
                   }
                    while(i>=1);
                    System.out.println("O fatorial de "+fator+"="+a);
                }
   }
}
