package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
					
	int menu;
	int tipoMoeda;
	// MENU DE ENTRADA, O USUÁRIO INSERE A OPÇÃO DESEJADA E ENQUANTO NÃO FOR INSERIDO UMA OPÇÃO VÁLIDA O MENU ENTRA EM LOOPING ATÉ A SELEÇÃO CORRETA.
		Scanner entrada = new Scanner(System.in);
		new Scanner(System.in);

		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("========================COFRE DIGITAL=============================== ");
		System.out.println("Seja Bem-Vindo ao Cofrinho Digital, insira uma das opções listadas: ");
		System.out.println("1 - Adicionar Moeda ");
		System.out.println("2 - Remover Moeda ");
		System.out.println("3 - Listar Moedas do Cofre ");
		System.out.println("4 - Calcular Montante(R$)");
		System.out.println("0 - Encerrar Programa");
		System.out.println("==================================================================== ");		
		menu = entrada.nextInt();
		
		while (menu !=0) {
			switch(menu) {
			case 1: // ESTA PARTE DO CÓDIGO ADICIONA MOEDA EM UMA LISTA.
				tipoMoeda=0;
				while (tipoMoeda > 4 || tipoMoeda<=0) {
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					System.out.println("4 - Bitcoin");
					tipoMoeda = entrada.nextInt();
				}
					System.out.println("Insira a quantidade.");
						double valor = entrada.nextDouble(); 						
						Moeda moeda = null;
						if (tipoMoeda==1) {
							moeda = new Dolar(valor);
						}
						if (tipoMoeda==2) {
							moeda = new Euro(valor);
						}
						if (tipoMoeda==3) {
							moeda = new Real(valor);
						}
						if (tipoMoeda==4) {
							moeda = new Bitcoin(valor);
						}
						cofrinho.adicionar(moeda);
						System.out.println("##Moeda adicionada com Sucesso##");
						
				break;
			case 2: // ESTA PARTE DO CÓDIGO ADICIONA MOEDA EM UMA LISTA.
				tipoMoeda=0;
				while (tipoMoeda > 4 || tipoMoeda<=0) {
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					System.out.println("4 - Bitcoin");
					tipoMoeda = entrada.nextInt();
				}
					System.out.println("Insira a quantidade.");
						valor = entrada.nextDouble();	
						
						moeda = null;
						if (tipoMoeda==1) {
							moeda = new Dolar(valor);
						}
						if (tipoMoeda==2) {
							moeda = new Euro(valor);
						}
						if (tipoMoeda==3) {
							moeda = new Real(valor);
						}
						if (tipoMoeda==4) {
							moeda = new Bitcoin(valor);
						}
						cofrinho.remover(moeda);
						System.out.println("##Moeda removida com Sucesso##");
				break;
			case 3:
				cofrinho.listar();
				break;
			case 4:
				cofrinho.converter();
				break;
				
			default: 
				System.out.println("Opção Inválida");
			}
			System.out.println("==================================================================== ");
			System.out.println("Seja Bem vindo ao Cofrinho Digital, insira uma das opções abaixo: ");
			System.out.println("1 - Adicionar Moeda ");
			System.out.println("2 - Remover Moeda ");
			System.out.println("3 - Listar Moedas do Cofre ");
			System.out.println("4 - Calcular Montante(R$)");
			System.out.println("0 - Encerrar Programa");
			System.out.println("==================================================================== ");
			menu = entrada.nextInt();
			
			
		}
		
		System.out.println("Encerrando Programa....");	
		System.out.println("Elaborado por Julio Cesar Danini");

	
		
	
		

	}

}
