package br.celescacustra.model;

import br.celescacustra.dao.DetailCadastroDAO;

public class PrincipalTesteDetailConcessionariaConveniado {

	public static void main(String[] args) {
		
		DetailCadastroDAO detailCadastroDAO = new DetailCadastroDAO();
		
		DetailCadastro detailCadastro = new DetailCadastro();
		
		detailCadastro.setCnpjCliente("");
		detailCadastro.setCoberturaOcorrencia("");
		detailCadastro.setCodigoContaGerencial("");
		detailCadastro.setCodigoUnidadeConsumidora(Integer.valueOf(0));
		detailCadastro.setComandoMovimento(Integer.valueOf(0));
		detailCadastro.setComplementoCNPJ(Integer.valueOf(0));
		detailCadastro.setCpfCliente("");
		detailCadastro.setDataGeracaoRegistro(Integer.valueOf(0));
		detailCadastro.setDescricaoCoberturaOcorrencia(Integer.valueOf(0));
		detailCadastro.setEspacosEmBranco("");
		detailCadastro.setEspacosEmBranco2("");
		detailCadastro.setEspacosEmBranco3("");
		detailCadastro.setEspacosEmBranco4(Integer.valueOf(0));
		detailCadastro.setId(Long.valueOf(1));
		detailCadastro.setIdentificacaoClienteConveniado(Integer.valueOf(0));
		detailCadastro.setIdentificacaoTipoRegistro("");
		detailCadastro.setMesFimVigencia(Integer.getInteger("2302"));
		detailCadastro.setMesInicioVigencia(Integer.getInteger("2302"));
		detailCadastro.setNomeTabela("");
		detailCadastro.setNumeroSequencialRegistro(Integer.getInteger("0"));
		detailCadastro.setValorLancamento(Integer.getInteger("0"));		
		
		detailCadastroDAO.alterar(detailCadastro);
	}

}
