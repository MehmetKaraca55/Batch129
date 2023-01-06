package Practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        Kullancidan bir gun alin
            - eger gun cuma ise "Muslumanlar icin mubarek gun";
            - eger gun cumartesi ise "Yahudiler icin mubarek gun";
            - eger gun pazar ise "Hristiyanlar icin mubarek gun" yazdiran kodu olusturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String gün = input.next().toLowerCase(); //küçük harfe çevirdik

        if (gün.equals("cuma")) {
            System.out.println("Müslümanlar için mübarek gün");

        } else if (gün.equals("cumartesi")) {
            System.out.println("Yahudiler için mübarek gün");

        } else if (gün.equals("pazar")) {
            System.out.println("Hristiyanlar için mübarek gün");
        } else {
            System.out.println("Kutsal gün değil");
        }

    }
}
