package miniProject.biletBus;

import java.util.Scanner;

public class Bilet {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int km=0;
        int yas=0;
        int yolculukTipi=1;
        String plakaNumarasi="55 AD 626";


        System.out.println("Lutfen gideceginiz mesafeyi km olarak veriniz");
        km= input.nextInt();

        System.out.println("Lutfen yasinizi giriniz");
        yas= input.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz" + "Sadece Gidis ise 1\ngidis-donus ise 2");
        yolculukTipi= input.nextInt();

        if(km>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)){

            double biletUcreti=km*0.10;
            double yasIndirimOrani=0;

            if(yas<12){
                yasIndirimOrani=0.5;

            }else if(yas<24){
                yasIndirimOrani=0.1;

            }else if(yas>65){
                yasIndirimOrani=0.3;
            }

            biletUcreti-= biletUcreti*yasIndirimOrani;

            if(yolculukTipi==2){
                biletUcreti-=biletUcreti*0.2;
                biletUcreti*=2;


            }

            biletDokum(plakaNumarasi, km, yolculukTipi, biletUcreti);


        }else
            System.out.println("Hatali veri girdiniz....");



    }//main

    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti) {

        System.out.println("===========================BILET DOKUM ================================");
        System.out.println("Otobusun Plakasi "+ plakaNumarasi);
        System.out.println("Mesafe "+ km);
        System.out.println("Yolculuk Tipi "+ (yolculukTipi==1 ? "Tek Yon" : "Gidis-Donus"));
        System.out.println("Bilet Ucreti "+ biletUcreti);


        slowPrint("KEYIFLI YOLCULUKLAR DILERIZ",50);

    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}//class
