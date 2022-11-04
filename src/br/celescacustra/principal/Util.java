package br.celescacustra.principal;

public class Util {

	abstract class EtapaDoMenu{
		
		public String mensagem;		

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}	
		
		public abstract void acao();
		
		public void executar() {
			acao();
		}
		
		
	}
	
	
}
