package br.celescacustra.principal.menus.detailcadastro;
import java.util.HashMap;
import java.util.Map;

import br.celescacustra.principal.menus.*;

public class MenuDetailCadastro implements Comando{
	
	Map<Integer, Comando> menuDetailCadastro = new HashMap<Integer,Comando>();
	
	@Override
	public void executar() 
	{		
		
		menuDetailCadastro.put(1, new AdicionarDetailCadastro());
		menuDetailCadastro.put(2, new VisualizarDetailCadastro());
		menuDetailCadastro.put(3, new AtualizarDetailCadastro());
		menuDetailCadastro.put(4, new DeletarDetailCadastro());
		
		Util.GerarMenu(menuDetailCadastro);			 
	}
	
	@Override
	public String retornaNome() {
		return "Menu Detail Cadastro";		
	}

}
