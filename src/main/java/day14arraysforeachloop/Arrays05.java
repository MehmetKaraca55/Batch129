package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //Note1: sort() methodu sayısal data tiplerini küçükten-büyüğe sıralar. (ascending order)
        //Note2: sort() methodu String data tiplerini alfabetik olarak sıralar. (alphabetical order)
        //Note3: ascending order + alphabetic order ==> natural order
        //note4: sort() methodu array elemanlarını natural order a göre sıralar.

        //Note5: binarySearch() methodu bir elemanın bir array de olup olmadığını kontrol etmek için kullanılır.
        //      "binarySearch()" methodunu kullanmadan önce "sort()" methodunu kullanırız.
        // sort() methodunu kullanmazsak, bulduğumuz method güvenilir olmaz.

        String colors []= new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        Arrays.sort(colors);

        int num1= Arrays.binarySearch(colors,"Blue");
        System.out.println(num1);// 0 ==> Var hem de index i sıfır.


        int num2= Arrays.binarySearch(colors,"Orange");
        System.out.println(num2);// 3 ==> Var hem de index i üç.

        int num3= Arrays.binarySearch(colors,"Tarık");
        System.out.println(num3);// -6 ("-" bu eleman yok demek )
                                // 6 ise olsaydı, 6. eleman olurdu.













    }
}
