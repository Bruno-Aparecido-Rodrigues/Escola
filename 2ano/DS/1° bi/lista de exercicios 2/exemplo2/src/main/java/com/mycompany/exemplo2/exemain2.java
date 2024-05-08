/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class exemain2 {
    
    /////gerencia os métodos e apresenta uma mensagem inicial e efinal//////
    public static void main(String[] args)
    {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t=tamanho(p);
        JOptionPane.showMessageDialog(null,p+ " possui "+t+ " caracteres");
    }
    ////apresenta ua messagem na tela de inserção////
    static void digite()
    {
        JOptionPane.showMessageDialog(null, "Digite uma palavra");
    }
    ////transforma a palavra digitada em valores inteiros referente ao número de caracteres inseridos e devolve ao main////
    static int tamanho(String x)
    {
        return x.length();
    }
}
