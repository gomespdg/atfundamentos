package br.edu.infnet.barbeariapp.model;

public class Cerveja extends Tratamento {

	public Cerveja(String opção, float valor, int codigo) {
		super(opção, valor, codigo);
		// TODO Auto-generated constructor stub
	}
	private float quantidade;
	private String tipo;
	private String nome;
	@Override
	public boolean cerveja() {
		// TODO Auto-generated method stub
		return false;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
