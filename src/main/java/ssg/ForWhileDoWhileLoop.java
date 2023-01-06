package ssg;

public class ForWhileDoWhileLoop {

    public static void main(String[] args) {

       //Soru 1) 3 ile 8 arasindaki(3 ve  8 dahil) sayilari  ayni satirda yazdirin

        for (int i = 3; i < 9; i++) {

            System.out.print(" " + i);

        }
        System.out.println();

        int j=3;

        while(j<9){

            System.out.print(" " + j);

            j++;
        }

        System.out.println();

        int k=3;

        do{

            System.out.print(" " + k);

            k++;
        }while(k<9);




    }
}
