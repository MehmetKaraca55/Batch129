package ssg;

public class C11_forloop {
    public static void main(String[] args) {

        /*
    soru 11) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
    */

        for (int i = 1; i <=6 ; i++) {
            for (int j = 6; j >=i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }



    }

}




