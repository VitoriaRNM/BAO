/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w.DTO;

public class Universal {
        public int id_universal;
        public String tipo;    
	public String capitulos;
	public String nome;
	public String nome_alternativo;
	public String sinopse;
	public String status;
	public String link;
	
	public int getId_universal() {
		return id_universal;
	}
	public void setId_universal(int id_universal) {
		this.id_universal = id_universal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(String capitulos) {
		this.capitulos = capitulos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome_alternativo() {
		return nome_alternativo;
	}
	public void setNome_alternativo(String nome_alternativo) {
		this.nome_alternativo = nome_alternativo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

    public String getTitulo_alternativo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
