package br.celescacustra.principal.menus;

import java.sql.Connection;

import br.celescacustra.dao.connection.ConnectionFactory;

public interface Comando {

	void executar();
	String retornaNome();
	Connection connection = ConnectionFactory.getConnection();
	
}
