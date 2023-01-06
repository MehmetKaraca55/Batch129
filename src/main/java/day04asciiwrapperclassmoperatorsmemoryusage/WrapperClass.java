package day04asciiwrapperclassmoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive:      char - boolean - byte - short - int - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double
        // Wrapper Classlar non-primitivedir. O yüzden memory de çok yer kaplarlar. o yüzden şart değilse Wrapper Class
        //kullanmayı tercih etmeyiz.
        int n = 12; // "n" yazıp nokta koyarsanız, hiç metod göremezsiniz, çünkü primitiveler metod içermez.

        Integer m = 12; // "m" yazıp nokta koyarsanız bir sürü metod görürsünüz, çünkü wrapper classlar metod içindir.

        byte p = 23;
        Byte r = 43;

        //Example 1: Short data tipinin minimum ve maximum değerlerini kod yazarak bulunuz.

        Short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort); //

        Short minShort = Short.MIN_VALUE;
        System.out.println(minShort);


        //Example 2: int data tipinin minimum değeriyle byte data typennin maximum değerinin toplamını bulunuz.
        int minInt = Integer.MIN_VALUE;


        byte maxByte = Byte.MAX_VALUE;


        System.out.println("Toplam " + minInt + maxByte);

        //Example 3: i) primitive int i Wrapper Integer a çeviriniz
        int num = 22;

        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //      ii) Wrapper Byte ı primitive byte çevirelim

        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        // Example 4: i) primitve char ı Wrapper Character e çeviriniz (Autoboxing)
        //              ii) Wrapper Boolean ı primitive boolean a ceviriniz (Unboxing)

        char initial = 'T';
        Character initialWrapper = initial;

        Boolean isOld = true;
        boolean isOldWrapper = isOld;

        //Example 5: Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız

        String shirt = "2300";
        String shoes = "5200";
        // Javada "+" sembolu iki sayı arasında kullanılırsa, "toplama işlemi" olur.
        //Javada "+" sembolu iki String arasında ve bir String ve bir sayı arasında kullanılırsa "Concatenation"
        // işlemi olur.
        //Concatenation işlemlerinde Java matematikteki işlem kurallarını kullanır.
        //işlem önceliği kuralları: i) önce üslü sayılar, ii) Parantez içi işlemler İii)
        System.out.println(shirt + shoes);

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);


        //Example 6: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        //Note: valueOf() methodu tum karakterleri rakam olan String'leri sayilara cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        // Bu hatayı düzeltmeyi ilerde öğreneceğiz.

        String tv = "$1100";
        String radio = "$3000";
        System.out.println(tv + radio);

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);






    }
}
