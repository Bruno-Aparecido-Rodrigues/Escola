/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer1;

import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class maiornum {

   //variaveis//
    
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
            System.out.println("O valor: "+A+" é maior que o valor: "+B);
        }
        else
        {
            if(A<B){
               System.out.println("O valor: "+B+" é maior que o valor: "+A); 
                   }
            else{
               System.out.println("O valor: "+B+" é igual ao valor: "+A);
         
                }
        }
     }
}
