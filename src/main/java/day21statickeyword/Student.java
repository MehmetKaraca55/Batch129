package day21statickeyword;

public class Student {

    /*
    1) Static variable veya static methodlar (Class member) tüm object ler için ortak elemanıdır.
    2) Static class member lar üzerinde yapılan tüm değişiklikler tüm object leri etkiler.
    3) static class member lar Class a, non-static class member lar object lara monte edilir.
        Mesela, bir Class dan 100 tane object oluşturduğunuzda, non-static olanlar 100 kere oluşturulur,
        ama static olanlar object sayısından bağımsız olarak, 1 kere oluşturulur.
     4) Static class member lara ulaşmak için, object oluşturmaya gerek duyulmaz, ama non-static class member lara
     ulaşmak için object oluşturmak şarttır.

     5) Static variable ları n diğer adı "Class Variable"dır.
        Non-static Variable ların diğer adı "Instance Variable" veya "Object Variable" dır.


     */


        public static String stdName= "Tom Hanks";

        public int age = 13;

        //Öğrenci isminin ilk harflerini veren methodu oluşturunuz
        public static String getInitials(String name){

                String first = name.substring(0,1);
                String second = name.split(" ")[1].substring(0,1);

                return first + second;
        }

        //Öğrenci ismindeki sesli harfleri (a, e, i, o, u) sayan bir method oluşturunuz

        public int countVowel(String name){

                int counter=0;

                for (int i = 0; i < name.length(); i++) {
                      char ch = name.toLowerCase().charAt(i);

                switch(ch){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                       counter++;
                       break;

                        }
                }
                return counter;
        }





}
