/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer5_comparanum;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class comparanum {
      public static Scanner teclado = new Scanner(System.in);
    
    public static int A;
    public static int B;
    
    //fim variavieis//
    //inicio texto/aplicação//
    
     public static void main(String[] args) {
     
        System.out.println("Insira um valor inteiro:");
        A=teclado.nextInt();   
        System.out.println("Insira um valor inteiro:");
        B=teclado.nextInt(); 
        
        if(A>B)
        {
            System.out.println("O valor A: "+A+" é maior e diferente do valor B: "+B);
        }
        else
        {
            if(A<B){
               System.out.println("O valor B: "+B+" é maior e diferente do valor A: "+A); 
                   }
            else{
               System.out.println("Os valores: "+B+" e "+A+" são iguais.");
                }
        }
     }
}
