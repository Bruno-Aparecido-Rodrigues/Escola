/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio4 {

 ///var///   
    public static Scanner teclado = new Scanner(System.in);
    
    public static String senha;
    
    public static void main(String[] args) {
  ///entrada///      
        System.out.println("Por favor insira sua senha:");
        
        senha = teclado.nextLine();
     
  ///switch///      
        switch(senha){
            
            case "carpediem":System.out.println("Bem vindo!!!");
            break;
            default:System.out.println("Senha inválida. Por favor reinicie e tente novamente.");
        }
        
    }
    
}
