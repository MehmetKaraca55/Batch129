package Lambda_Recap;

import jdk.jshell.execution.Util;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        printEvenAndPositiveNumbersThroughLambdaExpression(sayi); //12 6 8
        System.out.println("    \n      *************");
        printEvenAndPositiveNumbersThroughMethodReference(sayi);//12 6 8
        System.out.println("    \n      *************");
        printSquaresOfElements(sayi);//25 64 144 0 1 144 25 25 36 81 225 64
        System.out.println("    \n      *************");
        printSquareOfElementsDistinct(sayi);//25 64 144 0 1 36 81 225
        System.out.println("    \n      *************");
        listElementsFromGreatestToLeast(sayi);//15 12 9 8 6 5 5 1 0 -5 -8 -12
        System.out.println("    \n      *************");
        printPositiveElementsCubes(sayi);//125 125 3375
        System.out.println("    \n      *************");
        addElementsThroughMethodReference(sayi);//Optional[36]
        System.out.println("    \n      *************");
        sumOfElementsThroughLambdaExpression(sayi);//36
        System.out.println("    \n      *************");
        System.out.println(printMultiplyOfPositiveElements(sayi));//1944000
        System.out.println("    \n      *************");
        System.out.println(printEvenElementGetSquareListFromLeastToGreatest(sayi));//[0, 36, 64, 64, 144, 144]

    }
    ////SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void printEvenAndPositiveNumbersThroughLambdaExpression( List<Integer> sayi){
        sayi.stream().filter(t-> t%2==0 && t>0).forEach(Utils::print);
    }
    ////SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void  printEvenAndPositiveNumbersThroughMethodReference( List<Integer> sayi){
        sayi.stream().filter(t-> t%2==0 && t>0). forEach(Utils::print);
    }
    ////SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void printSquaresOfElements (List<Integer> sayi){
        sayi.stream().map(Utils::getSquare). forEach(t-> System.out.print(t + " "));
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void printSquareOfElementsDistinct(List<Integer> sayi){
        sayi.stream().map(Utils::getSquare).distinct().forEach(Utils::print);
    }
//SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void listElementsFromGreatestToLeast(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::print);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void printPositiveElementsCubes(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(Utils::getCube).filter(t->t%10==5).forEach(Utils::print);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void addElementsThroughMethodReference(List<Integer> sayi){
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);//reduce() terminal bir methoddur. En son kullanılır
        //terminal methodlardan (findFirst(), forEach() ... ) sonra "forEach()" gibi bir method kullanılmaz. Java müsade etmez.
        System.out.println(sonuc);
    }
// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void sumOfElementsThroughLambdaExpression(List<Integer> sayi){
       int sonuc =  sayi.stream().reduce(0, (t,u) -> t+u);//ilk değeri biz verdiğimiz için optional a çevir demedi Java.
        System.out.println(sonuc);
    }
    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int printMultiplyOfPositiveElements(List<Integer> sayi){
        int sonuc = sayi.stream().filter(t-> t>0). reduce(1,(t,u) -> t*u);
        return sonuc;

    }
    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> printEvenElementGetSquareListFromLeastToGreatest(List<Integer> sayi){
       List <Integer>sonuc = sayi.stream().filter(t-> t%2==0).map(Utils::getSquare). sorted().collect(Collectors.toList());
       return sonuc;
    }

}
