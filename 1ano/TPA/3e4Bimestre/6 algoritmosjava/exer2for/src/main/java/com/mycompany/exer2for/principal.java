/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer2for;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class principal {
      public static Scanner teclado = new Scanner(System.in);
    
    public static int res=0;
    
    public static int num=0;
    
        public static void main(String[] args) {
    
            System.out.println("Informe o número da tabuada de 1 a 10");
            
             num = teclado.nextInt();
     if(num<=10){                   
             for (int cont = 0 ; cont <= 10; cont++)
             {
                 res=num*cont;
                 System.out.println(num+"*"+cont+"="+res);
             }
        }
           
    else{
         System.out.println("!!!!erro número inválido!!!!!");
     }
    }
        
}
