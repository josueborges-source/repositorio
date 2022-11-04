package br.celescacustra.model;

public class DetailConcessionariaConveniado implements Persistivel {
	
	private String identificacaoTipoRegistro;
	// Item: 6.01
	// Identifica��o do tipo de registro.
	// Posi��o Inicio: 1
	// Posi��o Fim: 1
	// Tamanho: 1
	// Tipo: CHAR
	// Dados: 6
	// Nota: Fixo.
	
	private Integer codigoUnidadeConsumidora;
	// Item: 6.02
	// C�digo da unidade consumidora.
	// Posi��o Inicio: 2
	// Posi��o Fim: 14
	// Tamanho: 13
	// Tipo: NUM
	// Dados: 
	// Nota: M�ximo 13 caracteres, com zeros � esquerda.
	
	private Integer valorLancamento;
	// Item: 6.03
	// C�digo da unidade consumidora.
	// Posi��o Inicio: 2
	// Posi��o Fim: 15
	// Tamanho: 23
	// Tipo: NUM
	// Dados: 
	/*
	Nota: M�ximo 9 caracteres, com zeros a esquerda, sem v�rgula
	ou ponto para as casas decimais (ex: R5,00 = 000000500).
	*/
	
	private String dataLancamento;
	// Item: 6.04
	// Data do lan�amento (pagamento).
	// Posi��o Inicio: 24
	// Posi��o Fim: 31
	// Tamanho: 8
	// Tipo: NUM	
	// Dados: 
	/*
	Nota: Ver no arquivo �Layout Completo - Convenio Arrecadacao Terceiros.pdf�, Nota 15.
	*/
	
	private Integer informacaoRegistro;
	// Item: 6.05
	// Informativo do registro.
	// Posi��o Inicio: 24
	// Posi��o Fim: 31
	// Tamanho: 8
	// Tipo: NUM	
	// Dados: 
	/*
	Nota: Ver no arquivo �Layout Completo - Convenio Arrecadacao Terceiros.pdf�, Nota 15.
	*/
	
	private String codigoContaGerencial;
	// Item: 6.06
	// C�digo da Conta Gerencial.
	// Posi��o Inicio: 34
	// Posi��o Fim: 41
	// Tamanho: 8
	// Tipo: CHAR	
	// Dados: 11307AC1
	/*
	Nota: Fixo.
	*/
	
	private String espacosEmBranco;
	// Item: 6.07
	// Em Branco.
	// Posi��o Inicio: 42
	// Posi��o Fim: 74
	// Tamanho: 32
	// Tipo: CHAR	
	// Dados: 	
	// Nota: Em branco.
	
	
	private Integer identificacaoClienteConveniado;
	// Item: 6.08
	// Identifica��o do cliente conveniado
	// Posi��o Inicio: 84
	// Posi��o Fim: 89
	// Tamanho: 6
	// Tipo: NUM	
	// Dados: 
	// Nota: Em branco.
	
	private String codigoOrigemFatura;
	// Item: 6.09
	// C�digo da origem da fatura
	// Posi��o Inicio: 102
	// Posi��o Fim: 104
	// Tamanho: 3
	// Tipo: CHAR	
	// Dados: 
	/*
	 Ver no arquivo �Layout Completo - Convenio
	 Arrecadacao Terceiros.pdf�, Nota 18.
	 */
	
	private Integer numeroFatura;
	// Item: 6.10
	// N�mero da fatura.
	// Posi��o Inicio: 105
	// Posi��o Fim: 121
	// Tamanho: 17
	// Tipo: NUM	
	// Dados: 
	/*
	 Ver no arquivo �Layout Completo - Convenio
	 Arrecadacao Terceiros.pdf�, Nota 19.
	*/
	
	private Integer dataVencimentoBaixa;
	// Item: 6.11
	// Data De Vencimento Baixa.
	// Posi��o Inicio: 122
	// Posi��o Fim: 129
	// Tamanho: 17
	// Tipo: NUM	
	// Dados: 
	
	/*
	 Ver no arquivo �Layout Completo - Convenio
	 Arrecadacao Terceiros.pdf�, Nota 19.
	*/
	
	
	public String SQLQuery() {
		
		String query = "";
		/* query = 
		 "Create TABLE "
				 + "DetailConcessionariaConveniado" +				
			    "("+
				 
				"identificacaoTipoRegistro varchar(255)" + ","+
				"codigoUnidadeConsumidora int" +","+
				"valorLancamento int" + 
				
				"dataGeracaoRegistro int" + ","+				
				"espacosEmBranco int" + ","+				
				"identificacaoClienteConveniado int" + ","+	
				
				"cpfCliente int" + ","+					
				"cnpjCliente int" + ","+				
				"mesInicio varchar(255)" + ","+
				
				"codigoOrigemFatura varchar(255)" + ","+
				"numeroFatura varchar(255)" + ","+
				"dataVencimentoBaixa varchar(255)" + ","+
				
				")";
				*/
		return query;
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

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getInformacaoRegistro() {
		return informacaoRegistro;
	}

	public void setInformacaoRegistro(Integer informacaoRegistro) {
		this.informacaoRegistro = informacaoRegistro;
	}

	public String getCodigoContaGerencial() {
		return codigoContaGerencial;
	}

	public void setCodigoContaGerencial(String codigoContaGerencial) {
		this.codigoContaGerencial = codigoContaGerencial;
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

	public void setIdentificacaoClienteConveniado(Integer identificacaoClienteConveniado) {
		this.identificacaoClienteConveniado = identificacaoClienteConveniado;
	}

	public String getCodigoOrigemFatura() {
		return codigoOrigemFatura;
	}

	public void setCodigoOrigemFatura(String codigoOrigemFatura) {
		this.codigoOrigemFatura = codigoOrigemFatura;
	}

	public Integer getNumeroFatura() {
		return numeroFatura;
	}

	public void setNumeroFatura(Integer numeroFatura) {
		this.numeroFatura = numeroFatura;
	}

	public Integer getDataVencimentoBaixa() {
		return dataVencimentoBaixa;
	}

	public void setDataVencimentoBaixa(Integer dataVencimentoBaixa) {
		this.dataVencimentoBaixa = dataVencimentoBaixa;	
	}


	@Override
	public String CreateTableQuery() {
		// TODO Auto-generated method stub
		return null;
	}
}
