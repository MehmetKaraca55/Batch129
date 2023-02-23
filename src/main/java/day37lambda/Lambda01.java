package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList= new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));//60
        System.out.println("    \n      *************");
        System.out.println(getSumFromSevenToSeventy());//2464
        System.out.println("    \n      *************");
        System.out.println(getMultiplicationFromThreeToNine01());//181440
        System.out.println(getMultiplicationFromThreeToNine2());//181440
        System.out.println("    \n      *************");
        System.out.println(getFactorial(5));//120
        System.out.println("    \n      *************");
        System.out.println(getSumOfEvensBetweenTwoInt(5, 14));//36
        System.out.println("    \n      *************");
        System.out.println(getSumOfDigitsBetweenTwoInts(12, 18));//30
        System.out.println("    \n      *************");

    }
    //1) Verilen List'teki tüm sayılarin toplamini veren methodu oluşturunuz.
    public static int getSumOfAllElements(List<Integer> myList) {
       return myList.stream().reduce(Math::addExact).get();
    }
    //2) 7'den 70'e kadar tüm tamsayıların toplamını veren kodu yaziniz.
    public static int getSumFromSevenToSeventy(){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }
    //3) 3'ten '9'a kadar tüm tamsayıların çarpımını veren methodu oluşturunuz.
    public static int getMultiplicationFromThreeToNine01(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }
    public static int getMultiplicationFromThreeToNine2(){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }
    //4) Size verilen sayinin faktoriyelini hesaplayan kodu yazınız
    public static int getFactorial(int x){
        if(x==0){
            return 1;
        }else if(x<0){
            System.out.println("Faktoriyel işlemi negatif sayılarla yapılamaz");
            return -1;
        }else{
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }

    }
    //5) Size verilen iki tamsayı arasındaki tüm çift sayıların toplamını veren kodu yazınız.
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1, b). filter(Utils::isNumberEven).sum();
    }
    //6) Size verilen iki tamsayı arasındaki tüm tamsayıların rakamları toplamını veren kodu yazınız
    //12 ve 18 ==> 13 14 15 16 17==> 4+5+6+7+8=30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
       return IntStream.range(a+1, b).map(Utils::getSumOfDigits).sum();
    }
}
