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
public class Vendedor {
    
    /*variaveis*/
    private String nome;
    private double salarioBase;


    
    //construtores
    //inicializando o atributo zerado
    public Vendedor(){
        this("",0);
    }
    
    public Vendedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    //getter e seeter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    //metodos//
    
    public double calculoComissao(double valorVendido){
        double r=0;
        this.setNome(JOptionPane.showInputDialog("Por favor digite seu nome:"));
        this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Por favr digite seu salário Base:")));
        
       r=this.getSalarioBase() + (valorVendido * 0.1);
        
       return(r);
    }
    
 
}
