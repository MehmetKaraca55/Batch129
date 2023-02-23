package mini_Projects.Aile;

import java.util.*;

public class Aile {

    private Map<String, String> adSoyad = new HashMap();
    private List<String> kardeşlerList = new ArrayList<>();
    private Map<Integer, List<String>> yaşKardeşler = new HashMap<>();
    private Map<Map<String, String>, Map<Integer, List<String>>> aileMap = new HashMap<>();

    public Aile (String ad, String soyAd, int yaş, String... kardeşler){
        adSoyad.put(ad, soyAd);
        kardeşlerList.addAll(Arrays.asList(kardeşler));
        yaşKardeşler.put(yaş, kardeşlerList);
        aileMap.put(adSoyad, yaşKardeşler);
    }


    public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
        return aileMap;
    }
}
