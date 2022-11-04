package br.celescacustra.model;

public class DetailCadastro implements Persistivel{

	private Long id;
	private String nomeTabela = "DetailCadastro";
	

	private String identificacaoTipoRegistro;
	// Item: 2.01
	// Identifica��o do tipo de registro.
	// Posi��o Inicio: 1
	// Posi��o Fim: 1
	// Tamanho: 1
	// Tipo: CHAR
	// Dados: 9
	// Nota: Fixo.
	
	private Integer codigoUnidadeConsumidora;
	// Item: 2.02
	// C�digo da unidade consumidora.
	// Posi��o Inicio: 2
	// Posi��o Fim: 14
	// Tamanho: 13
	// Tipo: NUM
	// Dados: M�ximo 13 caracteres, com zeros � esquerda.
	
	private Integer valorLancamento;
	// Item: 2.03
	// Valor de lan�amento.
	// Posi��o Inicio: 15
	// Posi��o Fim: 23
	// Tamanho: 9
	// Tipo: NUM
	// Dados: 
	/* 
	Dados: M�ximo 9 caracteres, com zeros a esquerda, sem v�rgula ou ponto para as casas decimais 
	(ex: R5,00 = 000000500).
	*/	
		
	private Integer dataGeracaoRegistro;
	// Item: 2.04
	// Data de gera��o do registro.
	// Posi��o Inicio: 24
	// Posi��o Fim: 31
	// Tamanho: 8
	// Tipo: NUM
	// Dados: DDMMAAAA
	// Nota: Data atual.
	
	private Integer comandoMovimento;
	// Item: 2.05
	// Comando do movimento.
	// Posi��o Inicio: 32
	// Posi��o Fim: 33
	// Tamanho: 2
	// Tipo: CHAR
	// Dados: 
	// Nota: Ver no arquivo �Layout Completo - Convenio Arrecadacao Terceiros.pdf�, Nota 07.
	
	private String codigoContaGerencial;
	// Item: 2.06
	// Comando do movimento.
	// Posi��o Inicio: 34
	// Posi��o Fim: 41
	// Tamanho: 8
	// Tipo: CHAR
	// Dados: 11307AC1
	// Nota: Fixo.
	
	private String coberturaOcorrencia;
	// Item: 2.07
	// Cobertura/Ocorr�ncia.
	// Posi��o Inicio: 42
	// Posi��o Fim: 43
	// Tamanho: 2
	// Tipo: CHAR
	// Dados: 
	/*
	Ver no arquivo �Layout Completo - Convenio Arrecadacao Terceiros.pdf�, Nota 09.
	*/
	
	private Integer descricaoCoberturaOcorrencia;
	// Item: 2.08
	// Cobertura/Ocorr�ncia.
	// Posi��o Inicio: 42
	// Posi��o Fim: 43
	// Tamanho: 2
	// Tipo: CHAR
	// Dados: 
	/*
	Ver no arquivo �Layout Completo - Convenio Arrecadacao Terceiros.pdf�, Nota 09.
	*/
	
	private String espacosEmBranco;
	// Item: 2.09
	// Cobertura/Ocorr�ncia.
	// Posi��o Inicio: 44
	// Posi��o Fim: 73
	// Tamanho: 30	
	// Tipo: CHAR
	// Dados: 
	// Nota: Em branco.
	

	private Integer identificacaoClienteConveniado;
	// Item: 2.10
	// Identifica��o do cliente no conveniado.
	// Posi��o Inicio: 84
	// Posi��o Fim: 89
	// Tamanho: 6	
	// Tipo: NUM
	// Dados: 
	// Nota: M�ximo 6.
	
	private String cpfCliente;
	// Item: 2.11
	// CPF do Cliente.
	// Posi��o Inicio: 90
	// Posi��o Fim: 100
	// Tamanho: 11	
	// Tipo: CHAR
	// Dados: 
	// Nota: M�ximo 11, com zeros � esquerda.
	
	private String cnpjCliente;
	// Item: 2.11
	// CNPJ do Cliente.
	// Posi��o Inicio: 90
	// Posi��o Fim: 101
	// Tamanho: 12	
	// Tipo: CHAR
	// Dados: 
	// Nota: M�ximo 12, com zeros � esquerda. Complemento no campo 2.14
	
	private Integer mesInicioVigencia;
	// Item: 2.12
	// M�s de in�cio vig�ncia. In�cio cobran�a.	Sempre utilizar o m�s seguinte.
	// Posi��o Inicio: 102
	// Posi��o Fim: 109
	// Tamanho: 8	
	// Tipo: NUM
	// Dados: 01MMAAAA
	// Nota: IMPORTANTE: Sempre utilizar o m�s seguinte.
	
