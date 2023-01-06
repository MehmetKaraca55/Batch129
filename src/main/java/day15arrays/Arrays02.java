package day15arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //example 2: Bir String'deki sesli harflerin sayısını bulan kodu yazınız.
        //          a-e-i-o-u-A-E-I-O-U

        String s= "Java brings you money";

        //1.YOL: use replaceAll() method

        int vowels = s.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println(vowels);

        // 2.YOL: Use Array - Loop

        String letters[]=s.split("");
        System.out.println(Arrays.toString(letters));

        int counter=0;//harfleri sayacağız, o yüzden yeni bir konteyner lazım.

        for(String w:letters){

            switch(w.toLowerCase()){

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                counter ++;
            }
        }

        System.out.println(counter);







    }
}
