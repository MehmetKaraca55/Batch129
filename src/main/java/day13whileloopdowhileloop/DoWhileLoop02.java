package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir tamsayı alınız.
        Tamsayı 1002den küçük ise, kullanıcıya "Kaybettiniz!" mesajı vererek, oyunu sonlandırınız.
        Tamsayı 100 ve 100'den büyük ise, "Kazandınız!" mesajı vererek, oyuna devam ettiriniz.
         */

        Scanner input= new Scanner(System.in);

        int num=0;//Başlangıç değeri olarak verdik. farklı da olabilir.
        do{
            System.out.println( "Bir sayı giriniz");//tekrarlı çalışması gerektiği için loop un içinde olmalı
            num= input.nextInt();

            if(num>=100){
                System.out.println("Kazandınız!");
            }

        }while(num>=100);//oyun devam etmesi için num 100 den büyük olmalı

        System.out.println("Kaybettiniz!");


    }
}
