package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Verilen bir String de ilk 'a' harfinden önceki tüm karakterleri console a yazdırınız.
        String s="I love Java"; //"I love J" ilk karaktere bakacam, a değilse yazdıracam, ikinci karaktere bakacaz, ...

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);

        }
        System.out.println();


        //Example 2: Verilen bir String de son 'a' dan sonraki tüm karakterleri tersten yazdırınız.
        // "Germany" ==> "yn"

        String t= "Germany";
        for (int i = t.length()-1; i >=0 ; i--) {
            char ch=t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);

        }

    }

}
