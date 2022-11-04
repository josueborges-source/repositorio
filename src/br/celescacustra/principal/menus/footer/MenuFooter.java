package br.celescacustra.principal.menus.footer;
import br.celescacustra.principal.menus.*;

import java.util.HashMap;
import java.util.Map;

public class MenuFooter implements Comando {

	Map<Integer, Comando> menuFooter = new HashMap<Integer, Comando>();

	@Override
	public void executar() {
		menuFooter.put(1, new AdicionarFooter());
		menuFooter.put(2, new VisualizarFooter());
		menuFooter.put(3, new AtualizarFooter());
		menuFooter.put(4, new DeletarFooter());

		Util.GerarMenu(menuFooter);
	}

	@Override
	public String retornaNome() {
		return "Menu Footer";
	}
}
