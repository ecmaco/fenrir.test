
Feature:US_020 Kullanıcı Updates butonunun çalışıp çalışmadığını kontrol edebilmeli

  Background:Apps Launcher
    Given Kullanıcı Mobil uygulamayı açar
    When Kullanıcı Login olmadan uygulamayı açar.
    Then Kullanıcı  footer bölümünde "Settings" bölümünü bulur ve seçer.
    And Kullanıcı açılan sayfada "Updates" bölümünü bulur ve seçer.

  Scenario: US_020 TC_001 Kullanıcı  "Updates" bölümüne giriş yapabilmeli.

    But Kullanıcı "Updates" sayfasının açıldığını doğrular.

  Scenario: US_020 TC_002 Kullanıcı "2023 Öne Çıkanlar " başlığının belirtilen dille uyumluluğu doğrulanmalı

    But Kullanıcı "2023 Öne Çıkanlar " başlığının belirtilen dille uyumluluğunu doğrular.

  Scenario: US_020 TC_003 Kullanıcı "2023 Öne Çıkanlar " bölümünde yer alan bilgilerin içerikle uyumluluğu doğrulanmalı

    Then Kullanıcı "2023 Öne Çıkanlar " başlığına tiklar.
    But Kullanıcı "2023 Öne Çıkanlar " bölümünde yer alan bilgilerin içerikle uyumluluğunu doğrular.

  Scenario:  US_020 TC_004 Kullanıcı "Latest news about ev's " başlığının belirtilen dille uyumluluğu doğrulanmalı

    But Kullanıcı "Latest news about ev's " başlığının belirtilen dille uyumluluğunu doğrular.

  Scenario:  US_020 TC_005 Kullanıcı "Latest news about ev's " bölümünde yer alan bilgilerin içerikle uyumluluğu doğrulanmalı

    Then Kullanıcı "Latest news about ev's " başlığına tiklar.
    But Kullanıcı "Latest news about ev's " bölümünde yer alan bilgilerin içerikle uyumluluğunu doğrular.