/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer3for;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class principal {
    
    public static Scanner teclado = new Scanner(System.in);
        
    public static int fator=0;
    
    public static int res=1;
    
        public static void main(String[] args) {
             
            System.out.println("Informe um número a ser fatorado");
            
             fator = teclado.nextInt();
          
          if (fator==0){
              System.out.println("O fatorial de "+fator+"="+res);
          }   
          else{
             var a=fator;
             
             for(var i=a-1; i>=1; i--)
             {
              a=a*(fator-res);
              res=res+1;
             }
             
             System.out.println("O fatorial de "+fator+"="+a);
        }}
}

