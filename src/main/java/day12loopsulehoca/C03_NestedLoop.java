package day12loopsulehoca;


import java.util.Scanner;

public class C03_NestedLoop {
    public static void main(String[] args) {

          /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
*/
        //önce satırları kontrol edecez. 5 satır var

        for (int i = 1; i < 6; i++) {//satır kontrolü
            for (int j = 1; j <=i ; j++) {//rakam kontrolü
                System.out.print(j + " ");
                }
            System.out.println();//alt satıra geçmek için
        }

        System.out.println();


        /*

    Example 2: Asagidaki sekil cizen kodu yaziniz
                * * * *
                * * *
                * *
                *
 */
        int satır=4;

        for (int i = 1; i <=satır; i++) {//satır kontrol
            for (int j = satır; j >=i ; j--) {//yıldız kontrol
                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println();









    }//main


}//class
