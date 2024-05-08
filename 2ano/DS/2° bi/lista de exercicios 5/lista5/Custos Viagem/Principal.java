/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.custosviagem;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Principal {
    
    public static void main(String[] args){
        int op;
         Percurso per = new Percurso();//Instanciação do objeto per
         Custos cus = new Custos();         
        do{//inicio do looping do-while
            //Apresentação e leitura do menu de opções
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Cadastrar dados da viagem "+ "\n2 - Apresentar  dados da viagem \n3 - Apresentar  custo total da viagem \n0 - Sair"));
            switch (op) { //abertura da estrutura de switch-case
                case 1:
                per.cadastrarPercurso(); //começa o cadastr
                    break;
                case 2:
                per.listarPercurso(); //lista o cadastro
                    break;
                case 3:
                cus.calcularViagem(per); //mostra o custo da viagem
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
