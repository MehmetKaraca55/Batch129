package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

     //Multidimensional Array nasıl oluşturulur?
        //  a=[[5.12],[81.45],[123.0]]

     int a[][]= new int[3][2];

     //Multidimensional Array ler nasıl yazdırılır?

        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]


        //Multidimensional Array lere eleman nasıl eklenir?

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        System.out.println(Arrays.deepToString(a)); // [[5, 12], [81, 45], [123, 0]]

        //Note: Array'lere non-primitive data konulamaz. non-primitive datayı içeremezler..
        // Array'lere primitive data veya reference konur.
        // Ama siz bir Array'ı yazdırmak istediğinizde Java adresler yardımıyla, non-primitive dataya ulaşır ve
        // o non-primitive data yı sanki Array'ın içindeymiş gibi gösterir.


        //Multidimensional Array'lerdeki belli elemanlara nasıl ulaşılır?

        System.out.println(Arrays.toString(a[2]));  //[123, 0] ==> bu kendi başına bir string
        System.out.println((a[1][0])); //[81]

        System.out.println(Arrays.toString(a[0])); //[5, 12] ==> bu kendi başına bir string
        System.out.println((a[2][1])); //



















    }
}
