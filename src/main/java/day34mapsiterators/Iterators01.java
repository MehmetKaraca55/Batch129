package day34mapsiterators;

    /*
    Iterator'lar Loop'larin yaptigi isi yapar.
    Iterator'lar tipki loop'larda oldugu gibi elemani alarak isleme sokar.
    Java'nin Iterator'lari ortaya cikarma sebebi Infinite Lopp riskini bitirmektir.
    Iterator'larda sonsuz loop yoktur.
    Iterator'lar Java tarafindan sonradan olusturulmuslardir ve loopl'larin yaptiklari butun islemleri yapabilirler.
    Loop'lar ile Iterator'larin performans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.
    Iki tip Iterator var;
    i)Iterator: Sadece elemanlari remove edebilirsiniz. Update özelliği yok
             Sadece soldan saga calisir yani tek yonludur.
    ii)ListIterator: Elemani "remove etme", "update etme" ve "add" yapabilirsiniz.
                  Hem soldan saga hem de sagdan sola calisabilir yani cift yonludur.

    List'ler mutable dır. Orjinal Lİst değişiri.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        System.out.println(list1);//[Ali, Can, Aliye]

        Iterator<String> itr1 = list1.iterator();

        while(itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);//[]

        //ListIterator
        //Example 1
        List<String> list2 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr = list2.listIterator();

        while(listItr.hasNext()){

            String el = listItr.next();

            listItr.set(el + "!");

        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]

        //Example 2:
        List<String> list3 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();

        //Aşağıdaki loop pointer'ı en sağa almak için yazıldı.
        while(listItr2.hasNext()){
            listItr2.next();
        }

        //Aşağıdaki loop elemanları en sondan en başa doğru yazdırmak için yazıldı.
        while(listItr2.hasPrevious()){

           String el = listItr2.previous();
            System.out.println(el + " <=="); //Aliye<==
                                            // Can<==
                                            //Ali<==

        }

    }
}
