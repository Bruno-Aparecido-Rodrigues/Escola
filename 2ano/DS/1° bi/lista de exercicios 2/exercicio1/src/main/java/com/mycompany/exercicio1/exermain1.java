/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class exermain1 {
    
    public static void main(String[] args)
    {
        float nota1, nota2, media;
        nota1=lerNota();
        nota2=lerNota();
        media=calcularMedia(nota1, nota2);
         if(media >= 7.0)
        JOptionPane.showMessageDialog(null, "Sua média foi:"+media+" Você foi aprovado");
        else
        JOptionPane.showMessageDialog(null, "Sua média foi:"+media+" Você foi reprovado");
    }
    static float lerNota()
    {
        float n;
         n=Float.parseFloat(JOptionPane.showInputDialog("Entre com a sua nota:: "));
    return n;
    }
    
    static float calcularMedia(float n1, float n2)
    {
        float m;
        m=(n1+n2)/2;
  
        return m;
    }
  
}
