	package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import recursos.Base;

public class PO_Carga extends Base {	

	/*Botones*/
	By btnCatologo = By.xpath("//*[@id=\"addhd_last\"]/div/div/a");	
	By btnSave = By.xpath("//*[@id=\"cboxLoadedContent\"]/div[2]/a");	
	By btnPlus = By.xpath("//*[@class= 'fas fa-plus']");	
	By btnOpcion = By.xpath("//*[contains(text(), 'Category Protractor') and @class= 'inputMultipleSelectOptionTitle']");
	By btnContinuar = By.id("button_continue");
	By btnEnviar = By.id("submit_button");
	
	
	/*Campos de Texto*/
	By txtIconName = By.id("category_name_input");	
	By txtAsunto = By.name("title");	
	By txtDescripcion = By.xpath("/html/body");	
	
	
	public WebElement getbtnCatologo() {
		return driver.findElement(btnCatologo);
	}
	public WebElement gettxtIconName() {
		return driver.findElement(txtIconName);
	}
	public WebElement getbtnSave() {
		return driver.findElement(btnSave);
	}
	public WebElement getbtnPlus() {
		return driver.findElement(btnPlus);
	}
	public WebElement getbtnOpcion() {
		return driver.findElement(btnOpcion);
	}
	public WebElement getbtnContinuar() {
		return driver.findElement(btnContinuar);
	}
	public WebElement gettxtAsunto() {
		return driver.findElement(txtAsunto);
	}
	
	public WebElement gettxtDescripcion() {
		driver.switchTo().frame(0);
		WebElement box  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(box).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("Protractor");
		return box;
	}
	
	public WebElement getbtnEnviar() {
		return driver.findElement(btnEnviar);
	}
	
	
}
