package day10switchloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //Example 1: Ay numarasını söyleyince, numarası verilen aydan başlayıp 12. aya kadar tüm ayların isimlerini
        // yazdıran kodu yazınız.
        // 8 ==> August - September - October - Novermber - December

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç ayının kaçıncı ay olduğunu giriniz");
        int numOfMonth = input.nextInt();

        switch(numOfMonth){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Geçerli ay numarası veriniz");

        }

        /*
        Note: switch de;
        1- String,
        2- int
        3- byte
        4- short
        5- char kullanılabilir.

        Ancak, long, boolean, float, double kullanılmaz
         */



    }
}
