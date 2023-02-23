package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static olduğundan, ona ulaşmak için object oluşturmadım.
        System.out.println(Student.stdName); // Tom Hanks

        //age non-static olduğundan, ona ulaşmak için object oluşturmak zorundayız.
        Student std1 = new Student ();
        System.out.println(std1);

        //Static methodlara ulaşmak için Class ismini kullanmalıyız.
        String initials = Student.getInitials("Tom Cruise");
        System.out.println(initials);//TC

        //Non-static olanlara object ile ulaşılır.
        int vowels = std1.countVowel("Tom Cruise");
        System.out.println(vowels);//4

        //Static olanları object ile de çağırabiliriz, ancak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);//AC

        //Bazı methodlar, object ile çalışır. Mesela, "subString, "Length" gibi.
        //Bu methodlar, non-static yapılır.

        //Lİst oluşturmada yeni bir ışıltı..
        List <String> names = List.of("Ali", "Veli", "Can", "Kemal");
        System.out.println(names);
    }
}
