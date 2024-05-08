/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Principal {
    
    public static void main(String args[]){
        Calculadora calcu = new Calculadora();//Instanciação do objeto calcu
         int op; //declaração da variável de opções
         double a; //declaração da variável a
         double b; //declaração da variável b
         double x; //declaração da variavel x ou r
         
        do{//inicio do looping do-while
            //Apresentação e leitura do menu de opções
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Soma "+ "\n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n0 - Sair"));
            switch (op) { //abertura da estrutura de switch-case
                case 1:
                    calcu.soma();//chamada ao metodo soma do objeto calcu
                    break;
                case 2:
                    a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    b= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    calcu.subtrair(a,b);//chamada ao método subtração do objeto calcu
                    break;
                case 3:
                    x=calcu.multiplicar();//chamada ao metodo multiplicar do objeto calcu
                    JOptionPane.showMessageDialog(null, "a multiplicação de"+calcu.getN1()+"*"+calcu.getN2()+"="+calcu.getR());
                    break;
                case 4:
                    a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    b= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    x=calcu.dividir(a,b);//chamada ao método dividir do objeto calcu
                    JOptionPane.showMessageDialog(null, "a divisão de"+calcu.getN1()+"/"+calcu.getN2()+"="+calcu.getR());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Invalida !");                    
            } 
            
        }while(op !=0); //Repetirá as operações enquanto a opção for diferente de zero
    }
}
