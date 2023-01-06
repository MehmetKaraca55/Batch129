package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {

        // Bir multidimansional array oluşturunuz ve bir dimensionallı array a dönüştürünüz.
        //          [[2,5], [3], [4,7,11] ]==> [2,5,3,4,7,11]

        int a[][]={{2,5}, {3}, {4,7,11}};

        // "a" array ındeki toplam eleman sayısını bulunuz.

        int totalElement=0;

        for(int [] w: a){

            totalElement=totalElement+w.length; //5
        }

        // "b" isimli tek dimension lı bir array oluşturunuz.

        int b[]=new int[totalElement]; // [0, 0, 0, 0, 0]


        // "a" array indeki elemanları "b" array ın içine transfer ediniz

        int idx=0; // b array ındeki indexleri koymak için

        for(int[] w: a){

            for(int k: w){

               b[idx]=k;

               idx++;
            }
        }

        System.out.println(Arrays.toString(b));
















    }
}
