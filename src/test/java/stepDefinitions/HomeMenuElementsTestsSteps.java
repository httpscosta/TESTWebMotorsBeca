package stepDefinitions;

import io.cucumber.java.an.E;

import pages.HomeWebmotorsPage;

public class HomeMenuElementsTestsSteps {

	HomeWebmotorsPage validarElementos = new HomeWebmotorsPage();

	@E("verifico que existe itens no  menu")
	public void validarMenu() {
		validarElementos.validaMenuHome();
	}

}
