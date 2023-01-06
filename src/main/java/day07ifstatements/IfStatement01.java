package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz.

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir character giriniz...");

        char ch = input.next(). charAt(0);

        //1. Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("Küçük Harf");
        }

        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran
        // küçük harf ise ekrana "Küçük Harf" yazdıran kodu yazdırın

        //2. Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Küçük Harf");
        }else{
            System.out.println("Harf Değil");
        }

            }
}
