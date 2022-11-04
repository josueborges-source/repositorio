package br.celescacustra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.model.DetailCadastro;

public class DetailCadastroDAO {

	
	public static final String INSERT_SQL_QUERY = "INSERT INTO detailCadastro" + " ("
			+ "codigoContaGerencial, cnpjCliente, coberturaOcorrencia, codigoUnidadeConsumidora, comandoMovimento,"
			+ "complementoCNPJ, cpfCliente, dataGeracaoRegistro, descricaoCoberturaOcorrencia, espacoEmBranco, "
			+ "espacoEmBranco2, espacoEmBranco3, espacoEmBranco4, identificacaoClienteConveniado, identificacaoTipoRegistro, "
			+ " mesInicioVigencia, mesFimVigencia, numeroSequencialRegistro, valorLancamento, numeroSequencialDeRegistro, "
			+ ") VALUES(?,?,?,?,?)";

	public static final String UPDATE_SQL_QUERY = "UPDATE detailCadastro SET"
			+ " codigoContaGerencial = ? , cnpjCliente = ?, coberturaOcorrencia = ?, codigoUnidadeConsumidora = ?, "
			+ "comandoMovimento = ?, complementoCNPJ = ?, cpfCliente = ?, dataGeracaoRegistro = ?, "
			+ "descricaoCoberturaOcorrencia = ?, espacoEmBranco = ?, espacoEmBranco2 = ?, espacoEmBranco3 = ?,"
			+ "espacoEmBranco4 = ?, identificacaoClienteConveniado = ?, identificacaoTipoRegistro = ?, mesInicioVigencia = ?"
			+ "mesFimVigencia = ?, numeroSequencialRegistro = ?, valorLancamento = ?, numeroSequencialDeRegistro = ?, "
			+ "WHERE ID=?";

	public static final String SELECT_SQL_QUERY = "SELECT"
			+ " codigoContaGerencial = ? , cnpjCliente = ?, coberturaOcorrencia = ?, codigoUnidadeConsumidora = ?, "
			+ "comandoMovimento = ?, complementoCNPJ = ?, cpfCliente = ?, dataGeracaoRegistro = ?, "
			+ "descricaoCoberturaOcorrencia = ?, espacoEmBranco = ?, espacoEmBranco2 = ?, espacoEmBranco3 = ?,"
			+ "espacoEmBranco4 = ?, identificacaoClienteConveniado = ?, identificacaoTipoRegistro = ?, mesInicioVigencia = ?"
			+ "mesFimVigencia = ?, numeroSequencialRegistro = ?, valorLancamento = ?, numeroSequencialDeRegistro = ?"
			+ "FROM DetailCadastro WHERE ID = ?";

	public static final String SELECT_ALL_SQL_QUERY = "SELECT"
			+ " codigoContaGerencial = ? , cnpjCliente = ?, coberturaOcorrencia = ?, codigoUnidadeConsumidora = ?, "
			+ "comandoMovimento = ?, complementoCNPJ = ?, cpfCliente = ?, dataGeracaoRegistro = ?, "
			+ "descricaoCoberturaOcorrencia = ?, espacoEmBranco = ?, espacoEmBranco2 = ?, espacoEmBranco3 = ?,"
			+ "espacoEmBranco4 = ?, identificacaoClienteConveniado = ?, identificacaoTipoRegistro = ?, mesInicioVigencia = ?"
			+ "mesFimVigencia = ?, numeroSequencialRegistro = ?, valorLancamento = ?, numeroSequencialDeRegistro = ?"
			+ "FROM DetailCadastro";

	public static final String DELETE_SQL_QUERY = "DELETE FROM DetailCadastro WHERE ID=?";

	public static final String DELETE_ALL_SQL_QUERY = "DELETE FROM DetailCadastro";

	public static final String CREATE_SQL_QUERY = "CREATE TABLE DetailCadastro" 
			+ "(" 
			+"id long,"
			+ "codigoContaGerencial varchar(255), cnpjCliente int, coberturaOcorrencia int, "
			+ "codigoUnidadeConsumidora int"
			+ "comandoMovimento int, complementoCNPJ int, cpfCliente int, dataGeracaoRegistro int,"
			+ "descricaoCoberturaOcorrencia int, espacoEmBranco varchar(255), espacoEmBranco2 varchar(255), espacoEmBranco3 varchar(255), "
			+ "espacoEmBranco4 int, identificacaoClienteConveniado int, identificacaoTipoRegistro varchar(255), mesInicioVigencia int, "
			+ "mesFimVigencia int , numeroSequencialRegistro varchar(255)," + "valorLancamento int" + ","
			+ "numeroSequencialDeRegistro int ," 
			+ ")";

