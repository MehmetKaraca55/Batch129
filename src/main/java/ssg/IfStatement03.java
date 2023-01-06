package ssg;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz");
        String günİsmi= input.next().toLowerCase();

        if(günİsmi.equalsIgnoreCase("Pazar") || günİsmi.equals("Cumartesi")){
            System.out.println("haftasonu");


        }else{
            System.out.println("haftaiçi");
        }









    }
}
