/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlecomissao;

import javax.swing.JOptionPane;


/**
 *
 * @author Bruno
 */
public class Principal {

    public static void main(String [] args){
            //variavel//
       double valven;
       double x;
       
           Vendedor vende = new Vendedor();//Instanciação do objeto vende
      
          valven=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor vendido:"));
          x=vende.calculoComissao(valven);//puxa os metodos//
          JOptionPane.showMessageDialog(null,"Olá "+vende.getNome()+"\nSeu novo salário é de:"+x);
    }
}
