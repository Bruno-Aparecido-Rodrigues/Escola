/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.cadastroaluno;

import javax.swing.JOptionPane;
import com.etec.cadastroaluno.Aluno;
/**
 *
 * @author dti
 */
public class Util {
     
    public Util() {
}    
    
    Aluno aluno = new Aluno();
    
    public void digitarTextoNome()
    {
        aluno.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    }
    
    public void digitarTextoIdade()
    {
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
    }
    
    public void digitarTextoAltura()
    {
        aluno.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura ")));
    }
    
    public void digitarTextoPaulistano()
    {
        aluno.setPaulistano(Boolean.parseBoolean(JOptionPane.showInputDialog("Você é Paulistano? (true) para sim  (false) para não")));
    }
     
    public void exibirTexto()
    {
        JOptionPane.showMessageDialog(null , " Seu nome é: " + aluno.getNome() + " Sua idade é: " + aluno.getIdade() + "Anos" + " Sua altura é: " + aluno.getAltura() + " Metros " + aluno.isPaulistano());
    }
}
