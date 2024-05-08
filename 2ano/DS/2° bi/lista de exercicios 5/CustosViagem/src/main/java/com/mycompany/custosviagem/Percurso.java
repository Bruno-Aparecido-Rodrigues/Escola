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
public class Percurso {
    
    //variaveis//
    private double kmPercorrida;
    private double valorCombustivel;
    private double valorPedagio;
    
    //construtores//
    // criando atributo zerado//
    public Percurso(){
        this(0,0,0);
    }

    public Percurso(double kmPercorrida, double valorCombustivel, double valorPedagio) {
        this.kmPercorrida = kmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    //getter seteer//
    
    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    
    //metodos//
    
    public void cadastrarPercurso(){
        this.setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Km percorrido:")));
        this.setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustivel:")));
        this.setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedágio:")));
    }

    public void listarPercurso(){
        JOptionPane.showMessageDialog(null,"Os km percorridos foram de:"+this.getKmPercorrida()+"\n O valor do combustivel foi de:"+this.getValorCombustivel()+"\n O valor do pedágio foi de:"+this.getValorPedagio());
    }
   }
