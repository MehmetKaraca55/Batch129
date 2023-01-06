package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Example 2: Kullanıcıdan alınan bir sayının tek mi çift mi olduğunu yazdıran kodu oluşturunuz

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir sayı giriniz...");

        int num = input.nextInt();

        //1.Yol:
        if(num%2==0){
            System.out.println("Çift Sayı");

        }

        if(num%2!=0){
            System.out.println("Tek Sayı");
        }

        //2. Yol:
        if(num%2==0){
            System.out.println("Çift Sayı");
        }else {
            System.out.println("Tek Sayı");
        }
        }
}
