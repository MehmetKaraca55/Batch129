package day12forloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        // Example 1: 3'ten 10'a kadar tamsayıları console a yazdırın

        //1.YOL: For Loop

        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }

        //2.YOL: While Loop

        int i=3;

        while(i>11){

            System.out.println(i+ " ");

            i++;

        }
        System.out.println();

        //Example 2: 23'den 12'ye kadar çift tamsayıları console a yazdırınız

        int k=23;

        while(k>11){

            if(k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();

        //Example 3: Verilen bir tamsayının rakamları toplamını console a yazdıran kodu yazınız.

        //Sayı%10==> Her zaman sayının son rakamını verir.

        //1.YOL: While Loop

        int num=578;
        num=Math.abs(num);
        int sum=0;//toplanan rakamların koyulacağı konteyner.

        while(num>0){

            sum=sum +num%10;

            num/=10;
        }
        System.out.println(sum);


        //2.YOL: For Loop:

        int a= 684;
        int toplam= 0;//Toplanan sayıların konulacağı konteyner

        for (int m = a; m >0 ; m/=10) {
            toplam=toplam+m%10;

        }
        System.out.println(toplam);


    }
}
