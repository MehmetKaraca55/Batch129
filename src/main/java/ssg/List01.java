package ssg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();//daha yaygın
        //ArrayList<Integer> list2 = new ArrayList<Integer>();
        //Collection<Integer> list3 = new ArrayList<>();

        System.out.println(list);//[]

        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println(list);//[15,16,17,18,19,20]
        System.out.println(list.size());//6

        for(int i=0; i<list.size(); i++){
            System.out.println(i);//0,1,2,3,4,5
            System.out.println(list.get(i));//index yerine, elemanların kendisini verir.
        }

        for(Integer w:list){
            System.out.println(w);

        }








    }
}