	private Integer mesFimVigencia;
	// Item: 2.13
	// M�s de in�cio vig�ncia. In�cio cobran�a.	Sempre utilizar o m�s seguinte.
	// Posi��o Inicio: 102
	// Posi��o Fim: 109
	// Tamanho: 8	
	// Tipo: NUM
	// Dados: 00000000
	// Fixo zeros
	
	private Integer complementoCNPJ;
	// Item: 2.14
	// M�s de fim de vig�ncia.
	// Posi��o Inicio: 110
	// Posi��o Fim: 117
	// Tamanho: 8	
	// Tipo: NUM
	// Dados: 
	// Fixo zeros
	
	private String espacoEmBranco2;
	// Item: 2.15
	// M�s de fim de vig�ncia.
	// Posi��o Inicio: 118
	// Posi��o Fim: 119
	// Tamanho: 2	
	// Tipo: CHAR
	// Dados: 
	// Nota: Em branco
	
	private String espacoEmBranco3;
	// Item: 2.16
	// Espa�os em branco.
	// Posi��o Inicio: 120
	// Posi��o Fim: 121
	// Tamanho: 2	
	// Tipo: CHAR
	// Dados: 
	// Nota: Em branco
	
	private Integer espacoEmBranco4;
	// Item: 2.17
	// Espa�os em branco.
	// Posi��o Inicio: 122
	// Posi��o Fim: 134
	// Tamanho: 13	
	// Tipo: NUM
	// Dados: 
	/*
	Nota: Evoluir de 1 em 1, a cada registro gerado no arquivo.
	*/
	
	private Integer numeroSequencialRegistro;
	// Item: 2.18
	// N�mero sequencial do registro.
	// Posi��o Inicio: 145
	// Posi��o Fim: 150
	// Tamanho: 6	
	// Tipo: NUM
	// Dados: 
	/*
 	Nota: Evoluir de 1 em 1, a cada registro gerado no arquivo.
	*/
	
