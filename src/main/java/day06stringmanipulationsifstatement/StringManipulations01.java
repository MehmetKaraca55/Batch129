package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String in baş ve sonunda space character i varsa siliniz.
        //         " Ali Can " ==> "AliCan"

        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() metodu bir String in baş ve sonundaki space karakterlerini siler, aradaki spacelere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        // Example 2: Aşağıda fiyatları verilen ürünlerin toplam fiyatlarını bulunuz.
        //          String tv= "$456.99";   String laptop= "$875.99"; ==>456.99 + 875.99 = 1332.98
        String tv1= "$456.99";
        String tv2 = tv1.replace("$", "");
        System.out.println(tv2); //456.99 ==> Ondalık sayılar Java da otomatik olarak double kabul edilir.

        String laptop1= "$875.99";
        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);//875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.99

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdırınız
        //           "Ali Can" ==> AC

        String name = "   ali cAN  ";
        char first = name.trim(). toUpperCase().charAt(0);
        System.out.println(first);//A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);//C
        System.out.println("" + first + second);

        //Example 4: Bir String in hic karakter içermediğini (Bos String) kontrol eden kodu yazınız.
        String str = "";

        //1.Yol; lenght() metodu
        boolean result1 = str.length()==0;
        System.out.println("String boş mu? " + result1); //true

        //2.yol: isEmpty() kullan. Java bir konuda metod üretmişse o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("String boş mu? " + result2);

        //Example 5: Bir String in space hariç hiçbir karakter içermediğini kontrol eden kodu yazınız
        String t = "      ";

        //1. yol:
        boolean result3 = t.replace(" ", ""). length()==0;
        System.out.println("Sadece space mi var? " + result3);

        //2.Yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3. Yol:
        // isBlank() metodu sadece spce içeren String ler için true, space dışında bir character içerirse false verir.
        //isBlank() metodu boş String ler içinde de true verir
        //isBlank() ==> space + hiçbir şey için true        isEmpty() metodu ==> hicbir şey için true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);

        //Example 6: Bir String de a, e, i, karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız
        //          "Java is easy to learn" ==> 1 + 5 +  = 14
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA); //1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Indexler toplamı: " + (idxA + idxI + idxE));//14

        //Example 7: Bir String de "java" kelimesinin ilk olarak kaçıncı indexde kullanıldığını gösteren kodu yazınız.
        //          "Ah Java vah Java sensiz olmuyor Java"

        String u = "Ah Java vah Java sensiz olmuyor Java";

        //indexOf("java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin indexini almış olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);

        //indexOf metodu olmayan karakterler için kullanılırsa her zaman -1 verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Example 8: Bir String de a, e, i, karakterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız
        //           "Java is easy to learn" ==> 18+5+17=40
        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        System.out.println(idxOfA+idxOfE+idxOfI);//40

        //Note: lastIndexOf() String de olmayan bir karakter için kullanılırsa her zaman -1 verir.

        //Example 9: (Hocaya ebay ın interwievinde sorulmuş)
        //Bir String deki tekrarsız karakterleri ekrana yazdırınız
        //          abbccdc==>ad

        //Note: Bazı kodların bazı şartlara bağlı olarak çalışması gerekir.
        // Bazı kodları bazı şartlara göre aktive etmek için "if statement" kullanılır.
        // if you study hard, you will learn Java.

        //Example 10: Sayı pozitif ise ekrana pozitif yazdırın.
        int num = 12;

        if(num>0){
            System.out.println("pozitif");
        }

        //Example 11: Sayı -1 ile 10 arasında ise ekrana rakam yazdırın.
        int number = 3;
        if(number>-1 && number<10){
            System.out.println("rakam");
        }



        //Example 12:Sayı 3 basamaklı ise "Wooow" ekrana yazdırın.
        int n = -123;
        n = Math.abs(n);
        if(n>99 && n<1000){
            System.out.println("Wooow");
        }

        //Example 9: (Hocaya ebay ın interwievinde sorulmuş)
        //Bir String deki tekrarsız karakterleri ekrana yazdırınız
        //          aac==>c

        String y = "aac";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
















    }

}
