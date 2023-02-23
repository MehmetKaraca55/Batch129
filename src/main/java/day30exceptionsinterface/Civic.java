package day30exceptionsinterface;

    /*
    1) Bir Interface ı bir class'ın parent'ı yapmak için "implements" keywordunu kullanırız.
    2) Java, parent'lar class olduğunda "multiple parent"a müsade etmez.
        Ama biz bazen multiple parent'a ihtiyaç duyarız. Bu ihtiyacı gidermek için Java "Interface"ismini verdiği
        yeni bir yapı oluşturdu.
     Bu yapı sayesinde, bir class için çoklu "interface parent" oluşrurabilir.
     3) Çoklu interface parent'ların her birinin içine aynı isimli methodar koyabiliriz.
        Mesela, Ac'nin, Engine'nin, ve security'nin içleirne run() methodu koymak gibi.
        Child class herhangi birini override ettiğinde, hepsini override etkiş gibi olur.
        Sonra da, body'i Child Class'da yazarak uygulamasini yapmis olur.
     */

public class Civic implements Ac, Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfectly");
    }
}
