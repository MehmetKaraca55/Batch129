package day11loopssulehoca;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        //5'ten 10'a kadar tamsayıların toplamını bulan kodu yazınız.
        int sum=0;

        for (int i = 5; i < 11; i++) {
            sum=sum+i;

        }
        System.out.println("5'den 10'a kadar toplam: " +sum);


        // 6'dan 3'e kadar olan tamsayilarin carpimini bulan kodu yaziniz

        int carpma= 1;
        for(int i=6; i>2; i--){
            carpma = carpma * i;
        }
        System.out.println(carpma);

        int carpim=1;
        for (int i= 6; i >2 ; i--) {
            carpim*=i;
        }
        System.out.println(carpim);//360

        //Bir tamsayinin rakamlarinin toplamini yazan kodu olusturunuz

        int sayi=2543;
        sayi=Math.abs(sayi);
        int toplam=0;
        for (int i =2543; i >0 ;i= i/10 ) {


            toplam=toplam+i%10;
        }
        System.out.println(toplam);

        //  //Bir tamsayinin rakamlarinin toplamini yazan kodu olusturunuz
        //2545==>2+5+4+3+=14
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen tam sayi giriniz");
        int num=input.nextInt();

        num= Math.abs(num);//  mat clasindan  verilen eksi degerler icin pozotif  yapmak icin kullaniyoruz.
        int sonuc=0;
        for (int i = num; i < 0; i=i/10) { //  10 ile bolmek ile  sayiyi kucultuyoruz%  son rakamini almak icinde % 10GERKIYOR

            sonuc = sonuc + i%10;    //  son rakamlari  almak icin kullaniyoruz

        } // for
        System.out.println(sonuc);//

    }

}






