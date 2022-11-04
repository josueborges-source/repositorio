package br.celescacustra.principal.menus.header;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class AdicionarHeader implements Comando{

	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void executar() {
		
		try {
			String sql = "INSERT into" + "Header" + "(" 
					+ "identificacaoTipoDeRegistro, contrato,"
					+ "codigoConcessionaria, dataEnvio, siglaMoeda,"
					+ "numeroSequencialEnvio, motivoRecusaArquivoRemessa, nomeClienteContratante"
					+ "espacosEmBranco, tipoArquivo, numeroSequencialRegistro"
					+ "values (" + "?,?,?,?,?," + "?,?,?,?,?,?" + ")";

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);

			System.out.print("Identificação dos Clientes Conveniados: \n ");
			String identificacaoClientesConveniados = entrada.nextLine();
			stmt.setString(1, identificacaoClientesConveniados);

			System.out.print("Contrato: \n ");
			String contrato = entrada.nextLine();
			stmt.setString(2, contrato);

			System.out.print("Código Concessionaria: \n ");
			String codigoConcessionaria = entrada.nextLine();
			stmt.setString(3, codigoConcessionaria);

			System.out.print("Data Envio: \n ");
			String dataEnvio = entrada.nextLine();
			stmt.setString(4, dataEnvio);

			System.out.print("Sigla Moeda: \n ");
			String siglaMoeda = entrada.nextLine();
			stmt.setString(5, siglaMoeda);

			System.out.print("Numero Sequencial Envio\n ");
			String codigoContagerencial = entrada.nextLine();
			stmt.setString(6, codigoContagerencial);

			System.out.print("Motivo Recusa Arquivo Remessa Ocorrencia: \n ");
			String motivoRecusaArquivoRemessaOcorrencia = entrada.nextLine();
			stmt.setString(7, motivoRecusaArquivoRemessaOcorrencia);

			System.out.print("Nome Cliente Contratante: \n ");
			String nomeClienteContratante = entrada.nextLine();
			stmt.setString(8, nomeClienteContratante);

			stmt.setString(9, "");

			System.out.print("Tipo Arquivo: \n ");
			String tipoArquivo = entrada.nextLine();
			stmt.setString(10, tipoArquivo);

			System.out.print("Numero Sequencial Registro: \n ");
			String numeroSequencialRegistro = entrada.nextLine();
			stmt.setString(11, numeroSequencialRegistro);
			
			new Util().retornaPreparedStatement(stmt);

		} catch (SQLException e) {
			System.out.println("Exception "+ e.getMessage());
		}

	}

	@Override
	public String retornaNome() {
		// TODO Auto-generated method stub
		return "Header";
	}

}
