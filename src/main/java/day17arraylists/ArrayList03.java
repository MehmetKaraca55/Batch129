package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almatı");
        System.out.println(cities);

        //remove() methodu index ile kullanılırsa, o index'teki elemanı siler.
        // remove() methodu index ile kullanılırsa, size sildiği metodu verir.
        //remove() methodu index ile kullanılırsa, eleman ile kullanılırsa size o elemanı silip silmediğini
        //ifade eden true veya false verir.
        //Eğer eleman List te varsa o elemanı siler ve size true der.
        //Eğer eleman List te yok ise o elemanı silemediğinden ve size false der.

        String n = cities.remove(1);//Istanbul gider
        System.out.println(n); // Istanbul
        System.out.println(cities);

        //remove() methodu eleman ile kullanılırsa ilk görünümü siler.
        boolean p = cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);







    }
}
