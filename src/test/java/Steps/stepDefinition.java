package Steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Steps.LoginPage;

public class stepDefinition extends Elementos.Elementos_MagazineLuiza {

	public LoginPage lp;

	WebDriver driver;

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@Before
	public void BeforeClass() throws IOException {

		// System.setProperty("webdriver.chrome.driver",
		// "src\\test\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		// lp = new LoginPage(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(120, TimeUnit.SECONDS);
	}

	@After
	public void AfterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
	}

	@Given("que acesso o sistema {string}")
	public void que_acesso_o_sistema(String url) throws InterruptedException {
		driver.get(url);

		Thread.sleep(5000);
	}

	@Given("opto por pesquisar produto {string}")
	public void opto_por_pesquisar_produto(String produto) throws InterruptedException {

		driver.findElement(getTxtProcurar()).sendKeys(produto);

		Thread.sleep(5000);

		driver.findElement(getBtnProcurar()).click();
	}

	@Given("opto por validar resultado de pesquisa")
	public void opto_por_validar_resultado_de_pesquisa() throws InterruptedException {

		Thread.sleep(5000);

		assertEquals("Livro - A filosofia do sucesso", driver.findElement(getLinkProduto()).getText());

	}

	@Given("opto por selecionar livro {string}")
	public void opto_por_selecionar_livro(String string) throws InterruptedException {
		driver.findElement(getLinkProduto()).click();

		Thread.sleep(3000);
	}

	@Then("opto por clicar {string}")
	public void opto_por_clicar(String texto) throws InterruptedException {

		driver.findElement(getBtnAdicionarSacola()).click();
		
		Thread.sleep(5000);

		// String titulo = driver.findElement(By.xpath("//span[contains(text(), '" +
		// texto + "')]")).getText();

		// System.out.println("==== titulo: " + titulo);
	}

	@Then("opto por preencher cep {string}")
	public void opto_por_preencher_cep(String cep) {
		//if (driver.findElement(getTxtCepPreenchido()).isDisplayed()) {

			//String cepPreenchido = driver.findElement(getTxtCepPreenchido()).getText();
			//System.out.println("Campo cep já está preenchido: " + cepPreenchido);

		//} else {
			driver.findElement(getTxtCep()).sendKeys(cep);

		//}
	}

	@Then("opto por clicar em Ok")
	public void opto_por_clicar_em_Ok() throws InterruptedException {
		driver.findElement(getBtnOk()).click();

		Thread.sleep(5000);
	}

	@Then("opto por verificar valor")
	public void opto_por_verificar_valor() {
		String valor = driver.findElement(By.xpath("//div[@class='BasketPriceBox-prices-values']/div")).getText();

		System.out.println("Valor do Produto: " + valor);

	}

}
