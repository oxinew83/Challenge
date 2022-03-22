package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import recursos.Base;

public class PO_Menu extends Base {	

	/*Botones*/
	By btnConfiguracion = By.xpath("//*[contains(text(), 'Config') and @class= 'side-bar-item-text']");	
	By btnSolicitudes= By.xpath("//*[contains(text(), 'Solicitudes') and @class= 'side-bar-item-text']");	
	By btnReportes= By.xpath("//*[contains(text(), 'Reportes') and @class= 'side-bar-item-text']");	
	
	
	
	public WebElement getbtnConfiguracion() {
		return driver.findElement(btnConfiguracion);
	}
	public WebElement getbtnSolicitudes() {
		return driver.findElement(btnSolicitudes);
	}	
	public WebElement getbtnReportes() {
		return driver.findElement(btnReportes);
	}	
}
