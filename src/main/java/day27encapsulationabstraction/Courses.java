package day27encapsulationabstraction;

public abstract class Courses {

    /*
    1) Bazen method body sini yazmak gerekmez. Bu durumlarda body'siz method oluşturmak gerekir.
    Body olmayan methodlara "abstract method"lar denir.

    2) Abstract method'lar child class'lar tarafından override edilmek zorundadırlar.
    Bu yüzden, eğer bir fonksiyonun child class'lar tarafından kullanılmasını mecbur kılmak isterseniz,
    o methodu abstract yapmak gerekir.

    3) Bir method'un body'sini silmek o method'un abstract olması için yeterli değildir.
    Access modifier ile return type arasına abstract keyword koymak gerekir.

    4) Abstract method'lar sıradan class'ların (concrete) içine yazılamazlar.
    Abstract method'ların içine yazıldıkları class'lar da abstract olmak zorundadırlar.
    Yani, abstract methodlar, abstract class lar içinde olur.

    5) mecburi olmasını istediklerimizi abstract yapın,
        seçmeli olmasını istediklerini, concrete yapın.(abstract eklemeyin)

        //i: impliment (abstract methodlar implement edilir.)
        //o:override (concrete methodlar override edilir.)

    6) Abstract class'larda hem abstract methodlar hem de concrete methodlar kullanılabilir.

    7) Concrete Class'lar abstract class'ların child'ı olabilirler.
        "abstract method"ların override edilme zorunluluğu concrete class'lar için geçerlidir.



     */

    public abstract void math();//zorunlu ders oldu

    public void art(){//seçmeli ders oldu,
        System.out.println("Painting");
    }

    //final methodlar override edilemezler. Halbuki, abstract methodlar, override edilmek için oluştururlar.
    //Bu çelişkidir, bu yüzden Java, abstract methodların "final" olmasına müsade etmez.
    //public final abstract void science();

    //COncrete class'lar final olduğunda, Child class'a sahip olamazlar.
    //Ama abstract class'lar için Child class olmalıdır. Çünkü child classlar abstract parent class'daki
    //abstract methodları kullanırlar.
    //Bu yüzden, Java Abstract class'ların "final" olmasına müsade etmezler.

    //Abstract methodlar, "private" olamazlar, çünkü child class'lar abstract methodları kullanırlar.
    //private yapınca, kullanıma kapalı olurlar, bu çelişkidir, bu yuzden Java abstract methodların "private"
    //olmasına müsade etmez.

    //Abstract methodlar "Static" olamazlar, çünkü static methodlar override edilemez.
    //Halbuki, abstract methodlar, override edilmek için oluşturulmuştur.

    //Java, object üreten constructor'lar var, ama Java constructor'lara object üretmesine izin vermiyor.
    //defolu object üretilmesin diye,


}
