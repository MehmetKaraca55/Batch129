package Practice.practiceDTNT.daytime03;

import java.util.Scanner;

public class C01_StringManipulations {

    public static void main(String[] args) {

        System.out.println(15+20 + "Merhaba");//35Merhaba
        System.out.println("Merhaba"+15+20);//Merhaba1520
        System.out.println("Merhaba"+(15+20));//Merhaba35
        System.out.println("Merhaba"+15*20);//Merhaba300

        //Kullanıcıdan ismini ve soyismini girmesini isteyin ve console a kullanıcı nasıl girerse girsin, büyük harf
        //ile yazılmasını sağlayın

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
        String isim = input.nextLine(), soyİsim = input.nextLine();//Multiple Declaration(Çoklu tanımlama)
        String tamİsim=isim.concat(" "+soyİsim).toUpperCase();
        System.out.println("tamİsim = " + tamİsim);

        //rakam haricindekileri silin
        String str = "45.99$";
        str = str.replaceAll("\\D", "");//Sayılar dışında herşeyi hiçbir şey ile değiştirdi
        System.out.println("str = "+str);

        //Verilen bir cümleyi * ile gizleyin, 10.karakterden sonrasını yazdırın.
        String cümle = "Her dert Java gibi olsa";
        System.out.println(cümle.replaceAll("\\w", "*") +" " + cümle.substring(10));

        // "a" harfi yerine "@" işareti yerleştiriniz.
        String kelime = "olağanüstü";
        kelime = kelime.replace("a", "@");
        System.out.println(kelime);
        System.out.println(kelime.replace("a", "@"));

        // "Merhaba Dünya" cümlesindeki tüm "a" ları "e" ile değiştirin.
        String txt = "Merhaba Dünya";
        System.out.println(txt.replace("a", "e"));

        //Sadece ilk "a" harfini "e" ile değiştirin.

        System.out.println(txt.replaceFirst("a", "e"));

        //"Kalem" yerine "biber" yazdırın.
        String str1 = "Dolma Kalem ile bir Dünya kaleme aldık";
        System.out.println(str1.replaceAll("Kalem", "biber"));





    }
}
