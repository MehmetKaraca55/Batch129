package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {

    /*
    1) Map'ler "USA=400.000.000" şeklinde data depolamamız gerektiğinde kullanılır.
    2) "USA=400.000.000" datasının "USA" kısmı "key" olarak adlandırılır ve "key"ler "unique"dir
    3) "USA=400.000.000" datasının "400.000.000" kısmı "value" olarak adlandırılır ve "value"lar "tekrarlı" olabilir.
    4) Map'lerde depoladığınız her bir dataya "entry" denir. "Eleman" denmez.
    5) Entry'ler unique'dir, çünkü "key" kısımları unique olduğundan, her bir entry diğerlerinden farklıdır.

    6) HashMap çok hızlıdır, çünkü HashMap'ler "entry"leri sıralamak ile uğraşmazlar.
    7) HashMap'lerde bir tane "key"i "null" yapabilirsiniz.
    8) HashMap'lerde birden fazla "value"yu "null" yapabilirsiniz.
    9) HashMap'ler "multi-thread" için kullanılamaz, yapısı uygun değil. (aynı anda birden fazla iş yapamaz)
        Synchronization yoktur. (aynı anda birden fazla iş yapabilmek için bu işlerin mantıklı bir sıraya konması)
        Extra özellikler application'ı yavaşlatır. HAshMaplar super hızlı çalışsın diye birçok özellik konulmamış
     */

    public static void main(String[] args) {

        //2 tane data type yazmalıyız. ilki key ler için, ikincisi value'lar için
        //Primitive data type olmaz.

        //HashMap nasıl OLuşturulur?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm); //{}

        //HashMap'lere nasıl Entry eklenir?
        //Eklenenler random olarak eklenir, HashMap'lerde sıralama yoktur.
        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 3000000);
        //Aynı key'i kullanarak yeni bir entry eklerseniz, var olan entry'nin value'sunu update etmiş olursunuz.
        hm.put("Albania", 2800000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=85000000, Albania=2800000}

        //HashMap'lerde sadece "key"leri almak istiyorum.
        //key'ler için set kullanır. tekrarsızlar set e koyulur. set'ler tekrarsız data depolamak içindir. Key'lerde
        //tekrarsızdır.

        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]

        //HashMap'lerde sadece "value"lari almak istiyorum.
        //Example 1: hm Map'indeki ülkelerin toplam nüfusunu bulunuz.

        Collection<Integer> hmValues = hm.values();
        int sum=0;

        for(Integer w: hmValues){
            if(w!=null){
                sum = sum+w;
            }
        }
        System.out.println(sum);

        //HashMap'lerde belirli bir key'nin value'sunu nasıl alabiliriz?

        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);//400000000

        //HashMap'lerde, replace() methodunu, var olan bir key'nın value'sunu değiştirmek için kullanılır.
        hm.replace("Bhutan", 350000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=350000000, Germany=85000000, Albania=2800000}

        //putIfAbsent() olmayan bir değeri ekler. Var olan entry için, birşey yapmaz.
        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=350000000, Germany=85000000, Albania=2800000}

        //Example 2: Yeni öğretmenin maaşı standart ücretten(10.000) 1000tl fazla, eski öğretmenin maaşı standart ücretten
        //2000tl fazla olsun

        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayşe", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName="Kemal";


        if(salaries.keySet().contains(teacherName)){
            salaries.put(teacherName, 12000);
        }else{
            salaries.putIfAbsent("teacherName", 11000);
        }

        System.out.println(salaries);

        //replace("USA", 400000000, 500000000) methodu, key "USA" ve value "400000000" ise, value'u "500000000" yapar
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=500000000, Bhutan=350000000, Germany=85000000,
                                // Albania=2800000}

        //getOrDefault() methodu, olan key'lerin değerini verir, olmayan key'ler içinde, sizin ikinci parametreye
        //yazdığınız değeri verir.
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);//350000000

        //entrySet() methodu, "Map"i "Set"e çevirir.
        //Set'lerin methodlarını kullanabilmek için entrySet() methodunu kullanarak, Map'i Set'e çevirebiliriz.

        //Map'i Set'e çevirdiğimizde, Set'in bütün özelliklerini kullanabiliriz.Mesela, loop gibi..
        //EntrySet() methodunu kullandığınızda, elde ettğiniz Set'in elemanları "Map.Entry<String, Integer> şeklinde
        // bir Map olur. Bu yüzden, elemanlar için
        //Map methodları kullanabilir.
        //Map'i Set'e çevirmek için==> entrySet()
        Set< Map.Entry<String, Integer>> myEntries =hm.entrySet();
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Bhutan=350000000,
                                        // Germany=85000000, Albania=2800000]

        //Example 3: Ülke ismindeki karakter sayısını, ülke nüfusuna ekleyen ve sonucu console a yazdıran kodu yazınız.

        for(Map.Entry<String, Integer> w: myEntries){

            if(w.getValue()!=null && w.getKey()!=null) {
                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam); //500000003   350000006   85000007  2800007

            }


        }









    }
}
