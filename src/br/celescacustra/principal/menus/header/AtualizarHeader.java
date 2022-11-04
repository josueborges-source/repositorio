package br.celescacustra.principal.menus.header;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.celescacustra.dao.connection.ConnectionFactory;
import br.celescacustra.principal.menus.Comando;
import br.celescacustra.principal.menus.Util;

public class AtualizarHeader implements Comando {

	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void executar() {
		try {
			String sql = 
					"UPDATE Header SET"
					+ "identificacaoTipoDeRegistro =?, contrato=?," 
					+ "codigoConcessionaria=?, dataEnvio=?, siglaMoeda=?,"
					+ "numeroSequencialEnvio=?, motivoRecusaArquivoRemessa=?, nomeClienteContratante=?,"
					+ "espacos=?, tipoArquivo=?, numeroSequencialRegistro=? where id=?";

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);

			System.out.print("Identificação Tipo De Registro: \n ");
			String identificacaoClientesConveniados = entrada.nextLine();
			stmt.setString(1, identificacaoClientesConveniados);

			System.out.print("Contrato: \n ");
			String contrato = entrada.nextLine();
			stmt.setString(2, contrato);

			System.out.print("Código Concessionária: \n ");
			String codigoConcessionaria = entrada.nextLine();
			stmt.setString(3, codigoConcessionaria);

			System.out.print("Data Envio: \n ");
			String dataGeracao = entrada.nextLine();
			stmt.setString(4, dataGeracao);

			System.out.print("Sigla Moeda: \n ");
			String siglaMoeda = entrada.nextLine();
			stmt.setString(5, siglaMoeda);

			System.out.print("Numero Sequencial Envio: \n ");
			String numeroSequencialEnvio = entrada.nextLine();
			stmt.setString(6, numeroSequencialEnvio);

			System.out.print("Motivo Recusa Arquivo Remessa: \n ");
			String motivoRecusaArquivoRemessa = entrada.nextLine();
			stmt.setString(7, motivoRecusaArquivoRemessa);

			System.out.print("Nome Cliente Contratante:\n ");
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
			System.out.println(e.toString());
		}	
	}

	@Override
	public String retornaNome() {
		return "Atualizar Footer";
	}

}
