package ssg;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input= new Scanner(System.in);

        int sayı= 1;
        int toplam=0;
        int counter=1;

        while(sayı!=0){
            System.out.println("Bir tamsayı giriniz");
            sayı=input.nextInt();
            toplam+=sayı;
            counter++;
        }
        System.out.println((counter-1) + " defa sayı girdiniz. Toplam :" + toplam);

        System.out.println();


        do{
            System.out.println("Bir tamsayı giriniz");
            sayı=input.nextInt();
            toplam+=sayı;
            counter++;
        }while(sayı!=0);
        System.out.println((counter-1) + " defa sayı girdiniz. Toplam :" + toplam);



    }
}
