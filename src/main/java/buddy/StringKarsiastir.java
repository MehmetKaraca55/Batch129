package buddy;

public class StringKarsiastir {

    public static void main(String[] args) {

         /*
        Girilen iki String veriyi karşılaştıran Java kodu yazınız.


    Test data:
    1. String : techproed.com
    2. String : Techproed.com

    Beklenen Çıktı:
    False

    Test data:
    1. String : techproed.com
    2. String : techproed.com

    Beklenen Çıktı:
    true
         */

        String a = "techproed.com";
        String b = "Techproed.com";

        boolean eşitMi = a.equalsIgnoreCase(b);
        System.out.println(eşitMi);

    }
}
