
package com.edu.eteczl.terminal;

import java.util.InputMismatchException;
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
      try 
         {
           System.out.println("Para o registro digite seu nome completo: ");
      
           nome = teclado.nextLine();
         }
     catch (InputMismatchException e1) 
        {
          System.out.println("Um erro ocorreu ao armazenar seu nome (tipo de dados): " + e1.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
       }
      catch (NullPointerException e2)
      {
          System.out.println("Um erro ocorreu ao armazenar seu nome (variável nula): " + e2.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
      }
      
      try 
         {
          
         System.out.println("Insira sua idade: ");
      
         idade = teclado.nextInt();
         }    
     catch (InputMismatchException e1) 
        {
          System.out.println("Um erro ocorreu ao armazenar a idade (tipo de dados): " + e1.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
       }
      catch (NullPointerException e2)
      {
          System.out.println("Um erro ocorreu ao armazenar a idade (variável nula): " + e2.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
      }
      
      try
        {
         System.out.println("Insira sua altura em metros (separe com , e não .): ");
      
         altura = teclado.nextFloat();
        }
      catch (InputMismatchException e1)
        {
          System.out.println("Um erro ocorreu ao armazenar a altura (tipo de dados): " + e1.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
        }
      catch (NullPointerException e2)
      {
          System.out.println("Um erro ocorreu ao armazenar a altura (variável nula): " + e2.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
      }
      try
        {
         System.out.println("Você é paulistano? (true=sim) (false=não) ");
      
        paulistano = teclado.nextBoolean();;
        }
      catch (InputMismatchException e1)
        {
          System.out.println("Um erro ocorreu ao armazenar sua cidade natal (tipo de dados): " + e1.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
        }
      catch (NullPointerException e2)
      {
          System.out.println("Um erro ocorreu ao armazenar sua cidade natal (variável nula): " + e2.getMessage());
          
          System.out.println("Desculpe tente novamente!");
          
          System.exit(0);
      }
      
      System.out.println("Cadastro concluído!!!");
      
      System.out.println("Seu nome está como: " + nome + "  Sua idade é: " + idade + "  Sua altura é: " + altura + " metros  " + "Sou paulistano?: " + paulistano);
      
      
  }
  
}
