package day24accessmodifiersinheritance;

public class Animal {

    /*
    Inheritance'in faydalari;
    1) Code standardında tekrar iyi değildir.
    2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
    3) Gelişime update'e açık olmalıdır
    4) Code atomic yapıda olmalı.
    Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
    Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
    Note3: public class'lar child class'lar tarafından kullanılabilir.
            "child class'lar tarafından kullanılabilir" demek "inherit edilebilir" demektir.
    Note4: "Protected" methodlar inherit edilebilir.
            Çünkü protected olan method ve variable lar, child lar tarafından kullanılır.
    Note5: "Default" methodlar object ile aynı paackage de oldukları sürece inherit edilebilirler.
            Ama default method ile object'in üretildiği class farklı package lerde ise inherit edilemezler.
    Note6: Private methodlar inherit edilemezler.
    Note7: Java birden fazla parent ı onaylamaz. "Multiple inheritance" Java tarafından desteklenmez.
    Note8: Child--> Parent --> Grand Parent --> Grand Grand Parent ... şeklinde ilerleyen inheritance'lara
                                "Multi-level Inheritance" denir.
    NOTE9: Java'da "Object Class" tüm Class'ların ortak parent'ıdır.
    Note10: Javada, Object Class hariç, tüm class'ların parent'ı vardır.
            Java'da parent ı olmayan tek class "object class"dır.
    Note 11: Java'da "parent"dan "child"a olan ilişkilere "HAS-A Relationship" denir.
             java'da "child"dan "parent"a olan ilişkilere "IS-A Relationship" denir.
    Note 12: Java'da hre class'ın bir tane default constructor'ı vardır.
            Bu default constructor class'ın içinde görünmez, çünkü default constructor "Objet Class" içindedir.
            Bizim class'ımız default constructor' a ihtiyac duydugunda parent olan "Object Class" a gider ve
            oradaki constructor'ı kullanır.

     */

    public void eat(){
        System.out.println("Animals eat");
    }

    public void drink(){
        System.out.println("Animals drink");
    }


}
