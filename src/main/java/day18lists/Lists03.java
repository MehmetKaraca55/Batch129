package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

    public static void main(String[] args) {

        // Example 2: Bir Integer Lİst teki 7 hariç tüm elemanların değerini 3 arttırınız.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        //1.YOL: for-each Loop (indexOf methodu index kullandığı için, for each loop riskli olur.)
        for (Integer w: nums){

            if(w==7){
                continue;

            }
            nums.set(nums.indexOf(w), w+3);
        }
        System.out.println(nums); // [15, 16, 7, 15, 14]

        //2.YOL: for loop

        for (int i = 0; i < nums.size(); i++) {

            int element = (nums.get(i));
            if(element==7){
                continue;

            }
            nums.set(i, element + 3);
        }

        System.out.println(nums); //[18, 19, 7, 18, 17]

        /*
        nums.indexOf(w) ilk görünümün index ini verir. List tekrarlı elemana sahipse;
        nums.indexOf(w) kullanımı risk oluşturabilir. Bu yüzden bu soruda en güvenli yol
        "for-loop"tur.
         */














    }
}
