package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
    1) Interface'lerden object oluşturulamaz, çünkü interface'lerin constructor'ı yoktur.
    2) Abstract class'lardan object oluşturulamaz. Constructor'ları vardır ama constructor object oluşturmada kullanılamaz.
    3) Interface'lerin constructorları olmadığından collection oluştururken interface isimleri "new" keyword'unden sonra
        kullanılamaz.
     4) class-->class==>extends (clas class'ın child ı yaparken)
        class-->interface==> implements (class'ı interface'ın child ı yaparken)
        interface-->interface==>extends (interface'ı interface'ın child ı yapmak için)
        interface-->class==>Bu mümkün değildir. (interface class'ın child ı olamaz)
    5) ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
        yapilacaksa ArrayList kullanmak tavsiye edilmez. (index kullanma problem haline getirir).

      6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
             leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
             durumlarda LinkList kullanmak tavsiye edilir.
       7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
       8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
             bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

     */

    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();


        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cüneyt");
        System.out.println(names);//[Cüneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");//"addlast()" method is equivalent to "add()"
        System.out.println(names);//[Cüneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3, "Süleyman");
        System.out.println(names);//[Cüneyt, Steve, Ajda, Süleyman, Raj, Megan, Brandon, Ajda]

        //names.clear();//Lİst içindeki tüm elemanları siler

        names.remove("Ajda");//İlk "ajda"yı siler
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Raj, Megan, Brandon]

        names.remove(4);
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Raj, Brandon, Ajda]

        names.add("Süleyman");
        names.add("Süleyman");
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Raj, Brandon, Ajda, Süleyman, Süleyman]

        String r1 = names.remove(); //Retrieves and removes the first element of this list (Cut + Paste)
                                    //İlk elemanı listeden siler ve size verir.
        System.out.println(r1);//Cüneyt
        System.out.println(names);//[Steve, Süleyman, Raj, Brandon, Ajda, Süleyman, Süleyman]

        names.removeFirstOccurrence("Süleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman, Süleyman]

        names.removeLastOccurrence("Süleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman]

        //Retrieves, but does not remove, the head (first element) of this list (Copy + Paste)
        //Returns: the head of this list, or null if this list is empty
        //İLk elemanın Listeden silmeden size verir.
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman]

        //Retrieves and removes the head (first element) of this list.
        //Returns: the head of this list, or null if this list is empty
        // Listeden ilk elemanı siler ve size verir (Cut + Paste)
        //remove() boş LİnkedLİste'de kullanılırsa, hata verir; poll() boş LİnkedLİste'de kullanılırsa, "null" verir.
         names.poll();

         //Pops removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
         names.pop();





    }
}
