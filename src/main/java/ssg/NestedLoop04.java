package ssg;

public class NestedLoop04 {
    public static void main(String[] args) {

         /*
            a
            a b
            a b c
            a b c d
            a b c d e
       şeklini yazdırınız.


       */

        char harf = 'a';
        for (char i = 'a'; i <= harf ; i++) {

            for (char j = 'a'; j < harf; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");

        }
        System.out.println();
        // 1 .yol

        int sayi = 5;
        for (int i = 1; i <sayi ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print((char)(('a'-1)+j));
            }
            System.out.println();
        }



        // soru 6 Asagidaki sekil cizen kodu yaziniz
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int input =5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input-i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println("");
        }
    }
}
