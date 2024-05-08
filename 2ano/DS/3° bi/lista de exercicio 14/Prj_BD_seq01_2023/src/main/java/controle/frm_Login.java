package controle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane; 
import javax.sql.*;
/**** @author Μπρούνο */
public class frm_Login extends JFrame{
    
    Conexao con_cliente;
    
    JPasswordField tsen;
    JLabel rtit, usuario, senha;
    JTextField tusu;
    JButton blogar;
    ImageIcon imagens[];
    int tentativa = 0;
    
public frm_Login(){    
 
    con_cliente = new Conexao();
    con_cliente.conecta();
    
    setTitle(" *** Login de Acesso *** ");
    Container tela = getContentPane();
    setLayout(null);
    setResizable(false);
    tela.setBackground (new Color (255,203,190));
   
    rtit = new JLabel("Acesso ao Sistema ");
    ImageIcon usua = new ImageIcon("imagens/pessoa.png");
    ImageIcon se = new ImageIcon("imagens/cadeado.png");
    blogar = new JButton ("logar");
    tsen = new JPasswordField(5);
    tusu = new JTextField(5);
    usuario = new JLabel(usua);
    senha = new JLabel(se);
    rtit.setFont(new Font("Comic Sans MS",Font.BOLD,20));
            
    rtit.setBounds(100,50,200,20);
    usuario.setBounds(100,120,50,20);
    tusu.setBounds(150, 120,100,20);
    senha.setBounds(100, 170,50,20);
    tsen.setBounds(150, 170, 100,20);
    blogar.setBounds(145,230,100,20);
    
  
      tela.add(tsen);
      tela.add(senha);
      tela.add(usuario);
      tela.add(rtit);
      tela.add(tusu);
      tela.add(blogar);
   
       
    //botão logar//

     blogar.addActionListener( new ActionListener(){
       public void actionPerformed(ActionEvent e) {
       
  //caso seje digitado apenas números na senha esse if é ativado
           if(tsen.getText().matches("[0-9]+")){
               
           try{
               String pesquisa = "select * from tblusuario where usuario like '" + tusu.getText() + "' && senha = " + tsen.getText() + "";
               con_cliente.executaSQL(pesquisa);
              
               if (con_cliente.resultset.first())
               { //acesso ao form de cadastro
                  FrmTelaCad mostra = new FrmTelaCad();
                  mostra.setVisible(true);
                  dispose();
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"\n Usuário ou senha esta icorreto!!!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                   tentativa++;
               }
               
              }catch (SQLException errosql){
                JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! : \n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
             }}
           
           //caso seje digitado letra na senha
           else{
                 JOptionPane.showMessageDialog(null, "\n Usuário ou senha esta icorreto!!!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                 tentativa++;
                        }
           
//sistema de tentativas caso passe de 3 o programa é fechado
           if(tentativa == 3){
                 con_cliente.desconecta(); 
                 System.exit(0);}
       }});
     
       setLocationRelativeTo(null);
       setVisible(true);
       setSize(400,400);
 }

    public static void main(String args[]){
        frm_Login app = new frm_Login();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
