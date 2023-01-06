package ssg;

public class Ternary01 {
    public static void main(String[] args) {

        // verilen sayi 100'den buyukse sayi’nin karesini  alip yazdiran
        // 100'den kucukse ” sayi 100'den buyuk olmali” yazdiran
        // bir ternary olusturalim

        int sayı=115;

        Object m = sayı>100 ? sayı*sayı : "Sayı 100'den büyük olmalı";
        System.out.println(m);

        System.out.println(sayı>100 ? sayı*sayı : "sayı 100'den büyük olmalı");






    }
}
