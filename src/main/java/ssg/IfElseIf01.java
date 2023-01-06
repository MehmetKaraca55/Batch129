package ssg;

import java.util.Scanner;

public class IfElseIf01 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz");
        int not= input.nextInt();

        if(not>0 || not<=100){
            System.out.println("Geçerli bir not giriniz lütfen");

        }else if(not <50){
            System.out.println("Notunuz D");
        }else if(not <60){
            System.out.println("Notunuz C");
        }else if(not <80){
            System.out.println("Notunuz B");
        }else{
            System.out.println("Notunuz A");
        }






        }

    }

