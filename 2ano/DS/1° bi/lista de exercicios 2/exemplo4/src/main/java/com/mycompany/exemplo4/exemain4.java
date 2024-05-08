/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo4;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class exemain4 {
    
    public static void main(String[] args)
    {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:: "));
        
        if (RestoPorDois(num) == 0)
            JOptionPane.showMessageDialog(null, "O número é par. \n");
        else
            JOptionPane.showMessageDialog(null, "O número é impar. \n");
    }
    
    static int RestoPorDois(int a)
    {
        return a % 2;
    }
}
