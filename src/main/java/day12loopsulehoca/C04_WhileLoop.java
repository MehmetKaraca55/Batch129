package day12loopsulehoca;

public class C04_WhileLoop {

    public static void main(String[] args) {

        //3'ten 10'a kadar tamsayıları aynı satıra yazdıran kosu yazdırın.

        //1. YOL:
        for (int i = 3; i < 11; i++) {
            System.out.print(i+" ");

        }
        System.out.println();

        //2.YOL:

        int i=3; //başlangıç değeri

        while(i<11){//bitiş değeri
            System.out.print(i+" ");
            i++;//artırma while loop un body si içinde olur.
        }
        System.out.println();

        //17'den 4'e kadar tüm çift sayıları ekrana aynı satırda yazdıran kosu yazınız.

        int a= 17;
        while(a>3){//bitiş değeri
            if(a%2==0){//sayı çift mi
                System.out.print(a+" ");
            }
            a--;
        }


    }

}
