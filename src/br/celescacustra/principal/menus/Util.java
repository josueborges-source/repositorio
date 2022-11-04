package br.celescacustra.principal.menus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.model.Persistivel;


public class Util {
	
	public static ResultSet retornaPreparedStatement(PreparedStatement preparedStatement) 
	{
		ResultSet rs = null;
		try {
			rs = preparedStatement.executeQuery();
			preparedStatement.execute();
			preparedStatement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return rs;
	}

	public static void GerarMenu(Map<Integer, Comando> menuPrincipal) {
		Scanner input = new Scanner(System.in);

		for (Map.Entry<Integer, Comando> entry : menuPrincipal.entrySet()) 
		{						
			System.out.println(String.format("%d) %s", entry.getKey(), ((Comando)entry.getValue()).retornaNome()));			
		}

		System.out.println("Escolha uma opção: ");
		int escolha = input.nextInt();

		menuPrincipal.get(escolha).executar();

		input.close();
	}

	public static void GerarTabela(Persistivel entidade) 
	{
		try {
			retornaPreparedStatement(ConnectionFactory.getConnection().prepareStatement(entidade.CreateTableQuery()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
