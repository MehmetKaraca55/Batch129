package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
        1)ArrayListler çoklu data depolamak için kullanılır. Arraylerde bu amaçla kullanılırdı.
        2)ArrayListler non-primitive data tipindeki çoklu dataları depolamak için kullanılır.
        Listler non-primitive data kabul ederler; Arrayler ise primitive data veya reference kabul ederler.
        3) Array lere primitive data tipler ve adresleri (reference) koyabiliriz.
        4) ArrayList(List)leri oluştururken içine koyacağınız eleman sayısını başta söylemeye gerek yoktur.
        5) Listler eleman sayısında flexible dırlar. Ne kadar eleman koyarsak onu kabul ederler.
        6) Ama Arrayler flexible değildirler.
        7) Madem Arrayler eleman sayısında flexible değil, niçin Java Arrayleri iptal etmedi?
            ==> Eleman sayısı belli olan dataları depolamak için Arrayler tercih edilir (Haftanın günleri, aylar...)
            ==> Çünkü Arrayler çok hızlı (super-fast) çalışır,
            ==> Arrayler memoryde çok az yer kaplar.
         */

        //List Nasıl Oluşturulur?

        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages); // [] // Lİsti yazdığında eleman eklemediysek boş list verir.
                                        // List i yazdırmak için sadece ismini kullanmamız yeterli

        //Listlere eleman nasıl eklenir?

        //List e eleman eklemek için add() methodunu kullanırız.
        //add() methodu elemanları sizin verdiğiniz sırada List e ekler. (Insertion Order) Bizim verdiğimiz sıraya göre

        ages.add(12); //add methodu elemanları verdiğimiz sıraya göre list in içine dizer.
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1, 656);
        ages.add(3,777);
        System.out.println(ages); //[12, 656, 9, 777, 10, 888]

        //List e çoklu eleman nasıl eklenir? veya List e başka bir List nasıl eklenir?
        //Bir List e çoklu eleman eklemek için o elemanları önce bir List in içine koymalısınız.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges); // [12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]
        System.out.println(ages); //[12, 656, 9, 777, 10, 888, 8, 9, 10]

        //Bir List deki tüm elemanları nasıl silebilirim?
        //ages.clear();
        //System.out.println(ages); //[]

       // Bir elemanın List e var olup olmadığını nasıl kontrol ederiz. contains()
        boolean r = ages.contains(656);
        System.out.println(r);

        // Bir List in başka bir List ile aynı olup olmadığını nasıl kontrol ederiz?
        //İki List in eşit olabilmesi için aynı indexte aynı elemanlar olmalıdır.

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s); //False

        //Example 1: Verilen iki Integer List te tamamıyla aynı elemanların olup olmadığını kontrol eden kodu yazınız

        ArrayList<Integer> nums1= new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2= new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        //Elemanları küçükten büyüğe dizdi.
        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t); //True














    }
}
