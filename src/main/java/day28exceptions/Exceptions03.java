package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s="Java";

        getCharFromString(s, 2);//v

        getCharFromString(s, 4);//StringIndexOutOfBoundsException ==> index is out of range

    }

    //String'lerde var olmayan index'ler kullanıldığında, Java "StringIndexOutOfBoundsException" atar.
    public static void getCharFromString(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullanma hatası yaptınız " + e.getMessage());
            System.out.println(e.getCause());//null, sebep izah etmiyor...
            e.printStackTrace();

        }
    }
}
