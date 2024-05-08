/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exercicio1 {

    ///var///   
    public static Scanner teclado = new Scanner(System.in);
    
    public static int A;
    public static int B;
    public static int C;
    public static int Del;
    public static float X1;
    public static float X2;
    
    public static void main(String[] args) {
        
       ///Entrada/// 
        System.out.println("!!!!!!Adendo o codígo é preciso. Em caso de resultados com dizima o número será encurtado!!!!!");
        System.out.println("Insira um valor para A:");
        A=teclado.nextInt();
        System.out.println("Insira um valor para B:");
        B=teclado.nextInt();
        System.out.println("Insira um valor para C:");
        C=teclado.nextInt();
        
        ///Calculo///
        Del=(B*B)-4*A*C;        

        System.out.println("Delta:"+Del);
        if(Del<0){
            System.out.println("Não existe raízes reais pois não existe raiz quadrada de número negativo.");
        }
        else{
            if(Del>0){
                X1=(float) ((-B + Math.sqrt(Del))/(2*A));
                X2=(float) ((-B - Math.sqrt(Del))/(2*A));
                
                System.out.println("As raízes são");
                System.out.println("X1:"+X1);
                System.out.println("X2:"+X2);
            }
            else{
              X1=(float) ((-B + Math.sqrt(Del))/(2*A));
              
              System.out.println("A raíz é");
              System.out.println("X:"+X1);
            }
        }
           }
}
