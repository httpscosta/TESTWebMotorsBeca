package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomeWebmotorsPage;
import pages.PesquisaWebmotorsPage;

public class Ct_004ValidarFiltroLocalizacao {

	PesquisaWebmotorsPage pesquisaWebmotors = new PesquisaWebmotorsPage();
	
	@Dado("que eu navego até a página Pesquisa")
	public void irParaHome() {
		pesquisaWebmotors.acessaPaginaPesquisa();
		
	}
	@Quando("Quando digito são paulo no input de texto do campo localização")	
	public void localizarCarroSaoPaulo() {
		pesquisaWebmotors.localizarCarroPorLocalidade("São Paulo");		
	}
	@Então("devo ser redirecionado a pagina da busca em São Paulo")
	public void validaFiltroLocaliza() {
		pesquisaWebmotors.validaFiltro("SÃO PAULO - SP");
	}
}
