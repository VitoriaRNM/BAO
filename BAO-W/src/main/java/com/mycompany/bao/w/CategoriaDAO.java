/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w;
import com.mycompany.bao.w.DTO.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CategoriaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void CadastrarCategoria(Categoria categoria){
        String sql = "insert into categoria(nome) values(?)";
        
        conn = new Conexao().getConnection();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,categoria.getNome());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"CategoriaDAO" + erro);
        }
        
    /**
     *
     * @param id_ca
     * @return
     */
    public Categoria getCategoria(int id_ca){
          String sql = "select * from categoria where id_ca = ?";
          
          try{
             pstm = conn.prepareStatement(sql);
             pstm.setInt(1,id_ca);
             ResultSet rs = pstm.executeQuery();
             Categoria categoria = new Categoria();
             
             rs.first();
             categoria.setId_ca(id_ca);
             categoria.setNome("nome");
             
             return categoria;
             
          }catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"CategoriaDAO" + erro);
        return null;
     }
}
      public List<Categoria> getCategoria(String nome)
     {
         String sql = "select * from universal where nome like ?";
      try {
     pstm = conn.prepareStatement(sql);
     ResultSet rs = pstm.executeQuery();
    List<Categoria> listaCategoria = new ArrayList<>();
    
    while(rs.next()){
        Categoria categoria = new Categoria();
        categoria.setId_ca(rs.getInt("id"));
             categoria.setNome(rs.getString("nome"));
             
             
             listaCategoria.add(categoria);
             
             return listaCategoria;
    }
     
} catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"UniversalDAO" + erro);
     }
         return null;
     }
		
}
