package br.celescacustra.model;

public class Header implements Persistivel{
	
	private String identificacaoTipoDeRegistro; 
	// Item: 1.01
	// Identificação do tipo de registro.
	// Posição Inicio: 1
	// Posição Fim: 1
	// Tamanho: 1
	// Tipo: CHAR
	// Dados: 1
	// Nota: Fixo.
	private String contrato;
	// Item: 1.02
	// Contrato.
	// Posição Inicio: 2
	// Posição Fim: 57
	// Tamanho: 56
	// Tipo: CHAR
	// Dados: 01000000002022908203774000AC1
	// Nota: Fixo, máximo 56.
	private String codigoConcessionaria;
	// Item: 1.03
	// Código da Concessionária.
	// Posição Inicio: 58
	// Posição Fim: 61
	// Tamanho: 4
	// Tipo: CHAR
	// Dados: 01000000002022908203774000AC1
	// Nota: Fixo, máximo 56.
	private Integer	dataEnvio;
	// Item: 1.04
	// Data de envio.
	// Posição Inicio: 62
	// Posição Fim: 69
	// Tamanho: 8
	// Tipo: NUM
	// Dados: DDMMAAAA
	// Nota: Data atual.
	private String	siglaMoeda;
	// Item: 1.05
	// Sigla da moeda.
	// Posição Inicio: 62
	// Posição Fim: 69
	// Tamanho: 8
	// Tipo: CHAR
	// Dados: DDMMAAAA
	// Nota: Evoluir de 1 em 1, a cada arquivo gerado.
	private Integer	numeroSequencialEnvio;	
	// Item: 1.06
	// Número sequencial de envio.
	// Posição Inicio: 76
	// Posição Fim: 81
	// Tamanho: 6
	// Tipo: NUM
	// Dados: 000001
	// Nota: Ver tabela no arquivo "Layout Completo - Convenio Arrecadacao Terceiros.pdf", Nota 4
	private String	motivoRecusaArquivoRemessa; 
	// Item: 1.07
	// Motivo de recusa do arquivo de remessa.
	// Posição Inicio: 82
	// Posição Fim: 83
	// Tamanho: 2
	// Tipo: CHAR
	// Dados: ASSOCIACAO CULTURAL
	// Nota: Fixo, máximo 20 caracteres
	private String	nomeClienteContratante;
	// Item: 1.08
	// Nome do Cliente Contratante.
	// Posição Inicio: 82
	// Posição Fim: 83
	// Tamanho: 2
	// Tipo: CHAR
	// Dados: ASSOCIACAO CULTURAL
	// Nota: Fixo, máximo 20 caracteres
	private String espacos;
	// Item: 1.09
	// Espaços.
	// Posição Inicio: 104
	// Posição Fim: 143
	// Tamanho: 40
	// Tipo: CHAR
	// Dados:
	// Nota:
	private String tipoArquivo;
	// Item: 1.10
	// Tipo de arquivo.
	// Posição Inicio: 144
	// Posição Fim: 144
	// Tamanho: 1
	// Tipo: CHAR
	// Dados: 
	// Nota: "1" para remessa ou "2" para retorno.
	private Integer	numeroSequencialRegistro;
	// Item: 1.11
	// Tipo de arquivo.
	// Posição Inicio: 145
	// Posição Fim: 150
	// Tamanho: 6
	// Tipo: NUM
	// Dados: 
	// Nota: Fixo
	
