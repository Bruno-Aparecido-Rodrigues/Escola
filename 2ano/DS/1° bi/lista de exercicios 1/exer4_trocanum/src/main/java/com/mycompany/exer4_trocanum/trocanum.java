/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer4_trocanum;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class trocanum {
    
    //variaveis//
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static int A;
    public static int B;
    public static int inter;
    
     //fim variavieis//
    //inicio texto/aplicação//
    
     public static void main(String[] args) {
     
        System.out.println("Insira um valor para A:");
        A=teclado.nextInt();   
        System.out.println("Insira um valor para B:");
        B=teclado.nextInt(); 
        
        inter=B;
        B=A;
        A=inter;

         System.out.println("NumA="+A+" NumB="+B);        
}
}