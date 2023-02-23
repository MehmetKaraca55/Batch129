package buddy;

public class StringleriYanyanaDizme {

    public static void main(String[] args) {


        /* 2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

        Test Data:
        str1: Java is
        str2: fun

        Beklenen Çıktı:
        java is fun

         */

        String str1 = "Learn";
        String str2 = "Java";
        String str3 = "earn";
        String str4 = "money";

        cümle(str1,str2,str3,str4);


    }


    static String newCümle="";
    private static void cümle(String... str1) {
        for (String w:str1) {
            newCümle += w + " ";

        }
        System.out.println(newCümle);
    }
}
