package day11deneme;

import java.util.Scanner;

public class C12 {

    public static void main(String[] args) {

        /*Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere kullanildigini bulup, yazdirin

         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=input.next();
        System.out.println("Lütfen bir harf giriniz");
        String harf=input.next();
        int sum=0;

        for (int i = 0; i < kelime.length(); i++) {

            sum=sum+i;
        }




    }
}
