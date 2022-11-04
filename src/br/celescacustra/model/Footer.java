package br.celescacustra.model;

public class Footer implements Persistivel{

	private String identificacaoTipoRegistro;
	// Item: 9.01
	// Identificação do tipo de registro.
	// Posição Inicio: 1
	// Posição Fim: 1
	// Tamanho: 1
	// Tipo: CHAR
	// Dados: 9
	// Nota: Fixo.
	private Integer valorTotalLancamentos;
	// Item: 9.02
	// Valor total dos lançamentos.
	// Posição Inicio: 2
	// Posição Fim: 12
	// Tamanho: 11
	// Tipo: NUM
	/* 
	 Dados: Máximo 11 caracteres, com zeros a esquerda, sem vírgula ou ponto para as casas decimais
	 (ex: R5,00 = 000000500).
	*/
	private Integer espacosEmBranco;
	// Item: 9.03
	// Em branco.
	// Posição Inicio: 13
	// Posição Fim: 144
	// Tamanho: 132
	// Tipo: CHAR
	// Em branco	
	private Integer numeroSequencialRegistro;
	// Item: 9.04
	// Número sequencial do registro.
	// Posição Inicio: 145
	// Posição Fim: 150
	// Tamanho: 6
	// Tipo: NUM
	// Dados: 
	// Nota: Evoluir de 1 em 1, a cada registro gerado no arquivo.
	
	
	//Construtores:
	
	public String getIdentificacaoTipoRegistro() {
		return identificacaoTipoRegistro;
	}
	
	public void setIdentificacaoTipoRegistro(String identificacaoTipoRegistro) {
		this.identificacaoTipoRegistro = identificacaoTipoRegistro;
	}
	
	public Integer getValorTotalLancamentos() {
		return valorTotalLancamentos;
	}
	
	public void setValorTotalLancamentos(Integer valorTotalLancamentos) {
		this.valorTotalLancamentos = valorTotalLancamentos;
	}
	
	public Integer getEspacosEmBranco() {
		return espacosEmBranco;
	}
	
	public void setEspacosEmBranco(Integer espacosEmBranco) {
		this.espacosEmBranco = espacosEmBranco;
	}
	
	public Integer getNumeroSequencialRegistro() {
		return numeroSequencialRegistro;
	}
	
	public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}
	
	@Override
	public String toString() {
		return "Footer [identificacaoTipoRegistro=" + identificacaoTipoRegistro + ", valorTotalLancamentos="
				+ valorTotalLancamentos + ", espacosEmBranco=" + espacosEmBranco + ", numeroSequencialRegistro="
				+ numeroSequencialRegistro + "]";
	}

	public void instanciaDadosComArquivoCompleto(StringBuilder textoCompleto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String CreateTableQuery() {
		// TODO Auto-generated method stub
		return null;
	}	
}
