package day31collections;

import java.util.HashSet;

public class HashSet01 {

    /*
        Collections'lari coklu eleman depolamak icin kullaniriz
        Hash bir tekniktir biz bu teknigi kullanarak unique data'lar uretiriz (Benzersiz)
        Mesela universitenin olusturdugu ogrenci numarasi olusturma islemine hash code islemi denir
        IT de set kelimesini duyarsaniz tekrar yok demektir
        Mesela e-mail depolayan bir DB icin HashSet en iyisidir
        Bir Collection, set ise tekrarlı eleman olmaz.
        collections lar non-primitive data type kullanır.

     "Has" bir tekniktir. Java bu tekniği kullanarak unique datalar üretir.
    "Set" terkrarsız data depolamak için kullanılan bir Collection'dır.
    Set tekrar kabul etmez. Yani, tekrarsız verileri depolamak için kullanır.

    "Set" ler 3'e ayrılır:
        i)HashSet: a)Super hızlıdır, çünkü HashSet'ler verdiğiniz elemanları sıralamak için zaman kaybetmez.
                    Yani, HashSet'lere eklenen elemanlar rastgele sıralanır.
                    Öğrenci emaillerini depolamak için sıralamaya gerek yok, HashSet kullanılabilir.
                    b) HashSet'ler tekrarlı elemana müsade etmezler.
                    c) HashSet'ler sadece 1 tane "null" ı eleman olarak kabul ederler.

        ii) LinkedHashSet: a) "LinkedHashSet", elemanları "insertion order"a göre dizer (elemanları nasıl girersek, öyle)
                            b) LinkedHashSet elemanları sıralamakta zaman kaybettiği için, HashSet'e göre yavaştır.
                            Öğrencileri kayıt sırasına göre depolama..
                            c)LinkedHashSet'ler tekrarlı elemana müsade etmezler.
        iii) TreeSet: a) TreeSet elemanları natural order'a göre (küçükten-büyüğe veya alfabetik sıra) dizer.
                       IT'de "tree" kelimesini görürsek aklımıza natural order gelsin.
                       b) Alfabetik sıraya koyma çok zahmetli iştir. TreeSet, natural order yaparken çok zaman harcar,
                       o yüzden en yavaş "Set"tir.
                       c) TreeSet'ler tekrarlı elemana müsade etmezler.
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78]==> Elemanlar rastgele sıralandı. (Random Order)

        int hc = hs.hashCode();
        System.out.println(hc);//329





    }
}
