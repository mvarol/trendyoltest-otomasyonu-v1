package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSayfasi extends Sayfa {

    public final String emailYaz = "login-email";
    public final String sifreYaz = "login-password-input";
    public final String button = "submit";
    public final String girisHata = "error-box-wrapper";

    public static final By emailAlan = By.id("login-email");
    public static final By sifreAlan = By.id("login-password-input");
    public static final By girisButyon = By.className("submit");
    public static final By hataMesaji = By.className("message");

    //Hata mesajları
    public final String mailBosHata = "Lütfen geçerli bir e-posta adresi giriniz.";
    public final String sifreBosHata = "Lütfen şifrenizi giriniz.";
    public final String sifreYanlis = "E-posta adresiniz ve/veya şifreniz hatalı.";



    public LoginSayfasi(WebDriver driver){
        super(driver);
    }




}
