package br.celescacustra.principal.menus;
import java.util.HashMap;
import java.util.Map;

import br.celescacustra.principal.menus.detailcadastro.*;
import br.celescacustra.principal.menus.detailconcessionariaconveniado.*;
import br.celescacustra.principal.menus.envio.*;
import br.celescacustra.principal.menus.footer.*;
import br.celescacustra.principal.menus.header.*;

public class MenuPrincipal implements Comando {
	
	Map<Integer, Comando> menuPrincipal = new HashMap<Integer,Comando>();
	 
	@Override
	public void executar() 
	{				
		menuPrincipal.put(1, new MenuDetailCadastro());
		menuPrincipal.put(2, new MenuDetailConcessionariaConveniada());
		menuPrincipal.put(3, new MenuFooter());
		menuPrincipal.put(4, new MenuHeader());
		menuPrincipal.put(5, new MenuEnvio());
		menuPrincipal.put(6, new MenuGerarTabelas());
		
		Util.GerarMenu(menuPrincipal);	 
	}
	
	@Override
	public String retornaNome() {
		return "Menu Principal";
	}	
}
