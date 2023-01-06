package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {

        // Example 1: String Array elemanlarını karakter sayısına göre küçükten büyüğe sıralayınız.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]

        String arr[]={"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr));//[Michael, Ajda, Thomas, Tom]

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr));//[Tom, Ajda, Thomas, Michael]


        // Example 2: String Array elemanlarını karakter sayısına göre büyükten küçüğe  sıralayınız.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cüneyt", "Ajda", "Tom"]

        String brr[]={"Michael", "Ajda", "Thomas", "Tom", "Cüneyt"};

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        // Example 3: String Array elemanlarını karakter sayısına göre büyükten küçüğe  sıralayınız.
        //          Aynı character sayısında olanları da alfabetik sıraya koyunuz.
        //          ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin" "Cüneyt", "Cem]
        //          ==> ["Gabriel", "Michael", "Reyhane", "Thomas", "Cüneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        String crr[]={"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cüneyt", "Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));















    }
}
