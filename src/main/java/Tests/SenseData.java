package Tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.CartPage;
import Pages.DSL;
import Pages.LoginPage;
import Pages.ProductsPage;

public class SenseData {
	private WebDriver driver;
	private CartPage pageCart;
	private ProductsPage pageProducts;
	private LoginPage pageLogin;
	
	@Before
	//Antes de Todos os testes.
	public void inicializa() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		new DSL(driver);
		pageProducts = new ProductsPage(driver);
		pageCart = new CartPage(driver);
		pageLogin = new LoginPage(driver);
	}
	
	@After
	//Depois de todos os Testes.
	public void finaliza() {
		//driver.quit();
	}
	
	@Test
	public void cadsastro() throws InterruptedException {
		//Desafio 1
		
		//Valida página 'Login'
		String URLLogin = driver.getCurrentUrl();
		pageLogin.setValidaPagina(URLLogin);
		
		//Preenchimento dos campos na Página:
		pageLogin.setUserName("standard_user");
		pageLogin.setSenha("secret_sauce");

		//Clica no botão 'Login'
		pageLogin.setBotaoLogin();
		
		//Valida página 'Products'
		String URLProducts = driver.getCurrentUrl();
		pageProducts.setValidaPagina(URLProducts);
		
		//Ordenar os produtos pelo valor (low to high)
		pageProducts.Switch();
				
		//Clica no botão 'ADD TO CART' do produto 'Sauce Labs Onesie'
		pageProducts.setBotaoCompra1();
		
		//Clica no botão 'ADD TO CART' do produto 'Test.allTheThings() T-Shirt (Red)'
		pageProducts.setBotaoCompra2();
		
		//Clica no icone 'Carro de compras'
		pageProducts.setCartLink();
		
		//Valida página 'cart'
		String URLCart = driver.getCurrentUrl();
		pageCart.setValidaPagina(URLCart);
		
	}

}