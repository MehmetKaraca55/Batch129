package day11deneme;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        /*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        ORNEK:
        INPUT      : Kilo: 71
                      Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
    */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo=input.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boy=input.nextDouble();

        double VKI=kilo*(boy*boy);
        System.out.println("VKI:" + VKI);

        /*
         * Kullanicidan alacaginiz vize1; vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen vize1 notunuzu giriniz");
        double vize1=input.nextDouble();

        System.out.println("Lütfen vize2 notunuzu giriniz");
        double vize2=input.nextDouble();

        System.out.println("Lütfen son sınav notunuzu giriniz");

        double sonSınav = input.nextDouble();

        double vizeort=(vize1+vize2)*30/100;
        double finalort=sonSınav*70/100;
        System.out.println("Geçme Notu: " +(vizeort+finalort));




        }
       

        }



