package mini_Projects.KursaOgrenciSec;

import java.util.Scanner;

public class KursaOgrenciSec {

    /*
    Spor kursu için seçilecek öğrencileri seçmek için bir kod yazınız

            Kurs gereklilikleri;
            Erkekler: boy: 1.60 ve üstü
                            kilo: 70-90 kg
            Kızlar: boy: 1.50 ve üstü
                        Kilo: 50-70

       Kullanıcıdan öğrenci sayısı ve her bir öğrenci için isim, cinsiyet, kilo ve boy bilgilerini girmesini isteyiniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz");
        int öğrenciSayısı=scanner.nextInt();

        String[] isimArr = new String[öğrenciSayısı];
        String[] cinsiyetArr = new String[öğrenciSayısı];
        double[] kilotArr = new double[öğrenciSayısı];
        double[] boyArr = new double[öğrenciSayısı];

        for(int i=0; i<öğrenciSayısı; i++){
            System.out.println(i+1+ ". İsim giriniz");
            scanner.nextLine();
            isimArr[i]= scanner.nextLine();
            System.out.println("Cinsiyet giriniz");
            String cinsiyet =scanner.next().toLowerCase().trim().substring(0,1);
            if(cinsiyet.equals("k")|| cinsiyet.equals("e")){
                cinsiyetArr[i]=cinsiyet;

            }else{
                System.out.println("Hatalı giriş. Yeniden giriniz");
                i--;
                continue;
            }
            System.out.println("Kilo giriniz(kg):");
            kilotArr[i]= scanner.nextDouble();

            System.out.println("Boy giriniz(m):");
            boyArr[i]= scanner.nextDouble();

            System.out.println("Kursa seçilen öğrenciler");
            int sayac=0;
            for(int j=0; j<öğrenciSayısı; j++ ){

                if(cinsiyetArr[j].equals("k")&&kilotArr[j]>=50&&kilotArr[j]<=70&&boyArr[j]>=1.5){
                    System.out.println(isimArr[j]);
                    sayac++;

                }else if (cinsiyetArr[j].equals("e")&&kilotArr[j]>=70&&kilotArr[j]<=90&&boyArr[j]>=1.6){
                    System.out.println(isimArr[j]);
                    sayac++;
                }
            }
            if(sayac==0){
                System.out.println("Kursa seçilen öğrenci yoktur!!!");

            }

        }




    }

}
