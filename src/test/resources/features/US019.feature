
Feature:US_019 Kullanıcı App Settings butonunun çalışıp çalışmadığını kontrol edebilmeli

  Background:Apps Launcher
    Given Kullanıcı Mobil uygulamayı açar
    When Kullanıcı Login olmadan uygulamayı açar.
    When Kullanıcı  footer bölümünde "Settings" bölümünü bulur ve seçer.
    Then Kullanıcı açılan sayfada "App Settings" bölümünü bulur ve seçer.

  Scenario: US_019 TC_001 Kullanıcı  "App settings" bölümüne giriş yapabilmeli.

    But Kullanıcı "App Settings" sayfasının açıldığını doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır

  Scenario: US_019 TC_002 Kullanıcı "Tema" bölümünde bulunan tema rengini "Light" seçeneği seçildiğinde tema renginin açık olduğunu doğrulamalı

    And Kullanıcı Theme bölümünden tema rengini "Dark" olarak değiştirir.
    But Kullnıcı tema renginin "Dark" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır

  Scenario:  US_019 TC_003 Kullanıcı "Tema" bölümünde bulunan tema rengini "Dark" seçeneği seçildiğinde tema renginin koyu olduğunu doğrulamalı

    And Kullanıcı Theme bölümünden tema rengini "Dark" olarak değiştirir.
    And Kullanıcı Theme bölümünden tema rengini "Light" olarak değiştirir.
    But Kullnıcı tema renginin "Light" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır

  Scenario:  US_019 TC_004 Kullanıcı "Dil Tercihi" bölümünde bulunan dil seçeneğini "English" olarak seçtiğinde dilin ingilizce olduğunu doğrulamalı

    And Kullanıcı Language bölümünden dili "Turkish" olarak değiştirir.
    And Kullanıcı Language bölümünden dili "English" olarak değiştirir.
    But Kullnıcı dil seçeneğinin "English" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır

  Scenario:  US_019 TC_005 Kullanıcı "Dil Tercihi" bölümünde bulunan dil seçeneğini "Turkish" olarak seçtiğinde dilin türkçe olduğunu doğrulamalı

    And Kullanıcı Language bölümünden dili "Turkish" olarak değiştirir.
    But Kullnıcı dil seçeneğinin "Turkish" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır

  Scenario: US_019 TC_006 Kullanıcı "Dil Tercihi" bölümünde bulunan dil seçeneğini "French" olarak seçtiğinde dilin fransızca olduğunu doğrulamalı

    And Kullanıcı Language bölümünden dili "French" olarak değiştirir.
    But Kullnıcı dil seçeneğinin "French" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır

  Scenario: US_019 TC_007 Kullanıcı "Birim" bölümünde bulunan birim seçeneğini "Imperial" olarak seçtiğinde birimin metrik olduğunu doğrulamalı

    And Kullanıcı Unit bölümünden birimi "Imperial" olarak değiştirir.
    But Kullnıcı unit seçeneğinin "imperial" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır
  @yeni
  Scenario: US_019 TC_008 Kullanıcı "Birim" bölümünde bulunan birim seçeneğini "Metric" olarak seçtiğinde birimin imperial olduğunu doğrulalı

    And Kullanıcı Unit bölümünden birimi "Imperial" olarak değiştirir.
    And Kullanıcı Unit bölümünden birimi "Metric" olarak değiştirir.
    But Kullnıcı unit seçeneğinin "Metric" olarak değiştiğini doğrular.
    Then Kullanıcı Mobil uygulamayı kapatır