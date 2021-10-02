package br.edu.infnet.barbeariapp.model;

	public class Barba extends Tratamento {
	
	private float tamanho;
	private String vikings;
	private int preço;
	private int setPreço;
	


	public Barba(String opção, float valor, int codigo) {
		super(opção, valor, codigo);
	}

	@Override
	public boolean cerveja() {
		return false;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(vikings);
		sb.append(";");
		sb.append(preço);
		sb.append(";");
		sb.append(cerveja());
		
		return sb.toString();
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getVikings() {
		return vikings;
	}

	public void setVikings(String vikings) {
		this.vikings = vikings;
	}


	

	public int getPreço() {
	return preço;
	}

	public void setPreço1(int preço) throws Exception {
		if(setPreço <= 0) {
			throw new Exception("Preço Indevido");
		}
		
	this.preço = preço;
	}

	public void setPreço(int preço2) {
		// TODO Auto-generated method stub
		
	}
}


