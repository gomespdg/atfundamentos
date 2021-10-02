package br.edu.infnet.barbeariapp.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.barbeariapp.model.Barba;
import br.edu.infnet.barbeariapp.model.Barbearia;
import br.edu.infnet.barbeariapp.model.Cabelo;
import br.edu.infnet.barbeariapp.model.Cerveja;
import br.edu.infnet.barbeariapp.model.Cliente;

public class ArquivoTeste {
public static void main(String[] args) {
		
		String dir = "C:/Dev/";
		String arq = "barbeariapp.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				while(linha != null) {
					
					campos = linha.split(";");
					
					if(campos.length == 4) {
						Cliente cliente = new Cliente(
								campos[1], 
								campos[3], 
								campos[4]
						);
						Barba barbinha = new Barba(linha, 0, 0);
						barbinha.setVikings(campos[2]);
					
						
						System.out.println(barbinha);
					
					}else {
						
						
					switch (campos[0]) {
					
					case "C":
						System.out.println("Cabelo");
						Cabelo cabelo = new Cabelo("Corte", 40, 121);
						cabelo.setDisfarçado("Régua");
						cabelo.setTesoura("Simples");
						cabelo.setMaquina("Militar");
						
						break;

					case "B":
						Barba disfarçada = new Barba("Disfarçada", 25, 123);
						disfarçada.setTamanho(15);
						disfarçada.setVikings("Vikings");
					
					

						break;
						
					case "K":
						Cerveja cervejinha = new Cerveja("pacote", 60, 122);
						cervejinha.setQuantidade(330);
						cervejinha.setTipo("Weiss");
						cervejinha.setNome("Witbier");
				

						break;

					default:
						System.out.println("Inválido");
						break;
					}
					}
					linha = leitura.readLine();
				}
				
	//			escrita.write(qtde+";"+somaSalarial+"\r\n");

				leitura.close();
				file.close();
				
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
	}

}
