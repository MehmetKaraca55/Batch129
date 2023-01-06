package ssg;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı= input.nextInt();

        if(sayı%2==0){
            System.out.println("Çift");

        }else{
            System.out.println("Tek");
        }


        }






    }

