package day11deneme;

import java.util.Scanner;

public class C11 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=input.nextInt();
        boolean asal=true;

        if(sayı<2){
            System.out.println("Girdiğiniz sayı 2'den büyük olmalıdır");
        }else{
            for (int i =2; i < sayı; i++) {
                if(sayı%i==0){
                    asal=false;
                    break;
                }
            }
            if(asal){
                System.out.println(sayı + "asaldır");
            }else{
                System.out.println(sayı + "asal değildir");
            }

            }









    }
}
