package creational.Bilder;

public class VisitCardWebsBuilder extends WebSiteBilder{
    @Override
    void buildName() {
        webSite.setName("VisitCard");
    }

    @Override
    void buildCms() {
        webSite.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
