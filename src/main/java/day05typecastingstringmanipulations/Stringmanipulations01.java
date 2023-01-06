package day05typecastingstringmanipulations;

public class Stringmanipulations01 {

    //String bir non-primitive data type dir, aynı zamanda bir Classdır.
    //bir kedi hem memelidir hem hayvan

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String deki tüm karakterleri büyük harf yapınız

       String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        // Example 2: "s" String deki tüm karakterleri küçük harf yapınız
        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //Example 3: "s" String deki ilk karakteri alınız.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Example 4: "s" String indeki ikinci ve sondan ikinci characteri alınız ve ekrana yanyana yazdırınız

        char secondChar = s.charAt(1);
        char tenthChar = s.charAt(10);

        //1. Yol: Aynı satırda yazdırmak için
        System.out.print(secondChar);
        System.out.print(tenthChar);

        //2.Yol:Aynı satırda yazdırmak için
        System.out.println("" + secondChar + tenthChar);

        //Example 5: "s" String inde kullanılan character sayısını bulunuz
        int sLenght = s.length();
        System.out.println(sLenght);

        //Example 6: "s" String indeki ilk dört karakteri alınız.

        //substing (0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index hariç dir.
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        //Example 7: "s" String indeki "is" kelimesini alınız
        String is = s.substring(5,7);
        System.out.println(is);

        //Example 8: "s" String indeki "easy" kelimesini alınız
        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //Bir characterden başlayıp sonuna kadar almak isterseniz, ikinci index i yazmayınız.
        //s.substring(8, 12) yerine, s.substring(8) yazınız.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" String inde "money" kelimesinin var olup olmadığını kontrol ediniz.
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        /* Bir methodu öğrenirken şu 3 şeyi mutlaka öğrenin;
        1. Bu method ne iş yapar,
        2. Bu methodun farklı kullanımları nasıldır.
        3. Bu method size ne return eder.
         */

        //Example 10: "s" String inin belli bir harfle başlayıp başlamadığını kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String inin altıncı characterden itibaren belli bir harfle başlyıp başlamadığını kontrol ediniz.
        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);











    }
}
