package mini_Projects.pangram;

public class Pangram {

    /*
    Bir cümlenin pangram olup olmadığın kontrol eden bir kod yazınız
    NOT: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.

    TR: Pijamalı hasta yağız şoföre açbucak güvendi
    ENG: The quick brown fox jumps over the lazy dog.
     */

    public static void main(String[] args) {


        System.out.println("isPangram(\"Pijamalı hasta yağız şoföre açbucak güvendi\") = " + isPangram("Pijamalı hasta yağız şoföre açbucak güvendi"));
        System.out.println("isPnagram2(\"The quick brown fox jumps over the lazy dog\") = " + isPnagram2("The quick brown fox jumps over the lazy dog"));

    }

    public static boolean isPangram(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        String trAlfabe = "abcçdefghıijklmnoöprsştuüvyz";
        boolean sonuc = true;

        for (int i = 0; i < trAlfabe.length(); i++) {

            if (!str.contains(String.valueOf(trAlfabe.charAt(i)))) {
                sonuc = false;
                break;
            }

        }
        return sonuc;
    }

    //2.YOL
    public static boolean isPnagram2(String str){
        str=str.replaceAll(" ", "").toLowerCase();

        for(char ch = 'a'; ch<='z'; ch++){

            if(str.indexOf(ch)==-1){
                return false;
            }

        }
        return true;
    }
}



