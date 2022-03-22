package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import recursos.Base;

public class PO_login extends Base {

	By lblTituloMensaje = By.xpath("<h1>Inicio de sesión</h1>");
	By txtUsuario = By.name("value");
	By txtPassword = By.name("password");
	By btnIngresar = By.id("button_login");

	public WebElement getlblTituloMensaje(String item) {
		lblTituloMensaje = By.xpath("//*[contains(text(), '" + item + "')]");
		return driver.findElement(lblTituloMensaje);
	}

	public WebElement gettxtUsuario() {
		return driver.findElement(txtUsuario);
	}

	public WebElement gettxtPassword() {
		return driver.findElement(txtPassword);
	}

	public WebElement getbtnIngresar() {
		return driver.findElement(btnIngresar);
	}

}