	public void adiciona(DetailCadastro detailCadastro){		
		
		Connection connection = null;
		PreparedStatement ps = null;		
		
		try
		{
			connection = ConnectionFactory.getConnection();			
			if(connection == null) 
			{
				System.out.println("Erro capturando a conexão. Por favor cheque se o servidor de Banco de dados está rodando");
			}
			connection.setAutoCommit(false);
			ps = connection.prepareStatement(INSERT_SQL_QUERY);
			ps.setLong( 1, detailCadastro.getId());
			ps.setString( 2, detailCadastro.getCodigoContaGerencial());
			ps.setString( 3, detailCadastro.getCnpjCliente());
			ps.setString( 4, detailCadastro.getCoberturaOcorrencia());
			ps.setLong( 5, detailCadastro.getCodigoUnidadeConsumidora());
			ps.setLong( 6, detailCadastro.getComandoMovimento());
			ps.setLong( 7, detailCadastro.getComplementoCNPJ());
			ps.setString( 8, detailCadastro.getCpfCliente());
			ps.setLong( 9, detailCadastro.getDataGeracaoRegistro());
			ps.setLong( 10, detailCadastro.getDescricaoCoberturaOcorrencia());
			ps.setString( 11, detailCadastro.getEspacosEmBranco());
			ps.setString( 12, detailCadastro.getEspacosEmBranco2());
			ps.setString( 13, detailCadastro.getEspacosEmBranco3());
			ps.setLong( 14, detailCadastro.getEspacosEmBranco4());
			ps.setLong( 15, detailCadastro.getIdentificacaoClienteConveniado());
			ps.setString( 16, detailCadastro.getIdentificacaoTipoRegistro());
			ps.setLong( 17, detailCadastro.getMesInicioVigencia());
			ps.setLong( 18, detailCadastro.getMesFimVigencia());
			ps.setLong( 19, detailCadastro.getNumeroSequencialRegistro());
			ps.setLong( 20, detailCadastro.getValorLancamento());			
		}
		catch (SQLException exception) 
		{
			 try
	         {
	            if ( connection != null )
	            {
	            	connection.rollback();
	            }
	         }
	         catch ( SQLException exception2 )
	         {
	        	 exception2.printStackTrace();
	         }
	         exception.printStackTrace();
		}
		 finally
	      {
	         try
	         {
	        	ConnectionFactory.closePreparedStatement(ps);
	        	ConnectionFactory.closeConnection(connection);
	         }
	         catch ( SQLException exception )
	         {
	        	 exception.printStackTrace();
	         }
	      }
	}

	public List<DetailCadastro> listar() {
		
		  Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      List<DetailCadastro> detailCadastroLista = new ArrayList<DetailCadastro>();
	      try
	      {
	         con = ConnectionFactory.getConnection();
	         if ( con == null )
	         {
	            System.out.println( "Error getting the connection. Please check if the DB server is running" );
	            return null;
	         }
	         ps = con.prepareStatement( SELECT_ALL_SQL_QUERY );
	         rs = ps.executeQuery();
	         System.out.println( "Detail Cadastro => " + ps.toString() );
	         
	         while ( rs.next() )
	         {
	        	 
	        	DetailCadastro detailCadastro = new DetailCadastro();
	        	detailCadastro.setId( rs.getLong( "ID" ) ); //1
	        	detailCadastro.setIdentificacaoTipoRegistro(rs.getString("identificacaoTipoRegistro")); //2
	        	detailCadastro.setCodigoUnidadeConsumidora(rs.getInt("codigoUnidadeConsumidora")); //3 // valorLancamento
	        	detailCadastro.setValorLancamento(rs.getInt("valorLancamento"));
	        	detailCadastro.setDataGeracaoRegistro(rs.getInt("dataGeracaoRegistro"));	        	
	        	detailCadastro.setComandoMovimento(rs.getInt("comandoMovimento"));
	        	detailCadastro.setCodigoContaGerencial(rs.getString("codigoContaGerencial"));
	        	
	        	detailCadastro.setCoberturaOcorrencia(rs.getString("coberturaOcorrencia"));
	        	detailCadastro.setDescricaoCoberturaOcorrencia(rs.getInt("descricaoCoberturaOcorrencia"));
	        	detailCadastro.setEspacosEmBranco(rs.getString("espacosEmBranco"));
	        	//identificacaoClienteConveniado
	        	detailCadastro.setIdentificacaoClienteConveniado(rs.getInt("identificacaoClienteConveniado"));
	        	//cpfCliente
	        	detailCadastro.setCpfCliente(rs.getString("cpfCliente"));
	        	detailCadastro.setCnpjCliente(rs.getString("cnpjCliente"));
	        	detailCadastro.setMesInicioVigencia(rs.getInt("mesInicioVigencia"));
	        	detailCadastro.setMesFimVigencia(rs.getInt("mesFimVigencia"));
	        	
	        	detailCadastro.setComplementoCNPJ(rs.getInt("mesFimVigencia"));
	        	detailCadastro.setNumeroSequencialRegistro(rs.getInt("mesFimVigencia"));
	        	
	        	detailCadastro.setEspacosEmBranco2(rs.getString("espacoEmBranco2"));
	        	
	        	detailCadastro.setEspacosEmBranco3(rs.getString("espacoEmBranco3"));
	        	detailCadastro.setEspacosEmBranco4(rs.getInt("espacoEmBranco4"));
	        	
	        	detailCadastro.setIdentificacaoClienteConveniado(rs.getInt("identificacaoClienteConveniado"));	        	
	    
	        	detailCadastroLista.add( detailCadastro );
	         }

	      }
	      catch ( SQLException exception )
	      {
	    	  exception.printStackTrace();
	      }

	      return detailCadastroLista;
	}

