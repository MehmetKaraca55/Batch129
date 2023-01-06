package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {


        // Example 1: Kullanıcının verdiği sayı için çarpım tablosunu oluşturup, konsola yazdıran kodu yazınız
        //          3==> 3x1=3, 3x2=6, 3x3=9, 3x4=12 ... 3x10=30

        Scanner input= new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek için bir sayı giriniz");
        int num=input.nextInt();

        int i=1;//başlangıç değeri

        while(i<11){
            System.out.println(num + "x" + i + "=" + (num*i));

            i++;
        }

        //Example 2: Verilen bir String de her harfin sonrasına "*" sembolünü ekleyiniz.
        //          Java==>J*a*v*a*

        System.out.println("Bir kelime giriniz");
        String word= input.next();
        String newWord="";//yeni oluşturulan kelimeyi koymak için, memory de yer açıyoruz

        int k=0;

        while(k< word.length()){
            //newWord=newWord + word.charAt(k) + "*";
            newWord+=word.charAt(k) + "*";

            k++;
        }
        System.out.println(newWord);
















    }
}
