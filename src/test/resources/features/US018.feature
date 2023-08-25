
  Feature:US_018 Kullanıcı Profile Settings butonunun çalışıp çalışmadığını kontrol edebilmeli

    Scenario: US_018 TC_001 Kullanıcı üye olmadan "profil settings" bölümüne giriş yapamamalı.

      Given Kullanıcı Mobil uygulamayı açar
      When Kullanıcı Ana sayfada herhangi bir oturum açma işlemi yapmadan "Profil Settings" bölümüne gider.
      Then Kullanıcı uygulamanın yüklenip yüklenmediğini kontrol eder.
      And Kullanıcı uygulamada bir hata mesajı veya giriş yapma isteği olup olmadığını kontrol eder.
      But Kullanıcının mobil uygulamada üye olmadan "Profil Ayarları" bölümüne giriş yapamamasını doğrulamalıdır.


    Scenario: US_018 TC_002 Kullanıcı üye girişi yaparak "profil settings" bölümüne giriş yapabilmeli.

      Given Kullanıcı Mobil uygulamayı açar
      When Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.
      Then Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapabildiğini doğrular.
      And Kullanıcı, profil menüsüne erişebilmelidir.
      Then "Profil Ayarları" seçeneği görünür ve dokunabilir durumda olmalıdır.
      And Kullanıcı "Profil Ayarları" seçeneği görünür ve dokunabilir durumda olduğunu doğrulamalıdır.