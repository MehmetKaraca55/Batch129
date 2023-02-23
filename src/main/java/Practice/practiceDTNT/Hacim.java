package Practice.practiceDTNT;

public class Hacim {

    //Küp, kare prizma ve dikdörtgen prizmanın
    // hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız

    public int hacimHesapla(int a){
        return a*a*a;  //kup
    }

    public int hacimHesapla(int a,int b){
        return a*a*b;  //karePrizma
    }

    public int hacimHesapla(int a,int b,int c){
        return a*b*c;  //dikdortgenPrizma
    }


}
