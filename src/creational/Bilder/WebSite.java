package creational.Bilder;

public class WebSite {
    String name = "";
    CMS cms;
    int price;
    public void setName(String name){
        this.name = name;
    }
    public void setCms(CMS cms){
        this.cms = cms;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", price=" + price +
                '}';
    }
}
