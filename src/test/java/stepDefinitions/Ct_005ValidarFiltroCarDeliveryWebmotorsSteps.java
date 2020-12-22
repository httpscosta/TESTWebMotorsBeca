package stepDefinitions;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.PesquisaWebmotorsPage;

public class Ct_005ValidarFiltroCarDeliveryWebmotorsSteps {
	
	PesquisaWebmotorsPage pesquisaWebmotors = new PesquisaWebmotorsPage();
	
	@Quando("Quando seleciono o filtro Car delivery")	
	public void localizarCarroSaoPaulo() {
		pesquisaWebmotors.clicarBotaoCarDeliveryr();		
	}
	
	@Então("devo ser redirecionado a pagina da busca em Car Delivery")
	public void validaFiltroCarDelivery() {
		pesquisaWebmotors.validaFiltro("CAR DELIVERY");
	}
}
