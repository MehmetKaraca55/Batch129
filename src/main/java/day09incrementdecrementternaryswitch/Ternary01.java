package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1:

        int a = 10;
        int b = 20;

        int r1 = a<7 ? a++ : b++;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);

        //Example 2: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız.
        //          -4 ==> -1*-4     4==>4      0==>0

        int c = -4;
        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);//4

        //Example 3: İki sayının işareti aynı ise, bu sayıları çarpan, işaretleri farklı ise, "Farklı işaretli
        // sayıları çarpamıyorum" mesajı veren kodu yazınız

        int m = 5;
        int n = 6;

        //"Object" Java da bütün Non-Primitive data type ların ortak parent(Baba) ıdır.
        //"Object" in parent ı yoltur.
        // Farklı data type ları için ortak bir variable oluşturmak istediğinizde data type olarak object kullanılır.
        //Java da object insanlık aleminde Hz.Adem e benzer.

        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farklı işaretli sayıları çarpamıyorum";
        System.out.println(r3);

        //Example 4: Size verilen sayının 3 basamaklı olup olmadığını kontrol eden kodu yazınız.

        int p = -436;
        int r = Math.abs(p);
        String r4 = (r>99 && r<1000) ? p + " üç basamaklıdır" : p + " üç basamaklı değildir";
        System.out.println(r4);






    }
}
