package day11deneme;

import java.util.Scanner;

public class C05 {

    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime =input.next();
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı= input.nextInt();
        sayı=Math.abs(sayı);

        for (int i = 1; i <=sayı; i++) {
            char ch1=kelime.charAt(0);
            char ch2=kelime.charAt(kelime.length()-1);
            System.out.print("" +ch1+ch2);
        }



    }
}
