
Feature: Kullanici login olabilmeli
  Background:
  Given ilk ekran ayarlari yapin
  Scenario:TC01 Basarili sekilde giris yapilir
    When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
    Then Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapabildiğini doğrular.

  Scenario: TC02 Basarisiz giris
    When Kullanıcı, yanlis kullanıcı adı ve  yanlis şifre bilgileri ile  giriş yapamaz.
    Then Kullanıcı, giris yapilamadigini dogrular

  Scenario: TC03 Sifre sifirlama
    When Kullanici Forgot Password bolumune girer.
    Then Kullanici gecerli emailini girerek Reset My Password tusuna basar
    And Mail gonderildigi bilgis ana ekranda dogrulanir.

  Scenario: T04 Google hesabi ile sisteme giris
    When Kullanici Google ile griris yap bolumune tiklar
    Then Google hesap bilgileri girilir
    And  Google ile giris yapildigi dogrulanir

  Scenario: TC05 Goz isareti testi
    Then Sifre bolumune sifre gonderilir
    And   Password bolumundeki goz isaretine tiklanir
    Then Yazilan sifrenin gorunur oldugu dogrulanir

  Scenario: TC04 Oturum kapatma
    When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
    And Kullanici settings bolumune tiklar ve cikis yapar.
    Then Kullanicinin cikis yaptigi dogrulanir.



