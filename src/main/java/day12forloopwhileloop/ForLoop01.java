package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
*/

        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int row= input.nextInt();

        System.out.println("Sütun sayısını giriniz");
        int column= input.nextInt();

        for (int i = 1; i <=row ; i++) {

            for (int k1 = 0; k1 <=column; k1++) {
                System.out.print("X ");

            }
            System.out.println();

        }



























    }
}