	public void alterar(DetailCadastro detailCadastro) {
		
	      try
	      {
	    	 Connection connection = null;
	    	 PreparedStatement pStatement = null;
	    	 
	    	 connection = ConnectionFactory.getConnection();
	    	 pStatement = connection.prepareStatement( UPDATE_SQL_QUERY );
	    	 
	    	  pStatement.setString(1, detailCadastro.getIdentificacaoTipoRegistro());	    	  
	    	  pStatement.setInt(2, detailCadastro.getCodigoUnidadeConsumidora());
	    	  pStatement.setInt(3, detailCadastro.getValorLancamento());
	    	  pStatement.setInt(4, detailCadastro.getDataGeracaoRegistro());
	    	  pStatement.setInt(5, detailCadastro.getComandoMovimento());
	    	  pStatement.setString(6, detailCadastro.getCodigoContaGerencial());
	    	  pStatement.setString(7, detailCadastro.getCoberturaOcorrencia());
	    	  pStatement.setInt(8, detailCadastro.getDescricaoCoberturaOcorrencia());
	    	  pStatement.setString(9, detailCadastro.getEspacosEmBranco());
	    	  pStatement.setInt(10, detailCadastro.getIdentificacaoClienteConveniado());
	    	  pStatement.setString(11, detailCadastro.getCpfCliente());
	    	  pStatement.setString(12, detailCadastro.getCnpjCliente());
	    	  pStatement.setInt(13, detailCadastro.getMesInicioVigencia());
	    	  pStatement.setInt(14, detailCadastro.getMesFimVigencia());
	    	  pStatement.setInt(15, detailCadastro.getComplementoCNPJ());
	    	  pStatement.setString(16, detailCadastro.getEspacosEmBranco2());
	    	  pStatement.setString(17, detailCadastro.getEspacosEmBranco3());
	    	  pStatement.setInt(18, detailCadastro.getEspacosEmBranco4());
	    	  pStatement.setInt(19, detailCadastro.getNumeroSequencialRegistro());
	    	  pStatement.setLong(20, detailCadastro.getId());	    	  
	    	  

	    	  pStatement.executeUpdate();
	    	  pStatement.close();	             
	      }
	      catch ( SQLException exception )
	      {
	        	 exception.printStackTrace();
	      }
	}

	public void remove(DetailCadastro detailCadastro) {
		  Connection connection = null;
	      PreparedStatement pStatement = null;
	      ResultSet resultSet = null;
	      List<DetailCadastro> detailCadastroLista = new ArrayList<DetailCadastro>();      
	      
	      try
	      {	   
	    	  pStatement = connection.prepareStatement(
	    		      "DELETE detailCadastro"+ "WHERE id = ?");
	    	  pStatement.setLong(1, detailCadastro.getId());	 
	    	  resultSet = pStatement.executeQuery();
	      
	      }
	      catch ( Exception exception )
	      {
	        	 exception.printStackTrace();
	      }
	      
	}

}
