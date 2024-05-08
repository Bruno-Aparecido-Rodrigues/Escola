/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vetor.vetor;


import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Vetor 
{
    Scanner scanner = new Scanner(System.in);
    
    void inicializarVetor(int _vetor[])
    {
        for (int contador = 0 ; contador < _vetor.length ; contador++)
        {
            System.out.println("Digite um numero inteiro para a posição " + contador + ": ");
            
            _vetor[contador] = scanner.nextInt();
        }
        
        System.out.println("Vetor inicializando...");
    }
    
    void exibirVetor(int _vetor[])
    {
        System.out.print("Vetor = [");
        
        for (int contador = 0 ; contador < _vetor.length ; contador++)
        {
            if (contador == _vetor.length - 1)
            {
                System.out.print(_vetor[contador] + "]\n");
            }
            else
            {
                System.out.print(_vetor[contador] + " , ");
            }
        }
    }
}
