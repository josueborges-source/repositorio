package br.celescacustra.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection connection;	
	

	public static Connection getConnection() 
	{
		String jdbcURL = "jdbc:derby:celesclayout;create=true";
		try {			
			connection = DriverManager.getConnection(jdbcURL);			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closePreparedStatement(PreparedStatement stmt) throws SQLException
	   {
	      if ( stmt != null )
	      {
	         stmt.close();
	      }
	   }

	   public static void closeResultSet(ResultSet resultSet) throws SQLException
	   {
	      if ( resultSet != null )
	      {
	    	  resultSet.close();
	      }
	   }
	   
	   
	   public static void closeConnection(Connection connection) throws SQLException 
		{
		    if(connection != null) {		
		    	connection.close();	
			} 
		}
	   
	   

}
