package day28exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t= "1a2b";
        convertStringToInt(t);

    }
    //İçince rakamlar dışında, karakter olan bir String"i sayıya çevirmek isterseniz, Java "NUmberFormatException" atar.

    public static void convertStringToInt(String s){

        int intS = 0;
        try{
        intS = Integer.valueOf(s);
        System.out.println(intS);
    }catch (NumberFormatException e){
            System.out.println("Bir String'in sayıya dönüştürülebilemesi için, rakam dışı karakter içermemesi gerekir");
            System.out.println(e.getMessage());
        }
        System.out.println(intS + 1);

    }
}
