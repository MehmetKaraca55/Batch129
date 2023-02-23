package Practice.practiceDTNT;

import java.util.HashMap;
import java.util.Scanner;

public class KullanıcıBilgileriMap {

    /*
    1- Kullanıcıdan bir kişinin kimlik numarasını(4 haneli),
        tam ismini, adresini , telefonunu alın.
     2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
     3- Kimlik numarasını girerek kullanıcının bilgilerini ekrana yazdırın
     4- Tüm kullanicilarin isimlerini ekrana yazdıralım
     */

    public static void main(String[] args) {


        String secim="";

        Scanner input= new Scanner(System.in);
        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

        do{

           HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("Lütfen ad ve soyadınızı giriniz");
            kisiBilgileri.put("TamIsim", input.nextLine());
            System.out.println("Lütfen adresinizi giriniz");
            kisiBilgileri.put("adres", input.nextLine());
            System.out.println("Lütfen telefon numaranızı giriniz");
            kisiBilgileri.put("TelNo", input.nextLine());

            System.out.println("Lütfen kimlik numaranızı giriniz");
            kisiListesi.put(input.nextInt(), kisiBilgileri);

            System.out.println("KisiBilgileri" + kisiBilgileri);
            System.out.println("KisiListesi" + kisiListesi);
            System.out.println("Devam etmek istiyor musunuz? E/H");
            secim=input.next();


        }while(secim.equalsIgnoreCase("E"));

        System.out.println("Lütfen aradıgınız kisinin TC numarasını giriniz");
        System.out.println(kisiListesi.get(input.nextInt()));


    }

}
