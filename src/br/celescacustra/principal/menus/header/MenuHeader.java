package br.celescacustra.principal.menus.header;
import br.celescacustra.principal.menus.*;

import java.util.HashMap;
import java.util.Map;

public class MenuHeader implements Comando {

	Map<Integer, Comando> menuFooter = new HashMap<Integer, Comando>();

	@Override
	public void executar() {
		menuFooter.put(1, new AdicionarHeader());
		menuFooter.put(2, new VisualizarHeader());
		menuFooter.put(3, new AtualizarHeader());
		menuFooter.put(4, new DeletarHeader());

		Util.GerarMenu(menuFooter);
	}

	@Override
	public String retornaNome() {
		return "Menu Header";
	}
}
