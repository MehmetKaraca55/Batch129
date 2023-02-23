package mini_Projects.beslenmeEgzersiz;

public enum BeslenmeEgzersiz {

    Ocak("Havuç", "Nar", 17),
    Şubat("Lahana", "Ayva", 16),
    Mart("Roka", "Muz", 20),
    Nisan("Enginar", "Çagla", 22),
    Mayıs("Patlıcan", "Erik", 23 ),
    Haziran("Domates", "Kayısı",27),
    Temmuz("Mısır", "Karpuz", 30),
    Ağustos("Börülce", "İncir", 29),
    Eylül("Mantar", "üzüm", 26),
    Ekim("Lahana", "Armut", 24),
    Kasım("Karnabahar", "Hurma", 21),
    Aralık("Pırasa", "Portakal",19);

    final String ayınSebzesi;
    final String ayınMeyvesi;
   final int toplamEgzersizSaati;

    BeslenmeEgzersiz(String ayınSebzesi, String ayınMeyvesi, int toplamEgzersizSaati) {
        this.ayınSebzesi = ayınSebzesi;
        this.ayınMeyvesi = ayınMeyvesi;
        this.toplamEgzersizSaati = toplamEgzersizSaati;
    }

}
