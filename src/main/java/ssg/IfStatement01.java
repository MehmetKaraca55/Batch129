package ssg;

public class IfStatement01 {
    public static void main(String[] args) {

        int a=122;
        int b=120;

        if(a!=b){
            System.out.println("Verilen sayılar eşittir");

        }

        if(a>100){
            System.out.println("a 100'den büyük");
            System.out.println("body içinde tüm kodlar çalışır");

        }

        if(a*b>5){
            System.out.println("Verilen sayıların çarpımı 5 ten büyük");

        }

    }
}
