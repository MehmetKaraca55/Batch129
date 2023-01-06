package day12loopsulehoca;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    public static void main(String[] args) {

        //Kullanıcıdan başlangıç ve bitiş değerlerini alın, başlangıç değerinden başlayıp bitiş değerine kadar olan
        //tüm tamsayıları ekrana yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen başlangıç giriniz");
        int başlangıç=input.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz");
        int bitiş= input.nextInt();

        if(başlangıç>bitiş){
            System.out.println("Verdiğiniz başlangıç değeri bitiş değerinden küçük olmalı");
        }else{
            for (int i = başlangıç; i <=bitiş ; i++) {
                System.out.print(" " +i);

            }

        }



    }
}
