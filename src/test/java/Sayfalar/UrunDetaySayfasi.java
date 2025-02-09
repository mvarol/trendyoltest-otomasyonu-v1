package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrunDetaySayfasi extends Sayfa {

    public final String sepeteEkleButton = "add-to-basket"; //class add-to-basket
    public final String sepeteEklendi = "success";
    public final String overlay = "overlay"; //class
    public final String fiyat = "prc-dsc";
    public static final By ozelik = By.cssSelector(".sp-itm:not(.so)"); //class

    //so sp-itm


    public UrunDetaySayfasi(WebDriver driver){
        super(driver);
    }




}
