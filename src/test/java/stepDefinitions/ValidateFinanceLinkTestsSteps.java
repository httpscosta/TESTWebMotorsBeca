package stepDefinitions;

import io.cucumber.java.pt.Então;
import pages.HomeWebmotorsPage;

public class ValidateFinanceLinkTestsSteps {
	
	HomeWebmotorsPage linkQueroFinanciar = new HomeWebmotorsPage();
	
	@Então("verifico que sou direcionada para página de quero financiar")
	public void queroFinanciar() {
		linkQueroFinanciar.validaLinkQueroFinanciar();
	}

}
