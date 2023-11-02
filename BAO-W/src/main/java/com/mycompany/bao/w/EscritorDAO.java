/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w;

import com.mycompany.bao.w.DTO.Escritor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EscritorDAO {
     Connection conn;
    PreparedStatement pstm;
    
    public void CadastrarEscritor(Escritor escritor){
        String sql = "insert into scritor(nome, sexo') values(?,?)";
        
        conn = new Conexao().getConnection();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,escritor.getNome());
            pstm.setString(2,escritor.getSexo());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"EscritorDAO" + erro);
        }
        
}
    
    public Escritor getEscritor(int id_esc){
          String sql = "select * from escritor where id_esc = ?";
          
          try{
             pstm = conn.prepareStatement(sql);
             pstm.setInt(1,id_esc);
             ResultSet rs = pstm.executeQuery();
             Escritor escritor = new Escritor();
             
             rs.first();
             escritor.setId_esc(id_esc);
             escritor.setNome("nome");
             escritor.setSexo("sexo");
             
             return escritor;
          }catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"EscritorDAO" + erro);
        return null;
     }
}
    
     public List<Escritor> getEscritor(String nome)
     {
         String sql = "select * from escritor where nome like ? ";
      try {
     pstm = conn.prepareStatement(sql);
     ResultSet rs = pstm.executeQuery();
    List<Escritor> listaEscritor = new ArrayList<>();
    
    while(rs.next()){
        Escritor escritor = new Escritor();
        escritor.setId_esc(rs.getInt("id"));
             escritor.setNome(rs.getString("nome"));
             escritor.setSexo(rs.getString("sexo"));
            
             
             listaEscritor.add(escritor);
             
             return listaEscritor;
    }
     
} catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"UniversalDAO" + erro);
     }
         return null;
     }
}
