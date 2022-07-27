package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class DSL {
	
	private WebDriver driver;
		
	public DSL(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//Escreve String em um campo
	public void escreve(By by, String texto) {
		driver.findElement(by).sendKeys(texto);
	}
	
	//Clica em um botão
	public void clicarEm(By by) {
		driver.findElement((by)).click();
	}
	
	//Encontra um Elemento e retorna o texto no Elemento
	public String obterTexto(By by) {
		String texto = driver.findElement(by).getText();
		return texto;
	}
	//
	public void precionaEnter(By by) {
		driver.findElement(by).sendKeys(Keys.ENTER);
	}
	
}
