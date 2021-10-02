package br.edu.infnet.barbeariapp.model;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String email;
	private boolean vip;
	
	public Cliente(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(telefone);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(vip ? "vip" : "normal");
		
		return sb.toString();
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	

}
