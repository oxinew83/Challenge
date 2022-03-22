package steps;


import org.junit.Assert;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import pageobjects.PO_login;
import pageobjects.PO_Carga;
import recursos.Base;

public class StepDefinitions extends Base {

	PO_login login = new PO_login();
	PO_Carga carga = new PO_Carga();

	@Given("^Me logeo al sitio con el usuario \"([^\"]*)\"$")
	public void Ingreso_usuario(String usuario) throws Throwable {
		InnicializarWebDriver().get("https://leonardocativa.sd.cloud.invgate.net/dashboard");
		Assert.assertTrue(login.getlblTituloMensaje("Bienvenido a InvGate Service Desk").isDisplayed());
		login.gettxtUsuario().clear();
		login.gettxtUsuario().sendKeys(usuario);
		login.gettxtPassword().clear();
		login.gettxtPassword().sendKeys("jKKSzk33AsQDq9z");
		login.getbtnIngresar().click();

	}
	
	@And("^Ingreso en el menu \"([^\"]*)\"$")
	public void Ingreso_en_el_menu_configuracion(String categoria) throws Throwable {
		menu(categoria);
	}
	
	@And("^Ingreso SubMenu \"([^\"]*)\"$")
	public void Ingreso_SubMenu(String subcategoria) throws Throwable {
		submenu(subcategoria);
	}
	
	@And("^Seleccionamos Categoria")
	public void Seleccionamos_Categoria() throws Throwable {
		carga.getbtnCatologo().click();
	}
	
	@And("^Completamos la Carga")
	public void Completamos_la_Carga() throws Throwable {
		carga.gettxtIconName().click();
		carga.gettxtIconName().sendKeys("Category Protractor");
		carga.getbtnSave().click();
		carga.getbtnPlus().click();
		carga.getbtnOpcion().click();
		carga.getbtnContinuar().click();
		carga.gettxtAsunto().click();
		carga.gettxtAsunto().sendKeys("Protractor");	
		carga.gettxtDescripcion().click();
		Prioridad("Media");
		scroll_down();
		carga.getbtnEnviar().click();
	}	
}

