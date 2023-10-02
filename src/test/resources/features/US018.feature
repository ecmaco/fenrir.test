
  Feature:US_018 Kullanıcı Profile Settings butonunun çalışıp çalışmadığını kontrol edebilmeli

    Background:Apps Launcher
      Given Kullanıcı Mobil uygulamayı açar

    @wip
    Scenario: US_018 TC_001 Kullanıcı üye olmadan "profil settings" bölümüne giriş yapamamalı.


      When Kullanıcı Ana sayfada herhangi bir oturum açma işlemi yapmadan "Profil Settings" bölümüne gider.
      Then Kullanıcı uygulamanın yüklenip yüklenmediğini kontrol eder.
      And Kullanıcı uygulamada bir hata mesajı veya giriş yapma isteği olup olmadığını kontrol eder.
      But Kullanıcının mobil uygulamada üye olmadan "Profil Ayarları" bölümüne giriş yapamamasını doğrulamalıdır.


    Scenario: US_018 TC_002 Kullanıcı üye girişi yaparak "profil settings" bölümüne giriş yapabilmeli.


      When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
      Then Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapabildiğini doğrular.
      And Kullanıcı "Profil Ayarları" seçeneği görünür ve dokunabilir durumda olduğunu doğrulamalıdır.

    Scenario:  US_018 TC_003 Kullanıcı  "profil settings" bölümüne giriş yapamalı ve profil bilgilerinin doğru olduğunu doğrulamalı.

      When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
      Then Kullanıcı ana ekranın üst kısmında kullanıcının adını veya profil resmini görüntüleyen bir bölüm olduğunu doğrular.
      And Kullanıcı "Kullanıcı adı" veya "profil resmi" 'ne tıklayarak profil menüsüne erişir.
      But Kullanıcı Profil Ayarları sayfasında kullanıcının adı, e-posta, telefon numarası gibi profil bilgilerini kontrol eder ve bilgilerin doğru olduğunu doğrular.

    Scenario:  US_018 TC_004 Kullanıcı "profil settings" bölümündeki bilgileri güncelleyebilmeli ve  "Kaydet" butonunun işlevsel olduğunu doğrulamalı.

      When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
      Then Kullanıcı "Kullanıcı adı" veya "profil resmi" 'ne tıklayarak profil menüsüne erişir.
      Then Kullanıcı Profil Ayarları sayfasında güncellenebilir bilgileri ( ad, soyad, e-posta, telefon numarası) bulur ve bu bilgileri günceller.
      Then Kullanıcı bilgileri güncelledikten sonra "Kaydet" ve "Onayla" butonuna tıklar.
      But Kullanıcı bilgilerin başarıyla güncellendiğini ve "Kaydet" butonunun işlevsel olduğunu doğrular.

    Scenario:  US_018 TC_005 Kullanıcı "profil settings" bölümündeki "Remove My Account" butonunun işlevsel olduğunu doğrulamalı

      When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
      Then Kullanıcı Profil menüsünde "Profil Ayarları" seçeneğini arar ve ona dokunur.
      And Kullanıcı "Remove My Account" seçeneği görünür ve dokunabilir durumda olduğunu doğrulamalıdır.
      Then Kullanıcı "Remove My Account" butonuna tıkladığında bir uyarı mesajı aldığını goğrulamalıdır.
      Then Kullanıcı, uyarı mesajını okumalı ve talimatları takip ederek hesabını kaldırmayı onaylamalıdır.
      But Kullanıcı hesabın kaldırıldığını doğrulamalıdır.