package Practice;

import java.util.Scanner;

public class C02_Variables {

    /*
     TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
 salona devam edeceği ay süresi  bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TechProEd Spor Salonuna Hoşgeldiniz");

        System.out.println("Lütfen isim soyisim giriniz");
        String isim = input.nextLine(); // tüm cümleyi alır, enter a basıncaya kadar olan satırı alır.

        System.out.println("Lütfen yaşınızı giriniz");
        byte yaş = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        System.out.println("Lütfen boyunuz giriniz");
        double boy = input.nextDouble();

        int aylıkÜcret = 20;
        System.out.println("aylıkÜcret = " + aylıkÜcret);

        System.out.println("Lütfen devam edeceğiniz süreyi giriniz");
        int ay = input.nextInt();


        int toplamTutar = aylıkÜcret*ay;
        System.out.println("Ödeyeceğiniz Toplam Tutar : " + toplamTutar+"$");

        System.out.println("Isminiz : " + isim + "\t" + "Yasiniz : " + yaş +
                "\t"+" Kilo : " + kilo + " Boyunuz : " + boy+ "Odemeniz gereken toplam tutar : " +
                toplamTutar + "$");









    }
}
