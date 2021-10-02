package br.edu.infnet.barbeariapp.model.exceptions;

public class CodigoNegativoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String mensnagem;

	public CodigoNegativoException(String mensagem) {
		super(mensnagem);
	}

}
