package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));//elma cilek elma elma

        printElementsInitialsEOrCThroughMethodReference(meyve);
        System.out.println("    \n      *************");
        printElementsWithAsteriks(meyve);//*elma* *portakal* *uzum* *cilek* *greyfurt* *nar* *mandalina* *armut* *elma* *keciboynuzu* *elma*
        System.out.println("    \n      *************");
        System.out.println(printElementsSortedbyCharacterNumber(meyve));//[keciboynuzu, mandalina, portakal]


    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım.
    public static void printElementsInitialsEOrCThroughMethodReference( List<String> meyve){
        meyve.stream().filter(t-> t.startsWith("e") || t.startsWith("c")).forEach(Utils::print);
    }
// SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void printElementsWithAsteriks(List<String> meyve){
        meyve.stream().map(t-> "*" + t + "*").forEach(Utils::print);
    }

    //// SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    //// karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> printElementsSortedbyCharacterNumber(List<String> meyve){
        List <String> sonuc = meyve.
                                            stream().
                                            sorted(Comparator.comparing(t-> t.toString().
                                            length()).
                                             reversed()).
                                             limit(3).
                                             collect(Collectors.toList());
        return sonuc;
    }

}
