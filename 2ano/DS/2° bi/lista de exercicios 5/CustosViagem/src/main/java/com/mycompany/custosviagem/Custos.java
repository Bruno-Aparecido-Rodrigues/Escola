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
public class Custos {
   
    //variaveis//
    private double totalPercurso;
  
    //construtores//
    //inicializando atributo zerado//
    public Custos(){
    this(0);
    }

    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
   
    //metodos
    public void calcularViagem(Percurso per){
        
        this.setTotalPercurso((per.getKmPercorrida()* per.getValorCombustivel())  + per.getValorPedagio());
        JOptionPane.showMessageDialog(null,"o custo total da viagem foi:"+this.getTotalPercurso());
    }
}
