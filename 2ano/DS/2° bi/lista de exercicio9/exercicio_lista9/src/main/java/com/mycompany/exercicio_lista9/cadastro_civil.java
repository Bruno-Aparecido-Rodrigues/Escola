/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_lista9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author برونو
 *
 */
public class cadastro_civil extends JFrame{
    JComboBox lista;
    JCheckBox automovel,barcos,aviao;
     JRadioButton feminino,masculino;
    JLabel rotulo1, rotulo2, rotulo3,rotulo4,rotulo5,nome;
    JTextField texto1,texto2;
    JButton limpar,enviar;
    ButtonGroup grupo;
    String  estados[]={"Solteiro(a)","Casado(a)","Divorciado(a)","Viúvo(a)"};
    
    public cadastro_civil() {
    super("Cadastro Civil");
    ImageIcon icone = new ImageIcon("src/imagem/um_civil_nomal.jpg");
    setIconImage(icone.getImage());
    Container tela = getContentPane();
    tela.setLayout(null);
    
    rotulo1 = new JLabel("Nome: ");
    rotulo2 = new JLabel("Idade: ");
    rotulo3 = new JLabel("Sexo: ");
    rotulo4 = new JLabel("Interesses: ");
    rotulo5 = new JLabel("Estado civil: ");
    nome= new JLabel("Bruno Rodrigues-2°DS(AMS)");
    texto1 = new JTextField(20);
    texto2 = new JTextField(5);
    lista = new JComboBox(estados);
    enviar = new JButton("Enviar os Dados");
    limpar = new JButton("Limpar os Dados");
    feminino = new JRadioButton("Feminino");
    masculino = new JRadioButton("Masculino");
    automovel = new JCheckBox("Automóveis");
    barcos = new JCheckBox("Barcos");
    aviao = new JCheckBox("Aviões");
    grupo = new ButtonGroup();
       grupo.add(masculino);
       grupo.add(feminino);
    
      
    //exibe o envio na tela
    enviar.addActionListener( new ActionListener(){
    public void actionPerformed(ActionEvent e){
    //verificar genero e interreses
    String sex ="",interesse ="";   
    if(masculino.isSelected()){sex="Masculino";}
    else if(feminino.isSelected()){sex="Feminino";}
    if(automovel.isSelected()){interesse +="Automóveis ";}
    if(barcos.isSelected()){interesse +="Barcos ";}
    if(aviao.isSelected()){interesse +="Aviões ";}
    
        JOptionPane.showMessageDialog(null, "Seu nome é:" + texto1.getText() + "\n Idade:" + texto2.getText() + "\nSexo:"+sex+"\nInteresses:"+interesse+"\nEstado Civil:"+lista.getSelectedItem().toString());
    }});
    
    
    //limpa os dados da tela
    limpar.addActionListener( new ActionListener(){
    public void actionPerformed(ActionEvent e){
        texto1.setText(null);
        texto2.setText(null);
        grupo.clearSelection();
        automovel.setSelected(false);
        barcos.setSelected(false);
        aviao.setSelected(false);
        lista.setSelectedIndex(-1);
        texto1.requestFocus();
    }});
    
    //atalho de teclado
    limpar.setMnemonic(KeyEvent.VK_L);
    enviar.setMnemonic(KeyEvent.VK_E);
    
    //coloca o local do objeto na tela
    rotulo1.setBounds(30,20,50,20);
    rotulo2.setBounds(30,45,50,20);
    rotulo3.setBounds(30,80,50,20);
    rotulo4.setBounds(30,115,80,20);
    rotulo5.setBounds(30,210,100,20);
    nome.setBounds(310,280,200,20);
    texto1.setBounds(75,20,150,20);
    texto2.setBounds(75,45,60,20);
    masculino.setBounds(75,80,87,20);
    feminino.setBounds(160,80,100,20);
    automovel.setBounds(30,135,100,20);
    barcos.setBounds(30,155,80,20);
    aviao.setBounds(30,175,80,20);
    lista.setBounds(108,210,100,20);
    limpar.setBounds(30,250,130,20);
    enviar.setBounds(163,250,130,20);
     
  
    //adiciona na tela
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(rotulo5);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(feminino);
    tela.add(masculino);
    tela.add(automovel);
    tela.add(barcos);
    tela.add(aviao);
    tela.add(lista);
    tela.add(limpar);
    tela.add(enviar);
    tela.add(nome);
    
    setSize(500,350);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true); 
    }
    
    public static void main(String args[]){
    cadastro_civil app = new cadastro_civil();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    }