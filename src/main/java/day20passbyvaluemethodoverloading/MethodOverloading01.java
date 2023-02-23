package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
    Note: Method overloading de odaklanacağınız 2 yer var:
            - Method un ismi,
            - Method un parametresi
    1) Method overloading yaparken method ismi değiştirilmez.
    2) Method overloading yaparken parametreler değiştirilir.
        i) Parametre değiştirirken, parametrelerin data type ları değiştirilebilir.
        ii) Parametre değiştirirken, parametrelerin data type ları farklı ise yerleri değiştirilebilir.
        iii) Parametre değiştirirken, parametrelerin sayısı değiştirilebilir.
   3) Java için, "ismi" ve "parametreleri" aynı olan iki method tamamıyla aynıdır.
   4) Java da, method un ismi ve parametresi, o methodu unique hale getirir.
        Bu yüzden, isim ve parametre, "method signiture" olarak adlandırılır.

   5) Method overloading oluştururken, return type değiştirmenin hiçbir etkisi yoktur.
   6)  Method overloading oluştururken, access modifier değiştirmenin hiçbir etkisi yoktur.
   7) Method overloading oluştururken, methodu static veya non-static yapmanın hiçbir etkisi yoktur.
   8) Method overloading oluştururken, method body sini değiştirmenin hiçbir etkisi yoktur.
   9) Private method lar overload edilebilir. Private methods can be overloaded.
   (Private: O class a has. sadece o class içinde kullanılabilir; başka bir class ta o methodu göremez bile)
   - Çünkü, method overloading sadece bir class ın içinde olur.
   - "Private" olmak ise başka class lara gidildiğinde problem oluşturur.

   10) Static methodlar overload edilebilirler.
     */

    public static void main(String[] args) {

        add(3,5);

    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b);
    }
}
