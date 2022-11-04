package br.celescacustra.principal;

import java.util.*;

import br.celescacustra.dao.*;
import br.celescacustra.model.*;
import br.celescacustra.principal.menus.*;
import br.celescacustra.principal.menus.MenuGerarTabelas;
import br.celescacustra.principal.menus.Util;
import br.celescacustra.principal.menus.detailcadastro.MenuDetailCadastro;
import br.celescacustra.principal.menus.detailconcessionariaconveniado.MenuDetailConcessionariaConveniada;
import br.celescacustra.principal.menus.envio.MenuEnvio;
import br.celescacustra.principal.menus.footer.MenuFooter;
import br.celescacustra.principal.menus.header.MenuHeader;

public class Principal implements Comando
{
	Scanner entrada = new Scanner(System.in);
	
	Map<Integer, Comando> menuDetailConcessionariaConveniada = new HashMap<Integer,Comando>();

	public static void main(String[] args) 
	{
		new Principal().executar();
	}

	public void executar() 
	{
						
			System.out.print("-=Menu=-\n");
			
			menuDetailConcessionariaConveniada.put(1, new MenuDetailCadastro());
			menuDetailConcessionariaConveniada.put(2, new MenuDetailConcessionariaConveniada());
			menuDetailConcessionariaConveniada.put(3, new MenuEnvio());
			menuDetailConcessionariaConveniada.put(4, new MenuFooter());
			menuDetailConcessionariaConveniada.put(5, new MenuHeader());
			menuDetailConcessionariaConveniada.put(6, new MenuDetailConcessionariaConveniada());
			menuDetailConcessionariaConveniada.put(7, new MenuGerarTabelas());
			
			Util.GerarMenu(menuDetailConcessionariaConveniada);	
			
			/*
			System.out.print(2, "Criação de Tabelas" \n");			
			System.out.print("3) Menu Detail Concessionaria Conveniada \n");
			System.out.print("4) Menu Footer \n");
			System.out.print("5) Menu Header \n");
			System.out.print("0) Sair \n");
			System.out.print("Escolha Uma Opção No Menu \n ");
			*/
			/*
			escolha = Integer.valueOf(entrada.nextLine());

			switch (escolha) {

			case 1:
				menuDetailCadastro();
				break;
			case 2:
				new CriarTabela().executar();
				break;
			case 4:
				gerarNovoCadastroDetailConveniado();
				break;
			case 5:
				editarDetailCadastrado();
				break;
			case 6:
				deletarDetailCadastrado();
				break;
			default:
				System.out.print(escolha + " não é uma opção válida. \n");
			}			

		} while (escolha != 0);
		*/

		//input.close();
	}

	String nomeTabela = "DetailCadastroEnviado";

	void menuDetailCadastro() {
		/**
		 * -1.00 - Menu Detail 
		 * -1.01 ---- Gerar Novo Detail ---
		 * -1.02 ---- Visualizar Details Gerados ----
		 * -1.03 ---- Editar Detail Gerado ---- 
		 * -1.04 ---- Deletar Detail Gerado ----
		 */

		int escolha = 0;

		do {
			System.out.print("Detail Conveniado \n");
			System.out.print("1) Gerar Novo Detail Conveniado \n");
			System.out.print("2) Visualizar Todos Detail Conveniados Salvos \n");
			System.out.print("3) Editar Detail Cadastro \n");

			escolha = Integer.valueOf(entrada.nextLine());

			switch (escolha) {
			case 1:
				gerarNovoCadastroDetailConveniado();
				break;
			case 2:
				visualizarDetailsCadastrosSalvos();
				break;
			case 3:
				editarDetailCadastrado();
				break;
			default:
				System.out.print(escolha + " não é uma opção válida \n");
			}
		} while (escolha != 0);
	}

