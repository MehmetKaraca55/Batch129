package Practice.practiceDTNT;

public class A {//Runner

    public static void main(String[] args) {

        B b = new B();
        b.m();//bad ==> önce kendi sınıfındaki değeri getirir.
        System.out.println(b.x);//20


        C c = new B();

        c.m();
        System.out.println(c.x);//10


        C d = new C();

        d.m();// Good
        System.out.println(d.x);//10

        D child = new D();

        System.out.println(child.x);//20 ==> Babadan aldı, dedeye gitmeye gerek kalmadı.
        System.out.println(child.sayı); //50: Kendi sınıfında var, onu kullandı.
        child.m();//Bad ==> super dediğimiz için babadan aldık methodu.

        C bebek = new D();
        System.out.println(bebek.x);//10 Variable için dedeye gitti, x in parantez olmadığı için C den aldı.
        bebek.m();//Bad ==> parantez olduğu için, D den alıyor.

    }
}
