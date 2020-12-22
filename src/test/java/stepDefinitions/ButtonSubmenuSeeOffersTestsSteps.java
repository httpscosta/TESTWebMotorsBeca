package stepDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;

import io.cucumber.java.pt.Então;
import pages.HomeWebmotorsPage;

public class ButtonSubmenuSeeOffersTestsSteps {
	HomeWebmotorsPage homeWebmotors = new HomeWebmotorsPage();

	@Dado("que eu navego até a página home do Webmotors")
	public void acessarHome() {
		homeWebmotors.navegaSite();
		
	}

	@Quando("eu clico no botão ver ofertas")
	public void clickBotão() {
		homeWebmotors.clickButtonOfertas();
	}

	String pesquisarPalavra = "carro";

	@Então("vejo os itens do submenu")
	public void validarSubmenuVerOfertas() {
		homeWebmotors.validaElmentoSubmenu();

	}

}