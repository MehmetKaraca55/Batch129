package day11forloop;

public class ForLoop03 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir String i tersten yazdırınız.
        //Germany==> ynamreG

        String s= "Germany";
        String t="";

        for (int i = s.length()-1; i >=0 ; i--) {
            t=t+s.charAt(i);

        }
        System.out.println(t);

        //Example 2: Size verilen bir String i "Palindrome" olup olmadığını kontrol eden kodu yazınız.
        //Soldan sağa-sağdan sola okununca aynı olan ==>civic, nalan, kabak, 11211...

        //String i ters çevir, sonra da düz hali ile ters halini karşılaştır; aynı ise "palindrome" de.

        String düz="civic";
        String ters= "";//Ters çevirince oluşacak yeni datayı koymak için, bunu oluştururuz.
        for (int i = düz.length()-1; i >=0 ; i--) {
            ters=ters+düz.charAt(i);

        }
        if(düz.equals(ters)){
            System.out.println(düz + " palindrome dur");

        }else{

            System.out.println(düz + " palindrome değildir");
        }


    }
}
