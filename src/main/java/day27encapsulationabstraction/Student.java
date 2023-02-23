package day27encapsulationabstraction;

    /*
    Access modifier "private" olursa, data class ın içinde saklanmış olur.
    Encapsulation: Data hiding.
    Class member lar encapsule olur. method lar ve variable lar.. Class olmaz...
    encapsualtion ın amaçları:
    1) Güvenlik==> öğrenci Id sini herkesin görmesi zarar verebilir.
    Dışardan etkiler Student Id yi bozabilir.
    2) Kod yazarken, daha simple bir ortamda çalışırız. herşeyi görmeyiz. Odaklanmayı engelleyebilir.
    Tüm data ortada olursa, kod yazarken, odaklanmamızı etkiler.
     */

public class Student {

    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;

    //Encapsulaiton yapılmış datayı okuyabilir miyiz?
    // Datayı sakladığımızda, gerektiğinde okuyabliiriz.
    // get methodlar(getter) encapsule edilmiş (saklanmış) datayı okumamıza yarar.
    //get methodlar her zaman public olur. Çünkü, saklanmış datayı oluşturmak için kullandığımız için.
    //get methodların return type ı, variable ların data type ı ile aynı olur.
    //get methodların isimleri, "get + variable name" şeklinde olur. (Naming Convention)
    //Variable ın data type ı boolean ise, get + variable name olmaz, (is.. şeklinde olur.)
    //get methodların isimleri, variable boolean ise, "is + variable name" şeklinde olur.
    //get methodlar parametre kullanmazlar. datayı olduğu gibi verdikleri için.


    //getter methodu, stdId yi return ediyor.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

    //Encapsulation yapılmış dataların değeri değiştirilebilir mi?
    //set methodlar (setter) encapsulation yapılmış dataların değerlerini update etmemize yarar.
    //set methodlar her zaman "public" olur.
    // set methodların return type ı her zaman "void" olur. Çünkü set method sadece datayı değiştirir.
    // değiştirmiş olduğu datayı vermez, değiştirir orda bırakır.
    //set methodların isimleri "set + variable name" şeklinde olur.
    //set methodlar parametre variable ile aynı data type ında parametre kullanırlar. (double sa, double verir)

    //getter ve setter ların ikisine birden "Java Beans" denir.


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}


