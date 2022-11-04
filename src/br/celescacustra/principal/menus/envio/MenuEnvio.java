package br.celescacustra.principal.menus.envio;
import java.util.HashMap;
import java.util.Map;

import br.celescacustra.principal.menus.*;
import br.celescacustra.principal.menus.detailcadastro.*;

public class MenuEnvio implements Comando {

	Map<Integer, Comando> menuEnvio = new HashMap<Integer, Comando>();

	@Override
	public void executar() {
		menuEnvio.put(1, new AdicionarEnvio());
		menuEnvio.put(2, new AtualizarDetailCadastro());
		menuEnvio.put(3, new DeletarDetailCadastro());
		menuEnvio.put(4, new VisualizarDetailCadastro());

		Util.GerarMenu(menuEnvio);
	}

	@Override
	public String retornaNome() {
		return "Menu Envio Cadastro";
	}

}
