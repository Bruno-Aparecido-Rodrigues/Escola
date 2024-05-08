
package controle;
 /** @author burnor */
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexao.Conexao;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel; //para reconhecimento de Jtable

import java.sql.*;

public class FrmTelaCad extends JFrame
{    
   //criação das variaveis
    
    Conexao con_cliente;
    
    JLabel rCodigo, rNome, rEmail, rTel, rData, rPesq, criador;
    JTextField tcodigo, tnome, temail, tpesq;
    JFormattedTextField tel, data;
    MaskFormatter mTel, mData;
    JButton bPrim, bAnt, bPro, bUlt, bNr, bGra, bAlt, bExc, bPesq, bSair;
    JTable tblClientes; //datagrid
    JScrollPane scp_tabela; // container para o datagrid
    ImageIcon imagens[];
    
    public FrmTelaCad(){
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
            setTitle("Conexão java com Mysql");
            ImageIcon icone = new ImageIcon("imagens/trilhas_de_guerra_bob.png");
            setIconImage(icone.getImage());
            setResizable(false);
            Container tela = getContentPane();
            tela.setLayout(null);
            tela.setBackground (new Color (255,203,190));
            
            //configuração da tela
            ImageIcon criar = new ImageIcon("imagens/trilhas_de_guerra_bob.png");
            rCodigo = new JLabel ("Código:: ");
            rNome = new JLabel ("Nome:: "); 
            rData = new JLabel ("Data:: ");
            rTel = new JLabel ("Telefone:: ");
            rEmail = new JLabel ("Email:: ");
            rPesq = new JLabel ("Pesquisa por nome do Cliente:: ");
            criador = new JLabel(criar);
            
       String icones[]={"imagens/primeiro.png","imagens/anterior.png",
       "imagens/proximo.png","imagens/ultimo.png","imagens/criar.png","imagens/gravar.png",
       "imagens/alterar.png","imagens/delete.png","imagens/pesquisar.png","imagens/sair.png"};
        imagens = new ImageIcon[11];
        for(int i = 0;i < 10;i++){
           imagens[i] = new ImageIcon(icones[i]);}         
            bPrim = new JButton (imagens[0]);
            bAnt = new JButton (imagens[1]);
            bPro = new JButton (imagens[2]);
            bUlt = new JButton (imagens[3]);
            bNr = new JButton (imagens[4]);
            bGra = new JButton (imagens[5]);
            bAlt = new JButton (imagens[6]);
            bExc = new JButton (imagens[7]);
            bPesq = new JButton (imagens[8]);
            bSair = new JButton (imagens[9]);
            
        //mensagem em popup quando fica em cima do botão//
        bAnt.setToolTipText("Volta um registro");
        bPro.setToolTipText("Avança um registro");
        bPrim.setToolTipText("Vai para o primeiro registro");
        bUlt.setToolTipText("Vai para o ultimo registro");
        bAnt.setToolTipText("Volta um registro");
        bGra.setToolTipText("Grava um novo registro");
        bExc.setToolTipText("Exclui um registro");
        bAlt.setToolTipText("Altera um registro");    
        bNr.setToolTipText("Inicia um processo de novo registro");
        bPesq.setToolTipText("Pesquisa por um registro");
        bSair.setToolTipText ("Sai do App");
        criador.setToolTipText("Segurança dos Dados: Brunola 2°DS");        
        try{  
            mData = new MaskFormatter("##/##/####");
            mTel = new MaskFormatter("(##)####-####");
            }
           catch(ParseException excp) {}    
            tel= new JFormattedTextField(mTel);
            data= new JFormattedTextField(mData);
            
            tcodigo = new JTextField(5);
            tnome = new JTextField(5);
            temail = new JTextField(5);
            tpesq = new JTextField(5);
            
            //formatação na tela
            rCodigo.setBounds(50, 50, 50, 20);
            rNome.setBounds(50, 80, 50, 20 );
            rData.setBounds(50, 110, 50, 20);
            rTel.setBounds(50, 140, 60, 20);
            rEmail.setBounds(50, 170, 50, 20);
            rPesq.setBounds(50,480, 200,20);
            tcodigo.setBounds(150, 50, 50, 20);
            tnome.setBounds(150, 80, 170, 20);
            temail.setBounds(150, 170, 200, 20);
            tpesq.setBounds(250,480,250,20);
            data.setBounds(150, 110, 90, 20);
            tel.setBounds(150, 140, 110, 20);
            bPrim.setBounds(50, 215,30,20);
            bAnt.setBounds(90, 215,30,20);
            bPro.setBounds(130, 215,30,20);
            bUlt.setBounds(170, 215,30,20);
            bNr.setBounds(630, 270, 30, 20);
            bGra.setBounds(630, 300, 30, 20);
            bAlt.setBounds(630, 330, 30, 20);
            bExc.setBounds(630, 360, 30, 20);
            bPesq.setBounds(510,480,30,20);
            bSair.setBounds(630,510,30,30);
            criador.setBounds(440,0,250,220);

            
            //funcão dos botões
            bSair.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int opcaosair;
            Object[]botoessair={"Sim","Não"};
            opcaosair = JOptionPane.showOptionDialog(null,"Você deseja mesmo sair?","Fehcar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoessair,botoessair[0]);
            if(opcaosair==JOptionPane.YES_NO_OPTION)System.exit(0);   
            }});
            
            bPrim.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.first();
                    mostrar_Dados();
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
            }
            }});
            
            bAnt.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    if(con_cliente.resultset.isFirst()){
                    JOptionPane.showMessageDialog(null, "Você se encontra no primeiro registro");}
                    else{
                    con_cliente.resultset.previous();   
                    mostrar_Dados();}  
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
            }
            }});
            
            bPro.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    if(con_cliente.resultset.isLast()){
                    JOptionPane.showMessageDialog(null, "Você se encontra no último registro");}
                    else{
                    con_cliente.resultset.next();
                    mostrar_Dados();}
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
            }
            }});
            
            bUlt.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    con_cliente.resultset.last();
                    mostrar_Dados();
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
            }
            }});
            
            bNr.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    tcodigo.setText(""); // limpa a caixa de texto em questão
                    tnome.setText("");
                    temail.setText("");
                    tel.setText("");
                    data.setText("");
                    tcodigo.requestFocus(); // posiciona o cursor neste campo para a digitação
            }});
            
            bGra.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    String nome = tnome.getText();
                    String data_nasc = data.getText();
                    String telefone = tel.getText();
                    String email = temail.getText();
                    
                    try {
                        String insert_sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                        con_cliente.statement.executeUpdate(insert_sql);
                        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        
                        con_cliente.executaSQL("select * from tbclientes order by cod");
                        preencherTabela();
                    }catch(SQLException errosql){
                        JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
            }});
             
            
            bAlt.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    String nome = tnome.getText();
                    String data_nasc = data.getText();
                    String telefone = tel.getText();
                    String email = temail.getText();
                    String sql;
                    String msg="";
                    
                    try {
                        if(tcodigo.getText().equals("")){
                            sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                            msg="Gravação de um novo registro";
                        }else{
                            sql="update tbclientes set nome='" + nome + "',telefone='" + telefone + "', email='" + email + "', dt_nasc='" + data_nasc + "' where cod = " + tcodigo.getText();
                            msg="Alteração de registro";
                        }
                        
                        con_cliente.statement.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        
                        con_cliente.executaSQL("select * from tbclientes order by cod");
                        preencherTabela();
                        
                    }catch(SQLException errosql){
                        JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
            }});
                 
            bExc.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                   String sql=""; 
                   try{
                       int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão",JOptionPane.YES_NO_OPTION,3);
                       if (resposta==0){
                           sql = "delete from tbclientes where cod = " + tcodigo.getText();
                           int excluir = con_cliente.statement.executeUpdate(sql);
                           if(excluir ==1){
                               JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
                               con_cliente.executaSQL("select * from tbclientes order by cod");
                               con_cliente.resultset.first();
                               preencherTabela();
                               posicionarRegistro();
                           }
                           else{
                               JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!","Menssagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                           }
                       }
                   }catch (SQLException excecao){
                        JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
                }});
            
            bPesq.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                 try{
                     String pesquisa = "select * from tbclientes where nome like '" + tpesq.getText() + "%'";
                     con_cliente.executaSQL(pesquisa);
                     
                     if(con_cliente.resultset.first()){
                        preencherTabela(); 
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "\n Não existe dados com este paramêtro!! :\n ","Mensagem do Programa,",JOptionPane.INFORMATION_MESSAGE);
                     }
                 }catch(SQLException errosql){
                        JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
                }});      
            
            //configuração da Jtable
               tblClientes = new javax.swing.JTable();
               scp_tabela = new javax.swing.JScrollPane();    
               tblClientes.setBounds(50,260,550,200);
               scp_tabela.setBounds (50,260,550,200);          
               tela.add(tblClientes);
               tela.add(scp_tabela);
               
               tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0))); 
               tblClientes.setFont(new java.awt.Font("Arial", 1, 12));
         
               tblClientes.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                   {null, null, null, null, null},
                   {null, null, null, null, null},
                   {null, null, null, null, null},
                   {null, null, null, null, null}
                   },
                   new String [] {"Código","Nome","Data Nascimento","Telefone","Email"})
                {
                 boolean[] canEdit = new boolean []{false, false, false, false, false };
                 public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex];}
        });
        scp_tabela.setViewportView(tblClientes);
        tblClientes.setAutoCreateRowSorter(true); //ativa a classificação ordenada da tabela
            //fim da config da Jtable
            
            tela.add(rCodigo);
            tela.add(rNome);
            tela.add(rEmail);
            tela.add(rTel);
            tela.add(rData);
            tela.add(rPesq);
            tela.add(tcodigo);
            tela.add(tnome);
            tela.add(temail);
            tela.add(tpesq);
            tela.add(data);
            tela.add(tel);
            tela.add(bPrim);
            tela.add(bAnt);
            tela.add(bPro);
            tela.add(bUlt);
            tela.add(bNr);
            tela.add(bGra);
            tela.add(bAlt);
            tela.add(bExc);
            tela.add(bPesq);
            tela.add(bSair);
            tela.add(criador);
            
       setSize(700,600);
       setVisible(true);
       setLocationRelativeTo(null);
       
       con_cliente.executaSQL("select * from tbclientes order by cod");
       preencherTabela();
       posicionarRegistro();
    }
    
    
    //método preencher Tabela
    public void preencherTabela(){
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(170);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
            modelo.addRow(new Object[]{
            con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")

            });
          }
        }catch (SQLException erro){
          JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //método posicionarRegistro
    public void posicionarRegistro(){
        try{
            con_cliente.resultset.first(); // posiciona no 1° registro da tabela
            mostrar_Dados(); // chama o método que irá buscar o dado da tabela
           }catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);    
           }
    }
        
   public void mostrar_Dados(){
       try{
           tcodigo.setText(con_cliente.resultset.getString("cod")); // Associar a caixa de texto ao campo cod
           tnome.setText(con_cliente.resultset.getString("nome")); // Associar a caixa de texto ao campo nome
           data.setText(con_cliente.resultset.getString("dt_nasc"));
           tel.setText(con_cliente.resultset.getString("telefone"));
           temail.setText(con_cliente.resultset.getString("email"));
       }catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);    
       }     
    }

    
    public static void main(String args[]){
        FrmTelaCad app = new FrmTelaCad();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}