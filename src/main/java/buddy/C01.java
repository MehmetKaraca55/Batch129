package buddy;

import java.util.ArrayList;
import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));



    }
}
