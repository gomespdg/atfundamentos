package br.edu.infnet.barbeariapp.tests;

import br.edu.infnet.barbeariapp.model.Cabelo;
import br.edu.infnet.barbeariapp.model.Cerveja;
import br.edu.infnet.barbeariapp.model.Combo;
import br.edu.infnet.barbeariapp.model.exceptions.CodigoNegativoException;
import br.edu.infnet.barbeariapp.model.exceptions.NaoVipException;
import br.edu.infnet.barbeariapp.model.Barba;

public class TratamentoTest {

	public static void main(String[] args) {
		
		
		Cabelo cabelo = new Cabelo("Corte", 40, 121);
		cabelo.setDisfarçado("Régua");
		cabelo.setTesoura("Simples");
		cabelo.setMaquina("Militar");
		try {
			cabelo.setCodigo(121);
		} catch (CodigoNegativoException e) {
			// TODO Auto-generated catch block
			System.out.println();
		}
		System.out.println(cabelo);
		
		Cerveja cervejinha = new Cerveja("pacote", 60, 122);
		cervejinha.setQuantidade(330);
		cervejinha.setTipo("Weiss");
		cervejinha.setNome("Witbier");
		System.out.println(cervejinha.cerveja());
		
		
		Barba disfarçada = new Barba("Disfarçada", 25, 123);
		disfarçada.setTamanho(15);
		disfarçada.setVikings("Vikings");
		try {
			disfarçada.setPreço(25);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(disfarçada);
		
		Barba medieval = new Barba("Noel", 30, 124);
		medieval.setTamanho(30);
		medieval.setVikings("VikingsNoel, VikingsMendigo, VikingsNutella");
		try {
			medieval.setPreço(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(medieval.cerveja());
		
		Combo peeling = new Combo("Limpeza de pele", 50, 126);
		peeling.setPacote("Cabelo e Barba");
		try {
			peeling.setQuantidade(10);
		} catch (NaoVipException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage);
		}
	

		
		
		
		
		
		
	}
}
