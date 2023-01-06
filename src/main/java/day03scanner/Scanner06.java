package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz");
        int number = input.nextInt();
        //son rakamı al
        int lastDigit = number%10;

        //sayıyı küçült
        number=number/10;

        //sondan ikinci rakamı al
        int lastSecondDigit = number%10;
        number = number/10;

        //sondan üçüncü rakamı al
        int lastThirdDigit = number%10;
        number = number/10;

        //sondan dördüncü rakamı al
        int lastFourthDigit = number%10;
        number = number/10;

        //sondan beşinci rakamı al
        int lastFifthDigit = number%10;


        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);


    }
}
