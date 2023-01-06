package day16multidimensionalarrays;

import java.util.Arrays;

public class Md05 {

    public static void main(String[] args) {

        // Example 1: Bir integer multidimansional array oluşturunuz.
        //          Bu array'deki tüm elemanların çarpımını konsole a yazdıran kodu yazınız.

        int a[][]={{2,5}, {4,7,11}};

        int çarpım=1;

        for(int[] w : a){

            for(int k : w){

                çarpım= çarpım*k;
            }

        }

        System.out.println(çarpım);









    }
}
