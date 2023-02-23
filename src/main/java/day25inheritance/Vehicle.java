package day25inheritance;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {

    /*
    1) Child class'ta bir object oluşturduğunuzda, Constructor'lar en üstteki parent class'dan
        başlatılarak alta doğru çalıştırılırlar.
    2) Child Class'daki constructor'dan Parent Class'daki constructora gidebilmek için "super()" kullanılır.
    3) Parent Class'da birden fazla constructor varsa, istenilen constructor, "super()" ifadesinin parentezi içine
        yazılan parametreleri yardımı ile secilebilir.
     4) Aynı class içindeki constructorları seçmek için "this()" kullanılır.
        Aynı class'da birden fazla constructor varsa, istenilen constructor, "this()" ifadesinin parentezi içine
        yazılan parametreleri yardımı ile secilebilir.
     5) "super()" ifadesi yazmak isteğe bağlıdır, yazmasanızda Java sanki "super()" varmış gibi davranır.
        Ama kodunuzu daha okunur kılmak için yazmanız tavsiye edilir.
     6) "super()" ve "this()" ifadeleri constructor içinde her zaman ilk satırda olmalıdır.
     7) Bir contrcutor'ın içinde "super()" ve "this()" ifadeleri sadece bir kere kullanılır. Bakınız 6. kural...
     8) Inheritance'da variable'ları ve methodları çağırmak için "this" veya "super" kullanılır. Parantez olmadan...
        Parantezli olunca contructor çağırır, parantezsiz olunca variable çağırır.
        "this" aynı class'daki variable'ları ve methodları çağırmak için kullanılır.
        "super" parent class'daki variable'ları ve methodları çağırmak için kullanılır.
      9) Inheritance Object kullanarak variable çağırırsanız, object'in data type'ını temsil eden class'dan
        variable'ı aramaya başlayınız. O class'da yoksa parent'lara bakınız.
     10) Inheritance Object kullanarak method çağırırsanız, object'in constructor'ını temsil eden class'dan
        methodu'u aramaya başlayınız. O class'da yoksa parent'lara bakınız.

        OOP Principals:
        1) Inheritance,
        2) Polymorphism: Method Overloading-Method Overriding,
        3) Encapsulation,
        4) Abstraction

     */

    int price = 12000;

    public void engine(){
        System.out.println("Vehicle engine ..");
    }


    public Vehicle(){
        System.out.println("Vehicle 1");

    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }


}
