package br.celescacustra.dto;

import java.util.ArrayList;
import java.util.List;

import br.celescacustra.model.*;

public class Envio implements Persistivel 
{
	private Header cabecalho = new Header();
	private List<DetailCadastroEnviado> detailCadastro = new ArrayList<DetailCadastroEnviado> ();
	private Footer rodape = new Footer();
	
	public Header getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(Header cabecalho) {
		this.cabecalho = cabecalho;
	}
	public List<DetailCadastroEnviado> getDetailCadastro() {
		return detailCadastro;
	}
	public void setDetailCadastro(List<DetailCadastroEnviado> detailCadastro) {
		this.detailCadastro = detailCadastro;
	}
	public Footer getRodape() {
		return rodape;
	}
	public void setRodape(Footer rodape) {
		this.rodape = rodape;
	}		
	public void adicionarDetailCadastro(DetailCadastroEnviado detailCadastro){
		this.detailCadastro.add(detailCadastro);
	}			
	public void removeDetailCadastro(DetailCadastroEnviado detailCadastro){
		this.detailCadastro.remove(detailCadastro);
	}	
	public String retornaArquivoDeEnvioTXT() {
		return "Texto Envio.";
	}
	@Override
	public String CreateTableQuery() {
		// TODO Auto-generated method stub
		return null;
	}	
}