	public DetailCadastro gerarNovoCadastroDetailConveniado() {		
		
		/**
		 * -1.01 ---- Gerar Novo Detail ---
		 */		
		DetailCadastro detailCadastro = new DetailCadastro();
		
		System.out.print("Digite identificação do tipo de registro: \n");
		String identificacaoTipoRegistro = entrada.nextLine();

		System.out.print("Digite código da unidade consumidora: \n");
		String codigoUnidadeConsumidora = entrada.nextLine();

		System.out.print("Digite o valor de lançamento: \n");
		String valorLancamento = entrada.nextLine();

		System.out.print("Digite data de geração de registro: \n");
		String dataGeracaoRegistro = entrada.nextLine();

		System.out.print("Digite comando de movimento: \n");
		String comandoMovimento = entrada.nextLine();

		System.out.print("Digite código da conta gerencial: \n");
		String codigoContaGerencial = entrada.nextLine();

		System.out.print("Digite número da cobertura/ocorrência: \n");
		String numeroCoberturaOcorrencia = entrada.nextLine();

		System.out.print(" ");

		System.out.print("Identificação do cliente no conveniado: \n");
		String identificacaoClienteConveniado =  entrada.nextLine();

		detailCadastro.setCodigoContaGerencial(codigoContaGerencial);
		detailCadastro.setDataGeracaoRegistro(Integer.valueOf(comandoMovimento));
		detailCadastro.setIdentificacaoTipoRegistro(identificacaoTipoRegistro);
		detailCadastro.setCodigoUnidadeConsumidora(Integer.valueOf(codigoUnidadeConsumidora));
		detailCadastro.setValorLancamento(Integer.valueOf(valorLancamento));
		detailCadastro.setDataGeracaoRegistro(Integer.valueOf(dataGeracaoRegistro));
		detailCadastro.setCoberturaOcorrencia(numeroCoberturaOcorrencia);
		detailCadastro.setEspacosEmBranco("");
		detailCadastro.setIdentificacaoClienteConveniado(Integer.valueOf(identificacaoClienteConveniado));

		System.out.print("Escolha uma opção: \n");
		System.out.print("Digite 1 para pessoa física: \n");
		System.out.print("Digite 2 para pessoa jurídica: \n");

		Integer escolha = Integer.valueOf(entrada.nextLine());

		switch (escolha) {
		case 1:
			System.out.println("Digite o CPF:\n");
			String cpf = entrada.nextLine();
			
			System.out.print("CPF: " + cpf + "\n");
			detailCadastro.setCpfCliente(cpf);
			break;
		case 2:
			System.out.print("Digite o CNPJ:" + "\n");
			String cnpj = entrada.nextLine();

			System.out.print("CNPJ: " + cnpj + "\n");
			detailCadastro.setCnpjCliente(cnpj);
			break;
		}

		System.out.print("Digite o mes inicio vigencia:\n");
		String mesInicio = entrada.nextLine();

		detailCadastro.setMesFimVigencia(Integer.valueOf(mesInicio));

		System.out.print("Digite o mes fim vigencia:\n");
		String mesFim = entrada.nextLine();
		
		detailCadastro.setMesFimVigencia(Integer.valueOf(mesFim));

		if (escolha == 1) {
			System.out.print("Digite o complemento CNPJ:\n");

			String cnpjComplemento = entrada.nextLine();			
			detailCadastro.setMesFimVigencia(Integer.valueOf(cnpjComplemento));
		}

		System.out.print("\n");
		detailCadastro.setEspacosEmBranco2(" ");
		System.out.print("\n");
		detailCadastro.setEspacosEmBranco3(" ");
		System.out.println("\n");
		detailCadastro.setEspacosEmBranco4(Integer.valueOf(0));

		System.out.print("Insira número sequencial do registro\n");
		String numeroSequencial = entrada.nextLine();
		detailCadastro.setNumeroSequencialRegistro(Integer.valueOf(numeroSequencial));

		DetailCadastroDAO detailCadastroDAO = new DetailCadastroDAO();
		
		detailCadastroDAO.adiciona(detailCadastro);
		
		/*
		DetailCadastroEnviadoDAO detailCadastroEnviadoDAO = new DetailCadastroEnviadoDAO();
		DetailCadastroEnviado detailCadastroEnviado = new DetailCadastroEnviado();
		detailCadastroEnviado.setEnviado(false);
		detailCadastroEnviado.setDetailCadastro(detailCadastro);
		detailCadastroEnviadoDAO.adiciona(detailCadastroEnviado);
		*/

		return detailCadastro;
	}

	private void visualizarDetailsCadastrosSalvos() {
		/**
		 * -1.02 ---- Visualizar Details Cadastrados ---
		 */
		DetailCadastroDAO detailCadastroDAO = new DetailCadastroDAO();

		List<DetailCadastro> listaDetailCadastroEnviado = detailCadastroDAO.listar();

		for (DetailCadastro detailCadastro : listaDetailCadastroEnviado) {
			System.out.print("Detail Cadastro: " + detailCadastro + "\n");
		}
	}

	private void editarDetailCadastrado() {
		/**
		 * -1.03 ---- Editar Detail Cadastrado ---
		 */
		DetailCadastroDAO detailCadastroDAO = new DetailCadastroDAO();

		System.out.print("Visualizar Details Cadastro:\n");
		System.out.print("Atualizar Detail Cadastrado por ID:\n");
		System.out.print("Sair\n");

		Integer escolha = Integer.valueOf(entrada.nextLine());

		do {
			switch (escolha) {
			case 1:
				List<DetailCadastro> detailCadastroLista = detailCadastroDAO.listar();
				System.out.print(detailCadastroLista + "\n");
				break;
			case 2:
				System.out.print("Digite uma ID de Detail Cadastrado para fazer atualização:\n");
				Long id =  Long.valueOf(entrada.nextLine());

				DetailCadastro detailCadastro = gerarNovoCadastroDetailConveniado();
				detailCadastro.setId(id);
				detailCadastroDAO.alterar(detailCadastro);
				break;
			case 0:
				System.out.print("Retornando ao Menu...\n");
				break;
			}
		} while (escolha != 0);
	}

	public void deletarDetailCadastrado() {
		/**
		 * -1.04 ---- Deletar Detail Gerado ----
		 */
		DetailCadastroDAO detailDAO = new DetailCadastroDAO();

		System.out.print("Visualizar Details Cadastro:\n");
		System.out.print("Deletar Detail Cadastrado por ID:\n");
		System.out.print("Sair\n");

		Integer escolha =  Integer.valueOf(entrada.nextLine());

		do {
			switch (escolha) {
			case 1:
				List<DetailCadastro> detailCadastroLista = detailDAO.listar();
				System.out.println(detailCadastroLista);
				break;
			case 2:
				System.out.print("Digite a ID do objeto a ser deletado:\n");
				Long id =  Long.valueOf(entrada.nextLine());

				DetailCadastro detailCadastro = gerarNovoCadastroDetailConveniado();
				detailCadastro.setId(id);

				detailDAO.remove(detailCadastro);
				break;
			case 0:
				System.out.print("Retornando ao Menu...\n");
				break;
			}
		} while (escolha != 0);
	}

	@Override
	public String retornaNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
