package br.edu.infnet.barbeariapp.model;

import br.edu.infnet.barbeariapp.model.exceptions.CodigoNegativoException;

public class Cabelo extends Tratamento {
	
	private String disfarçado;
	private String tesoura;
	private String maquina;
	private int codigo;
	

	public Cabelo(String opção, float valor, int codigo) {
		super(opção, valor, codigo);
}
	@Override
	public boolean cerveja() {
		// TODO Auto-generated method stub
		return true;
		
}		
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(disfarçado);
		sb.append(";");
		sb.append(tesoura);
		sb.append(";");
		sb.append(maquina);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		sb.append(cerveja());
		
		return sb.toString();
	}
		
	
	public String getDisfarçado() {
	return disfarçado;
}
	public void setDisfarçado(String disfarçado) {
	this.disfarçado = disfarçado;
}
	public String getTesoura() {
	return tesoura;
}
	public void setTesoura(String tesoura) {
	this.tesoura = tesoura;
}
	public String getMaquina() {
	return maquina;
}
	public void setMaquina(String maquina) {
	this.maquina = maquina;
}
	public int isCodigo() {
	return codigo;
}
	public void setCodigo(int codigo) throws CodigoNegativoException {
	this.codigo = codigo;
	
	if(codigo <= 0) {
		throw new CodigoNegativoException("Codigo Incorreto");
	}
}


}