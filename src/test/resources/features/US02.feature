
Feature: Kullanici kayit olabilmeli
  Background:
  Given ilk ekran ayarlari yapin
  Scenario:TC01 Basarili sekilde kayit yapilabiir
    Given Sing up bolumune tiklanir
    Then Gecerli isim,email,sifre,ikinci sifre ile kayit yapilir
    And Kayit olusturuldugu dogrulanir

  Scenario Outline: TC02 Basarisiz emailler ile kayit yapilamamsi
    Given Sing up bolumune tiklanir
    Then Basarisiz "<emailler>" (@icermeyen,.com icermeyen, bosluk iceren) ile kayit yapilamadigi dogrulanir
    Examples:
      | emailler |
      | mahmutmail.com |
      | mahmut@mail |
      | ma hmut@mail.com |
  Scenario: TC03 Basarisiz sifre ile kayit yapilamamasi
    Given Sing up bolumune tiklanir
    Then Basarisiz sifre (Sekiz karakter olmayan) ile kayit yapilamamasi dogrulanir

  Scenario: TC04 Basarisiz   ikinci sifre ile kayit yapilamamasi
    Given Sing up bolumune tiklanir
    Then Basarisiz ikici sifre(ilk sifre ile ikinci sifrenin ayni olmamasi) ile kayit yapilamamasi dogrulanir.

  Scenario: TC05 Kayitli email ile kayit yapilamamasi
    Given Sing up bolumune tiklanir
    Then Onceden kayit yapilmis email ile kayit yapilamamsi dogrulanir.

  Scenario: TC06 Sifre bolumundeki goz isareti testi
    Given Sing up bolumune tiklanir
    Then Sifre bolumune sifre yazilir
    And Goz isaretine tiklanir
    Then Yazilan sifrenin gorunurlugu dogrulanir.




