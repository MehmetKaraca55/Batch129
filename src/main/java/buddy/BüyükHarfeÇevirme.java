package buddy;

public class BüyükHarfeÇevirme {
    public static void main(String[] args) {

        /*
         Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
         */

        String a = "Java is fun";
        a = a.toUpperCase();
        System.out.println(a);
    }
}
