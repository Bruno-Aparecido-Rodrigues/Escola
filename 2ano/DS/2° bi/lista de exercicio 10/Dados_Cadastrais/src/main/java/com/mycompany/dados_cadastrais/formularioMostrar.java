
package com.mycompany.dados_cadastrais;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author Brunola
 */
public class formularioMostrar extends JFrame {
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,lblNome,lblmatric,lblrestr,lblperi,lblcurso,lblserie,nomemeu;
    JButton voltar,sair;
    public formularioMostrar(String nomer, String matr, String restr, String period, String  curso, String serie){
      
    super ("Apresentação dos dados");
    ImageIcon icone = new ImageIcon("src/imagens/patreco.jpg");
    setIconImage(icone.getImage());
    Container tela = getContentPane();
    setLayout(null);    
      rotulo1 = new JLabel ("Nome:: ");
      rotulo2 = new JLabel ("Mátricula:: ");
      rotulo3 = new JLabel ("Curso:: ");
      rotulo4 = new JLabel ("Série:: ");
      rotulo5 = new JLabel ("Periodo:: ");
      rotulo6 = new JLabel ("Restrições Médicas:: ");
      nomemeu = new JLabel("Bruno Rodrigues-2°DS(AMS)");
      lblNome = new JLabel ("");
      lblmatric = new JLabel ("");
      lblrestr = new JLabel ("");
      lblperi = new JLabel ("");
      lblcurso = new JLabel ("");
      lblserie = new JLabel ("");
      lblNome.setText(nomer);
      lblmatric.setText(matr);
      lblrestr.setText(restr);
      lblperi.setText(period);
      lblcurso.setText(curso);
      lblserie.setText(serie);
      voltar = new JButton("Voltar");
      sair = new JButton("Sair");
      
      //posiciona na tela
      rotulo1.setBounds(30,30,350,20);
      rotulo2.setBounds(30,50,350,20);
      rotulo3.setBounds(30,70,350,20);
      rotulo4.setBounds(30,90,350,20);
      rotulo5.setBounds(30,110,350,20);
      rotulo6.setBounds(30,130,350,20);
      lblNome.setBounds(80,30,350,20);
      lblmatric.setBounds(90,50,350,20);
      lblcurso.setBounds(75,70,350,20);
      lblserie.setBounds(75,90,350,20);
      lblperi.setBounds(85,110,350,20);
      lblrestr.setBounds(160,130,350,20);
      voltar.setBounds(30, 200, 70, 30);
      sair.setBounds(185,200,60,30);
      nomemeu.setBounds(30,230,200,20);
    //botão sair (abre uma tela de confirmação se deseja sair/fecha o app)
    sair.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
        int opcaosair;
        Object[]botoessair={"Sim","Não"};
        opcaosair = JOptionPane.showOptionDialog(null,"Você deseja mesmo sair?","Fehcar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoessair,botoessair[0]);
    if(opcaosair==JOptionPane.YES_NO_OPTION)System.exit(0);}});
    
    
      //botão voltar (volta pro form 1 e abre o mesmo
       voltar.addActionListener(new ActionListener(){ 
       public void actionPerformed(ActionEvent e){
      FormularioCadastrar volta = new FormularioCadastrar();
      volta.setVisible(true);//mostra o form 1
      dispose();//some form 2
      }});
     
    //adiciona na tela
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(rotulo5);
    tela.add(rotulo6);
    tela.add(lblcurso);
    tela.add(lblNome);
    tela.add(lblmatric);
    tela.add(lblserie);
    tela.add(lblrestr);
    tela.add(lblperi);
    tela.add(voltar);
    tela.add(sair);
    tela.add(nomemeu);
    setSize(300,300);
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);
}}