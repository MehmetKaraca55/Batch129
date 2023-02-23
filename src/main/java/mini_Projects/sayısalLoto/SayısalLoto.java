package mini_Projects.sayısalLoto;

import java.util.Random;
import java.util.Scanner;

public class SayısalLoto {
    /*
    Proje: Sayısal Loto Uygulaması

   Bilet için rastgele n tane sayı üretilir.
   Loto sonucu rastgele n tane sayı ile uretilir.
   sayısal lotoda tekrarlı sayılar olmamalı.

   n(hane sayısı), sayılar için min ve max değerler kullanıcıdan alınsın.

   sonuç ve bilet karşılaştırılsın, kaç eşleşme olduğu kullanıcıya bildirilsin.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayısal loto için hane sayısını giriniz");
        int slots = scanner.nextInt();
        System.out.println("Sayılar için min değer giriniz");
        int min = scanner.nextInt();
        System.out.println("Sayılar için max değer giriniz");
        int max = scanner.nextInt();

        int [] lotoArr = new int[slots];
        int [] ticketArr = new int[slots];

        int randomNumber1=0;
        int randomNumber2=0;
        Random random = new Random();
        boolean isRepeated;


        for(int i=0; i<slots; i++){
            do{
                isRepeated=false;
                //0 ile değer arasında rastgele sayı, değer dahil değil.
                randomNumber1 = random.nextInt(max+1-min) +min;
                //random sayı dizide var mı kontrol et
                for(int j=0; j<slots; j++){
                    if(lotoArr[j] ==randomNumber1){
                        isRepeated=true;
                        break;
                    }
                }
            }while (isRepeated);
            lotoArr[i]=randomNumber1;
        }








    }

}
