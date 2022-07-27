package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private DSL dsl;

	public LoginPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setValidaPagina(String URL) {
		Assert.assertEquals(URL,"https://www.saucedemo.com/");
	}
	
	public void setUserName(String user) {
		dsl.escreve(By.id("user-name"),user);
	}

	public void setSenha(String senha) {
		dsl.escreve(By.id("password"),senha);
	}

	public void setBotaoLogin() {
		dsl.clicarEm(By.id("login-button"));
	}

}