package br.celescacustra.principal.menus.detailconcessionariaconveniado;
import java.util.HashMap;
import java.util.Map;

import br.celescacustra.principal.menus.*;

public class MenuDetailConcessionariaConveniada implements Comando{
	
	Map<Integer, Comando> menuDetailConcessionariaConveniada = new HashMap<Integer,Comando>();
	
	@Override
	public void executar() {		
		menuDetailConcessionariaConveniada.put(1, new AdicionarDetailConcessionariaConveniada());
		menuDetailConcessionariaConveniada.put(2, new VisualizarDetailConcessionariaConveniada());
		menuDetailConcessionariaConveniada.put(3, new AtualizarDetailConcessionariaConveniada());
		menuDetailConcessionariaConveniada.put(4, new DeletarDetailConcessionariaConveniada());
		
		Util.GerarMenu(menuDetailConcessionariaConveniada);			 
	}
	
	@Override
	public String retornaNome() {
		return "Menu Detail Concessionaria Conveniada";		
	}

}
