package mini_Projects.ad_soyad;

import java.util.HashMap;
import java.util.Map;

public class Ad_SoyAd {

    /*
    İki farklı Array'de aynı indekste barındırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
            input: {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
            output: {John=Doe, Mark=Twain, Ali=Can};
     */
        public static void main(String[] args) {

        String [] ad= {"John", "Mark", "Ali"};
        String []soyAd= {"Doe", "Twain", "Can"};

        Map<String,String> adSoyAd= new HashMap<>();

        for(int i=0; i<ad.length; i++){
            adSoyAd.put(ad[i], soyAd[i]);
        }
            System.out.println("adSoyAd = " + adSoyAd);


        }
}
