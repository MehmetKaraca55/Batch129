package day16multidimensionalarrays;

public class Md06 {

    public static void main(String[] args) {

        // Example 1: Bir multidimansional Array'deki en büyük ve küçük sayının sayının toplamını ekrana yazdırınız.

        int a[][]={{21,5}, {14,70,11}}; //sıralama yapamayız. tek bir array içinde olmadıkları için

        int small= a[0][0]; // a array ındeki ilk array in ilk elemanını alır: 21
        int big= a[0][0]; // a array ındeki ilk array in ilk elemanını alır: 21

        for(int[] w : a){

            for(int k : w){

                small=Math.min(small, k);
               big= Math.max(big,k);

            }
        }

        System.out.println(small+big);//5+70=75
























    }
}
