package day26overriding;

    /*
    1) Parent Class'daki methodu Child Class içinde özelleştirerek kullanmaya "Overriding" yapmak denir.
    2) Overriding'de methodun parantezine, methodun ismine dokunulmaz; methodun body'si değiştirilir.
    3) @Override ==> Override Annotation: Override kurallarının Java tarafından kontrol edilmesini sağlar.
    4) Overriding'de parent class'daki methoda, "Overridden Method", child class'daki method'a ise "Overriding Method" denir.
    5) Private methodlar "Override" edilemezler.
    6) Child class'taki override edilmiş method(overriding) un access modifier ı Parent Class'daki override edilmis
    method(overridden) un access modifier ından dar olamaz. (Child parent a sınır koyamaz)

    Overridden Method(Parent) ==> protected ise; overriding method(child) ==> protedted + public
    Overridden Method(Parent) ==> default ise; overriding method(child) ==> default + protedted + public
    Overridden Method(Parent) ==> private ise; overriding method(child) ==> override olmaz ki, access modifier ı olsun.

    7) Child Class'da override edilen methodun(Overriding method) return type'ı methodun retrun ettiği data type'ının
    aynısı veya o data type'ının parent'ı olarak seçilebilir.

    8) Methodun return type ı "primitive" ise, overriding yaparken return type değiştirilemez.
    Çünkü, return type, ya aynı olur veya parent class'dan seçilir. Ama primitive ler arasında, parent-child ilişkisi
    olmadığından, parent'dan seçmek mevzu bahis olamaz. O zaman tek seçenek ==> aynısı kalır.

    9) Methodun return type ı "Wrapper Class" ise, overriding yaparken return type değiştirilemez.
    Çünkü; return type ya aynı olur ya da parent'dan seçilir.
    Ama, Java bir Wrapper Class ı diğerinin parent'ı yapmadığından, parent'dan secme ihtimali yoktur, geriye sadece
    aynısını alma ihtimali kalır (Java "Integer extends Long" dememiş yani).

    10) Methodun return type ı "void" ise, overriding yaparken return type değiştirilemez. (void'ın parent'ı yok)

     11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

        12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

        13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz
        14) "final" method'lar ve "static" method'lar "override"  edilemezler.
        15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
        16) Method Overloading "Compile Time Polymorphism" dir, Method Overriding "Run Time Polymorphism" dir.
        17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.

    */

public class Animal {

    public void eat(){//Parent'deki override edilmiş eat() methoduna "Overridden Method" denir.
        System.out.println("Animals eat ....");
    }

    public void drink(){
        System.out.println("Animals drink ....");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multply(int a, int b){
        return a*b;
    }

}
