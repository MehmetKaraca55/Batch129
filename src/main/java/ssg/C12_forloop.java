package ssg;

public class C12_forloop {

    public static void main(String[] args) {


        /*
        soru 12) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        */
        String str="Hava guzeldir";
        String str1="";

        for (int i = 0; i < str.length(); i++) {
            str1=str.substring(i,i+1);
            if (str.indexOf(str1)==str.lastIndexOf(str1)){
                System.out.print(str1+" ");
            }

        }
    }
}
