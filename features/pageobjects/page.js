module.exports = class Page {
    open (path) {
        return browser.url(`http://www.ebay.com`)
    }
}
