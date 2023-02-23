package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir cümlede kullanılan harflerin görünüm sayısını gösteren kodu yazınız.
        //          "Java is java." ==> J=2, a=4, v=2, i=1, s=1

        HashMap<String, Integer> lettersMap = new HashMap<>();

        String sentence =  "Java is java.";
        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        System.out.println(sentence);//Javaisjava

        String [] lettersArray = sentence.split("");
        System.out.println(Arrays.toString(lettersArray));//[J, a, v, a, i, s, j, a, v, a]
        


        




    }
}
