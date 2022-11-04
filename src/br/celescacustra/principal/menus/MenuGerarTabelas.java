package br.celescacustra.principal.menus;

import java.util.Scanner;

import br.celescacustra.dto.Envio;
import br.celescacustra.dto.Recebimento;
import br.celescacustra.model.DetailCadastro;
import br.celescacustra.model.DetailConcessionariaConveniado;
import br.celescacustra.model.Footer;
import br.celescacustra.model.Header;

public class MenuGerarTabelas implements Comando
{	
	public void executar() 
	{
		Scanner input = new Scanner(System.in);

		int escolha;

		do {
			System.out.println("-=Geração De Tabelas=-\n");
			
			System.out.print("1) Gerar Tabela Detail Cadastro\n");
			System.out.print("2) Gerar Tabela Datail Concessionaria Conveniado\n");
			System.out.print("3) Gerar Tabela Header\n");
			System.out.print("4) Gerar Tabela Footer\n");
			
			System.out.print("5) Gerar Tabela Detail Cadastro Enviado\n");
			
			System.out.print("6) Gerar Tabela Envio\n");
			System.out.print("7) Gerar Tabela Recebimento\n");
						
			
			System.out.print("0) Sair\n");
			System.out.print("Escolha Uma Opção Do Menu\n");

			escolha = input.nextInt();

			switch (escolha) {

			case 1:
				Util.GerarTabela(new DetailCadastro());
				break;
			case 2:
				Util.GerarTabela(new DetailConcessionariaConveniado());
				break;
			case 3:
				Util.GerarTabela(new Header());
				break;
			case 4:
				Util.GerarTabela(new Footer());
				break;			
			case 5:
				Util.GerarTabela(new Envio());
				break;
			case 6:
				Util.GerarTabela(new Recebimento());
				break;
			default: 
				System.out.println(escolha +
						"Não é uma opção válida");
			}			
		} while (escolha != 0);

		input.close();		
	}

	@Override
	public String retornaNome() {
		return "Gerar Tabelas ";
	}
	
}
