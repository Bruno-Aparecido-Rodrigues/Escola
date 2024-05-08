/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.padrao.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Exercicio3 {
   //gerencia o método e exibe menssagem de entra e saída///
    public static void main(String[] args) {
        
        double heig, p, sex;
         sex=Double.parseDouble(JOptionPane.showInputDialog("Insira seu sexo 1=masculino  2=feminino:: "));
         heig=Double.parseDouble(JOptionPane.showInputDialog("Entre com a sua altura:: "));
         p=calcularPesoIdeal(sex, heig);
         JOptionPane.showMessageDialog(null,"O peso ideal para o seu sexo é:"+p);
    }
    //faz o calculo referente ao peso//
    static double calcularPesoIdeal (double s, double h)
    {
        if(s==1)
        {
            h=(72.7*h)-58;
        }
        else
            if(s==2){
            h=(62.1*h)-44.7;
            }
        return h;
    }
}
