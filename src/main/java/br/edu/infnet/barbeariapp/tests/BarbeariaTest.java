package br.edu.infnet.barbeariapp.tests;

import br.edu.infnet.barbeariapp.model.Cliente;
import br.edu.infnet.barbeariapp.model.Barbearia;
import br.edu.infnet.barbeariapp.model.Barba;

public class BarbeariaTest {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Wilson", "99749-9048", "wilsinnikiti@gmail.com");
		
		
		Barba barbinha = new Barba("Barb", 20, 124);
		barbinha.setTamanho(10);
		barbinha.setVikings("Vikingzeira");
	
		Barbearia barbearia = new Barbearia();
		barbearia.setTipo(1);
		barbearia.setCliente(cliente);
		barbearia.setVip(false);
		System.out.println(barbearia);
			
		Barbearia dojaca = new Barbearia();
		dojaca.setCliente(cliente);
		dojaca.setTipo(2);
		dojaca.setVip(true);
		dojaca.setCpf(0);
		System.out.println(dojaca);
		
	
	}

}
