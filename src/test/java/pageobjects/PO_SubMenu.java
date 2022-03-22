package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import recursos.Base;

public class PO_SubMenu extends Base {	

	/*Botones*/
	By btnCatologo = By.xpath("//*[contains(text(), 'Catálogo') and @class= 'subnav__item-title']");	
	By btnUsuarios= By.xpath("cccc");	
	By btnArticulos= By.xpath("//*[contains(text(), 'Reportes') and @class= 'side-bar-item-text']");	
	
	
	
	public WebElement getbtnCatologo() {
		return driver.findElement(btnCatologo);
	}
	public WebElement getbtnUsuarios() {
		return driver.findElement(btnUsuarios);
	}	
	public WebElement getbtnArticulos() {
		return driver.findElement(btnArticulos);
	}	
}
