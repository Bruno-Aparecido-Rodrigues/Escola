package controle;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.UIManager;

public class menu extends JFrame
{
   JMenuBar barra;
   JMenu funcionariomenu,clientemenu,produtomenu,info;
   JMenuItem sairmenu,sobre;
   JButton funcionariob, clienteb, produtob, sairb,voltarb;
   ImageIcon imagem[];
   public menu()
   {
    super("Menu de Gerenciamento");
    Container tela = getContentPane();
    tela.setLayout(null);
    barra = new JMenuBar();
    setJMenuBar(barra);
    
    String icones[]={"imagens/user.png","imagens/return.png","imagens/exit.png"};
    imagem = new ImageIcon[8];
    for(int i = 0;i<3;i++)
        {
        imagem[i] = new ImageIcon(icones[i]);
        }
    
    info = new JMenu("Info");
    clientemenu = new JMenu("Cliente");
    funcionariomenu = new JMenu("Funcionário");
    produtomenu = new JMenu("Produto");
    clienteb = new JButton ("Cliente");
    funcionariob = new JButton ("Funcionário");
    produtob = new JButton ("Produto"); 
    sairb = new JButton(imagem[2]);
    voltarb = new JButton(imagem[1]);
    
    barra.add(Box.createVerticalStrut(1));
    barra.add(clientemenu);
    barra.add(Box.createVerticalStrut(1));
    barra.add(funcionariomenu);
    barra.add(Box.createVerticalStrut(1));
    barra.add(produtomenu);
    barra.add(Box.createVerticalStrut(1));
    barra.add(info);
    barra.add(Box.createVerticalStrut(1));
    
    sobre = new JMenuItem("Devs");
    sairmenu = new JMenuItem("Sair");
    
    //atalhos
     funcionariob.setMnemonic(KeyEvent.VK_F);
     clienteb.setMnemonic(KeyEvent.VK_C);
     produtob.setMnemonic(KeyEvent.VK_P);
     sobre.setMnemonic(KeyEvent.VK_D);
     sairb.setMnemonic(KeyEvent.VK_S);

    ////////////posiciona na tela os conteudos////////////////

    clienteb.setBounds(60,300,100,50);
    funcionariob.setBounds(240,300,100,50);
    produtob.setBounds(420,300,100,50);
    voltarb.setBounds(20,440,30,30);
    sairb.setBounds(530,440,30,30);
    
    //funcionalidade das opçoes sair (barra de ferramentas e  menu)
    sairmenu.addActionListener(
    new ActionListener(){
    public void actionPerformed(ActionEvent e){
        int opcao;
        Object[]botoes={"Sim","Não"};
        opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo sair do programa?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botoes,botoes[0]);
        if(opcao==JOptionPane.YES_OPTION)System.exit(0);
    }});  
   
        //funcionalidade botao funcionario
        funcionariob.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        adm_func ver = new adm_func();
        ver.setVisible(true);
        dispose();
        }});
        
        //funcionalidade botao funcionario
        funcionariomenu.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        adm_func ver = new adm_func();
        ver.setVisible(true);
        dispose();
        }});
        
        //funcionalidade botao sair
        sairb.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
        int opcao;
        Object[]botoes={"Sim","Não"};
        opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo sair do programa?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botoes,botoes[0]);
        if(opcao==JOptionPane.YES_OPTION)System.exit(0);
        }});
        
        //funcionalidade botao voltar
        voltarb.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
        frm_login mostra = new frm_login();
        mostra.setVisible(true);
        dispose();
        }});
        
    tela.add(clienteb);
    tela.add(funcionariob);
    tela.add(produtob);
    tela.add(sairb);
    tela.add(voltarb);
    info.add(sobre);
    info.addSeparator();
    info.add(sairmenu);
    setSize(600, 550);
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);
   }
    
    public static void main (String args[])
   {
   menu app = new menu();
   app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    
}