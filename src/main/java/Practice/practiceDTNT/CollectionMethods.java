package Practice.practiceDTNT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CollectionMethods {

    /*
     Kullanıcıdan 5 sayıdan olusan
       bir liste isteyin.
    listeyi sirala ve tersten yazdir //sort reverseorder
    listeyi karıştırin ve yazdırin //shuffle
    3'er sağa kaydirin ve yazdırin//rotate
    maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    tüm maksimum sayıların yerine minimum sayıyı yazdır.
     */
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Lütfen sayı giriniz");
            arrList.add(input.nextInt());

        }
        System.out.println(arrList);//[4, 5, 6, 7, 8, 9]

        arrList.sort(Collections.reverseOrder());
        System.out.println(arrList);

        Collections.shuffle(arrList);
        System.out.println(arrList);

        Collections.rotate(arrList, 3);
        System.out.println(arrList);

        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println(max);
        System.out.println(min);

        Collections.replaceAll(arrList, max, min);
        System.out.println(arrList);


    }

}
