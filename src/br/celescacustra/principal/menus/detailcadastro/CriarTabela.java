package br.celescacustra.principal.menus.detailcadastro;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class CriarTabela implements Comando{

	@Override
	public void executar() 
	{
		    String sql = "create table ";
		    try {
				PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
				
				new Util().retornaPreparedStatement(stmt);
			}
		    catch (SQLException e) 
		    {
				e.printStackTrace();
			}
	}

	@Override
	public String retornaNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
