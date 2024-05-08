/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraepica;

/**
 *
 * @author dti
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class telaprincipal  extends JFrame{
    //variaveis//
    JMenuBar barra;
    JToolBar barbarra;
    JButton barmais ,barmenos, bardivide, barmultiplica, barsair;
    JMenu opcoes, operacoes;
    JPopupMenu popopcoes;
    JMenuItem somar, multiplicar, subtrair, dividir, sair, popsair, popsobre, sobre;
    ImageIcon imagens[];
    
    public telaprincipal(){
        super("Calculadora");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        //cria os "objetos"//
        
       String icones[]={"imagens/somar.png","imagens/sub.png",
       "imagens/divide.png","imagens/multi.png","imagens/exit.png"};
        imagens = new ImageIcon[6];
        for(int i = 0;i < 5;i++){
        imagens[i] = new ImageIcon(icones[i]);}
        barbarra = new JToolBar("Barra de Ferramentas");
        barmais = new JButton(imagens[0]);
        barmenos = new JButton(imagens[1]);
        bardivide = new JButton(imagens[2]);
        barmultiplica = new JButton(imagens[3]);
        barsair = new JButton(imagens[4]);
        
       //barra de opções cria nome// 
        barra= new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opções");
        barra.add(opcoes);
        somar = new JMenuItem("adição");
        operacoes = new JMenu("Operações");
        sobre = new JMenuItem("Sobre");
        subtrair = new JMenuItem("Subtração");
        dividir = new JMenuItem("Divisão");
        multiplicar = new JMenuItem("Multiplicação");
        sair = new JMenuItem("sair");
        
        //pop up criar nome//
        popopcoes = new JPopupMenu();
        popsobre = new JMenuItem("Sobre");
        popsair = new JMenuItem("Sair");
       
        
        //mensagem em popup quando fica em cima do botão//
        barmais.setToolTipText("Realiza operação de adição");
        barmenos.setToolTipText("Realiza operação de subtração");
        bardivide.setToolTipText("Realiza operação de divisão");
        barmultiplica.setToolTipText("Realiza operação de multiplicação");
        barsair.setToolTipText("Fecha a aplicação");
    


        
        //posiciona na tela//
        barbarra.setBounds(1,1,260,50);
       
//////////deixa o pop up funcionando//////////////
    tela.addMouseListener(new MouseAdapter(){
    public void mouseReleased(MouseEvent e) {
    if(e.isPopupTrigger())
     popopcoes.show(e.getComponent(), e.getX(), e.getY());}});
     Tratador tratmenu = new Tratador ();
     popsobre.addActionListener(tratmenu);
     popsair.addActionListener(tratmenu);
      
     //funcionalidade aos botões e aos botões do menu//

      sair.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
         int opcao;
          Object[]botoes={"Sim","Não"};
          opcao = JOptionPane.showInternalOptionDialog(null, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
          if(opcao==JOptionPane.YES_OPTION) System.exit(0);  }});
      
      //abre a tela de soma
      somar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      soma somar = new soma(null,"Adição",true);
      somar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      somar.setVisible(true);}});
           
      //abre a tela de substrair
      subtrair.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      subtrair subtrai = new subtrair(null,"Subtração",true);
      subtrai.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      subtrai.setVisible(true);}});
      
      //abre a tela de dividir
      dividir.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      dividir divide = new dividir(null,"Divisão",true);
      divide.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      divide.setVisible(true);}});
      
      //abre a tela de multiplicar
      multiplicar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      multiplicar multi = new  multiplicar(null,"Multiplicação",true);
      multi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      multi.setVisible(true);}});
      
      //abre a tela de Sobre
      sobre.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      sobre sob = new  sobre(null,"Sobre",true);
      sob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      sob.setVisible(true);}});
      
            popsobre.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      sobre sob = new  sobre(null,"Sobre",true);
      sob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      sob.setVisible(true);}});
           //funcionalidade aos botões e aos botões da tool bar//

      barsair.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
          int opcao;
          Object[]botoes={"Sim","Não"};
          opcao = JOptionPane.showInternalOptionDialog(null, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
          if(opcao==JOptionPane.YES_OPTION) System.exit(0);  }});
           
      //abre a tela de soma
      barmais.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      soma somar = new soma(null,"Adição",true);
      somar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      somar.setVisible(true);}});
           
      //abre a tela de substrair
      barmenos.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      subtrair subtrai = new subtrair(null,"Subtração",true);
      subtrai.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      subtrai.setVisible(true);}});
      
      //abre a tela de dividir
      bardivide.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      dividir divide = new dividir(null,"Divisão",true);
      divide.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      divide.setVisible(true);}});
      
      //abre a tela de multiplicar
      barmultiplica.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      multiplicar multi = new  multiplicar(null,"Multiplicação",true);
      multi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      multi.setVisible(true);}});
      
      
      
        //atalhos de tecla//
        opcoes.setMnemonic(KeyEvent.VK_O);
        sair.setMnemonic(KeyEvent.VK_S);
        somar.setMnemonic(KeyEvent.VK_M);
 
       
        
        //adicona na tela//
        opcoes.add(operacoes);
        operacoes.add(somar);
        operacoes.add(subtrair);
        operacoes.add(dividir);
        operacoes.add(multiplicar);
        opcoes.add(sobre);
        opcoes.addSeparator();
        opcoes.add(sair);
        popopcoes.add(popsobre);
        popopcoes.addSeparator();
        popopcoes.add(popsair);
        barbarra.add(barmais);
        barbarra.add(barmenos);
        barbarra.add(bardivide);
        barbarra.add(barmultiplica);
        barbarra.addSeparator();
        barbarra.add(barsair);
        tela.add(barbarra);
        
        
        //tamanho da tela e outros//
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
    public static void main (String args[]){
        telaprincipal app = new telaprincipal();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Tratador implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
           if(e.getSource()==popsair){
             int opcao;
             Object[]botoes={"Sim","Não"};
             opcao = JOptionPane.showInternalOptionDialog(null, "Deseja mesmo sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
             if(opcao==JOptionPane.YES_OPTION)
             System.exit(0);
           else{
               if(e.getSource()==popsobre){
               sobre sob = new  sobre(null,"Sobre",true);
               sob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               sob.setVisible(true);}}}
           }};
}    


    