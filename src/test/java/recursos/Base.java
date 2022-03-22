package recursos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.PO_Menu;
import pageobjects.PO_SubMenu;

public class Base {

	public static WebDriver driver;

	public WebDriver InnicializarWebDriver() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

		
	public static void scroll_down() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void menu(String opcion) throws Exception {

		PO_Menu Menu = new PO_Menu();
		switch (opcion) {
		case "CONFIGURACION":
			Menu.getbtnConfiguracion().click();
			break;
		case "SOLICITUDES":
			Menu.getbtnSolicitudes().click();
			break;
		case "REPORTES":
			Menu.getbtnReportes().click();
			break;
		}
	}
	
	public static void submenu(String opcion) throws Exception {

		PO_SubMenu SubMenu = new PO_SubMenu();
		switch (opcion) {
		case "CATOLOGO":
			SubMenu.getbtnCatologo().click();
			break;
		case "USUARIOS":
			SubMenu.getbtnUsuarios().click();
			break;
		case "ARTICULOS":
			SubMenu.getbtnArticulos().click();
			break;
		}
	}
	
	public static void Prioridad(String nivel) throws Exception {
		Select familia = new Select(driver.findElement(By.xpath(
				"//*[@class='validate[required] multipleSelectorActive multipleSelectorBinded']")));
		familia.selectByVisibleText(nivel);
	}
	
}
	