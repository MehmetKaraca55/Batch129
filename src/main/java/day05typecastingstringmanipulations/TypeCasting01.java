package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /* Numeric primitive data type larının birbirine dönüştürülmesine "Type Casting" denir.
    Numeric data types: byte - short - int - long - float - double

    Note 1: Küçük data typelarını büyük data typelarına çevirmeyi Java otomatik olarak yapabilir.
            Bu işleme  "Autowidening" (Otomatik genişletme) denir.

    Note 2: Büyük data typelarını küçük data typelarına çevirmek riskli bir iştir. Java bu riskli işi otomatik olarak
            yapmaz. Bu işlemi kod yazanlar yapar.

            Bu işleme ""Explicit Narrowing" denir.
     */

    public static void main(String[] args) {

        //byte data typeini int data type ına çeviriniz

        byte age = 13;
        int ageInt = age; //autowidening

        //Long data type ını short data type ına çeviriniz

        long weight = 234;
        short weightShort = (short)weight; //Explicit Narrowing

        //int data type ını float data type ına çeviriniz

        int lenght = 150;
        float lenghtFloat = lenght;

        int population = 700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type ını short data type ına çeviriniz
        double number = 12.234;
        System.out.println(number);
        short numberShort = (short)number;
        System.out.println(numberShort);

        //Dikkat:
        //Dönüşüm yaptığınız sayı (260), dönüşeceğiniz data type ının sınırları dışında ise, Java kullandığınız sayıyı
        // "mod" işlemi yapar ve mod işleminin sonucu sizin yeni değeriniz olur.

        //Example 1:
        short num = 260;
        System.out.println(num);
        byte numByte = (byte)num;
        System.out.println(numByte);

        //Example 2:
        short n = 1023;
        System.out.println(n);
        byte nByte = (byte)n;
        System.out.println(nByte);

















    }
}
