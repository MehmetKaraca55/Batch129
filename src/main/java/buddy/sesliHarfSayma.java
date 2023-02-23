package buddy;

import java.util.Arrays;
import java.util.Scanner;

public class sesliHarfSayma {

    public static void main(String[] args) {

        /*
         Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
         */

        //1.YOL:
        //a-e-i-o-u-A-E-I-O-U

        String s = "Java brings you money";

        int vowels= s.replaceAll("[aeiouAEIOU]", "").length();
        System.out.println(vowels);//14

        //2.YOL: Array Loop

       String letters[]=s.split("");
        System.out.println(Arrays.toString(letters));// [J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

            int counter=0;
            for(String w: letters){
                switch (w.toLowerCase()){
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":

                        counter++;

                }
            }
        System.out.println(counter);
        }






    }

