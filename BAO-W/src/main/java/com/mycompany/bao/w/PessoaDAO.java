/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mycompany.bao.w.DTO.Pessoa;
import com.mycompany.bao.w.VIEW.TelaPrincipal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PessoaDAO {
    
    Connection conn;
    PreparedStatement pstm;
   
    public void CadastrarPessoa(Pessoa pessoa){
        String sql = "insert into pessoa(nome, email, senha) values(?,?,?)";
        
        conn = new Conexao().getConnection();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,pessoa.getNome());
            pstm.setString(2,pessoa.getEmail());
            pstm.setString(3,pessoa.getSenha());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"PessoaDAO" + erro);
        }
        
}
    
     public void Login(Pessoa pessoa) {
        String sql = "select * from pessoa where nome=? and email=? and senha=? ";
        
        conn = new Conexao().getConnection();
        
            try{
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, pessoa.getNome());
                pstm.setString(2, pessoa.getEmail());
                pstm.setString(3, pessoa.getSenha());
                
                pstm.execute();
                
                if(pstm.execute()){
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Nome/Email e/ou Senha esta incorreto");
                }
            }catch (Exception erro){
              JOptionPane.showMessageDialog(null,"PessoaDAO" + erro);
            }

    }

    public void setVisible(boolean b) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     
}
