
Feature: Kullanıcı konum bilgisi girdiğinde o konuma ait şarj istasyonları listenebilmeli
  Background:
  Given ilk ekran ayarlari yapin
    Scenario:TC01 Kullanici konum bilgisi girer ve girdigi konumlardaki sarj istasyonlari listelendigi dogrulanir
      When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
      Then Arama kutusuna tiklanir
      Then Arama kutusuna location girilir
      And Girilen location ın dogru oldugu kontrol edilir




