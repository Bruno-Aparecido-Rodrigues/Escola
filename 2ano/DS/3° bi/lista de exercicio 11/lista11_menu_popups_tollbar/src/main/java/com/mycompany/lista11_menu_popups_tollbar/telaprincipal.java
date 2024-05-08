/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista11_menu_popups_tollbar;

/**
 *
 * @author Brunors
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class telaprincipal  extends JFrame{
    //variaveis//
    JMenuBar barra;
    JToolBar barbarra;
    JButton bardireita,baresquerda,barcentralizar,barecortar,barcopiar,barcolar;
    JMenu opcoes,cor,fonte;
    JPopupMenu popopcoes;
    JMenuItem somar,limpar,sair,azul,verde,vermelho,amarelo,preto,poprecortar,popcopiar,popcolar;
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    ImageIcon imagens[];
    
    public telaprincipal(){
        super("Exemplo de Menus");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        //cria os "objetos"//
       String icones[]={"imagens/direita-imagem.png","imagens/esquerda-imagem.png",
       "imagens/centro-imagem.png","imagens/recortar-imagem.png",
       "imagens/copy.png","imagens/paste.png"};
        imagens = new ImageIcon[6];
        for(int i = 0;i < 6;i++){
        imagens[i] = new ImageIcon(icones[i]);}
        barbarra = new JToolBar("Barra de Ferramentas");
        bardireita = new JButton(imagens[0]);
        baresquerda = new JButton(imagens[1]);
        barcentralizar = new JButton(imagens[2]);
        barecortar = new JButton(imagens[3]);
        barcopiar = new JButton(imagens[4]);
        barcolar = new JButton(imagens[5]);
        barra= new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opções");
        barra.add(opcoes);
        somar = new JMenuItem("Somar");
        limpar = new JMenuItem("Limpar");
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");
        sair = new JMenuItem("sair");
        Tratador tratmenu = new Tratador();
        popopcoes = new JPopupMenu();
        poprecortar = new JMenuItem("Recortar");
        popcopiar = new JMenuItem("Copiar");
        popcolar = new JMenuItem("Colar");
        texto = new JTextArea(10,20);
        rolagem = new JScrollPane(texto);
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
       
        
        //mensagem em popup quando fica em cima do botão//
        bardireita.setToolTipText("Direita (Ctrl+d)");
        baresquerda.setToolTipText("Esquerda (Ctrl+e)");
        barcentralizar.setToolTipText("Centralizar (Ctrl+z)");
        barecortar.setToolTipText("Recortar (Ctrl+x)");
        barcopiar.setToolTipText("Copiar (Ctrl+c)");
        barcolar.setToolTipText("Colar (Ctrl+v)");

        
        //troca a cor de fundo das dicas do botão da barra de ferramentas//
        UIManager.put("ToolTip.background",SystemColor.info);
        UIManager.put("ToolTip.foreground",Color.blue);

        
        //posiciona na tela//
        painel.setBounds(30,100,250,250);
        barbarra.setBounds(1,1,260,50);
       
        
      //Aplicar o efeito Rollover aos botões da barra de ferramentas:
      barbarra.setRollover(true); 
      
      
        //funcionalidade aos botões e aos botões do menu//
      texto.addMouseListener(new MouseAdapter(){ 
      public void mouseReleased(MouseEvent e){
          if(e.isPopupTrigger())
          popopcoes.show(e.getComponent(),e.getX(),e.getY()); }});  
      
      limpar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         texto.setText("");
         texto.requestFocus();}});
       
      azul.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         texto.setForeground(Color.blue);
         repaint();}});

      verde.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         texto.setForeground(Color.green);
         repaint();}});

      vermelho.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         texto.setForeground(Color.red);
         repaint();}});
      
      amarelo.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         texto.setForeground(Color.yellow);
         repaint();}});

      preto.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         texto.setForeground(Color.black); 
         repaint();}});

      sair.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){ 
        System.exit(0);  }});
      
      
      //abre a segunda janela
      somar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      segundatabela segundajanela = new segundatabela(null,"Segunda Janela",true);
      segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      segundajanela.setVisible(true);
}
}
);
     
      
        //atalhos de tecla//
        opcoes.setMnemonic(KeyEvent.VK_O);
        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);
        somar.setMnemonic(KeyEvent.VK_M);
        poprecortar.setMnemonic(KeyEvent.VK_R); 
        popcopiar.setMnemonic(KeyEvent.VK_C);
        popcolar.setMnemonic(KeyEvent.VK_L);
       
        
        //adicona na tela//
        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.add(somar);
        opcoes.addSeparator();
        opcoes.add(sair);
        poprecortar.addActionListener(tratmenu);
        popcopiar.addActionListener(tratmenu);
        popcolar.addActionListener(tratmenu);
        popopcoes.add(poprecortar);
        popopcoes.add(popcopiar);
        popopcoes.addSeparator();
        popopcoes.add(popcolar);
        fonte.add(cor);
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);
        painel.add(rolagem);
        tela.add(painel);
        barbarra.setRollover(true);
        barbarra.add(bardireita);
        barbarra.add(baresquerda);
        barbarra.add(barcentralizar);
        barbarra.addSeparator();
        barbarra.add(barecortar);
        barbarra.add(barcopiar);
        barbarra.add(barcolar);
        tela.add(barbarra);
        
        
        //tamanho da tela e outros//
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main (String args[]){
        telaprincipal app = new telaprincipal();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class Tratador implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==poprecortar)
      texto.cut();
      if(e.getSource()==popcopiar)
      texto.copy();
      if(e.getSource()==popcolar) 
      texto.paste();
      repaint(); }}
}

