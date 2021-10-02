package br.edu.infnet.barbeariapp.model;

import br.edu.infnet.barbeariapp.model.exceptions.NaoVipException;

public class Combo extends Tratamento {
	
	public Combo(String opção, float valor, int codigo) {
		super(opção, valor, codigo);
		// TODO Auto-generated constructor stub
	}
	private String pacote;
	private int cod;
	private float quantidade;
	private String caneca;
	
	
	

	@Override
	public boolean cerveja() {
		// TODO Auto-generated method stub
		return true;
	}



	public String getPacote() {
		return pacote;
	}



	public void setPacote(String pacote) {
		this.pacote = pacote;
	}



	public int getCod(int i) {
		return cod;
	}



	public void setCod(int cod) {
		this.cod = cod;
	}



	public float getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(float quantidade) throws NaoVipException {
		
		if(quantidade <= 0) {
			throw new NaoVipException("Não é vip ainda");
		}
		this.quantidade = quantidade;
	}



	public String getCaneca() {
		return caneca;
	}



	public void setCaneca(String caneca) {
		this.caneca = caneca;
	}



		
	}



	