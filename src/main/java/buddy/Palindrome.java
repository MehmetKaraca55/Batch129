package buddy;

public class Palindrome {

    public static void main(String[] args) {

        /*
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:

    True

    String a = "kabak";
        String b ="";
        for (int i = a.length()-1; i >=0 ; i--) {
            String c = a.substring(i,i+1);
            b=b+c;

        }
        System.out.println(b);
        boolean d =a.equalsIgnoreCase(b);
        System.out.println(d);
         */

        String r = "çivic";
        String u="";

        for (int i =r.length()-1; i >=0 ; i--) {
            u=u+r.charAt(i);
        }
        if(r.equalsIgnoreCase(u)){
            System.out.println(u + " Palindrome'dur");
        }else{
            System.out.println(r + " Palindrome değildir");
        }




    }
}
