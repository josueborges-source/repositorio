package br.celescacustra.principal.menus.footer;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class AdicionarFooter implements Comando {

	Scanner entrada = new Scanner(System.in);

	@Override
	public void executar() {

		try {
			String sql = 
					"INSERT into" + "Footer" 
					+ "(identificacaoTipoRegistro,"
					+ " valorTotalLancamentos,espacosEmBranco, numeroSequencialRegistro )" 
					+ "values (" + "?,?,?,?" + ")";

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);

			System.out.print("Identificação Tipo de Registro: \n ");
			String identificacaoClientesConveniados = entrada.nextLine();
			stmt.setString(1, identificacaoClientesConveniados);

			System.out.print("Valor Total de Lançamentos: \n ");
			String valorTotalLancamentos = entrada.nextLine();
			stmt.setString(2, valorTotalLancamentos);

			stmt.setString(3, "");

			System.out.print("Número Sequencial de Registro: \n ");
			String numeroSequencialRegistro = entrada.nextLine();
			stmt.setString(4, numeroSequencialRegistro);
			new Util().retornaPreparedStatement(stmt);

		} catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String retornaNome() {
		return "Inserir Footer";
	}

}
