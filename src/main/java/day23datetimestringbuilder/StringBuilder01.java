package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
    Javada, String'ler, String Class kullanılarak veya StringBUilder Class kullanılarak oluşturulabilir.
    String Class kullanarak ürettiğiniz Stringler "Immutable"(değiştirilemez)dır
    StringBuilder Class kullanarak ürettiğiniz Stringler "Mutable"(>Değiştirilebilir)dır
    String class la oluşturulan Stringler,  yeni konteynar lara konulur.
     */

    public static void main(String[] args) {

        //Immutable
        //Memory dolup dolup taşıyor.
        //Orjinal değer hep koruma altında olur.
        String s = "Java"; // String class kullandım.
        String t = s + "!";
        String w = t + "?";

        //String'i değiştirdikten sonra, aynı String'e assign ederseniz, Java yine yeni bir konteyner oluşturur
        //değişmiş değeri bu yeni konteyner ın içine koyar ve eski konteyner ı gösteren oku, yeni konteyner a
        //yönlendirir.
        //Dolayısıyla, eski konteyner adressiz kalır ve "Garbage Collector" adressiz olan konteynerları siler.
        String a = "Money";
        a = a + " More";

        //Mutable
        //Orjinal değer ölür.
        //Memory dolmaz.
        //StringBuilder kullanarak String üretmenin 1. yolu:
        StringBuilder sb = new StringBuilder("Python");
        sb.append("!");//yeni bir konteyner oluşturmaz Java, sonuna ünlem ekler, aynı kabın içine koyar.
                        //Var olan kabın içindeki değeri değiştirirler.
                        //append() methodu String i String e yapıştırır.
        //append ile method chain yapılabilir.

        sb.append("!").append("?").append(".");
        System.out.println(sb);//Python!?.

        //StringBuilder kullanarak String üretmenin 2. yolu:
        //İlla constructor'ın parantezine koymaya gerek yok
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0: Length, verilen bu kutulardan kaç tanesinde değer var.

       //StringBUilder kullandığınızda, başlangıç kapasitesi 16'dır.
        //Kapasite aşıldığında, varolan kapasitesinin 2 fazlası kadar, varolan kapasiteye ekleme yapılır.
        // 16 ==> 16*2+2       ----- 34 ==>34*2+2
        System.out.println(sb2.capacity());//16: Java 16 tane boş kutuyu otomatik olarak verir
        sb2.append("Java");
        System.out.println(sb2.length());//4 Java 16 boş kutunun 4'ünü doldurdu.
        System.out.println(sb2.capacity());//16: Java 16 tane boş kutuyu otomatik olarak verir

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19: 4'ü Javadan geliyor. 15 tane de x var.
        System.out.println(sb2.capacity());//34 : toplam kutu sayısı 34. Var olan kutu sayısının 2 katının 2 fazlası

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.length());//Var olanın 2 katının 2 fazlası kadar ekler. 34*2+2=70


        //StringBuilder kullanarak String üretmenin 3. yolu:

        StringBuilder sb3 = new StringBuilder(2);//Bana 16 kutu lazım değil, onu 2 kutu yap dedik,
                                                        //memory den tasarruf ettik.
        sb3.append("Flo");
        System.out.println(sb3.length());//3 tane karakter.
        System.out.println(sb3.capacity());//6 Java var olan kadar ekler, plus 2 daha ekledi. Yetmedi, tekrar var olan +
                                        // 2 daha ekledi.


        sb3.insert(2, "xxxxxx"); // FLxxxxxxxo
        System.out.println(sb3);//kaç karakteri es geçeceksiniz. 2 karakteri es geç, x'leri araya yapıştır.
        System.out.println(sb3.length());//9

        //toString() methodu StringBuilder'ı String'e çevirir.
        //String class da bazı methodlar var, StringBUilder'da yok. O methodlara ihtiyaç duyarsak, mesela split()
        //String Class'da var olan ama StringBuilder'da var olmayan split() method gibi methodlara iftiyaç
        //duyduğumuzda, toString() methodunu kullanarak, String Class'a gecer ve o methodları kullanırız.

        sb3.toString().split("l");

        //String'i tekrar StringBUilder'a çevirebilirsiniz.
        StringBuilder sb4 = new StringBuilder(sb3);


        //reverse() methodu, var olan String'i tersine çevirir.
        sb3.reverse();
        System.out.println(sb3);//oxxxxxxxlF


        //deleteCharAt(1): StringBuilder a git, verilen index'teki karakteri sil
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxxxlF


        //index 1'deki karakterden index 5(6 dahil olmadığı için 5 yazdım)'teki karaktere kadar tüm karakterleri siler.
        sb3.delete(1, 6);
        System.out.println(sb3);//olF


        StringBuilder sb5 = new StringBuilder("Java");
        StringBuilder sb6 = new StringBuilder("Java");

       //compareTo() methodu sb5 ile sb6 yı alfabetik sıralama olarak karşılaştırır.
        //sb5 alfabetik sıralamada önce ise, sonuç negatif olur. Sonra ise, sonuç pozitif olur.
        sb5.compareTo(sb6);//lexicographically karşılaştırır: Alfabetik olarak
        System.out.println(sb5.compareTo(sb6));//0 verir, çünkü farkları yok
        //ASCII değerleri kullanır. Hava-Java karşılaştırırsak, H ile J arasında ASCII değer olarak kaçtane varsa
        //o kadar fark var.


       //setCharAt(2, 'm') index 2'deki karakteri "m"ye çevirir.
        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama

        sb6.replace(1,3,"xyx");
        System.out.println(sb6);//Jxyza


        //StringBuilder Class'da kullanmamıza izin verilen subString() gibi bazı String Class öethodları vardır.
        //Bu methodları StringBuilder üstünde kullanınca, StringBuilder'ın orjinal değeri değişmez.
        sb6.substring(1,3);//subString() meethodu String Class'ın methodu olduğu için StringBuilder'ın orjinal değerini
                        //değiştiremez.
        System.out.println(sb6);//Jxyza









    }
}
