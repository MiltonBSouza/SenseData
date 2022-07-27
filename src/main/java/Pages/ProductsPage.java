package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

	private DSL dsl;
	public ProductsPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setValidaPagina(String URL) {
		Assert.assertEquals(URL,"https://www.saucedemo.com/inventory.html");
	}
	
	public void setOrdenacao() {
		dsl.clicarEm(By.id("add-to-cart-sauce-labs-onesie"));
	}
	
	public void Switch() {

		dsl.clicarEm(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]"));		
	//	Select combo = new Select(driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select")));
	//	combo.selectByValue("lohi");//(texto);

	}
	
	public void setBotaoCompra1() {
		dsl.clicarEm(By.id("add-to-cart-sauce-labs-onesie"));
	}
	
	public void setBotaoCompra2() {
		dsl.clicarEm(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
	}
	
	public void setCartLink() {
		dsl.clicarEm(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	}

}
