package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Interview Question
        // example: Verilen bir List'teki elemanları tekrarsız olarak yazdırınız.
        //          [2, 3, 2, 2, 3, 5] ==> [2, 3, 5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();

        for(Integer w: myList){
            if(!newList.contains(w)){
                newList.add(w);

            }
        }
        System.out.println(newList);


        //Example 2: Müşteriden ürün ismini alınız. Sonra müşterinin ismini verdiği ürün listede varsa
        //          ürününün ismini yazdırınız.
        //          üşterinin ismini verdiği ürün listede yoksa "Out of Stock" yazdırınız.

        Scanner input= new Scanner(System.in);
        System.out.println("ürün arama sistemimize hoşgeldiniz");
        System.out.println("ürün aramayı sonlandırmak için Q'ya basınız");


        List<String> products= new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Pphone");

        do{
            System.out.println("Aradığınız ürünün ismini giriniz");

            String product= input.nextLine();

            if(product.equalsIgnoreCase("Q")){
                break;
            } else if(products.contains(product)){
                System.out.println(product + " is in the stock.");
            }else {
                System.out.println(product + " is out of Stock! ...");
            }
            }while(true); //Sonsuz Loop, müşteri Q ya basıp çıkacağı için, buraya herhangi bir kural yazmaya gerek yok.

        System.out.println("Sitemizi kullandığınız için teşekkür eder, tekrar bekleriz");


    }
}
