package br.celescacustra.dto;

import br.celescacustra.model.DetailCadastro;

public class DetailCadastroEnviado 
{
	private DetailCadastro detailCadastro;
	private Boolean enviado = false;
	
	public DetailCadastro getDetailCadastro() {
		return detailCadastro;
	}
	public void setDetailCadastro(DetailCadastro detailCadastro) {
		this.detailCadastro = detailCadastro;
	}
	public Boolean isEnviado() {
		return enviado;
	}
	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}	
	
	
	
	
}
