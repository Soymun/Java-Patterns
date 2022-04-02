package creational.Bilder;

public class Director {
    WebSiteBilder webSiteBilder;

    public Director(WebSiteBilder webSiteBilder) {
        this.webSiteBilder = webSiteBilder;
    }
    WebSite buildWebSite(){
        webSiteBilder.createWebSite();
        webSiteBilder.buildName();
        webSiteBilder.buildCms();
        webSiteBilder.buildPrice();
        return webSiteBilder.getWebSite();
    }
}
