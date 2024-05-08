
package com.edu.eteczl.terminal;

import java.util.Scanner;



public class Principal 
{
  public static Scanner teclado = new Scanner(System.in);
  
  public static String nome;
  
  public static int idade;
  
  public static float altura;
  
  public static boolean paulistano;
  
  public static void main(String args[])
  {
      
      System.out.println("Seja bem-Vindo!!! Aqui será feito aplicação de cadastro de aluno.");
      
      System.out.println("Para o registro digite seu nome completo: ");
      
      nome = teclado.nextLine();
      
      System.out.println("Insira sua idade: ");
      
      idade = teclado.nextInt();
      
      System.out.println("Insira sua altura em metros (separe com , e não .): ");
      
      altura = teclado.nextFloat();
      
      System.out.println("Você é paulistano? (true=sim) (false=não) ");
      
      paulistano = teclado.nextBoolean();
      
      System.out.println("Cadastro concluído!!!");
      
      System.out.println("Seu nome está como: " + nome + "  Sua idade é: " + idade + "  Sua altura é: " + altura + " metros  " + "Sou paulistano?: " + paulistano);
      
      
  }
  
}
