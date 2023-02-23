package day30exceptionsinterface;

public interface Ac {

   //Interface class değildir.
    // Interface'lerin içine concrete method konulmaz. Çünkü concrete methodlarda, body vardır. ve
   // body e method'un işi nasıl yapacağına sebep olur.
    //bir çok detay içerir ve bu Chils Classm'larda kafa karışıklığna sebep olur.
    //Halbuki sadece yapılması gereken işi söyleyip nasıl yapılacağını Child'a bırakırsanız
    //child class'ın kafa karışıklıüını engellemiş olursunuz.

    //interface'ler concrete method içeremezler. Dolayısıyla, interface'ın içinde kisbif şey istede bağlı değildir.
    //Her şey Child class'lar için mecburidir. Bu yüzden interface'lere "to-do-list"dir.


    //interface'lerdeki tüm methodlar otomatik olarak "public"dir, abstract'tır, static'dir.


    public void cool();

    void run();

    public static final int price = 2000; //interface'de methodlar default olrak, public, static ve final olurlar

    String model = "Mitshibusi";


}
