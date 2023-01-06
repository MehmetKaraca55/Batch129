package ssg;

public class NestedLoop03 {

    public static void main(String[] args) {


        /*
        Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

        *
         * *
         * * *
         * * * *
         * * * * *


          // nested for loop ya dikdortgen veya ucgen formatinda olabilir
           diktorgen istedigimizde iki loop icin de bagimsiz end point belirleriz
           ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz

         */

        int input =5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("=========================");

        int input1 =5;
        for (int i = 1; i <=input1 ; i++) {
            for (int j = 1; j <=input1 ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Bilal bey");
        int sayi = 5;
        for (int i = 1; i <sayi ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();


        /*
         /*Soru 3) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

        1
        22
        333
        4444
        55555

         */

        int sayi1 = 5;
        for (int i = 1; i <=sayi1 ; i++) {
            for (int j = 1; j <=sayi1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
