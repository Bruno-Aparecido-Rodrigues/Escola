/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class exen1main {
    
    
    //////gerência todo o processo dos métodos/puxa eles//////
    public static void main(String[] args)
    {
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        dobro(a);
    }
    ////exibe uma mensagem para o usuário inserir um valor////
    static void digite()
    {
        JOptionPane.showMessageDialog(null, "Digite um número:: ");
    }     
    
    static void dobro(int n)
    {
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro de "+n+" é "+ d);
    }
}
