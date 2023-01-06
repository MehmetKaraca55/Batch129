package ssg;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı= input.nextInt();

        String str= sayı%2==0 ? "Çift" : "Tek";
        System.out.println(str);

        System.out.println(sayı%2==0 ? "Çift" : "Tek");







    }
}
