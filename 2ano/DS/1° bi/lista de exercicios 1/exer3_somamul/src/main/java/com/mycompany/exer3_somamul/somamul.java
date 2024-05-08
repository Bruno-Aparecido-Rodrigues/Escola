/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer3_somamul;



/**
 *
 * @author Bruno
 */
public class somamul {
    
    //variaveis//
    
    public static int par;
    public static int impar;

     //inicio texto/aplicação//
    
     public static void main(String[] args) {
         
                   
             for (int i = 0 ; i <= 30; i++)
             {
                 
                  if(i %2 !=0) {
                     impar=impar+i;
                 }
                  else{
                      if(i %2 ==0) {
                     par=par*i;
                 }
               }
             }

         
 System.out.println("A soma dos impares de 0 a 30 é: "+impar+" A multiplicação dos pares é: "+par);
            }
}
