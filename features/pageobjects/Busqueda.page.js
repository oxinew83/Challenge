const Page = require('./page');

class Busqueda extends Page {

    get inputTexto () { return $('#gh-ac') }
    get btnLupa () { return $('#gh-btn') }

    async search (username) {
        await this.inputTexto.setValue(username);
        await this.btnLupa.click();        
    }

    async resultado () {
        var outerHTML = await $('/html/body/div[4]/div[6]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]').getHTML();
        console.log(outerHTML);
    }
}

module.exports = new Busqueda();

