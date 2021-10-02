package br.edu.infnet.barbeariapp.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Barbearia {
	
	private Cliente cliente;
	private int tipo;
	private LocalDateTime data;
	private List<Tratamento> tratamento;
	private int cpf;
	
	public List<Tratamento> getTratamento() {
		return tratamento;
	}


	public void setTratamento(List<Tratamento> tratamento) {
		this.tratamento = tratamento;
	}


	public Barbearia() {
		data = LocalDateTime.now();
	}
	

	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(tipo);
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(cliente.toString());
		sb.append(";");
		sb.append(tratamento.size());
		
		return sb.toString();
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setVip(boolean b) {
	
		
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public void setCliente1(String string) {
		// TODO Auto-generated method stub
		
	}


	}
			

