package br.celescacustra.principal.menus.envio;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class AtualizarEnvio implements Comando {

Scanner entrada = new Scanner(System.in);
	
	@Override
	public void executar() {

		try {
			String sql = "UPDATE DetailConcessionariaConveniada " + "SET" 
					+ "identificacaoTipoRegistro=?, codigoUnidadeConsumidora=?,"
					+ "valorLancamento=?, dataLancamento=?, informacaoRegistro,=?"
					+ "codigoContaGerencial=?, coberturaOcorrencia=?, descricaoCoberturaOcorrencia=?"
					+ "espacosEmBranco=?, identificacaoClienteConveniado=?, cpfCliente=?, cnpjCliente=?"
					+ "getMesInicioVigencia=?, getMesFimVigencia=?, complementoCNPJ=?"
					+ "espacosEmBranco2=?, espacosEmBranco3=?, espacosEmBranco4=?, "
					+ "numeroSequencialRegistro=?" + ")"
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

			System.out.print("Código Conta Gerencial: \n ");
			String codigoContagerencial = entrada.nextLine();
			stmt.setString(6, codigoContagerencial);

			System.out.print("Cobertura Ocorrencia: \n ");
			String coberturaOcorrencia = entrada.nextLine();
			stmt.setString(7, coberturaOcorrencia);

			System.out.print("Descrição Cobertura Ocorrencia: \n ");
			String descricaoCoberturaOcorrencia = entrada.nextLine();
			stmt.setString(8, descricaoCoberturaOcorrencia);

			stmt.setString(9, "");

			System.out.print("Identificação Cliente Conveniado: \n ");
			String identificacaoClienteConveniado = entrada.nextLine();
			stmt.setString(10, identificacaoClienteConveniado);

			System.out.print("CPF Cliente: \n ");
			String cpfCliente = entrada.nextLine();
			stmt.setString(11, cpfCliente);

			System.out.print("CNPJ Cliente: \n ");
			String cnpjCliente = entrada.nextLine();
			stmt.setString(12, cnpjCliente);

			System.out.print("Mes Inicio Vigencia: \n ");
			String getMesInicioVigencia = entrada.nextLine();
			stmt.setString(13, getMesInicioVigencia);

			System.out.print("Mes Fim Vigencia: \n ");
			String getMesFimVigencia = entrada.nextLine();
			stmt.setString(14, getMesFimVigencia);

			System.out.print("Complemento CNPJ: \n ");
			String complementoCNPJ = entrada.nextLine();
			stmt.setString(15, complementoCNPJ);

			stmt.setString(16, "");
			stmt.setString(17, "");
			stmt.setString(18, "");

			System.out.print("Número Sequencial Registro: \n ");
			String numeroSequencialRegistro = entrada.nextLine();
			stmt.setString(19, numeroSequencialRegistro);
			new Util().retornaPreparedStatement(stmt);

		} catch (SQLException e) 
		{
			System.out.println(e.toString());
		}
	}

	@Override
	public String retornaNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
