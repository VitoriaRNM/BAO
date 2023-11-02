/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w;

import com.mycompany.bao.w.DTO.EditoraEstudio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EditoraEstudioDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void CadastrarEditoraEstudio(EditoraEstudio edes){
        String sql = "insert into estudio_editora(nome, tipo') values(?,?)";
        
        conn = new Conexao().getConnection();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,edes.getNome());
            pstm.setString(2,edes.getTipo());
            
            pstm.execute();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"EditoraEstudioDAO" + erro);
        }
        
}
    
     public EditoraEstudio getEditoraEstudio(int id){
          String sql = "select * from EDITORA_ESTUDIO where id = ?";
          
          try{
             pstm = conn.prepareStatement(sql);
             pstm.setInt(1,id);
             ResultSet rs = pstm.executeQuery();
             EditoraEstudio edes = new EditoraEstudio();
             
             rs.first();
             edes.setId(id);
             edes.setNome("nome");
             edes.setTipo("tipo_id");
             
             return edes;
          }catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"EditoraEstudioDAO" + erro);
        return null;
     }
}
     
     public List<EditoraEstudio> getEditoraEstudio(String nome)
     {
         String sql = "select * from escritor where nome like ?";
      try {
     pstm = conn.prepareStatement(sql);
     ResultSet rs = pstm.executeQuery();
    List<EditoraEstudio> listaEditoraEstudio = new ArrayList<>();
    
    while(rs.next()){
        EditoraEstudio edes = new EditoraEstudio();
        edes.setId(rs.getInt("id"));
             edes.setNome(rs.getString("nome"));
             edes.setTipo(rs.getString("tipo"));
            
             
             listaEditoraEstudio.add(edes);
             
             return listaEditoraEstudio;
    }
     
} catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"UniversalDAO" + erro);
     }
         return null;
     }
}
