package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
            Geçerli Username="admin", password="pwd123" dur.
            Kullanıcıdan username ve password u alın. Username ve password dogru ise consola
            "Hesabınıza Hosgeldiniz!" desin.
            Username veya password yanlış ise, 4 kere "Username ve password'unuzu giriniz" mesajı versin.
            Username veya password 4.kere yanlış girilirse, "Hesabınız bloke olmuştur" mesajı vererek işlemi tamamlayın.
         */

        Scanner input= new Scanner(System.in);




        int counter=0; //birinci, ikinci , üçünüc giriş şeklinde sayması için - counter

        do{

         if(counter==4){
             System.out.println("Hesabınız bloke olmuştur!");//bloke olma en başta kontrol edilmeli. Bloke ise boşyere
                                                            // kullanıcı adı veya password sormamalı
             break;
         }

            System.out.println("Username'inizi giriniz");//tekrarlı çalışacağı için
            String username=input.next();

            System.out.println("Password'unuzu giriniz");
            String password=input.next();

            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabınıza hoşgeldiniz!");
                break;

            }
            counter++;

        }while(true); // sonsuz loop yapar ama biz break lerle onu engelliyoruz zaten (counter<5 te yazabilirdik ama Javaya
                        //iş yaptırmış oluruz// )



    }
}
