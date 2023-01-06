package ssg;

import java.util.Scanner;

public class IfElse01 {

    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().toUpperCase().charAt(0);

        if (karakter>='A' && karakter<='Z'){
            System.out.println("Gridiniz karkater harf dir");

        }else {
            System.out.println("Grdiginiz karkater harf degil dir");
        }

        if ((karakter>='a' && karakter<='z')|| (karakter>='A' && karakter<'Z')){
            System.out.println("Harf");
        }else
            System.out.println("Degil");


    }
}
