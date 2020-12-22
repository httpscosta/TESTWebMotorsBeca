package stepDefinitions;

import io.cucumber.java.it.*;
import io.cucumber.java.pt.Então;
import pages.LoginWebmotorsPage;

public class Ct_002LoginInvalidoWebmotorsTestsSteps {
	LoginWebmotorsPage loginInvalidoWebmotors = new LoginWebmotorsPage();

	@Quando("eu preencho os campos com login e senha errada")
	public void preencherDados() {
		loginInvalidoWebmotors.preencheDadosDeLogin("dandasaev@hotmail", "123445");
	}	
	@Então("eu devo ver a mensagem de erro, ou ser redirecionado pra um tela de trativa")
	public void confirmaçãoLogin() {
		loginInvalidoWebmotors.invalidaUrlPerfil();
	}
}
