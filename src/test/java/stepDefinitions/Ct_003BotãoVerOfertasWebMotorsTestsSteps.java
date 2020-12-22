package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomeWebmotorsPage;

public class Ct_003BotãoVerOfertasWebMotorsTestsSteps {
	
	HomeWebmotorsPage homeWebmotors = new HomeWebmotorsPage();
	
	@Dado ("que eu navego até a página Home do Webmotors")
	public void irParaHome() {
		homeWebmotors.navegaSite();;
		
	}
	
	@Quando("clico no botão Ver Ofertas")
	public void clickBotão(){
		homeWebmotors.clickBotaoVerOfertas();
	}
	String pesquisarPalavra = "carro";
	
	@Então("devo ser redirecionado a pagina da busca")
	public void validarRedicionamentoDePaginas() {
	homeWebmotors.validaResultadoBotaoVerOfertas();
	
		
	}
}	
