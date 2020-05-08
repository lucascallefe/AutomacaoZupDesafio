package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Elementos.Elementos_MagazineLuiza {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "login")
	WebElement login;

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	WebElement button;

	public void set_username(String usuario) {
		login.clear();
		login.sendKeys(usuario);
	}

	public void set_password(String senha) {
		password.clear();
		password.sendKeys(senha);
	}

	public void click_button() {
		//driver.findElement(getBtnEntrar()).click();
	}
}
