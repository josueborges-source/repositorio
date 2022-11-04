package br.celescacustra.dto;

import java.util.ArrayList;
import java.util.List;

import br.celescacustra.model.*;

public class Recebimento implements Persistivel
{
	
	private Header cabecalho = new Header();
	private List<DetailConcessionariaConveniado> detailConcessionariaConveniado = 
			new ArrayList<DetailConcessionariaConveniado> ();
	
	private Footer rodape = new Footer();
	
	public Header getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(Header cabecalho) {
		this.cabecalho = cabecalho;
	}
	public List<DetailConcessionariaConveniado> getDetailCadastro() {
		return detailConcessionariaConveniado;
	}
	public void setDetailCadastro(List<DetailConcessionariaConveniado> detailCadastro) {
		this.detailConcessionariaConveniado = detailCadastro;
	}
	public Footer getRodape() {
		return rodape;
	}
	public void setRodape(Footer rodape) {
		this.rodape = rodape;
	}	
	
	public void adicionarDetailCadastro(
			DetailConcessionariaConveniado detailCadastroConcessionariaConveniado) 
	{
		this.detailConcessionariaConveniado.add(detailCadastroConcessionariaConveniado);
	}		
	
	public void removeDetailCadastro(
			DetailConcessionariaConveniado detailCadastroConcessionariaConveniado) 
	{
		this.detailConcessionariaConveniado.remove(detailCadastroConcessionariaConveniado);
	}
	@Override
	public String CreateTableQuery() {
		// TODO Auto-generated method stub
		return null;
	}
}
