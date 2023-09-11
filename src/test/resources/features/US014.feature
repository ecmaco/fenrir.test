@wip
  Feature: Add My Car butonunu kontrol etme
  Scenario: Kullanici Add My Car butonunun calisip calismadigini kontrol etmeli


    Given ilk ekran ayarlarini yapin ve "Login" butonuna tiklayarak yeni hesap olusturarak Login girisi yapin
    Then  Settings tusuna basilarak ayarlar kismina gidilir
    And   Add My Car butonuna tiklanir
    And   Istenilen araba modeli secilir
    Then  Settings kisminda secilen arabanin kayitli oldugu dogrulanir
