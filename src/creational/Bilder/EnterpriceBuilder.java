package creational.Bilder;

public class EnterpriceBuilder extends WebSiteBilder{
    @Override
    void buildName() {
        webSite.setName("Enterprice Website");
    }

    @Override
    void buildCms() {
        webSite.setCms(CMS.ALTERFECCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(1000);
    }
}
