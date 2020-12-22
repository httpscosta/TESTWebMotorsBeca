package stepDefinitions;

import io.cucumber.java.an.E;
import pages.HomeWebmotorsPage;

public class SearchElementsTestsSteps {

	HomeWebmotorsPage validarelementosMenuBusca = new HomeWebmotorsPage();

	@E("verifico que existe o menu da barra de Busca")
	public void validarMenuBusca() {
		validarelementosMenuBusca.validaMenuBarraDeBusca();

	}

}
