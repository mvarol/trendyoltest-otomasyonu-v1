package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisSayfasi extends Sayfa {

    public final String popKapa = "modal-close";
    public final String girisYap = "account-user";
    public final String aramaKutusu = "V8wbcUhU";
    public final String urunler = "widget-product";
    public final String sepet = "account-basket";
    public final String cancel = "i-cancel";
    public final String overlay= "shadow";

    public GirisSayfasi(WebDriver driver){
        super(driver);
    }
}
