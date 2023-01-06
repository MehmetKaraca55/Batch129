package day11deneme;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {

        //Kullanıcıdan başlangıç ve bitiş değerlerini alın, başlangıç değerinden başlayıp bitiş değerine kadar olan
        //tüm çift tamsayıları ekrana yazdırınız.


        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz");
        int a =input.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz");
        int b= input.nextInt();

        if(a>b) {
            System.out.println("Başlangış değeri bitiş değerinden büyük olamaz");
        }else
            for (int i = a; i <= b; i++) {
            if(i%2==0){
                System.out.print(i + " ");

            }



        }


    }
}
