/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraepica;

/**
 *
 * @author bruno
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sobre extends JDialog{
        JButton sair;
        JLabel rotulo1, rotulo2;
        
        public sobre(Frame owner, String title, boolean modal){
        super(owner,title,modal);
        
          Container tela1 = getContentPane();
          tela1.setLayout(null);
          
          rotulo1 = new JLabel("Feito por: Bruno Aparecido 2°DS(AMS)");
          rotulo2 = new JLabel("Entregue: 19/06/2023");
          sair = new JButton("Voltar");
          
          rotulo1.setBounds(50,70,300,20);
          rotulo2.setBounds(50,90,300,20);          
          sair.setBounds(135,250,100,20);
          
          TBsair tsair = new TBsair();
          
          tela1.add(rotulo1);
          tela1.add(rotulo2);
          tela1.add(sair);
          sair.addActionListener(tsair);
          
          setSize(400,400);
          setLocationRelativeTo(null);
          setResizable(false);
}
        
        private class TBsair implements ActionListener{
        public void actionPerformed(ActionEvent evento){
         setVisible(false);
         dispose();}}}
