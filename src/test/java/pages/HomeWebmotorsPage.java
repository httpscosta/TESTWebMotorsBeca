package pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class HomeWebmotorsPage extends CommonsBasePage{
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
WebElement botaoOfertas, linkFinanciar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	String botaoVerOfertas = "/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a";
	public HomeWebmotorsPage(){
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	

	public void validaUrlWebmotors() {
		assertTrue("URL não contém WebMotors", wait.until(ExpectedConditions.urlContains("webmotors")));
	}
	
	public void hoverPesquisar() {
		pesquisar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoPesquisar)));
		builder.moveToElement(pesquisar).build().perform();
	}

	public void clickBotaoVerOfertas() {
		pesquisar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(botaoVerOfertas)));
		pesquisar.click();
	}

	public void validaResultadoBotaoVerOfertas() {
		assertTrue("URL contém busca", wait.until(ExpectedConditions.urlContains("busca")));
	}

public void clickBottonOfertas() {
		botaoOfertas = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a")));
		botaoOfertas.click();

	}

	public void validaElmentoSubmenu() {
		String[] submenu = { "Localização", "O que é interessante pra você?", "Marca do carro", "Carros", "Ano",
				"Preço", "Quilometragem", "Opcionais", "Câmbio", "Combustível", "Final da Placa", "Cores", "Carroceria",
				"Categoria", "Ofertas", "Características" };

		for (String elementos : submenu) {

			_Driver().getPageSource().contains(elementos);

		}

	}

	public void validaMenuHome() {
		assertTrue("Não existe a opção Comprar", _Driver().getPageSource().contains("Comprar"));
		assertTrue("Não existe a opção Vender", _Driver().getPageSource().contains("Vender"));
		assertTrue("Não existe a opção Serviços", _Driver().getPageSource().contains("Serviços"));
		assertTrue("Não existe a opção Ajuda", _Driver().getPageSource().contains("Ajuda"));
		assertTrue("Não existe a opção Entrar", _Driver().getPageSource().contains("Entrar"));

	}

	public void validaMenuBarraDeBusca() {
		assertTrue("Não existe a opção Comprar Carros", _Driver().getPageSource().contains("Comprar Carros"));
		assertTrue("Não existe a opção Comprar Motos", _Driver().getPageSource().contains("Comprar Motos"));
		assertTrue("Não existe a opção Quero Vender", _Driver().getPageSource().contains("Quero Vender"));
		assertTrue("Não existe a opção Quero Financiar", _Driver().getPageSource().contains("Quero Financiar"));
		assertTrue("Não existe a opção Ver Ofertas", _Driver().getPageSource().contains("Ver Ofertas"));
	}

	public void validaLinkQueroFinanciar() {
		linkFinanciar = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[1]/h2[3]/a")));
		linkFinanciar.click();
		assertTrue("Não existe página quero financiar", wait.until(ExpectedConditions.urlContains("financiamento")));
	}




	

}
