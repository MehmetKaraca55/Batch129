package buddy;

import java.util.Arrays;

public class KelimeleriSayilariSirala {

    public static void main(String[] args) {

        /*

         Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.


    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
         */
        String kelimeler[]= new String[6];

        kelimeler[0]="C Programming";
        kelimeler[1]="C#";
        kelimeler[2]="C++";
        kelimeler[3]="Java";
        kelimeler[4]="PHP";
        kelimeler[5]="Python";

        Arrays.sort(kelimeler);
        System.out.println(Arrays.toString(kelimeler));
    }
}
