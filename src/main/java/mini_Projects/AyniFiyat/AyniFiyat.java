package mini_Projects.AyniFiyat;

import java.util.HashMap;
import java.util.Map;

public class AyniFiyat {
    /*
    Aşağıdaki verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız
    Örn: {Kemer: 19.99, Gömlek: 29.99, Ayakkabı: 89.99, KAzak: 24.99, Kravat: 19.99, Pijama:29.99, Terlik: 29.99}
     */

    public static void main(String[] args) {

        Map<String, Double> ürünler = new HashMap<>();
        ürünler.put("Kemer", 19.99);
        ürünler.put("Gömlek", 29.99);
        ürünler.put("Ayakkabı", 89.99);
        ürünler.put("Kazak", 24.99);
        ürünler.put("Kravat", 19.99);
        ürünler.put("Pijama", 29.99);
        ürünler.put("Terlik", 29.99);

        System.out.println("ürünler = " + ürünler);

        for(Map.Entry<String, Double> w: ürünler.entrySet()){

            if(w.getValue()==29.99){
                System.out.println(w.getKey()+ "==>" + w.getValue());
            }

        }


    }
}
