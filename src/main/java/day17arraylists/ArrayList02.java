package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        //ArrayList oluştururken, sağ tarafa (constructor) "ArrayList" yazmak zorundasınız.
        //Ama sol tarafa ister "ArrayList" yazın, isterseniz de "List" yazın. İkisi de çalışır.

        //ArrayList<Character> initials = new ArrayList<>();
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');


        // Bir List te kaç eleman olduğunu nasıl anlarız?

        int numOfElemants = initials.size(); //Eleman sayısı (String lerde / Array lerde length'i, Listlerde size methodu dur)
        System.out.println(numOfElemants); //4

        //Arraylerden bahsederken length() kullanın; Listlerden bahsederken size() kullanın.


        //Bir List ten istenen bir eleman nasıl alınır?
        //List teki herhangi bir index i almak için get() methodu kullanılır.

        char u = initials.get(2);//M
        System.out.println(u);

        //Example 1: Verilen bir String List teki elemanların toplam karakter sayısını bulan kodu yazınız.

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("İstanbul");
        cities.add("Kayseri");
        cities.add("Almatı");

        //1.YOL: Recommended

        int sum=0;

        for(String w: cities){

           sum= sum+ w.length();


        }
        System.out.println(sum);//26

        //2.YOL

        int toplam= 0;

        for (int i = 0; i < cities.size(); i++) {

            toplam= toplam + cities.get(i).length();

        }
        System.out.println(toplam);


        // Bir List teki istenen bir elemanı nasıl değiştirebiliriz?

        cities.set(0, "New York");
        System.out.println(cities);

        //Example 2: Maaş List i oluşturunuz ve maaşlara %20 zam yapınız.

        List<Double> salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

       //1.YOL:

        int idx= 0;

        for(Double w: salary){

            salary.set(idx, w*1.20);

            idx++;

        }
        System.out.println(salary);

        //2.YOL:

        for (int i = 0; i < salary.size(); i++) {

            salary.set(i, salary.get(i)*1.20);

        }

        System.out.println(salary);





















    }
}
