package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable oluşturduğunuzda değer atamazsanız, o variable ı "initialize" etmediniz demektir.
    //Static variable lar static block lar içinde initialize edilierse, o class ın içinde herşeyden önce
    //hazır hale getirilmiş olur.
    //Bazen, main method çalıştırılmadan önce, variable ların hazır hale getirilmesi gerekir. Bu yüzden,
    //static block lar kullanılır.
    //Yazarken, static blocks lar önce yazılır, sonra main method yazılır.

    //NOTE1 : Static Blocks lar, static variable ları initialize etmek için kullanılırlar.
    //NOTE2: Static Block lar Class içinde herşeyden önce çalıtırılırlar.
    static double pi;
    static String shape;

    static{
        pi = 3.14;//StaticBlocks, main method çalıştırılmadan önce variable ları hazır hale getirir.
        System.out.println("StaticBlock 1");
    }

    static{
        shape="Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");

    }
}
