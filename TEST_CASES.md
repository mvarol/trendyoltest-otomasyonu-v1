Test Senaryoları
Bu doküman, uygulamanın işlevselliğini test etmek için yazılan senaryoları içermektedir.

Setup
Tarayıcıyı aç
Pencereyi genişlet
Sayfaya git
Pop-up, overlay, uyarıları kapat
Login Testleri
1. Kullanıcı Adı Boş, Şifre Var
Adımlar:

Kullanıcı adı boş, şifre dolu şekilde giriş yapmaya çalış.
Beklenen Sonuç:

Giriş yapılmadı, uyarı yazdırıldı.
Koşum Başarılı
2. Kullanıcı Adı Var, Şifre Boş
Adımlar:

Kullanıcı adı dolu, şifre boş şekilde giriş yapmaya çalış.
Beklenen Sonuç:

Giriş yapılmadı, uyarı yazdırıldı.
Koşum Başarılı
3. Kullanıcı Adı ve Şifre Boş
Adımlar:

Hem kullanıcı adı hem şifre boş bırakılarak giriş yapılmaya çalış.
Beklenen Sonuç:

Giriş yapılmadı, uyarı yazdırıldı.
Koşum Başarılı
4. Yanlış Kullanıcı Adı ve Şifre
Adımlar:

Yanlış kullanıcı adı ve şifre girerek giriş yapmaya çalış.
Beklenen Sonuç:

Giriş yapılmadı, uyarı yazdırıldı.
Koşum Başarılı
Arama Testi
1. Arama Kutusuna Yaz ve Arama Yap
Adımlar:

Giriş sayfasında arama kutusuna tıkla, yaz ve Enter’a bas.
1 saniye bekle.
Beklenen Sonuç:

Arama sonucu düzgün şekilde gösterilmeli.
Sepet İşlemleri
1. Sepete Ürün Ekleme ve Sepet Sayfasına Gitme
Adımlar:

Seçilen ürünün detayına git.
Ürünü sepete ekle.
Sepet sayfasına git.
Beklenen Sonuç:

Sepetteki ürün doğru şekilde görünmeli.
2. Sepetteki Ürünün Adedini Yazdırma
Adımlar:

Sepetteki üründen kaç adet alındığını yazdır.
Beklenen Sonuç:

Ürünün sayısı doğru şekilde yazdırılmalı.
3. Sepetteki Ürünün Miktarını Arttırma
Adımlar:

Sepetteki üründen 1 adet daha al.
Beklenen Sonuç:

Sepetteki ürün miktarı arttırıldı ve doğru şekilde yazdırıldı.
4. Sepetteki Ürünü Çıkarma
Adımlar:

Sepetteki ürünü sepetten çıkar.
Beklenen Sonuç:

Ürün sepetten çıkarıldı.
Sepet sonucu yazdırıldı.
Pop-up, overlay, uyarı, bilgi balonları beklendi, kapatıldı.
Sepete Çoklu Ürün Ekleme
1. İlk Ürünü Sepete Ekleme
Adımlar:

Seçilen ürünün detayına git.
Ürünü sepete ekle.
Ürün fiyatını yazdır.
Beklenen Sonuç:

Ürün sepete başarıyla eklendi ve fiyatı doğru şekilde yazdırıldı.
2. Ana Sayfaya Dönüp İkinci Ürünü Sepete Ekleme
Adımlar:

Ana sayfaya dön.
Seçilen ikinci ürünü sepete ekle.
Ürün fiyatını yazdır.
Beklenen Sonuç:

İkinci ürün sepete başarıyla eklendi ve fiyatı doğru şekilde yazdırıldı.
3. Sepet Sayfasına Gitme ve Ürün Sayısını Kontrol Etme
Adımlar:

Sepet sayfasına git.
Kaç adet ürün olduğunu göster.
Beklenen Sonuç:

Sepetteki ürün sayısı doğru şekilde gösterilmeli.
4. Sepetteki Ürün Fiyatlarını Listeleme
Adımlar:

Sepetteki ürünlerin fiyatlarını listele.
Beklenen Sonuç:

Ürünlerin fiyatları doğru şekilde listelenmeli.
Tarayıcıyı Kapatma
Adımlar:

Tarayıcıyı kapat.
Beklenen Sonuç:

Tarayıcı düzgün şekilde kapanmalı.
Notlar:

Yukarıdaki testler uygulamanın temel işlevselliğini kapsamaktadır ve her testin başarılı olması beklenmektedir.
Testler sırasında oluşabilecek hata ve beklenmeyen durumlar için raporlama yapılmalıdır.
