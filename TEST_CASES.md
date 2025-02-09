# Test Senaryoları

Bu dosya, uygulamanın işlevselliğini test etmek için yazılan senaryoları içermektedir. Aşağıda belirtilen testler, uygulamanın düzgün çalıştığını doğrulamak amacıyla adım adım gerçekleştirilecektir.

## Setup
- Tarayıcıyı aç
- Pencereyi genişlet
- Sayfaya git
- Pop-up, overlay ve uyarıları kapat

## Login Testleri

### 1. Kullanıcı Adı Boş, Şifre Var
- **Adımlar:**
  - Kullanıcı adı boş, şifre dolu şekilde giriş yapmaya çalış.
- **Beklenen Sonuç:**
  - Giriş yapılmadı, uyarı yazdırıldı.
  - **Koşum Başarılı**

### 2. Kullanıcı Adı Var, Şifre Boş
- **Adımlar:**
  - Kullanıcı adı dolu, şifre boş şekilde giriş yapmaya çalış.
- **Beklenen Sonuç:**
  - Giriş yapılmadı, uyarı yazdırıldı.
  - **Koşum Başarılı**

### 3. Kullanıcı Adı ve Şifre Boş
- **Adımlar:**
  - Hem kullanıcı adı hem şifre boş bırakılarak giriş yapılmaya çalış.
- **Beklenen Sonuç:**
  - Giriş yapılmadı, uyarı yazdırıldı.
  - **Koşum Başarılı**

### 4. Yanlış Kullanıcı Adı ve Şifre
- **Adımlar:**
  - Yanlış kullanıcı adı ve şifre ile giriş yapılmaya çalış.
- **Beklenen Sonuç:**
  - Giriş yapılmadı, uyarı yazdırıldı.
  - **Koşum Başarılı**

## Arama Testi

- **Adımlar:**
  - Giriş sayfası arama kutusuna tıkla, yaz ve Enter'a bas.
  - 1 saniye bekle.
- **Beklenen Sonuç:**
  - Arama sonucu sayfası yüklendi.

## Sepet İşlemleri

### 1. Seçilen Ürün Detayına Git
- **Adımlar:**
  - Seçilen ürünün detayına git.
  - Sepete ekle.
  - Sepet sayfasına git.
- **Beklenen Sonuç:**
  - Sepetteki ürün sayısını yazdır.

### 2. Sepetteki Üründen Kaç Adet Alındığını Göster
- **Adımlar:**
  - Sepetteki üründen kaç adet olduğunu yazdır.
- **Beklenen Sonuç:**
  - Ürün adedi doğru olarak yazdırıldı.

### 3. Sepetteki Ürünü Arttır
- **Adımlar:**
  - Sepetteki üründen bir adet arttır.
- **Beklenen Sonuç:**
  - Sepetteki ürün adedi arttı ve yazdırıldı.

### 4. Sepetteki Ürünü Çıkar
- **Adımlar:**
  - Sepetteki ürünü çıkar.
- **Beklenen Sonuç:**
  - Sepetteki ürün çıkarıldı ve sepet sonucu yazdırıldı.

### GENEL: Overlay, Uyarı ve Bilgi Balonları
- **Adımlar:**
  - Çıkan overlay, uyarı ve bilgi balonlarının kapanması sağlanacak.
- **Beklenen Sonuç:**
  - Overlay, uyarı ve bilgi balonları kapatıldı.

## Sepete Çoklu Ürün Ekleme

### 1. Ürünleri Sepete Ekle
- **Adımlar:**
  - Seçilen ürün detayına git, sepete ekle ve ürün fiyatını yazdır.
  - Anasayfaya dön.
  - Diğer ürünleri sepete ekle ve fiyatları yazdır.
  - Sepet sayfasına git.
- **Beklenen Sonuç:**
  - Kaç adet ürün olduğunu göster.
  - Sepetteki ürünlerin fiyatlarını listele.

## Tarayıcıyı Kapat
- **Adımlar:**
  - Tarayıcıyı kapat.
- **Beklenen Sonuç:**
  - Tarayıcı başarıyla kapandı.
