package Practice.practiceDTNT;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner2 {

    public static void main(String[] args) {

       KarePrizma karePrizma = new KarePrizma();//Kareprizma class ındaki methodları kullanabilmek için object oluşturduk.

        double karePrizmaHacmi = karePrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);//150.0
        

        NumberFormat obj = new DecimalFormat(".00");//Virgülden sonra kaç basamak ilerleyecek
        Koni koni = new Koni();
        double koniHacim=koni.hacimHesapla(3,5);
        System.out.println("koniHacim = " + obj.format(koniHacim));//eskisi: 47.099999999999994
                                                                    // yenisi: 47.10
        /*
        NUmberFormat Class'ından bir object oluşturup, DecimalFormat içerisine (".00") yazdığımızda, virgülden sonra
        2 basamak yazdırır.
        NUmberFormat Class'ından bir object oluşturup, DecimalFormat içerisine (".000") yazdığımızda, virgülden sonra
        3 basamak yazdırır.
         */

        Silindir silindir = new Silindir();
        double silindirHacim = silindir.hacimHesapla(1,5);
        System.out.println("obj.format(silindirHacim = " + obj.format(silindirHacim));//15.70
        


    }//main
}//class
