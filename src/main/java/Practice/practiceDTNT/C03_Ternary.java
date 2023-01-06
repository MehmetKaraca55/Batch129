package Practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan sıfırdan büyük pozitif bir tam sayı girmesini isteyiniz.
        girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
        3 basamaklı değilse, çift olup olmadığını

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int sayı = input.nextInt();
        boolean sıfırdanBüyükÜçBas = sayı>99 && sayı<1000;
        boolean sıfırdanBüyükÜçBasOlmayanÇift = !(sayı>99 && sayı<1000) && sayı%2==0;

        System.out.println("***********if ile çözümü **********************");
        if(sayı>0){


            if(sıfırdanBüyükÜçBas){
                System.out.println("3 Basamaklı Sayı");

            }else if(sıfırdanBüyükÜçBasOlmayanÇift){
                System.out.println("3 basamaklı olmayan çift sayı");

            }else{
                System.out.println("3 basamaklı olmayan pozitif tek sayı");
            }

        }else{//negatif sayılar için burası çalışır.
            System.out.println("Lütfen pozitif bir tamsayı giriniz");
        }

        System.out.println("****Ternary******");

        boolean sıfırdanBüyükÜçBasTer = sayı>99 && sayı<1000;
        boolean sıfırdanBüyükÜçBasOlmayanÇiftTer = !(sayı>99 && sayı<1000) && sayı%2==0;

        //şart ? True Action : False Action

        String sonuç = sayı>0 ? sıfırdanBüyükÜçBasTer ? ("3 Basamaklı Sayı") : sıfırdanBüyükÜçBasOlmayanÇiftTer ?
                ("3 basamaklı olmayan çift sayı") : ("3 basamaklı olmayan tek sayı") : ("Lütfen pozitif bir tamsayı giriniz");
        System.out.println(sonuç);
    }
}
