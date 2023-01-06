package Practice.practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alacağınız 2 sayıyı yine kullanıcıya seçtireceğiniz dört işlemden biriyle işleme koyup yazdırınız
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen\n toplama yapmak için 1\n çıkarma yapmak için 2\n çarpma yapmak için 3\n " +
                "bölme yapmak için 4\n giriniz");

        int işlem = input.nextInt();
        System.out.println("Lütfen iki tam sayı giriniz");
        double num1 = input.nextDouble();//birinci sayı assign edildi
        double num2 = input.nextDouble();//ikinci sayı assign edildi

        if(işlem == 1){
            System.out.println("Toplama işleminin sonucu :"+ num1+ "+"+num2 + "=" + (num1+num2));

        }else if(işlem == 2){
            System.out.println("Çıkarma işleminin sonucu :"+ num1+"-" +num2 + "=" + (num1-num2));

        }else if(işlem == 3){
            System.out.println("Çarpma işleminin sonucu :"+ num1+"*" +num2 + "=" + (num1*num2));

        }else if(işlem == 4){
            System.out.println("Çarpma işleminin sonucu :"+ num1+"/" +num2 + "=" + (num1/num2));

        }else{
            System.out.println("Hatalı seçim yaptınız. Tekrar deneyiniz");
        }

    }
}
