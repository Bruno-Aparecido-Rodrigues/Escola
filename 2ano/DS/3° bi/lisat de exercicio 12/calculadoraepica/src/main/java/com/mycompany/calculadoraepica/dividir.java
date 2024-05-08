/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraepica;

/**
 *
 * @author brunor
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dividir extends JDialog{
    //criação das variaveis//
    JButton sair, limpar;
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton div2n;

    public dividir(Frame owner, String title, boolean modal){
        super(owner,title,modal);
          Container tela1 = getContentPane();
          tela1.setLayout(null);
          
           // layout do formulário
           rotulo1 = new JLabel("1º Número: ");
           rotulo2 = new JLabel("2º Número: ");
           texto1 = new JTextField(5);
           texto2 = new JTextField(5); 
           exibir = new JLabel("");
           div2n = new JButton("Dividir");
           sair = new JButton("Voltar");
           limpar = new JButton("Limpar");
           
           //posição na tela//
           rotulo1.setBounds(50,20,100,20);
           rotulo2.setBounds(50,60,100,20);
           texto1.setBounds(120,20,200,20);
           texto2.setBounds(120,60,200,20);
           exibir.setBounds(50,140,200,20);
           div2n.setBounds(150,100,80,20);
           sair.setBounds(50,250,100,20);
           limpar.setBounds(180, 250, 100, 20);
           
           //botão//
           div2n.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
             int numero1, numero2, div;
             div = 0;
             numero1 = Integer.parseInt(texto1.getText());
             numero2 = Integer.parseInt(texto2.getText());
             div = numero1 / numero2;
             exibir.setVisible(true);
             exibir.setText("A divisão é: "+div);}});
           
           limpar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){ 
            texto1.setText(null);
            texto2.setText(null);
            exibir.setText(null);
            texto1.requestFocus();}});           
           
           TBsair tsair = new TBsair();

           //adiciona na tela
            
           exibir.setVisible(false);
           tela1.add(rotulo1);
           tela1.add(rotulo2); 
           tela1.add(texto1);
           tela1.add(texto2);
           tela1.add(exibir);
           tela1.add(div2n);
           tela1.add(sair);
           tela1.add(limpar);
           sair.addActionListener(tsair);



setSize(400,400);
setLocationRelativeTo(null);
}

private class TBsair implements ActionListener{
public void actionPerformed(ActionEvent evento){
setVisible(false);
dispose();}}}
