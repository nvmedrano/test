import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class googleSeleniumPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://www.google.com";
		String expectedTitle = "Google";
		
		String searchFor="Seleniumhq";
		
		//Launch google
		driver.get(baseUrl);
				
		String actualTitle = driver.getTitle();
		
		//Me aseguro que ingrese a la pagina correcta
		Assert.assertEquals(expectedTitle,actualTitle);
		
		//Tomo el elemento de busqueda
		WebElement searchBox = driver.findElement(By.id("lst-ib"));
		
		//Ingreso la palabra o frase a buscar
		searchBox.sendKeys(searchFor);
		
		//Presiono ENTER
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		            
		            
		//identify the link by the title of shows in the search
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		
		//Me aseguro que ingreso al link correcto
		
		expectedTitle = "Selenium - Web Browser Automation";
		actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle,actualTitle);
		
		// Close the driver
		driver.quit();
	}

}
