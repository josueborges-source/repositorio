package br.celescacustra.principal.menus.detailconcessionariaconveniado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class AdicionarDetailConcessionariaConveniada implements Comando {
	
	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void executar() {
		
		try {
			String sql = "INSERT into DetailConcessionariaConveniada" + "(" 
					+ "identificacaoTipoRegistro, codigoUnidadeConsumidora,"
					+ "valorLancamento, dataLancamento, informacaoRegistro,"
					+ "espacosEmBranco, codigoContaGerencial, coberturaOcorrencia, "
					+ "descricaoCoberturaOcorrencia, espacosEmBranco, "
					+ "identificacaoClienteConveniado, cpfCliente, cnpjCliente"
					+ "getMesInicioVigencia, getMesFimVigencia, "
					+ "complementoCNPJ, espacosEmBranco2, espacosEmBranco3,"
					+ " espacosEmBranco4, numeroSequencialRegistro" + ")"
					+ "values (" + "?,?,?,?,?," + "?,?,?,?,?" + "?,?,?,?,?" + "?,?,?,?,?" + ")";

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);

			System.out.print("Identificação dos Clientes Conveniados: \n ");
			String identificacaoClientesConveniados = entrada.nextLine();
			stmt.setString(1, identificacaoClientesConveniados);

			System.out.print("Código da Unidade Consumidora: \n ");
			String codigoUnidadeConsumidora = entrada.nextLine();
			stmt.setString(2, codigoUnidadeConsumidora);

			System.out.print("Valor de Lançamento: \n ");
			String valorLancamento = entrada.nextLine();
			stmt.setString(3, valorLancamento);

			System.out.print("Data Lançamento: \n ");
			String dataLancamento = entrada.nextLine();
			stmt.setString(4, dataLancamento);

			System.out.print("Informação Registro: \n ");
			String informacaoRegistro = entrada.nextLine();
			stmt.setString(5, informacaoRegistro);
			
			System.out.print("Informação Registro: \n ");
			String espacosEmBranco = entrada.nextLine();
			stmt.setString(6, espacosEmBranco);

			System.out.print("Código Conta Gerencial: \n ");
			String codigoContagerencial = entrada.nextLine();
			stmt.setString(7, codigoContagerencial);

			System.out.print("Cobertura Ocorrencia: \n ");
			String coberturaOcorrencia = entrada.nextLine();
			stmt.setString(8, coberturaOcorrencia);

			System.out.print("Descrição Cobertura Ocorrencia: \n ");
			String descricaoCoberturaOcorrencia = entrada.nextLine();
			stmt.setString(9, descricaoCoberturaOcorrencia);

			stmt.setString(10, "");

			System.out.print("Identificação Cliente Conveniado: \n ");
			String identificacaoClienteConveniado = entrada.nextLine();
			stmt.setString(11, identificacaoClienteConveniado);

			System.out.print("CPF Cliente: \n ");
			String cpfCliente = entrada.nextLine();
			stmt.setString(12, cpfCliente);

			System.out.print("CNPJ Cliente: \n ");
			String cnpjCliente = entrada.nextLine();
			stmt.setString(13, cnpjCliente);

			System.out.print("Mes Inicio Vigencia: \n ");
			String getMesInicioVigencia = entrada.nextLine();
			stmt.setString(14, getMesInicioVigencia);

			System.out.print("Mes Fim Vigencia: \n ");
			String getMesFimVigencia = entrada.nextLine();
			stmt.setString(15, getMesFimVigencia);

			System.out.print("Complemento CNPJ: \n ");
			String complementoCNPJ = entrada.nextLine();
			stmt.setString(16, complementoCNPJ);

			stmt.setString(17, "");
			stmt.setString(18, "");
			stmt.setString(19, "");

			System.out.print("Número Sequencial Registro: \n ");
			String numeroSequencialRegistro = entrada.nextLine();
			stmt.setString(20, numeroSequencialRegistro);
			new Util().retornaPreparedStatement(stmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String retornaNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
