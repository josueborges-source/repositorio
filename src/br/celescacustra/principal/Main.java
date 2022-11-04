package br.celescacustra.principal;

import java.sql.Connection;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;

public class Main {

	Scanner scanner = new Scanner(System.in);
	Connection conexao = ConnectionFactory.getConnection();

	public static void main(String[] args) {
		new Main().menuPrincipal();
	}

	void menuPrincipal() {

		int escolha;

		do {
			System.out.println("-=Menu=-\n");
			System.out.println("1) Menu Detail Cadastro \n");
			System.out.println("2) Menu Detail Cadastro Enviado \n");			
			escolha = scanner.nextInt();
			
			switch (escolha) {
			case 1:
				menuDetailCadastro();
				break;
			case 2:
				menuDetailCadastro();
				break;
			case 0:
				System.out.println("Sair");
				break;
			}
		} while (escolha != 0);
	}

	void menuDetailCadastro() 
	{
		int escolha;	

		do {
			System.out.println("Detail Conveniado \n");
			System.out.println("1) Gerar Novo Detail Conveniado \n");
			System.out.println("2) Visualizar Todos Detail Conveniados Salvos \n");
			
			escolha = scanner.nextInt();
			
			switch (escolha) {
			case 1:
				GerarNovoCadastroDetailConveniado();
				break;
			case 2:
				GerarNovoCadastroDetailConveniado();
				break;
			case 0:
				System.out.println("Sair");
				break;
			default:
				System.out.println(escolha + " não é uma opção válida.");
			}
		} while (escolha != 0);
	}
	
	void GerarNovoCadastroDetailConveniado() 
	{
		System.out.println("Escolha uma opção:");
		System.out.println("Digite 1 para pessoa física.");
		System.out.println("Digite 2 para pessoa jurídica.");
		
		Integer escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Digite o CPF:");
			Integer cpf = scanner.nextInt();	
			System.out.println("cpf: " + cpf);
			break;
		case 2:
			System.out.println("Digite o CNPJ:");
			String cnpj = scanner.nextLine();
			System.out.println("cnpj: " + cnpj);
			break;
		case 0:
			System.out.println("Sair");
			break;
		default:
			System.out.println(escolha + " não é uma opção válida.");		
		}
		System.out.println("Escolha = " + escolha);		
	}	
}
