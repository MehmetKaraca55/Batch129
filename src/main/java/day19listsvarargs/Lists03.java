package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

    public static void main(String[] args) {

        /*
                SAYI TAHMİN OYUNU
            Oyuncudan 1-10 arası bir sayı isteyiniz.
            Elinizdeki listede oyuncunun tahmin ettiği sayı varsa "BINGO" yazdırınız.
            Yoksa verdiği sayıyı listenize ekleyiniz.
            İlk "BINGO"yu tamamlayana "KAZANDINIZ" yazdırınız.
            [5,8,2,9] ==> 2 ==> [5,8,BINGO,9]
            [5,8,2,9] ==> 3 ==> [5,8,BINGO,9,3]
            [5,8,BINGO,9,3] ==> [BINGO, BINGO, BINGO, BINGO, BINGO] ==> KAZANDINIZ

          */

        Scanner input= new Scanner(System.in);
        System.out.println("Oyunumuza hoşgeldiniz!");
        System.out.println("Oyunu sonlandırmak için Q'ya basınız.");

        // Arrays.asList() ile List oluşturulabilir.
        //Ama Listlerdeki "eleman sayısını" değiştiren hiçbir method bu list için kullanılamaz.
        //Dolayısıyla, bu sorunun çözümünde ihtiyacınız olan Listi "Arrays.asLİst()" kullanarak oluşturmamalısınız.
        //List<Integer> numList = Arrays.asList(5,8,2,9);

        List<String> numsList= new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter=0;
        String num="";

        do{
            System.out.println("Lütfen 1 ile 10 arasında br tam sayı giriniz");
            num= input.next();

            if(num.equalsIgnoreCase("Q")){
                break;

            }else if(numsList.contains(num)){
                numsList.set(numsList.indexOf(num), "Bingo");

                counter ++;

            }else{
                numsList.add(num);
            }
        }while(counter!=numsList.size());

        if(!num.equalsIgnoreCase("Q")){
            System.out.println("Kazandınız!");
        }else{
            System.out.println("Oyundan isteyerek ayrıldınız, tekrar bekleriz");
        }

        System.out.println("Final report: " + numsList);

















    }
}
