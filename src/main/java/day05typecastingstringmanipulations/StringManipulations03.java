package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password u kontrol ediniz
                i) en az 8 character olsun
                ii) space characteri password de olmasın
                iii) en az bir tane büyük harf olsun
                iv) en az bir tane küçük harf olsun
                v) en az bir tane sembol olsun
                vi) en az bir tane rakam olsun

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordünüzü giriniz");
        String pwd = input.nextLine();

        //i) en az 8 character olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) space characteri password de olmasın
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //iii) en az bir tane büyük harf olsun
        //NOte: Büyük harf olmayanları sil,
        // kalan karakter sayısına bak
        //karakter sayısı sıfır ise büyük harf yok demektir.
        //sıfırdan büyük ise büyük harf var demektir.

        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0;//Metodları aynı satırda yanyana kullanmaya
        // method chain denir
        System.out.println(third);

        //iv) en az bir tane küçük harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

        //v) en az bir tane sembol (harf ve rakam harici her şey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //vi) en az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(sixth);

        System.out.println("Password geçerli mi? " + (first && second && third && fourth && fifth && sixth));






    }
}
