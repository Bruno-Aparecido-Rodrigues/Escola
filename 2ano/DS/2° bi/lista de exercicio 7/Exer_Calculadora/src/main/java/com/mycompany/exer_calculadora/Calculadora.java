/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer_calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Bruno
 */
public class Calculadora extends JFrame{
    JLabel rotulo1, rotulo2,result,resucor, assinado;
    JTextField texto1,texto2;
    JButton somar, subtrair, multiplicar, dividir, desabilitar, habilitar, ocultar, exibir, sair, limpar;
    
    public Calculadora(){
       super("Calculadora");
       ImageIcon icone = new ImageIcon("src/imagem/calcu.jpg");
       setIconImage(icone.getImage());
       Container tela = getContentPane();
       setLayout(null);
       //criando as coisas//
       rotulo1 = new JLabel("1° Número");
       rotulo2 = new JLabel("2° Número");
       assinado = new JLabel("Desenvolvido por: Bruno A. -2°DS(AMS)");
       texto1 = new JTextField(5);
       texto2 = new JTextField(5);
       result = new JLabel("");
       resucor = new JLabel("");
       somar = new JButton("+");
       subtrair = new JButton("-");
       multiplicar = new JButton("*");
       dividir = new JButton("/");
       desabilitar = new JButton("Desabilitar"); 
       habilitar = new JButton("Habilitar");
       limpar = new JButton("Limpar");
       ocultar = new JButton("Ocultar");
       exibir = new JButton("Exibir");
       sair = new JButton("Sair");
     //posicionamento na tela//  
       rotulo1.setBounds(50, 20, 100, 20); 
       rotulo2.setBounds(50, 60, 100, 20);
       assinado.setBounds(50, 280, 300, 20); 
       texto1.setBounds(120, 20, 90, 20); 
       texto2.setBounds(120, 60, 90, 20);
       result.setBounds(122, 100, 200, 20);
       resucor.setBounds(50,100, 100, 20);
       somar.setBounds(300, 20, 80, 20);
       subtrair.setBounds(300, 40, 80, 20);
       multiplicar.setBounds(300, 60, 80, 20); 
       dividir.setBounds(300, 80, 80, 20);
       limpar.setBounds(300,100,100,20);
       desabilitar.setBounds(140,200,100,20); 
       habilitar.setBounds(50,200,90,20);
       ocultar.setBounds(240,200,80,20);
       exibir.setBounds(320, 200, 80, 20);
       sair.setBounds(300, 240, 100, 20);
       
       //teclas de atalho//
       exibir.setMnemonic(KeyEvent.VK_E);
       ocultar.setMnemonic(KeyEvent.VK_O);
       limpar.setMnemonic(KeyEvent.VK_L);
       habilitar.setMnemonic(KeyEvent.VK_H);
       desabilitar.setMnemonic(KeyEvent.VK_D);
       sair.setMnemonic(KeyEvent.VK_S);
       
       //fonte e cor do resultado//
       result.setFont(new Font("Comic Sans MS",Font.BOLD,13));
       resucor.setFont(new Font("Comic Sans MS",Font.BOLD,13));
       resucor.setForeground(Color.red);
       
    //soma//   
     somar.addActionListener(
        new ActionListener(){
         public void actionPerformed(ActionEvent e){
         int numero1, numero2, soma;
         soma=0;
         numero1 = Integer.parseInt(texto1.getText());
         numero2 = Integer.parseInt(texto2.getText());
         soma = numero1 + numero2;
         resucor.setVisible(true);
         resucor.setText("Resultado::");
         result.setVisible(true);
         result.setText("A soma é: " +soma);
         }   
        }
     );  
     //subtração//
         subtrair.addActionListener(
        new ActionListener(){
         public void actionPerformed(ActionEvent e){
         int numero1, numero2, menos;
         menos=0;
         numero1 = Integer.parseInt(texto1.getText());
         numero2 = Integer.parseInt(texto2.getText());
         menos = numero1 - numero2;
         resucor.setVisible(true);
         resucor.setText("Resultado::");
         result.setVisible(true);
         result.setText("A subtração é: " +menos);
         }   
        }
     );  
      //multiplicação//   
          multiplicar.addActionListener(
        new ActionListener(){
         public void actionPerformed(ActionEvent e){
         int numero1, numero2, multi;
         multi=0;
         numero1 = Integer.parseInt(texto1.getText());
         numero2 = Integer.parseInt(texto2.getText());
         multi = numero1 * numero2;
         resucor.setVisible(true);
         resucor.setText("Resultado::");
         result.setVisible(true);
         result.setText("A multiplicação é: " +multi);
         }   
        }
     );  
      //divisão//       
         dividir.addActionListener(
        new ActionListener(){
         public void actionPerformed(ActionEvent e){
         int numero1, numero2, divide;
         divide=0;
         numero1 = Integer.parseInt(texto1.getText());
         numero2 = Integer.parseInt(texto2.getText());
         divide = numero1 / numero2;
         resucor.setVisible(true);
         resucor.setText("Resultado::");
         result.setVisible(true);
         result.setText("A divisão é: " +divide);
         }   
        }
     );  
         //ocultar//
        ocultar.addActionListener(
     new ActionListener(){
        public void actionPerformed(ActionEvent e){
           resucor.setVisible(false);
           result.setVisible(false);
        }
     }
);
        //exibir//
          exibir.addActionListener(
      new ActionListener(){
       public void actionPerformed(ActionEvent e){
         resucor.setVisible(true);
         result.setVisible(true);
}
}
);
     //limpar//
          limpar.addActionListener(
      new ActionListener(){
         public void actionPerformed(ActionEvent e){
      texto1.setText(null);
      texto2.setText(null);
      texto1.requestFocus();
      resucor.setText(null);
      result.setText(null);
    }
  }
);
    //desabilitar//
    desabilitar.addActionListener(
   new ActionListener(){
    public void actionPerformed(ActionEvent e){
     result.setEnabled(false);
     resucor.setEnabled(false);
    }
   }
);
    //habilitar//
    habilitar.addActionListener(
   new ActionListener(){
    public void actionPerformed(ActionEvent e){
     result.setEnabled(true);
     resucor.setEnabled(true);
   }
  }
);
      //sair//
      sair.addActionListener(
                 new ActionListener(){
             public void actionPerformed(ActionEvent e){
             System.exit(0);}
         });
      
     result.setVisible(false);
     
     tela.add(rotulo1); 
     tela.add(rotulo2);
     tela.add(assinado);
     tela.add(texto1); 
     tela.add(texto2);
     tela.add(result);
     tela.add(resucor);
     tela.add(somar);
     tela.add(subtrair);
     tela.add(multiplicar);
     tela.add(dividir);
     tela.add(limpar);
     tela.add(desabilitar);
     tela.add(habilitar);
     tela.add(ocultar);
     tela.add(exibir);
     tela.add(sair);
  
     setSize(450, 355);
     setVisible(true);
     setLocationRelativeTo(null);
    }
    public static void main(String args[]){
    Calculadora app = new Calculadora();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}