package Practice.okul;

import Practice.practiceDTNT.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain {

    /*
    1- Değişkenleri ad, soyad, yaş olan bir öğrenci Pojo class'ı oluşturunuz.
    2- Değişkenleri okulAd, maxÖğrenciSayısı, ArrayList cinsinden öğrencileri olan bir okul pojo class oluşturunuz.
    3- Main methodun olduğu OkulMain isimli bir class oluşturunuz.
    4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
        Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
        Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul();
        System.out.println("Okul adını giriniz");
        okul.setOkulAdı(scanner.nextLine());
        System.out.println();
        okul.setMaxÖğrenciSayısı(scanner.nextInt());

        for(int i =1; i<= okul.getMaxÖğrenciSayısı(); i++){

            scanner.nextLine(); //Dummy Scanner(İlk öğrenci ismini yazmadan diğerini soruyor. Bu şekilde onun önüne geçeriz)
            Öğrenci öğrenci = new Öğrenci();
            System.out.println(i + ". öğrenci ad: ");
            öğrenci.setAd(scanner.nextLine());

            System.out.println(i + ". öğrenci soyAd: ");
            öğrenci.setSoyAd(scanner.nextLine());

            System.out.println(i + ". öğrenci yaş: ");


            try{
                öğrenci.setYaş(scanner.nextInt());
                if(öğrenci.getYaş()<8 || öğrenci.getYaş()>15){
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

            okul.addÖğrenciToList(öğrenci);


        }



    }

}
