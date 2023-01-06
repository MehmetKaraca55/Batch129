package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Kullanıcından iki sayı alınız, "Büyük olmayan (küçük veya eşit olan) sayıyı yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("İki sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();


        //1.Yol: if else

        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2. Yol: Ternary (if else in yaptığı aynı şeyi yapar, sadece söz dizimi farklı)
        // daha kısadır, daha okunurdur
        //önce condition, sonra soru işareti, condition true ise ilk kısım çalışır,
        //condition false ise ikinci kısım çalışır.

        double result = a<b ? a : b;
        System.out.println(result);



    }
}
