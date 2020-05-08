package Elementos;

import org.openqa.selenium.By;

public class Elementos_MagazineLuiza {
	
	private By linkEntrar = By.xpath("//a[@class='login-link']"); //link Entre ou Cadastre-se
	
	private By txtLogin = By.xpath("//div[@class='LoginBox']/form/div/div/input"); // campo email
	
	private By txtSenha = By.xpath("//input[@name='password']"); // campo senha
	
	private By btnContinuar = By.xpath("//*[@id='LoginBox-form']/button"); // botão continuar

	public By getLinkEntrar() {
		return linkEntrar;
	}

	public By getTxtLogin() {
		return txtLogin;
	}

	public By getTxtSenha() {
		return txtSenha;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}
	
	private By txtProcurar = By.xpath("//input[@id='inpHeaderSearch']");
	
	public By getTxtProcurar() {
		return txtProcurar;
	}
	

	private By btnProcurar = By.xpath("//span[@id='btnHeaderSearch']");

	
	public By getBtnProcurar() {
		return btnProcurar;
	}
	
	private By linkNomeProduto = By.xpath("//h2[@class='nm-product-name']");
	
	private By linkProduto = By.xpath("//*[@id='product_bb8b1bj518']/div[3]/h2");
	
	
	public By getLinkProduto() {
		return linkProduto;
	}
	
	private By btnAdicionarSacola = By.xpath("//div[@class='wrapper-product__informations js-block-product']/button");

	public By getBtnAdicionarSacola() {
		return btnAdicionarSacola;
	}
	
	private By txtCepPreenchido = By.xpath("//span[@class='BasketAddress-zipcode']");	

	public By getTxtCepPreenchido() {
		return txtCepPreenchido;
	}
	
	private By txtCep = By.xpath("//input[@type='tel']");
	
	public By getTxtCep() {
		return txtCep;
	}
	
	private By btnOk = By.xpath("//button[@class='buttonWithin']");
	
	public By getBtnOk() {
		return btnOk;
	}

	private By btnContinuarCompra = By.xpath("//button[@class='BasketContinue-button']");
	
	public By getBtnContinuarCompra() {
		return btnContinuarCompra;
	}

	public By getLinkNomeProduto() {
		return linkNomeProduto;
	}

	public void setLinkNomeProduto(By linkNomeProduto) {
		this.linkNomeProduto = linkNomeProduto;
	}

	


	
}
