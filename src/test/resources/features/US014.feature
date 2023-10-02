@wip
  Feature: Kullanic Add My Car sekmesinden aracini secebilmeli

  Background:Ilk ekran ayarlari
    Given ilk ekran ayarlari yapin

    Then  kullanici(yusuf) girisi yapin

  Scenario: TC_001 Kullanici girisi yapildiginda ayarlar sekmesinde Aracim sayfasi gorunur olmali

    Given  Settings tusuna basilarak ayarlar kismina gidilir
    Then   Ayarlar sekmesinde Aracim sayfasinin gorunur oldugu dogrulanir

  Scenario: TC_002 Arac ekleme ekraninda arama kutusuna istenilen arac yazildiginda dogru filitreleme yapilmali

    Given  Add My Car butonuna tiklanir
    Then   Eklenecek arac modeli yazilir
    And    Sonuclarin dogru filitrelendigi dogrulanir


    Scenario: TC_003 Kaydet butonuna tiklandiktan sonra arac bilgisinin gorunur ve dogru oldugu dogrulanmali
      Given Add My Car butonuna tiklanir
      Then Istenilen araba modeli secilir
      And  Settings kisminda secilen arabanin kayitli oldugu dogrulanir

      Scenario:TC_004 Arac modeli degistirilmek istendiginde secili arac uzerine tiklandiginda arac modelleri listesi
      goruntulenebilmeli

        Given Profile Settings sekmesine tiklanir
        Then  Car sekmesine tiklanir
        And   Arac modeli degistirmek icin listenin acildigi dogrulanir














