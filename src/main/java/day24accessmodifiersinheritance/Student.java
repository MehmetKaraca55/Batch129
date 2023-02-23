package day24accessmodifiersinheritance;

public class Student {

    public String name= "Tom Hanks";//name herkes tarafından bilinebilir, o yüzden public yaptım.
    String stdId= "TH2023HU12001";//okul yönetimindeki insanlar tarafından bilinebilir, o yüzden default yaptım
    protected int accountNo= 76512345;//bir grup ve çocukları tarafından bilinebilir.
    private int balance=123000;//sadeve benim tarafımdan bilinmelidir, o yüzden private yaptım.

    //Note1: Access Modifier'lar genişten dara: puclic > protected > default > private
    //Note2: Class'lar protected ve private olamazlar; sadece public ve default olabilirler.
    //Meşhur Interview Sorusu: Access Modifier'lar ne işe yarar?
    //Access Modifier'lar classlara, methodlara ve variable'lara ulaşmayı düzenler.
    //Protected: aynı packacge içinde ve farklı package deki çocukalar
    //default: packacge privatedır. sadece paketin içinden ulaşılır.
    //Protected ile dafult un farkı?
    /*
    1)Access modifier'lar genis'den dara; public > protected > default > private
    2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
    3)Access Modifier'lar ne ise yarar?
        Variablelara methodlara classlara ulasmayi duzenler.
        4)Kac tane access modifier var ?
        public > protected > default > private
        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
        v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.


*/

}
