package Pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class CartPage {
	//
	public CartPage(WebDriver driver) {
		new DSL(driver);
	}
	//
	public void setValidaPagina(String URL) {
		Assert.assertEquals(URL,"https://www.saucedemo.com/cart.html");
	}
	
}