	/*
	public Header(String entrada)
	{
		String variavelAtual = entrada.substring(0, 1);			
		identificacaoTipoDeRegistro = variavelAtual;
		entrada = entrada.replaceFirst(identificacaoTipoDeRegistro, entrada);			
		System.out.println("IdentificacaoTipoDeRegistro: " + identificacaoTipoDeRegistro);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		contrato = variavelAtual;
		entrada = entrada.replaceFirst(contrato, entrada);		
		System.out.println("Contrato: " + contrato);		
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		codigoConcessionaria = variavelAtual;
		entrada = entrada.replaceFirst(codigoConcessionaria, entrada);		
		System.out.println("Código Concessionária: " + codigoConcessionaria);		
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		dataEnvio = Integer.getInteger(variavelAtual);
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Data De Envio: " + dataEnvio);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		siglaMoeda = variavelAtual;
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Sigla Moeda: " + siglaMoeda);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		numeroSequencialEnvio = Integer.valueOf(variavelAtual);
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Numero Sequencial Envio: " + numeroSequencialEnvio);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		motivoRecusaArquivoRemessa = variavelAtual;
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Motivo Recusa: " + motivoRecusaArquivoRemessa);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		nomeClienteContratante = variavelAtual;
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Nome Cliente Contratante: " + nomeClienteContratante);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		espaços = variavelAtual;
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Espaços: " + espaços);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		tipoArquivo = variavelAtual;
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Tipo Arquivo: " + tipoArquivo);
		
		variavelAtual = entrada.substring(0, entrada.indexOf(" "));			
		numeroSequencialRegistro = Integer.valueOf(variavelAtual);
		entrada = entrada.replaceFirst(variavelAtual, entrada);		
		System.out.println("Tipo Arquivo: " + numeroSequencialRegistro);		
	}	
	*/
	
	
	public Header(String entrada){
		this.identificacaoTipoDeRegistro = entrada.substring(0, 1);
		System.out.println(identificacaoTipoDeRegistro);
		this.contrato = entrada.substring(1, 57);
		System.out.println(contrato);
		this.codigoConcessionaria = entrada.substring(57, 61);
		System.out.println(codigoConcessionaria);
		this.dataEnvio = Integer.valueOf(entrada.substring(61, 69));
		System.out.println(dataEnvio);
		this.siglaMoeda = entrada.substring(69, 75);
		System.out.println(siglaMoeda);
		this.numeroSequencialEnvio = Integer.valueOf(entrada.substring(75, 81));
		System.out.println(numeroSequencialEnvio);
		this.motivoRecusaArquivoRemessa = entrada.substring(81, 82);
		System.out.println(motivoRecusaArquivoRemessa);
		this.nomeClienteContratante = entrada.substring(82, 103);
		System.out.println(nomeClienteContratante);
		this.espacos = entrada.substring(103, 143);
		System.out.println(espacos);
		this.tipoArquivo = entrada.substring(143, 144);
		System.out.println(tipoArquivo);
		this.numeroSequencialRegistro = Integer.valueOf(entrada.substring(144, 150));		
		System.out.println(numeroSequencialRegistro);
	}

	public Header() {
		// TODO Auto-generated constructor stub
	}

	//Construtores:	
	public String getIdentificacaoTipoDeRegistro() {
		return identificacaoTipoDeRegistro;
	}

	public void setIdentificacaoTipoDeRegistro(String identificacaoTipoDeRegistro) {
		this.identificacaoTipoDeRegistro = identificacaoTipoDeRegistro;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getCodigoConcessionaria() {
		return codigoConcessionaria;
	}

	public void setCodigoConcessionaria(String codigoConcessionaria) {
		this.codigoConcessionaria = codigoConcessionaria;
	}

	public Integer getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Integer dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getSiglaMoeda() {
		return siglaMoeda;
	}

	public void setSiglaMoeda(String siglaMoeda) {
		this.siglaMoeda = siglaMoeda;
	}

	public Integer getNumeroSequencialEnvio() {
		return numeroSequencialEnvio;
	}

	public void setNumeroSequencialEnvio(Integer numeroSequencialEnvio) {
		this.numeroSequencialEnvio = numeroSequencialEnvio;
	}

	public String getMotivoRecusaArquivoRemessa() {
		return motivoRecusaArquivoRemessa;
	}

	public void setMotivoRecusaArquivoRemessa(String motivoRecusaArquivoRemessa) {
		this.motivoRecusaArquivoRemessa = motivoRecusaArquivoRemessa;
	}

	public String getNomeClienteContratante() {
		return nomeClienteContratante;
	}

	public void setNomeClienteContratante(String nomeClienteContratante) {
		this.nomeClienteContratante = nomeClienteContratante;
	}

	public String getEspaços() {
		return espacos;
	}

	public void setEspaços(String espaços) {
		this.espacos = espaços;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public Integer getNumeroSequencialRegistro() {
		return numeroSequencialRegistro;
	}

	public void setNumeroSequencialRegistro(Integer numeroSequencialRegistro) {
		this.numeroSequencialRegistro = numeroSequencialRegistro;
	}

	@Override
	public String toString() {
		return "Header [identificacaoTipoDeRegistro=" + identificacaoTipoDeRegistro + ", contrato=" + contrato
				+ ", codigoConcessionaria=" + codigoConcessionaria + ", dataEnvio=" + dataEnvio + ", siglaMoeda="
				+ siglaMoeda + ", numeroSequencialEnvio=" + numeroSequencialEnvio + ", motivoRecusaArquivoRemessa="
				+ motivoRecusaArquivoRemessa + ", nomeClienteContratante=" + nomeClienteContratante + ", espaços="
				+ espacos + ", tipoArquivo=" + tipoArquivo + ", numeroSequencialRegistro=" + numeroSequencialRegistro
				+ "]";
	}

	public void instanciaDadosComArquivoCompleto(StringBuilder textoCompleto) 
	{
		System.out.println("Instacia com Arquivo Completo");		
	}

	@Override
	public String CreateTableQuery() {
		// TODO Auto-generated method stub
		return null;
	}	
}
