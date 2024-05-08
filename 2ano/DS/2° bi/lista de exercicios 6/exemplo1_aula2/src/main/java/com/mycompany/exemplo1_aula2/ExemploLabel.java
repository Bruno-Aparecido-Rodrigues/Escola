/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1_aula2;

import javax.swing.*;//importa a o pacote de janelas, icones//
import java.awt.*; //importa o pacote com cores de fundo container//

/**
 *
 * @author Bruno
 */
public class ExemploLabel extends JFrame {
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,imagem;//criação dos textos que aparecem quando abre//
    JTextField texto1,texto2,texto3,texto4;//criação da caixa de texto (onde c digita)//
    public ExemploLabel(){
        super("Exemplo com Label");//tabela//
        Container tela = getContentPane();
        setResizable(false);//janela fica não dimensionável//
        setLayout(null);//limpa todo o conteúdo na janela//
        //criação do conteúdo na janela//
        ImageIcon icone = new ImageIcon("src/rato.jpg");
        rotulo1 = new JLabel ("Nome");//criação dos textos fixos//
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        texto1 = new JTextField(50);//criação das caixas de textos e definindo seus tamanhos//
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        imagem = new JLabel(icone);
        rotulo1.setBounds(50,20,80,20);//posiciona na tela //
        rotulo2.setBounds(50,60,80,20);//posiciona na tela //
        rotulo3.setBounds(50,100,80,20);//posiciona na tela //
        rotulo4.setBounds(50,140,80,20);//posiciona na tela //
        texto1.setBounds(120,20,200,20);//posiciona na tela //
        texto2.setBounds(120,60,20,20);//posiciona na tela //
        texto3.setBounds(120,100,80,20);//posiciona na tela //
        texto4.setBounds(120,140,80,20);//posiciona na tela //
        imagem.setBounds(160,200,400,400);
        rotulo1.setForeground(Color.red);//define a cor do texto//
        rotulo2.setForeground(Color.blue);//define a cor do texto//
        rotulo3.setForeground(new Color(190,152,142));//define a cor do texto//
        rotulo4.setForeground(new Color(201,200,100));//define a cor do texto//
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));//Define a fonte//
        rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));//Define a fonte//
        rotulo3.setFont(new Font("Comic Sans MS",Font.BOLD,16));//Define a fonte//
        rotulo4.setFont(new Font("Comic Sans MS",Font.BOLD,16));//Define a fonte//
        //adiciona na janela//
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(imagem);
        setSize(800,700);//define tamanho da janela//
        setVisible(true);//mostra tudo que esta dentro da janela//
        setLocationRelativeTo(null);//deixa centralizado no pc//
    }
    public static void main(String args[]){
        ExemploLabel app = new ExemploLabel();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
