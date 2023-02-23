package buddy;

public class artikYil {

    public static void main(String[] args) {

         /*
        Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
         */

        int yıl = 1604;
        if(yıl%4==0 && yıl%100==0 && yıl%400==0){
            System.out.println(yıl + " artık yıldır");

        }else{
            System.out.println(yıl + " artık yıl değildir");
        }
    }
}
