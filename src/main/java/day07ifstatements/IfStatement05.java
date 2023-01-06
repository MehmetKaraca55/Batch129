package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        //Example 1: Ay isimleri girilince kaçıncı ay olduğunu yazan kodu yazınız

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen ay ismi giriniz...");
        String monthName = input.next();

        if(monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")) {
        System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        }else{
            System.out.println("Invalid month name");
        }

        //Note: String lerin eşitliklerini kontrol ederken, "==" yerine "equals()" kullanırız.
        //      Niye?
        //      Çünkü "==" sembolü iki Sting i karşılaştırırken hem adreslerine hem de değerlerine bakar. İkiside aynı
        //      size String ler eşittir der. Ama biz kod yazarken genellikle String lerin adresleriyle değil,
        //      değerleriyle ilgileniriz. Bu yüzden String karşılaştırmalarında "==" kullanmayız.

        //      "equals()" methodu ise iki String i karşılaştırırken sadece değerlerine bakar, degerler aynı ise,
        //      bu iki String eşittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
        //      ihtiyac duydugumuz seydir.
        //      Biz String lerin adresleriyle ilgilenmeyiz, değerleriyle ilgileniriz.
        //Note: 1. Stack memory de "Primitive Data" lar depolanır.
        //      2. Non-primitive lerin adresleri depolanır (Reference)

        //Heap Memory de non-primiteler depolanır.


        String s = "Tom";
        String t = "Terry";
        String r = new String ("Tom");
        String m = "Tom";

        System.out.println(s==t); // false, çünkü adres ler ve değerler farklı,
        System.out.println(s.equals(t)); // false, çünkü değerler farklı,
        System.out.println(s==r); // false, çünkü adresler farklı
        System.out.println(s.equals(r)); //true, çünkü equals method sadece değerlere bakar. "s" ve "r" nın
        //değerleri aynı olduğundan true verir.
        System.out.println(s==m);// true
        System.out.println(s.equals(m));//true




        }
}
