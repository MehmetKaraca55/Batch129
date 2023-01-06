package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: String array oluşturun. İçine 5 tane eleman ekleyin., ilk eleman ile son elemanın
        //içerdiği karakter sayıları toplamını ekrana yazdırın

        String arr[]=new String[5];

        arr[0]= "Math";
        arr[1]= "Science";
        arr[2]= "Music";
        arr[3]= "English";
        arr[4]= "Art";

        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length-1].length());// 7

        //Example 2: String array oluşturun. İçine 5 tane eleman ekleyin. Tüm elemanların içerdiği karakter sayıları
        //toplamını ekrana yazdırın.

        String brr[]=new String[5];

        brr[0]= "Miami";
        brr[1]= "İstanbul";
        brr[2]= "Frankfurt";
        brr[3]= "Dhaka";
        brr[4]= "Atina";


        //1.YOL: For Loop:

        int totalChar = 0;

        for (int i = 0; i<brr.length; i++) {

            totalChar=totalChar + brr[i].length();

        }

        System.out.println(totalChar);

        //2.YOL: for-each loop ==> başlangıç değeri, loop un çalışma şartı, ve inc/dec kısmını kendisi halleder.
        // for-each loop "Array"lerde ve "Collection" larda kullanılır.
        //Index kullanmanız gerektiğinde bazen for-each loop çaresiz kalır. Mecburen diğer loopları kullanırız.

        int sum=0;

        for (String w:brr) {
            sum=sum+w.length();

        }
        System.out.println(sum);
















    }
}
