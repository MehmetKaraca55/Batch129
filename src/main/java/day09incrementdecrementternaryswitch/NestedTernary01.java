package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Example 1: Verilen yılın artık yıl (Leap year) olup olmadığını kontrol eden kodu yazınız.
                1) Yıl 100 e bölünürse 400 de bölünmelidir.==>1600==>leap  1800==>Leap değil
                2) Yıl 100 e bölünmüyorsa, 4 e bölünmelidir. 2004==>Leap   2005==>Leap değil
         */

        int year = 2005;
        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);

    }
}
