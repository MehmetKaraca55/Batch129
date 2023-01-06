package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //kullanıcıdan ilk ismini ve soy ismini alıp, ikisini aynı satırda ekrana yazdırınz.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        //next() methodu kullanıcıdan tek kelimeli String almak için kullanılır.
        String firstName = input.next();

        System.out.println("Soyisminizi giriniz");
        String surname = input.next();

        System.out.println(firstName + " " + surname);


    }

}
