/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo4_aula3;

/**
 *
 * @author Bruno
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo4_aula3 extends JFrame{
   JLabel rotulo1, rotulo2;
   JTextField texto1,texto2;
   JButton limpar;
public Exemplo4_aula3(){
   super("Exemplo Limpar");
    Container tela = getContentPane();
    setLayout(null);
     rotulo1 = new JLabel("1º Número: ");
     rotulo2 = new JLabel("2º Número: ");
     texto1 = new JTextField(5);
     texto2 = new JTextField(5);
     limpar = new JButton("Limpar");
     rotulo1.setBounds(50,20,100,20);
     rotulo2.setBounds(50,60,100,20);
     texto1.setBounds(120,20,200,20);
     texto2.setBounds(120,60,200,20);
     limpar.setBounds(150,100,80,20);
     limpar.addActionListener(
      new ActionListener(){
         public void actionPerformed(ActionEvent e){
      texto1.setText(null);
      texto2.setText(null);
      texto1.requestFocus();
    }
  }
);
tela.add(rotulo1);
tela.add(rotulo2);
tela.add(texto1);
tela.add(texto2);
tela.add(limpar);
setSize(400, 250);
setVisible(true);
setLocationRelativeTo(null);

}
public static void main(String args[]){ 
    Exemplo4_aula3 app = new Exemplo4_aula3();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}