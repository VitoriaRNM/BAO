
package com.mycompany.bao.w.DTO;

public class Pessoa {
     public int id;
	public String nome;
    public String email;
    public String senha;
    public String ConfirmaSenha; 
    
    
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmaSenha() {
		return ConfirmaSenha;
	}
	public void setConfirmaSenha(String confirmaSenha) {
		ConfirmaSenha = confirmaSenha;
	}
}
