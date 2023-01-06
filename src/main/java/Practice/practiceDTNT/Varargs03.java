package Practice.practiceDTNT;

public class Varargs03 {

    public static void main(String[] args) {

        //Kaç tane String verilirse verilsin, içlerinden en uzun olanı veren kodu yazınız.
        //(Aklımıza Varargs gelmesi lazım)

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";



        uzunİsim(str1, str2, str3, str4, str5);




    }//main

    private static void uzunİsim(String... str) {
       String enUzunStr="";

       for(String w: str){

       if(w.length()>enUzunStr.length()) {
           enUzunStr = w;

       }

       }

        System.out.println("En uzun String : " + enUzunStr);




    }
}//class
