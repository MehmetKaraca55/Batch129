package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunuz alınız.
        // 1-Alanını hesaplayınız: kısa kenar*uzun kenar
        //2-Çevresini hesaplayınız: 2*(kısa kenar + uzun kenar)
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz");
        float shortSize = input.nextFloat();
        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");
        float longSize = input.nextFloat();
        System.out.println("Alan = " + (shortSize*longSize));
        System.out.println("Çevre = " + (2*(shortSize+longSize)));


    }
}
