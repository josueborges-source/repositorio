package br.celescacustra.principal.menus.footer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class VisualizarFooter implements Comando {

	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void executar() {
		try {
			String sql = 
					"SELECT * FROM FROM VisualizarFooter";					

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);			
			
			System.out.print("Visualização itens Detail Cadastro: \n ");
			Long id = entrada.nextLong();
			
			stmt.setLong(1, id);
			new Util().retornaPreparedStatement(stmt);			
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
	}

	@Override
	public String retornaNome() {
		return "Visualizar Footers";
	}

}
