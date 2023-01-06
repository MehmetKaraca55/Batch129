package ssg;

public class C09_forloop {

    public static void main(String[] args) {

        /*
    soru 9) input olarak girilen bir stringi forLoop kullanarak ters cevirin
    */

            String input="Java guzeldir";
            String str="";
            for (int i = input.length()-1; i >=0; i--) {
                str+=input.charAt(i);


            }
            System.out.println(str);



    }
}

