/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Util 
{
    private String nome = "";
    
    
    public Util()
    {
        System.out.println("Passei pelo construtor da classe Util"); 
    }

    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void digitarTexto()
    {
        this.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    }
    
    public void exibirTexto()
    {
        JOptionPane.showMessageDialog(null , "Uhuu Meu nome é: " + this.getNome());
    }
}
