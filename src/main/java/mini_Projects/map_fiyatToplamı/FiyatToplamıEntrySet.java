package mini_Projects.map_fiyatToplamı;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FiyatToplamıEntrySet {
    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız. (For each loop kullanınız)
    Örn: {Kemer: 19.99, Gömlek: 29.99, Ayakkabı: 89.99, KAzak: 24.99, Kravat: 19.99} ==> Toplam: 184.95
     */

    public static void main(String[] args) {

    Map<String, Double> ürünlerFiyatlar = new HashMap<>();
    ürünlerFiyatlar.put("Kemer", 19.99);
    ürünlerFiyatlar.put("Gömlek", 29.99);
    ürünlerFiyatlar.put("Ayakkabı", 89.99);
    ürünlerFiyatlar.put("Kazak", 24.99);
    ürünlerFiyatlar.put("Kravat", 19.99);

        System.out.println("fiyatToplamı(ürünlerFiyatlar) = " + fiyatToplamı(ürünlerFiyatlar));


    }
    public static double fiyatToplamı(Map<String, Double> map){

        System.out.println("Ürünler ve fiyatalrı: "+map);


        double toplam=0;

        for(Map.Entry<String, Double> w: map.entrySet()){

           toplam+= w.getValue();

        }


        return toplam;
    }

}
