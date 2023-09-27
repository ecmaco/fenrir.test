@wip
  Feature: Kullanici mesaj gonderip alabilmeli

    Background:Ilk ekran ayarlari
      Given ilk ekran ayarlari yapin

      Then  kullanici(yusuf) girisi yapin

    Scenario: TC_01 Kullanici olarak login girisi yapildiginda ayarlar sekmesinde Mesajlar sayfasi gorunur olmalidir
      Given  Settings tusuna basilarak ayarlar kismina gidilir
      Then   Mesajlar butonunun gorunur oldugu kontrol edilir

      Scenario: TC_02 Ayarlar sekmesinden Mesajlar butonuna tiklanabilmelidir
        Given Mesajlar butonuna  tiklanmalidir
        Then  Mesajlar sekmesinin acildigi dogrulanmalidir