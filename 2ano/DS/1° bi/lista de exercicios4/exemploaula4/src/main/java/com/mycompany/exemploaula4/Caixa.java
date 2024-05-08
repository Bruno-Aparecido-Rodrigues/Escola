/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploaula4;

import javax.swing.JOptionPane;
/**
 *
 * @author Bruno
 */
public class Caixa {
    
    //atributo
    private double saldo;
    //construtores
    //inicializando o atributo zerado
    public Caixa() {
        this(0);
    }
    //inicializando o atributo com o parâmetro
    public Caixa (double saldo) {
        this.saldo = saldo;
    }
    
    //getter e seeter

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


//Métodos específicos da classe

public void entrar(){
//lê um valor, converte se string para double e atribui a variável valor
double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
/* Soma o conteúdo do atributo saldo com a variável valor e passa o resultado por parametro para o método setSaldo() */
this.setSaldo(this.saldo + valor);
}

public void retirar(){
//lê um valor, converte se string para double e atribui a variável valor
double valor = Double.parseDouble(JOptionPane.showInputDialog("DIgite o valor da retirada: "));
/* Subtrai o conteúdo do atributo saldo com a variável valor e passa o resultado por parametro para o método setSaldo() */
this.setSaldo(this.saldo - valor);
}

}