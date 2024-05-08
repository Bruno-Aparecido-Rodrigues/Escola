/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Pessoa {
    
    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    
    // Construtores
    
    // Inicializa os atributos vazios
    public Pessoa() {
        this("","","");
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void inserirDadoPessoa(){
        this.setNome(JOptionPane.showInputDialog("INsira seu nome:"));
        this.setNome(JOptionPane.showInputDialog("Insira seu endereço:"));
        this.setNome(JOptionPane.showInputDialog("Insira seu telefone:"));
    }
     public void apresentarPessoa(){
        JOptionPane.showMessageDialog(null, "Olá seu nome é:" + this.getNome() + " seu endereço é:" +this.getEndereco() + " Seu telefone é:"+this.getTelefone());
    }
    }
