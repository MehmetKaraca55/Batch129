package day28exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);//4


        String t = "";
        getNumberOfChars(t);//0

        String u = null;
        getNumberOfChars(u);//NullPointerException


    }

    //String'in değeri "null" olduüunda, String class'daki bazı methodları kullanamayız. Kullanırsanız, Java
    //"NullPointerException" yapar.
    public static void getNumberOfChars(String s){

        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);//4
        }catch (NullPointerException e){
            System.out.println("null değeri için bazı methodlar kullanılamaz");
        }
    }
}
