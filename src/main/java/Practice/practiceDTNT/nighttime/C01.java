package Practice.practiceDTNT.nighttime;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        /*
        INTERWIEW QUESTIONS
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");

        String str= input.nextLine(); //alican

        String arr[]=str.split(""); //harf harf dediği için hiçlikten parçalarız. harfler arasındaki hiçlik

        System.out.println(Arrays.toString(arr)); // [a, l, i, c, a, n]

        Arrays.sort(arr);

        int counter=0;

        for (int i = 1; i <arr.length ; i++) { //başı sonu belli olduğu için for loop kullandık

            if(arr[i-1].equals(arr[i])){

                counter++; // Aynı olanlar için 1 artırır.

            }else{
                System.out.println(arr[i-1] + " karakteri " + (counter+1) + " kez kullanılmıştır.");

                counter=0; //başka harfe geçtiği için sıfırlanmalı.
            }
                if(i==arr.length-1){ // defalarca kodu yazdırmaması için; sona gelindiğinde yazdırması için

                    System.out.println(arr[i] + " karakterinin sayısı " + (counter+1) + " kez tekrarlanmıştır.");
                }

        }




    }
}
