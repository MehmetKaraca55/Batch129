package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

    //Java Nestef if leri çalıştırırken çok zamana ihtiyaç duyar. (Time Consuming)
    //Bu yüzden, biz mümkün olduğu kadar nested if kullanmamaya çalışırız.

    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan 3 tane sayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarları için 3 tane uzunluk giriniz");

        //Kullanıcı yanlışlıkla negatif sayı girdi ise kod aşağıdaki gibi yazılabilir. Kullanıcının hatasını görmezden
        //gelmek için
      //  double a = Math.abs(input.nextDouble());
        //double b = Math.abs(input.nextDouble());
        //double c = Math.abs(input.nextDouble());

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
       boolean üçgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));

        //Kullanıcının negatif sayı girmesini affetmiyorum:

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Üçgenin kenarları negatif olamaz");
        }else if(üçgenmi){

            if(a==b && b==c && a==c){
                System.out.println("Üçgen hem de eşkenar üçgen");
            }else{
                System.out.println("Üçgen ama eşkenar değil");
            }

        }else{
            System.out.println("Sen üçgen değilsin");
        }

    }
}
