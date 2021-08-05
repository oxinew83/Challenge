const { Given, When, Then } = require('@cucumber/cucumber');

const BusquedaPage = require('../pageobjects/Busqueda.page');

const pages = {
    busqueda: BusquedaPage
}


Given(/^Al Abrir la url (.+)$/, async function (pagina) {
    await browser.url(pagina)
});

When(/^Ingreso en el campo Search la palabra (.+)$/, async function (valor) {   
    await BusquedaPage.search(valor)    
});

Then(/^Imprimo por consola el numero de items que devuelve la busqueda$/, async function () {
    await BusquedaPage.resultado()
  });




