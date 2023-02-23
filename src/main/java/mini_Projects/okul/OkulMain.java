package mini_Projects.okul;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain {
    /*
    1- Değişkenleri ad, soyad, yaş olan bir öğrenci pojo class'I oluşturunuz
    2- Değişkenleri okulAd, maxÖğrenciSayısı, ArrayList cinsinden öğrencileri olan bir okul pojo class oluşturunuz
    3- Main methodun olduğu OkulMain isisnli bir class oluşturunuz.
    4- Bir okul objesi oluşturup, bu okula maz öğrenci miktarina ulaşıncaya kadar öğrenci ekleyiniz.
    Fakat oluşturacağınız öğrencilerin yaşı 15!i geçmemeli, 8'den küçük olmamalı.
    Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul( );
        System.out.println("Okul adını giriniz");
        okul.setOkulAdı(scanner.nextLine());
        System.out.println("Maximum öğrenci sayısını giriniz");
        okul.setMaxOgrenciSayısı(scanner.nextInt());

        for(int i=1; i<=okul.getMaxOgrenciSayısı(); i++){
            scanner.nextLine();//dummy scanner
            Ogrenci ogrenci = new Ogrenci();
            System.out.println(i+". öğrenci ad:");
            ogrenci.setAd(scanner.nextLine());
            System.out.println(i+". öğrenci soyad:");
            ogrenci.setSoyAd(scanner.nextLine());
            System.out.println(i+". öğrenci yaş:");


            try{
                ogrenci.setYas(scanner.nextInt());
                if(ogrenci.getYas()<8 || ogrenci.getYas()>15){
                    throw new ArithmeticException();
                }
            }catch (ArithmeticException e){
                System.out.println("Öğrenci yaşı 8-15 aralığında olmalıdır");
                i--;
                continue;
            }catch (Exception e){
                System.out.println("8-15 aralığında bir SAYI giriniz");
                i--;
                continue;
            }
            okul.addOgrenciToList(ogrenci);
        }

        System.out.println(okul);

    }

}
