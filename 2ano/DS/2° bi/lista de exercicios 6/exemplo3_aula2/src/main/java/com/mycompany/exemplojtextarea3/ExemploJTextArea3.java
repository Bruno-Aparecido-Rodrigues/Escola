/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojtextarea3;

/**
 *
 * @author Bruno
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


   public class ExemploJTextArea3 extends JFrame{
    JLabel rotulo;
    JTextArea texto;
    JScrollPane painelrolagem;
    JPanel painel;
   public ExemploJTextArea3(){
   super("Exemplo com JTextField");//nome da janela//
     Container tela = getContentPane();//cria container//
     tela.setLayout(null);//limpa a janela//
     rotulo = new JLabel ("Endereço");//cria texto//
     rotulo.setBounds(50,20,100,20);
     texto = new JTextArea(10,20);//cria caixa de texto//   
     painelrolagem = new JScrollPane(texto);//cria painel de rolagem na caixa de texto//
     painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//adiciona a barra vertical//
     painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//adiciona a barra horizontal//
     painel = new JPanel();//junta todos os conteúdos 'caixa de texto/barra de rolagem'//
     painel.add(painelrolagem);
     painel.setBounds(40,40,250,250);
     texto.setBackground(Color.yellow);
     tela.add(rotulo);
     tela.add(painel);
     setSize(300, 280);
     setVisible(true);
     setLocationRelativeTo(null);
    }
   public static void main(String args[]){
   ExemploJTextArea3 app = new ExemploJTextArea3();
   app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}