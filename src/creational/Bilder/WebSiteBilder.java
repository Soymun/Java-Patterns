package creational.Bilder;

public abstract class WebSiteBilder {
    WebSite webSite;
    void createWebSite(){
        webSite = new WebSite();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    public WebSite getWebSite() {
        return webSite;
    }
}
