package ssg;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        // bir kisinin kan bagişında olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yaş= input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo= input.nextDouble();

        if(yaş>=18){

            if(kilo>050){
                System.out.println("Kan bağışına uygunsunuz");
            }else{
                System.out.println("Kan bağışına uygun değilsini");
            }

        }else{
            System.out.println("Yaşınız 18'den büyük olmalı");

        }
















    }
}
