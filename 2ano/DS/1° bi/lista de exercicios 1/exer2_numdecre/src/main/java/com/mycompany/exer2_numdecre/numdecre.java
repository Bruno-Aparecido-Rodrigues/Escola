/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer2_numdecre;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class numdecre {
    
    //variaveis//
    
     public static Scanner teclado = new Scanner(System.in);
    
    public static int A;
    public static int B;
    public static int loop=0;
    
       //inicio texto/aplicação//
    
     public static void main(String[] args) {
     
        System.out.println("Insira um valor inteiro:");
        A=teclado.nextInt();
        B=A;    
        do{
            A=A-1;
            System.out.println(A);
            loop++;
        }
        while(loop!=B);
     }
}
