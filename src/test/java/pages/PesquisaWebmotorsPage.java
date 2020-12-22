package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class PesquisaWebmotorsPage extends CommonsBasePage {
	WebDriverWait wait;
	Actions builder;
	static WebDriver driver;
	
	WebElement pesquisar;
	
	String campoFiltros = "FilterResultContainer";
	String LocalidadeSaoPaulo = "São Paulo";
	
	public void acessaPaginaPesquisa() {
		navegarAteSite("https://login.webmotors.com.br/carros");
	}

	public void clicarBotaoCarDeliveryr() {		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[2]/label[1]/p"))).click();
		driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[2]/label[2]/input")).click();
//		WebElement filtro = driver.findElement((By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[2]/label[1]/input")));
//		filtro.click();
	}
	public void localizarCarroPorLocalidade(String localidade) {
		WebElement buscaLoc = driver.findElement(By.id("locationAutoComplete"));
		buscaLoc.sendKeys(localidade);
		buscaLoc.sendKeys(Keys.RETURN);
//			try com wait
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locationAutoComplete"))).sendKeys(localidade);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locationAutoComplete"))).sendKeys(Keys.RETURN);
		
	}
	
	
	public void validaFiltro(String filtro) {
		pesquisar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campoFiltros)));
		assertTrue(pesquisar.getText().contains(filtro));
		
	}

}
