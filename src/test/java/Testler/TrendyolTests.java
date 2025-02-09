package Testler;

import Sayfalar.GirisSayfasi;
import Sayfalar.LoginSayfasi;
import Sayfalar.SepetSayfasi;
import Sayfalar.UrunDetaySayfasi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendyolTests {

    private WebDriver driver;
    private GirisSayfasi girisSayfasi;
    private LoginSayfasi loginSayfasi;
    private UrunDetaySayfasi urunDetaySayfasi;
    private SepetSayfasi sepetSayfasi;


    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        girisSayfasi = new GirisSayfasi(driver);
        loginSayfasi = new LoginSayfasi(driver);
        urunDetaySayfasi = new UrunDetaySayfasi(driver);
        sepetSayfasi = new SepetSayfasi(driver);
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com");

        girisSayfasi.nesneBekleClass(girisSayfasi.popKapa);
        girisSayfasi.clickYapClass(girisSayfasi.popKapa);
        girisSayfasi.overlayKapat(girisSayfasi.overlay);
    }


    @Test
    public void kullaniciAdiBos(){
        loginSayfasi.clickYapClass(girisSayfasi.girisYap);
        loginSayfasi.loginTesti("", "123456", loginSayfasi.girisHata, loginSayfasi.mailBosHata);
    }
    @Test
    public void kullaniciSifreBos(){
        loginSayfasi.clickYapClass(girisSayfasi.girisYap);
        loginSayfasi.loginTesti("test@gmail.com", "", loginSayfasi.girisHata, loginSayfasi.sifreBosHata);
    }
    @Test
    public void kullaniciAdSifreBos(){
        loginSayfasi.clickYapClass(girisSayfasi.girisYap);
        loginSayfasi.loginTesti("", "", loginSayfasi.girisHata, loginSayfasi.mailBosHata);
    }

    @Test
    public void yanlisKullaniciAdSifre(){
        loginSayfasi.clickYapClass(girisSayfasi.girisYap);
        loginSayfasi.loginTesti("mustafavarol189@gmail.com", "123456", loginSayfasi.girisHata, loginSayfasi.sifreYanlis);
    }


    @Test
    public void aramaTesti() throws Exception {
        girisSayfasi.alanaYazClass(girisSayfasi.aramaKutusu,"Bebek arabası");
        girisSayfasi.klavye(girisSayfasi.aramaKutusu, Keys.ENTER);
        Thread.sleep(1000);//işlem sonraso az beklesin .....trows Exception
    }


    @Test
    public void sepetIslemleri() throws Exception{
        urunDetaySayfasi.urunDetayGit(girisSayfasi.urunler, 5);
        urunDetaySayfasi.overlayKapat(urunDetaySayfasi.overlay);
        urunDetaySayfasi.sepeteEkle(urunDetaySayfasi.sepeteEkleButton);
        urunDetaySayfasi.nesneBekleClass(urunDetaySayfasi.sepeteEklendi);
        urunDetaySayfasi.clickYapClass(girisSayfasi.sepet);

        urunDetaySayfasi.overlayKapat(sepetSayfasi.overlay);

        sepetSayfasi.sepettekiUrun();
        sepetSayfasi.sepetUrunArtiEksi(sepetSayfasi.urunAdetArtır);
        sepetSayfasi.nesneBekleClass(sepetSayfasi.sepetGuncellendi);
        sepetSayfasi.sepettekiUrun();
        sepetSayfasi.sepetUrunCikar();
        sepetSayfasi.nesneBekleClass(sepetSayfasi.sepetGuncellendi);
        sepetSayfasi.clickYapClass(sepetSayfasi.cancel);
        sepetSayfasi.sepettekiUrun();
    }

    @Test
    public void sepeteEkleCoklu() throws Exception{
        urunDetaySayfasi.urunDetayGit(girisSayfasi.urunler, 0);
        urunDetaySayfasi.overlayKapat(urunDetaySayfasi.overlay);
        urunDetaySayfasi.sepeteEkle(urunDetaySayfasi.sepeteEkleButton);
        urunDetaySayfasi.nesneBekleClass(urunDetaySayfasi.sepeteEklendi);
        urunDetaySayfasi.alanOkuClass(urunDetaySayfasi.fiyat,"Ürün fiyatı: ");
        driver.navigate().back();

        //overlay tekrar kapat
        girisSayfasi.nesneBekleClass(girisSayfasi.popKapa);
        girisSayfasi.clickYapClass(girisSayfasi.popKapa);
        girisSayfasi.overlayKapat(girisSayfasi.overlay);

        //ikinci bir ürün eklendi
        urunDetaySayfasi.urunDetayGit(girisSayfasi.urunler, 4);
        urunDetaySayfasi.overlayKapat(urunDetaySayfasi.overlay);
        urunDetaySayfasi.sepeteEkle(urunDetaySayfasi.sepeteEkleButton);
        urunDetaySayfasi.nesneBekleClass(urunDetaySayfasi.sepeteEklendi);
        urunDetaySayfasi.alanOkuClass(urunDetaySayfasi.fiyat,"Ürün fiyatı: ");

        //Sepetteki ürünler
        urunDetaySayfasi.clickYapClass(girisSayfasi.sepet);
        sepetSayfasi.alanOkuClass(sepetSayfasi.sepetBaslik,"Sepetteki Ürün ");
        sepetSayfasi.sepetUrunlerFiyat();
    }


    @AfterEach
    public void teardown(){
        driver.quit();
    }




}
