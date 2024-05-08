/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio7;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio7 {

///var///
    
     public static Scanner teclado = new Scanner(System.in);
    
     public static int hambur;
    
///menu///
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Mac donalds!!!");
        System.out.println("Aqui está o cardápio:");
        System.out.println("1. BigMac");
        System.out.println("2. Quarteirão");
        System.out.println("3. McChicken");
        System.out.println("4. Cheddar Mcmelt");
        System.out.println("5. MacMax");
        System.out.println("Digite o número referente ao hamburguer desejado:");
        
        hambur = teclado.nextInt();
        
 ///switch///       
           switch(hambur){
               
               case 1: System.out.print("O pedido de um BigMac está sendo preparado.");
                break;
               case 2: System.out.print("O pedido de um Quarteirão está sendo preparado.");
                break;
               case 3: System.out.print("O pedido de um McChicken está sendo preparado.");
                break;
               case 4: System.out.print("O pedido de um Cheddar Mcmelt está sendo preparado.");
                break;
               case 5: System.out.print("O pedido de um MacMax está sendo preparado.");
                break;
               default:System.out.println("O hamburger selecionado não existe. Verifique se digitou corretamente e tente novamente!!!");
           }
    }
}
