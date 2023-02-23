package day29exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        Object obj = 70;
        String str="";

        try {
            str = (String) obj;// Birbirine dönüştürülemeyecek data type'larını dönüştürmekte ısrar ederseniz,
            //Java, ClassCastException atar. Bu class bu class'a dönüştürülemez.
            //Kodu yazınca kırmızı çizgi vermedi, çalıştırınca hata verdi, run time exceptions
            System.out.println(str);
        }catch(ClassCastException e){
            System.out.println("Her data type'ı her data type'ına çevrilmez");
        }






    }
}
