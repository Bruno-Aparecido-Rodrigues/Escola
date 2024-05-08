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
public class Calculadora {
    //atributos
    private double n1;
    private double n2;
    private double r;
    
      //construtores
    //inicializando o atributo zerado
    public Calculadora() {
        this(0,0,0);
    }
    //inicializando o atributo com o parâmetro
    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }
     
     //getter e seeter

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    //criação do método soma
    public void soma(){
        //primeiro será feita a coleta de dados para o calculo 
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um valor:")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um valor:")));
        this.setR(this.getN1()+this.getN2());
        JOptionPane.showMessageDialog(null,"a soma de "+this.getN1()+"+"+this.getN2()+"="+this.getR());
    }
    
    public void subtrair(double n1, double n2){
        this.setR(this.getN1()-this.getN2());
        JOptionPane.showMessageDialog(null,"a subtração de "+this.getN1()+"-"+this.getN2()+"="+this.getR());
    }
    
    public double multiplicar(){
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor")));
        this.setR(this.getN1()*this.getN2());
        return(this.getR());
    }
    public double dividir(double n1, double n2){
        this.setR(this.getN1()/this.getN2());
        return(this.getR());
    }
}
