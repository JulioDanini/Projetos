package trabalho;

import java.util.ArrayList;
import java.util.Objects;


public class Cofrinho{
	
	Moeda moeda;
	// NESTA PARTE DO CÓDIGO É GERADO UMA LISTA DO TIPO ARRAY
	ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	
	public void adicionar(Moeda moeda) {
		listaMoeda.add(moeda);
		
	}
	
	
	public void remover(Moeda moeda) {
		listaMoeda.remove(moeda);
		
	}	
						
	public void listar() {
		for (Moeda moeda : listaMoeda) {
			System.out.println("----------------");
			System.out.println(moeda);
			System.out.println("----------------");
			
		}
	}
	/* NESTA PARTE DO CÓDIGO, AS MOEDAS SÃO CONVERTIDAS PARA O REAL ATRAVÉS DO MÉTODO 
	CONVERTER() CONTIDO EM CADA MOEDA, APÓS É REALIZADO A IMPRESSÃO DO TOTAL CONVERTIDO E RETORNA O MÉTODO INFO COM A COTAÇÃO DAS MOEDAS ESTRANGEIRAS.
	*/
	
	
	public void converter() {
		double total = 0;	
		for(Moeda moeda : listaMoeda) {
			total += moeda.converter();

		}
		System.out.println("|Total convertido em R$: |" + total+ "|");
		Dolar dolar = new Dolar(0);
		System.out.println("Cotação do Dolar: " );  dolar.info();
		Euro euro = new Euro(0);
		System.out.println("Cotação do Euro: " );  euro.info();		
			
				}

		
	}

	
		

	
			



