/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emeplonome_orientadobj;

/**
 *
 * @author Bruno
 */
public class Usuario {
    
    // Atributos
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    // Construtores
    
    // Inicializa os atributos vazios
    public Usuario() {
        //Todo auto-generated constructor stub
        this("","","","");
    }
    
    //inicializa os atributos através de passagens de parãmetros
    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

 //getter setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void provarExistencia(){
        System.out.println("Oi, meu nome é " + this.getNome() + ", e eu existo!");
    }
    
}
 
