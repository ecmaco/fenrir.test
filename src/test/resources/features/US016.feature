Feature: Kullanıcı My chargers butonunun çalışıp çalışmadığını kontrol edebilmeli
  Background:Ilk ekran ayarlari
    Given ilk ekran ayarlari yapin
    Then  kullanici(yusuf) girisi yapin

    Scenario: TC01 - Kullanici olarak login girisi yapildiginda ayarlar sekmesinde Sarj istasyonlari sayfasi gorunur olmalidir

      Given  Settings tusuna basilarak ayarlar kismina gidilir
      Then   Ayarlar sekmesinde My Chargers sayfasinin gorunur oldugu dogrulanir


    Scenario: TC02 - Yeni sarj istasyonu eklenebilmelidir
      Given My Chargers sekmesine tiklanir
      Then  "List Your Charger" butonuna tiklanir
      And   "Next" butonuna tiklanir ve devam edilir
      Then  Gerekli bilgiler girilerek "Finish" butonuna tiklanir
      Then  Sarj istasyonunun eklendigine dair onay mesajinin ekranda goruntulendigi dogrulanir


    Scenario: TC02 - Home charger ile eklenen sarj istasyonu gorunur olmalidir.

    Scenario: TC03 - Favoriye alinmasi icin bayrak resmine tiklanabilir olmalidir.

    Scenario: TC04 - Home charger ile eklenen sarj istasyonuna ok israeti ile giris yapilmalidir.

    Scenario: TC05 - Sarj istasyonunu offline yapabilmelidir.

    Scenario: TC06 - Sarj istasyonun girildikten sonra ileri butonu ile acilan sayfada ilgili degisiklikler yapilabilmelidir.
    (Sarj cihaz adi,adres, aciklama, adaptor tipi, sarj istasyonu markasi, odeme tipi)

    Scenario: TC07 - Sarj istasyonu "Bitir' ile degisikliklerin yapildigi kontrol edilmelidir.

    Scenario: TC08 - Sarj istasyonu "Geri" butonu ile bir onceki sayfaya donuldugu dogrulanmalidir.

    Scenario: TC09 - Home charger sayfasinda "mavi ok" basildigi dogrulanmalidir.

    Scenario: TC10 - Isminin yanindaki mesaj kutucuguna tiklanabilir olmalidir

    Scenario: TC11 - Check-in butonuna tıklanarak ilgi alanlar doldurulmalıdır.

    Scenario: TC12 - Gönder butonuna tıklandığında "teşekkür ederiz" yazısının çıkıp çıkmadığı kontrol edilmelidir.