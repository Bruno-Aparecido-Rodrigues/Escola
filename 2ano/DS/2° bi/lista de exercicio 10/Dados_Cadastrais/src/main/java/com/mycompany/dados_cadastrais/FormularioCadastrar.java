/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dados_cadastrais;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author Брунола
 */
public class FormularioCadastrar extends JFrame{
  
   //criação das variáveis //
    JComboBox lista;
    JRadioButton jrse1,jrse2,jrse3,jretim,jrmtec,jrtec;
    JLabel rotulo0,rotulo1, rotulo2, rotulo3,rotulo4,nome;
    JTextField texto1,texto2;
    JTextArea textorola;
    JScrollPane painelrolagem;
    JPanel painel;
    JButton apresentar,limpar,sair;
    ButtonGroup grupo1,grupo2;
     String  turno[]={"Selecionar","Matutino","Vespertino","Nortuno"};

    public FormularioCadastrar() {
    super("Cadastro do Aluno");
    ImageIcon icone = new ImageIcon("src/imagens/bobesponcha.jpg");
    setIconImage(icone.getImage());
    Container tela = getContentPane();
    tela.setLayout(null);
    
    rotulo0 = new JLabel ("Dados Cadstrais do Aluno");
    rotulo1 = new JLabel ("Nome:: ");
    rotulo2 = new JLabel ("Mátricula:: ");
    rotulo3 = new JLabel ("informe os dados do seu curso:: ");
    rotulo4 = new JLabel ("Restrições Médicas:: ");
    nome= new JLabel("Bruno Rodrigues-2°DS(AMS)");
    limpar = new JButton("Limpar");
    sair = new JButton("Sair");
    apresentar = new JButton ("Apresentar Dados");
    jrse1 = new JRadioButton("1ªsérie");
    jrse2 = new JRadioButton("2ªsérie");
    jrse3 = new JRadioButton("3ªsérie");
    jretim = new JRadioButton("Etim");
    jrmtec = new JRadioButton("Mtec");
    jrtec = new JRadioButton("Técnico");
    lista = new JComboBox(turno);
    texto1 = new JTextField(20);
    texto2 = new JTextField(5);
    textorola = new JTextArea(7,18);//cria caixa de texto//   
    painelrolagem = new JScrollPane(textorola);//cria painel de rolagem na caixa de texto//
    painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//adiciona a barra horizontal//
    painel = new JPanel();
    painel.add(painelrolagem);//junta todos os conteúdos 'caixa de texto/barra de rolagem'//
     grupo1 = new ButtonGroup();
       grupo1.add(jrmtec);
       grupo1.add(jretim);
       grupo1.add(jrtec);
     grupo2 = new ButtonGroup();
       grupo2.add(jrse1);
       grupo2.add(jrse2);
       grupo2.add(jrse3);
    
       
    //posiciona na tela
    rotulo0.setBounds(140,15,250,20);
    rotulo1.setBounds(30,50,100,20);
    texto1.setBounds(130,50, 250, 20);
    rotulo2.setBounds(30, 75, 100, 20);
    texto2.setBounds(130,75,60,20);
    rotulo3.setBounds(30,115,190,20);
    rotulo4.setBounds(40,245,130,20);
    jretim.setBounds(33,145,60,20);
    jrmtec.setBounds(33,170,60,20);
    jrtec.setBounds(33,195,70,20);
    jrse1.setBounds(153,145,70,20);
    jrse2.setBounds(153,170,70,20);
    jrse3.setBounds(153,195,70,20);
    lista.setBounds(223, 145, 110, 20);
    painel.setBounds(146, 235, 250, 160);
    apresentar.setBounds(70,415,140,28);
    limpar.setBounds(240,415,75,28);
    sair.setBounds(355,415,60,28);
    nome.setBounds(30,445,200,20);
    
     //fonte e tamanho//
       rotulo0.setFont(new Font("Comic Sans MS",Font.BOLD,18));
   
    
     //botão limpar limpa(os dados da tela)
    limpar.addActionListener( new ActionListener(){
    public void actionPerformed(ActionEvent e){
        texto1.setText(null);
        texto2.setText(null);
        textorola.setText(null);
        grupo1.clearSelection();
        grupo2.clearSelection();
        jrse1.setSelected(false);
        jrse2.setSelected(false);
        jrse3.setSelected(false);
        jrmtec.setSelected(false);
        jretim.setSelected(false);
        jrtec.setSelected(false);
        lista.setSelectedIndex(0);
        texto1.requestFocus();
    }});
    
   
    //botão sair (abre uma tela de confirmação se deseja sair/fecha o app)
    sair.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
        int opcaosair;
        Object[]botoessair={"Sim","Não"};
        opcaosair = JOptionPane.showOptionDialog(null,"Você deseja mesmo sair?","Fehcar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoessair,botoessair[0]);
    if(opcaosair==JOptionPane.YES_NO_OPTION)System.exit(0);}});
    
    
    //botão apresentar dadoa(manda oq vc escreveu para um outro form e apresenta na tela como rotulos)
    apresentar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        //cria as váriaveis de q represetam oq foi enviado(texot, listbox...)
        String cursop="", seriep="";
        
        String nomep=texto1.getText();
        String matricp=texto2.getText();
        String restrip=textorola.getText();
        
        String periodop=lista.getSelectedItem().toString(); //pega o item selecionado na caixa de turno "noite dia .....") 
 
        if(jrse1.isSelected())
            seriep = jrse1.getText();
        else if(jrse2.isSelected())
            seriep = jrse2.getText();
        else if(jrse3.isSelected())
            seriep = jrse3.getText();
        else 
            seriep = null;
        if(jretim.isSelected())
            cursop = jretim.getText();
        else if(jrmtec.isSelected())
            cursop = jrmtec.getText();
        else if (jrtec.isSelected())
            cursop = jrtec.getText();
        else
            cursop = null;
        
      //tratamento de erroif(nomep=="" && matricp=="" && restrip=="")
      if(((seriep == null)||(cursop == null)||(texto1.getText().isEmpty())||(texto2.getText().isEmpty())||(lista.getSelectedItem()== "Selecionar"))){
       JOptionPane.showMessageDialog(null,"Algo não foi preenchido por favor verifique e tente novamente","Mensagem de Aviso",JOptionPane.WARNING_MESSAGE,null);}
      else{      
      //envia tudo para o form 2 e abre o mesmo
      formularioMostrar mostra = new formularioMostrar(nomep,matricp,restrip,periodop,cursop,seriep);
      mostra.setVisible(true);//mostra o form 2
      dispose();//some form 1
    }}});
    
    //adiciona na tela
    tela.add(rotulo0);
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(nome);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(painel);
    tela.add(limpar);
    tela.add(sair);
    tela.add(lista);
    tela.add(jrtec);
    tela.add(jrmtec);
    tela.add(jretim);
    tela.add(jrse1);
    tela.add(jrse2);
    tela.add(jrse3);
    tela.add(apresentar);
    
    setSize(530,510);
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);
    }
  
    public static void main(String args[])
    {
        FormularioCadastrar app = new FormularioCadastrar();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
