package ssg;

public class C02_forloop {

    public static void main(String[] args) {


         /*
        soru 2) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
        */
        for (int i = 3; i <=9 ; i++) {
            if (5==i){
                continue;
            }else System.out.print(i+" ");

        }
    }
}
