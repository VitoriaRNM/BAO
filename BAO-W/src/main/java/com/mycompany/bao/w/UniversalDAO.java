/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w;

import com.mycompany.bao.w.DTO.Universal;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UniversalDAO {
     Connection conn;
    PreparedStatement pstm;

    
    public void CadastrarUniversal(Universal universal){
     String sql = "insert into universal(nome, titulo_alternativo, capitulo, status, sinopse,id_tipo,link) values(?,?,?,?,?,?,?)";
   
    
     try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,universal.getNome());
            pstm.setString(2,universal.getTitulo_alternativo());
            pstm.setString(3,universal.getCapitulos());
            pstm.setString(4,universal.getStatus());
            pstm.setString(5,universal.getSinopse());
            pstm.setString(6,universal.getTipo());
            pstm.setString(7,universal.getLink());
            
            pstm.execute();
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"UniversalDAO" + erro);
        }
}
    
     public Universal getUniversal(int id){
          String sql = "select * from universal where id = ?";
          
          try{
             pstm = conn.prepareStatement(sql);
             pstm.setInt(1,id);
             ResultSet rs = pstm.executeQuery();
             Universal universal = new Universal();
             
             rs.first();
             universal.setId_universal(id);
             universal.setNome("nome");
             universal.setNome_alternativo("titulo_alternativo");
             universal.setCapitulos("capitulo");
             universal.setStatus("status");
             universal.setSinopse("sinopse");
             universal.setTipo("id_tipo");
             
             return universal;
          }catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"UniversalDAO" + erro);
        return null;
     }
}
     
     public List<Universal> getUniversal(String nome)
     {
         String sql = "select * from universal where nome like ? ";
      try {
     pstm = conn.prepareStatement(sql);
     ResultSet rs = pstm.executeQuery();
    List<Universal> listaUniversal = new ArrayList<>();
    
    while(rs.next()){
        Universal universal = new Universal();
        universal.setId_universal(rs.getInt("id"));
             universal.setNome(rs.getString("nome"));
             universal.setNome_alternativo(rs.getString("titulo_alternativo"));
             universal.setCapitulos(rs.getString("capitulo"));
             universal.setStatus(rs.getString("status"));
             universal.setSinopse(rs.getString("sinopse"));
             universal.setTipo(rs.getString("id_tipo"));
             
             listaUniversal.add(universal);
             
             return listaUniversal;
    }
     
} catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"UniversalDAO" + erro);
     }
         return null;
     }
}