package buddy;

import java.util.Scanner;

public class tersÇevirme {
    public static void main(String[] args) {

        /* Girilen String değerde tersten yazan Java kodunu yazınız.

        Test Data:
        java
        avaj

        StringBuffer ters = new StringBuffer ("Java Harika");
        ters = ters.reverse();
        System.out.println(ters);

         */

        String s = "Germany";
        String t ="";

        for (int i = s.length()-1; i >=0 ; i--) {
             t= s.substring(i,i+1);
            System.out.print(t+" ");
        }




    }



}
