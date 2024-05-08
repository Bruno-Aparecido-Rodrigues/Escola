/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_aula1;

import javax.swing.*;//importa a o pacote de janelas, icones//
import java.awt.*; //importa o pacote com cores de fundo container//


public class PrimeiraJanela extends JFrame{//criação da janela//
  public PrimeiraJanela(){
      super("Nossa primeira janela");//título da janela//
        ImageIcon icone = new ImageIcon("src/imagens/icone_maSSA.jpg");
        setIconImage(icone.getImage());
        Container tela = getContentPane();//cria um conteiner com todo o conteúdo dentro//
        tela.setBackground(new Color(255,255,201));//cor de dfundo da tabela//
        setResizable(false);//janela fica não dimensionável//
        setSize(500, 300); // largura (comprimento) e altura//
        setVisible(true);
        setLocationRelativeTo(null);//centraliza a janela na tela do pc//
  }

public static void main(String args[]){
PrimeiraJanela app = new PrimeiraJanela();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } }