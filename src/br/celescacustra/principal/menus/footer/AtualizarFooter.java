package br.celescacustra.principal.menus.footer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class AtualizarFooter implements Comando {

	
	Scanner entrada = new Scanner(System.in);
	@Override
	public void executar() 
	{
		try {
			String sql = "UPDATE Footer SET" 
					+ "identificacaoTipoRegistro=?, valorTotalLancamentos=?,"
					+ "espacosEmBranco=?, numeroSequencialRegistro=?,"
					+ "values (" + "?,?,?,?" + ")";

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);

			System.out.print("Identifica��o dos Clientes Conveniados: \n ");
			String identificacaoClientesConveniados = entrada.nextLine();
			stmt.setString(1, identificacaoClientesConveniados);

			System.out.print("C�digo da Unidade Consumidora: \n ");
			String codigoUnidadeConsumidora = entrada.nextLine();
			stmt.setString(2, codigoUnidadeConsumidora);

			System.out.print("Valor de Lan�amento: \n ");
			String valorLancamento = entrada.nextLine();
			stmt.setString(3, valorLancamento);

			System.out.print("Data Lan�amento: \n ");
			String dataLancamento = entrada.nextLine();
			stmt.setString(4, dataLancamento);
			
			new Util().retornaPreparedStatement(stmt);

		} catch (SQLException e) 
		{
			System.out.println(e.toString());
		}
	}

	@Override
	public String retornaNome() {
		return "Atualizar Footer";
	}

}
