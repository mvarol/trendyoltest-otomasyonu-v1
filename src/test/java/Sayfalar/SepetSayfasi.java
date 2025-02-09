package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SepetSayfasi extends Sayfa{

    //cssSelector
    public final String urunAdetAzalt = "[aria-label=\"Ürün adedi azaltma\"]";
    public final String urunAdetArtır = "[aria-label=\"Ürün adedi arttırma\"]";
    public static final By urunAdet = By.cssSelector("[aria-label=\"Ürün adedi\"]");
    public static final By sepettenCikar = By.cssSelector("[aria-label=\"Ürünü sepetten çıkartma\"]");



    public final String sepetGuncellendi = "toastrElement";
    public static final By sepetUrun = By.className("pb-basket-item"); //class
    public final String overlay = "onboarding-overlay";
    public final String cancel = "i-cancel";
    public final String sepetBaslik = "pb-header";
    public static final By fiyat = By.className("pb-basket-item-price");






    public SepetSayfasi(WebDriver driver){
        super(driver);
    }



}
