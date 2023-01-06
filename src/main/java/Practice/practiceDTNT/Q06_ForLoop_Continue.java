package Practice.practiceDTNT;

import java.util.Scanner;

public class Q06_ForLoop_Continue {

    public static void main(String[] args) {

        /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */

        Scanner input= new Scanner (System.in);
        int toplam = 0;

        for(int i=0; i<5; i++){
            System.out.println("Bir tamsayı giriniz");
            int sayı = input.nextInt();

            if(sayı > 5 && sayı<10){
                System.out.println("Girdiğiniz sayı 5 ile 10 arasındadır. Toplama dahil olmayacaktır.");
                continue;
            }
            System.out.println(toplam = toplam+sayı);
        }










    }
}
