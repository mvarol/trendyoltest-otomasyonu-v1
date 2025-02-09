package Sayfalar;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Type;
import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Sayfa {

    WebDriver driver;
    WebDriverWait wait;

    public Sayfa(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public void nesneBekleClass(String className){wait.until(ExpectedConditions.presenceOfElementLocated(By.className(className)));}
    public void nesneBekleId(String idName){
        wait.until(ExpectedConditions.elementToBeClickable(By.id(idName)));
    }

    public void clickTag(String tagName){
        WebElement click = wait.until(ExpectedConditions.elementToBeClickable(By.tagName(tagName)));
        click.click();
    }
    public void clickYapClass(String className){
        WebElement click = wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
        click.click();
    }

    public void alanaYazId(String idName, String email){
        WebElement alan = wait.until(ExpectedConditions.elementToBeClickable(By.id(idName)));
        alan.sendKeys(email);
    }

    public void alanaYazClass(String className, String aranan){
        WebElement alan = wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
        alan.sendKeys(aranan);
    }

    public void klavye(String className, Keys klavyeTusu){
        driver.findElement(By.className(className)).sendKeys(klavyeTusu);
    }

    //burada yaz ve enter bas methodu var şu an kullanılmıyor
    public void yazEnter(String alanBilgi, Object key){
        WebElement  alan = wait.until(ExpectedConditions.elementToBeClickable(By.className(alanBilgi)));
        if(key instanceof Keys){
            alan.sendKeys((Keys) key);
        }else if(key instanceof String) {
            alan.sendKeys(key.toString());
        }
    }

    public void urunDetayGit(String urunlerClass, Integer index){
        try {
            List<WebElement> urunlerBul = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(urunlerClass)));
            if (urunlerBul.size() > index){
                WebElement urun = urunlerBul.get(index);
                WebElement link = wait.until(ExpectedConditions.elementToBeClickable(urun.findElement(By.xpath(".//a"))));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();",link);
            }else {
                System.out.println("Yeterli ürün yok");
            }
        }catch (TimeoutException e){
            System.out.println("Ürünler dönmedi");
        }
    }




    public void sepeteEkle(String linkBilgisi) throws Exception{
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            List<WebElement> ozellikler = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(UrunDetaySayfasi.ozelik));
            if (!ozellikler.isEmpty()) {
                WebElement ozellik = wait.until(ExpectedConditions.elementToBeClickable(ozellikler.getFirst()));
                ozellik.click();
                Thread.sleep(2000);
            }else{ System.out.println("Henüz özellik seçimine tıklanmadı"); }

        }catch (TimeoutException e){
            System.out.println("Özellik seçimi olmayan ürün koşum devam ediyor.");
        }


        WebElement sepeteEkle = wait.until(ExpectedConditions.elementToBeClickable(By.className(linkBilgisi)));
        sepeteEkle.click();
    }


    public void clickJava(String linkBilgisi){
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.className(linkBilgisi)));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",link);
    }


    public void alanOkuClass(String alanClass, String detay){
        WebElement alanYazi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(alanClass)));
        System.out.println(detay + alanYazi.getText());
    }


    public void sepettekiUrun(){
        try {
            List<WebElement> sepettekiUrunler = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(SepetSayfasi.sepetUrun));
            if (sepettekiUrunler.size()>0) {
                WebElement urunAdeti = wait.until(ExpectedConditions.elementToBeClickable(sepettekiUrunler.get(0).findElement(SepetSayfasi.urunAdet)));
                System.out.println("Sepeteki üründen " + urunAdeti.getAttribute("value") + " adet alınıyor.");
            }
        }catch (Exception e){
            System.out.println("Sepette Ürün Yok / Silme koşumu yapılmış.");
        }
    }

    public void sepetUrunArtiEksi(String artiEksi){
        List<WebElement> sepettekiUrunler = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(SepetSayfasi.sepetUrun));
        WebElement artiEksiButton = wait.until(ExpectedConditions.elementToBeClickable(sepettekiUrunler.get(0).findElement(By.cssSelector(artiEksi))));
        artiEksiButton.click();
    }


    public void sepetUrunCikar(){
        List<WebElement> sepettekiUrunler = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(SepetSayfasi.sepetUrun));
        WebElement sil = wait.until(ExpectedConditions.elementToBeClickable(sepettekiUrunler.get(0).findElement(SepetSayfasi.sepettenCikar)));
        sil.click();
    }

    public void sepetUrunlerFiyat(){
        List<WebElement> sepettekiUrunler = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SepetSayfasi.sepetUrun));

        if (sepettekiUrunler.size()>0){
            for (WebElement urun : sepettekiUrunler) {
                WebElement fiyat = urun.findElement(SepetSayfasi.fiyat);
                System.out.println("Ürün fiyatı " + fiyat.getText());
            }

        }


    }



    public void hataKutu(String idName, String hataMesaji){
        WebElement hataKutusu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));
        Assert.assertTrue("Hata kutusu görünmüyor!",hataKutusu.isDisplayed());

        String gelenHata = hataKutusu.findElement(LoginSayfasi.hataMesaji).getText();
        Assert.assertTrue("Hata mesajı beklenen mesajı içermiyor!",gelenHata.contains(hataMesaji));
        System.out.println("Test koşumu (Doğru) uyarı : " + gelenHata);
    }

    public void loginTesti(String ePosta, String sifre, String hataKutusu, String hataMesaji){
        WebElement ePostaAlan = wait.until(ExpectedConditions.elementToBeClickable(LoginSayfasi.emailAlan));
        ePostaAlan.clear();
        ePostaAlan.sendKeys(ePosta);

        WebElement sifreAlan = wait.until(ExpectedConditions.elementToBeClickable(LoginSayfasi.sifreAlan));
        sifreAlan.clear();
        sifreAlan.sendKeys(sifre);

        WebElement girisButton = wait.until(ExpectedConditions.elementToBeClickable(LoginSayfasi.girisButyon));
        girisButton.click();

        hataKutu(hataKutusu,hataMesaji);
    }

    public void overlayKapat(String overlayBilgi){
        try {
            WebElement overlay = wait.until(ExpectedConditions.elementToBeClickable(By.className(overlayBilgi)));
            overlay.click();
        }catch (TimeoutException e){
            System.out.println("Overlay yok, koşum devam ediyor..");
        }

    }














}
