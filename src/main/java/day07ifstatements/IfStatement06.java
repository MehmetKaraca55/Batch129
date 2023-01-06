package day07ifstatements;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
     asagidaki tabloya gore yazdiran kodu olusturunuz
     0-4 ==> bebek
     5-12 ==> cocuk
     13-20 ==> genc
     21-30 ==> yetiskin
     30 üstü Tanimlanmamis Evre
     Hata Mesaji olarak "Gecerli bir yas giriniz" yazdirini

         */

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        byte age = input.nextByte();

        if(age<0){
            System.out.println("Geçerli bir yaş giriniz");
        }else if(age<5){
            System.out.println("Bebek");
        }else if(age<13) {
            System.out.println("Çocuk");
        }else if(age<21) {
            System.out.println("Genç");
        }else if(age<31) {
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanımlanmamış Yaş");
        }

    }
}
