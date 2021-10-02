package br.edu.infnet.barbeariapp.model;

public abstract class Tratamento {
	
	private String opção;
	private float valor;
	private int codigo;
	
	public Tratamento(String opção, float valor, int codigo) {
		this.opção = opção;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract boolean cerveja();
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(opção);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
	
		return sb.toString();
	
	}

	public String getOpção() {
		return opção;
	}
	public float getValor() {
		return valor;
	}
	public int getCodigo() {
		return codigo;
	}
}
