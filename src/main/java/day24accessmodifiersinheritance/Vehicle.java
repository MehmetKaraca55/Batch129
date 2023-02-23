package day24accessmodifiersinheritance;

public class Vehicle {

    /*
    1) Child class'ta bir object oluşturduğunuzda, Constructor'lar en üstteki parent class'dan
        başlatılarak alta doğru çalıştırılırlar.
     */

    public  Vehicle(){
        System.out.println("Vehicle 1");

    }
}