	//Construtores:	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeTabela() {
		return nomeTabela;
	}

	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}

	public String getIdentificacaoTipoRegistro() {
		return identificacaoTipoRegistro;
	}

	public void setIdentificacaoTipoRegistro(String identificacaoTipoRegistro) {
		this.identificacaoTipoRegistro = identificacaoTipoRegistro;
	}

	public Integer getCodigoUnidadeConsumidora() {
		return codigoUnidadeConsumidora;
	}

	public void setCodigoUnidadeConsumidora(Integer codigoUnidadeConsumidora) {
		this.codigoUnidadeConsumidora = codigoUnidadeConsumidora;
	}

	public Integer getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(Integer valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public Integer getDataGeracaoRegistro() {
		return dataGeracaoRegistro;
	}

	public void setDataGeracaoRegistro(Integer dataGeracaoRegistro) {
		this.dataGeracaoRegistro = dataGeracaoRegistro;
	}

	public Integer getComandoMovimento() {
		return comandoMovimento;
	}

	public void setComandoMovimento(Integer comandoMovimento) {
		this.comandoMovimento = comandoMovimento;
	}

	public String getCodigoContaGerencial() {
		return codigoContaGerencial;
	}

	public void setCodigoContaGerencial(String codigoContaGerencial) {
		this.codigoContaGerencial = codigoContaGerencial;
	}

	public String getCoberturaOcorrencia() {
		return coberturaOcorrencia;
	}

	public void setCoberturaOcorrencia(String coberturaOcorrencia) {
		this.coberturaOcorrencia = coberturaOcorrencia;
	}

	public Integer getDescricaoCoberturaOcorrencia() {
		return descricaoCoberturaOcorrencia;
	}

	public void setDescricaoCoberturaOcorrencia(Integer descricaoCoberturaOcorrencia) {
		this.descricaoCoberturaOcorrencia = descricaoCoberturaOcorrencia;
	}

	public String getEspacosEmBranco() {
		return espacosEmBranco;
	}

	public void setEspacosEmBranco(String espacosEmBranco) {
		this.espacosEmBranco = espacosEmBranco;
	}

	public Integer getIdentificacaoClienteConveniado() {
		return identificacaoClienteConveniado;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getCnpjCliente() {
		return cnpjCliente;
	}

	public void setCnpjCliente(String cnpjCliente) {
		this.cnpjCliente = cnpjCliente;
	}

	public Integer getMesInicioVigencia() {
		return mesInicioVigencia;
	}

	public void setMesInicioVigencia(Integer mesInicioVigencia) {
		this.mesInicioVigencia = mesInicioVigencia;
	}

	public Integer getMesFimVigencia() {
		return mesFimVigencia;
	}

	public void setMesFimVigencia(Integer mesFimVigencia) {
		this.mesFimVigencia = mesFimVigencia;
	}

	public Integer getComplementoCNPJ() {
		return complementoCNPJ;
	}

	public void setComplementoCNPJ(Integer complementoCNPJ) {
		this.complementoCNPJ = complementoCNPJ;
	}

	public Integer getNumeroSequencialRegistro() {
		return numeroSequencialRegistro;
	}

	public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}		

	public String getEspacosEmBranco2() {
		return espacoEmBranco2;
	}

	public void setEspacosEmBranco2(String espacoEmBranco2) {
		this.espacoEmBranco2 = espacoEmBranco2;
	}

	public String getEspacosEmBranco3() {
		return espacoEmBranco3;
	}

	public void setEspacosEmBranco3(String espacoEmBranco3) {
		this.espacoEmBranco3 = espacoEmBranco3;
	}

	public Integer getEspacosEmBranco4() {
		return espacoEmBranco4;
	}

	public void setEspacosEmBranco4(Integer espacoEmBranco4) {
		this.espacoEmBranco4 = espacoEmBranco4;
	}

	public void setIdentificacaoClienteConveniado(Integer identificacaoClienteConveniado) {
		this.identificacaoClienteConveniado = identificacaoClienteConveniado;
	}
	
	
	public String CreateTableQuery() {
		String createTableDetailCadastro = 
		 "Create TABLE "+ 
				 this.nomeTabela +				    
				"("+				
				"id long" + ","+
				
				"codigoContaGerencial varchar(255)" + ","+
				"cnpjCliente int" +","+
				"coberturaOcorrencia varchar(255)" + ","+				
				"codigoUnidadeConsumidora int" + ","+	
				
				"comandoMovimento int" + ","+				
				"complementoCNPJ int" + ","+				
				"cpfCliente varchar(255)" + ","+					
				"dataGeracaoRegistro int" + ","+	
				
				"descricaoCoberturaOcorrencia int" + ","+				
				"espacoEmBranco varchar(255)" + ","+
				"espacoEmBranco2 varchar(255)" + ","+				
				"espacoEmBranco3 varchar(255)" + ","+
				
				"espacoEmBranco4 int" + ","+				
				"identificacaoClienteConveniado int" + ","+
				"identificacaoTipoRegistro varchar(255)" + ","+				
				"mesFimVigencia int" + ","+
				
				"mesInicioVigencia int" + ","+
				"numeroSequencialRegistro varchar(255)" + ","+
				"valorLancamento int" + ","+				
				"numeroSequencialDeRegistro int" + ","+
				
				"mesInicioVigencia int" + ","+
				"valorLancamento int"		 
		         +")";			
				
		return createTableDetailCadastro;
	}
	
	private String insert = 
	"INSERT into" + 
					this.nomeTabela + 
					"(" +
					"id, identificacaoClienteConveniado, codigoUnidadeConsumidora," +
					"valorLancamento, dataGeracaoRegistro, "
					+ "comandoMovimento,codigoContaGerencial, coberturaOcorrencia, "
					+ "descricaoCoberturaOcorrencia, espacosEmBranco, " +
					"identificacaoClienteConveniado, cpfCliente, cnpjCliente" +
					"getMesInicioVigencia, getMesFimVigencia," + ""
					+ "complementoCNPJ, espacosEmBranco2, espacosEmBranco3, espacosEmBranco4, "
					+ "numeroSequencialRegistro"+ ")" +
					"values (" +
					"?,?,?,?,?," + "?,?,?,?,?," + "?,?,?,?,?," + "?,?,?,?,? " + ")";
	
	private String select = 
	"SELECT * FROM DetailCadastro";
	
	private String update = 
			"identificacaoClienteConveniado, codigoUnidadeConsumidora, valorLancamento, dataGeracaoRegistro, "+
			"comandoMovimento,codigoContaGerencial, coberturaOcorrencia, descricaoCoberturaOcorrencia, espacosEmBranco, " +
			"identificacaoClienteConveniado, cpfCliente, cnpjCliente, getMesInicioVigencia, getMesFimVigencia, " + 
			"complementoCNPJ, espacosEmBranco2, espacosEmBranco3, espacosEmBranco4, numeroSequencialRegistro"+
			"values (" + 
			"?,?,?,?,?," + "?,?,?,?,?," + "?,?,?,?,?," + "?,?,?,?,? " + 
			" where id = ?)";
	
	
	public String getInsert() 
	{
		return this.insert;
	}

}
