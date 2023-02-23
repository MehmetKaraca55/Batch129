package Practice.practiceDTNT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopping {

    static List<String> ürünListesi = new ArrayList<String>();

    static List<Double> ürünFiyatları = new ArrayList<Double>();

    static double toplamÖdeme;

    static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {

        ürünListesi.add("ayakkabı : ürün kodu : 1");
        ürünListesi.add("çanta : ürün kodu : 2");
        ürünListesi.add("saat : ürün kodu : 3");
        ürünListesi.add("bilezik : ürün kodu : 4");
        ürünListesi.add("toka : ürün kodu : 5");


        ürünFiyatları.add(10.0);
        ürünFiyatları.add(20.0);
        ürünFiyatları.add(30.0);
        ürünFiyatları.add(15.0);
        ürünFiyatları.add(60.0);

        System.out.println("ürünListesi = " + ürünListesi);

        müsteriSeçim();















    }//main

    private static void müsteriSeçim() {

        System.out.println("Lütfen seçtiğiniz ürünün kodunu giriniz");
        int seçim = input.nextInt();

        System.out.println("Seçtiğiniz üründen kaç adet alacaksınız");
        int adet = input.nextInt();


        double ürünTutarı = adet * ürünFiyatları.get(seçim-1);//get methodu ile index ile çalıştığı için seçim-1 yaptık.


    }
}//class
