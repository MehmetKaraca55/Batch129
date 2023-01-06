package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

     //Example 1: Integer bir List oluşturunuz.
     //List e 5 tane eleman ekleyiniz.
     //Bu elemanlardan 12 yi siliniz.

     List<Integer> ages = new ArrayList();
     ages.add(10);
     ages.add(25);
     ages.add(12);
     ages.add(8);
     ages.add(12);

     //Siz Java da tamsayı yazdığında, Java o tamsayının data tipini otomatik olarak Primitive int kabul eder.
        //Bu yüzden remove methodunun içine yazdığınız tamsayı eleman olarak değil; index olarak kabul edilir.
        //Tamsayıyı eleman olarak gostermenın bir kaç yolu vardır.
        //aşağıki 4 yol sadece ilk görünümü siler. Toplu silmez.

        //1.YOL:
        Integer nonPrimitive = 12; // yeni bir variable oluşturuldu
     ages.remove(nonPrimitive);

     //2.YOL: Recommended
        ages.remove((Integer)12); //tek  method, daha az yorar Javayı..

        //3. YOL:
        ages.remove(Integer.valueOf(12)); // 2 method kullanıldı

        //4.YOL:
        ages.remove(ages.indexOf(12));// 2 method kullanıldı.

        //Example 2: Integer bir List oluşturunuz.
        //List e 5 tane eleman ekleyiniz.
        //Bu elemanlardan tüm 12 leri siliniz.

        List<Integer> nums = new ArrayList();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler=new ArrayList<>(); //removeAll u kullanmak için yeni bir List oluşturup,
                                                        // sayılar içine konur, ve öyle silinir.

        silinecekler.add(12);
        silinecekler.add(25);

        // removeAll() methodu List ile çalışır.
        //removeAll() methodu bir veya birden fazla elemanın tüm görünümlerini silmek için kullanılır.

        nums.removeAll(silinecekler);




















    }
}
