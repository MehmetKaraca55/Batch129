package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

    public static void main(String[] args) {

        List<String> names= new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Mahsun");
        names.add("Müslüm");
        names.add("Orhan");

        List<String> females= new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

       // names.containsAll(females) kodu "names" listinde "females" listindeki tüm elemanların var olup olmadığını
        // kontrol eder.
        // Tamamı varsa size "true" verir, herhangi biri yoksa "false" verir.

        boolean r = names.containsAll(females);//names List inde fameles içindekiler var mı?
        System.out.println(r);

       // names.subList(1,4) "names" listindeki indexi 1, 2, 3, olan elemanları bir List'in içinde size verir.
        // İkinci index olan 4 dahil olmaz.
        List<String> sublist = names.subList(1,4);
        System.out.println(sublist);// [Cüneyt, Mahsun, Müslüm]

        names.retainAll(females);
        System.out.println(names);// [Ajda]
        System.out.println(females);// [Ajda, Emel]


        //Example 1: Elektronik aletler ve ev aletleri listleriniz var.
        ////            Elektronik ev aletlerini listeleyiniz

        List<String> electronics= new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods= new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retailAll(electronics) kodu homeGood ile electronics List'lerin ortak elemanlarını homeGoods
        // List'i içinde verir.
        // Başka bir deyişle, homeGoods Listindeki ortak olmayan elemanları siler.

        homeGoods.retainAll(electronics);

        System.out.println(homeGoods); // [Radio, TV]


        // isEmpty() methodu List'te hiç eleman yokse size "True" verir,
        // bir veya daha fazla varsa, size "false" verir.
        // "isEmpty()" esasında "names.size()==0 demektir.
        names.isEmpty();

        System.out.println(names.hashCode()); //

















    }
}
