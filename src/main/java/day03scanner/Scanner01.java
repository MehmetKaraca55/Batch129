package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    //Kullanıcıdan data alıp kodlarımızda kullanıcağız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        byte age = input.nextByte();
        System.out.println(age);

    }

}
