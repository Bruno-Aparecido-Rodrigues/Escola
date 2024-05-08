/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer6_media;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class media {
    
    public static Scanner teclado = new Scanner(System.in);
    public static float vetornota[] = new float[4];
    public static String nome= "";
    public static float media;
    
     //fim variavieis//
    //inicio texto/aplicação//
    
    public static void main(String[] args)
    {
        System.out.println("Insira seu nome completo: ");
        nome=teclado.nextLine();
        System.out.println("Digite sua primeira nota:");
        vetornota[0]=teclado.nextFloat();  
        System.out.println("Digite sua segunda nota:");
        vetornota[1]=teclado.nextFloat();  
        System.out.println("Digite sua terceira nota:");
        vetornota[2]=teclado.nextFloat();  
        System.out.println("Digite sua quarta nota:");
        vetornota[3]=teclado.nextFloat();
        
        media=(vetornota[0]+vetornota[1]+vetornota[2]+vetornota[3])/4;
        
        System.out.println("O seu nome é: "+nome+"   sua média de matematica é:"+media);
    }   
}