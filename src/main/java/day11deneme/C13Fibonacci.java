package day11deneme;

import java.util.Scanner;

public class C13Fibonacci {

    public static void main(String[] args) {

        /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=input.nextInt();

        int a=0;
        int b=1;
        int c=1;

        for (int i = 0; i < sayı; i++) {
            System.out.print(a + " ");
            a=b;
            b=c;
            c=a+b;

        }










    }
}
