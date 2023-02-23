package day22staticblocksconstructors;

/*
        Constructor Nedir?
        Class'dan object üretmemize yarayan code block'larıdır.

        Class oluşturduğumuzda, Java bize otomatik olarak bir constructor verir.
        Ama bu Constructor, gözle görülmez (İnvisible).
        Gözle görülmeyen, otomatik olarak Java tarafından verilen bu Constructor'lara "Default Constructor" denir.

        "Class oluşturur, oluşturmaz, Java Default Constructor oluşturur.
         Default Constructor'lar "Car(){}" şeklindedir. Biz, bu boş Constructor ı kullanmaktansa,
        özellikleri olan constructor'ları kullanırız.

        NOTE: Siz kendi constructo'ınızı oluşturduğunuzda, Java Default constructor'ı siler.

        //Genellikler, constructor ların access modifier ı, public olur.


        NOTE: Bir Class'ın içinde, farklı parametreler kullanarak, istediğiniz kadar Constructor oluşturabilirsiniz.

        Farklı constructor'lar sayesinde, bir Class'dan farklı farklı object'ler oluşturabiliriz.

        Interview Question:
        Method ile Constructor'ın farkı var mıdır? Varsa nedir?
        Cevap: Method ile Constructor farklı yapılardır.
                i) Method'larda "return type" vardır. Ama constructor'larda "return type" yoktur.
                ii) MEthod'ların ismi yaptıkları işe göre, developer'lar tarafından belirlenir.
                Constructor'ların ismi ise, her zaman CLass ismi ile aynı olmalıdır.



         */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid){
        this.make=make;//Bu class daki make i, benim verdiğim make yap.
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }


    public Car(String make, String model){
        this.make=make;
        this.model=model;
        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
        }

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    //OLuşturduğunuz object leri console da yazdırmak için, toString() methoduna ihtiyaç var.

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
