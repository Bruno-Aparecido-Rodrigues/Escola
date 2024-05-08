/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploaula4;
import javax.swing.*; //importação da API swing
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Principal {
    public static void main (String args[]){
        Caixa cx1 = new Caixa();//Instanciação do objeto cx1
        int op; //declaração da variável de opções
        do{//inicio do looping do-while
            //Apresentação e leitura do menu de opções
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada "+ "\n2 - Retirada \n3 - Consultar saldo \n0 - Sair"));
            switch (op) { //abertura da estrutura de switch-case
                case 1:
                    cx1.entrar();//chamada ao metodo entrar do objeto cx1
                    break;
                case 2:
                    cx1.retirar();//chamada ao método retirar do objeto cx1
                    break;
                case 3:
                    //apresentação do conteúdo do atributo saldo
                    JOptionPane.showMessageDialog(null,"Saldo atual:"+cx1.getSaldo());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Invalida !");                    
            } 
            
        }while(op !=0); //REpetirá as operações enquanto a opção for diferente de zero
    }
}
