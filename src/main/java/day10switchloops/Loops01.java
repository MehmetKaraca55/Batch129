package day10switchloops;


public class Loops01 {

    /*
    Code Standards:
    1- Tekrar (Repetition) olmamalıdır.
    2- Dynamic olmalıdır.
    3- Tamir(fix) ve update kolay yapılabilrmelidir.
     */

    public static void main(String[] args) {


        //Example 1: Ekrana 5 kere "Hi" yazdırınız.

        //1. yol: Tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop"lar kullanılır.
        //4 adet Loop var:
        //1-for-loop, while-loop, do-while-loop, for-each loop
        //Başlangıç değeri   Loop'un çalışma şartı    Increment/Decrement
        for(int i=1        ;  i<6                 ;   i++             ){

            System.out.println("Hi");
        }

        //Example 2: 11 den 44 e kadar tüm tam sayıları ekrana yazdıran kodu yazdırınız.

        for(int i=11; i<45; i++){
            System.out.println(i);
        }

        //Example 3: 40 dan 23 e kadar tüm çift tam sayıları ekrana yazdıran kodu yazdırınız.

        for(int i=40; i<22; i--){

            if(i%2==0){
                System.out.println(i);
            }

        }

        //Example 4: 18 den 56 e kadar tüm tek tam sayıları ekrana yazdıran kodu yazdırınız.

        for(int i=18; i<57; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }

        }


    }
}
