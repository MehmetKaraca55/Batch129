package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String inin "money" ile bitip bitmediğini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String deki "money" kelimesini "dollar" kelimesine çeviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Example 3: "s" String deki "earn" kelimesini "win" kelisine çeviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);

        //Example 4: "s" String deki "a" harflerini "*" a çeviriniz.
        //Note: "Replace" methodunda çoklu character ile çalışırsanız mecbur çift tırnak kullanacaksınız
        //      ama tekli character ile çalışırsanız çift tırnak veya tek tırnak kullanablirsiniz.
        //Note: Ama ya ikiside çift tırnak olmalıdır, ya da ikisi de tek tırnak olmalıdır.
        String s3 = s.replace('a', '*');
        System.out.println(s3);

        //Example 5: "s" String deki "n" harflerini "XXX" a çeviriniz.
        String s4 = s.replace("n", "XXX");
        System.out.println(s4);

        //Example 6: "s" String deki bütün "e" harflerini siliniz.
        //Note: "Hiçbir şey" char data type ında yok. Bu yüzden replace() methodu kullanarak silme işlemi yaparsanız,
        //mutlaka çift tırnak kullanınız.
        String s5 = s.replace("e", "");
        System.out.println(s5);


        String t = "Ali 13 yasındadır!...";

        //Example 7: "t" String deki tüm rakamları (0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a çeviriniz.
        //Note: Bir grup dayayı değiştirmek için replaceAll() kullanılır (sesli harfler, rakamlar, büyük harfler)
        //NOte: Bir grup datayı ifade etmek için "Regular Expresion" kullanırız (regex).
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
        Meşhur Regex'ler;
        1) Tüm rakamlar ==>[0-9],
        2) Tüm küçük harfler ==> [a-z]
        3) Tüm büyük harfler ==> [A-Z],
        4) Tüm büyük ve küçük harfler ==> [a-zA-Z],
        5) Tüm harfler ve rakamlar ==> [a-zA-Z0-9],
        6) Tüm noktalama işaretleri ==> \\p{Punct}
        7) Tüm sesli harfler ==> [aeiouAEIOU]
            x, q, w harfleri ==> [xqw]
        8) Küçük harflerden farklı tüm karakterler ==> [^a-z]
        9) Tüm harflerden farklı tüm karakterler ==> [^a-zA-Z]


         */
        //Example 8: "t" String indeki tüm rakamları ve harfleri "!" e çeviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        //Example 9: "t" String indeki tüm sesli harfleri "?" e çeviriniz
       String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //Example 10: "t" String indeki küçük harfler sışındaki tüm karakterleri "<>" e çeviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example 11: "t" String indeki tüm harfler dışındaki tüm karakterleri "+" e çeviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example 12: "t" String indeki spaceler dışındaki tüm karakterleri "$" e çeviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);

        //Example 13: "t" String indeki sesli harfler dışındaki tüm karakterleri "&" e çeviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);













    }
}
