package day16multidimensionalarrays;

public class Star {

    public static void main(String[] args) {

        /*
        Aağıdaki şekli çizen kodu yazınız.

                            *
                           * *
                          *   *
                         *     *
                        * * * * *
         */

        //önce şekli dikdörtgene tamamlayın. Soldaki boşlukları fark ederiz.
        // 4. sırada 1 boşluk;
        // 3. sırada 2 boşluk;
        // 2. sırada 3 boşluk
        // 1. satırda 4 boşluk

        int row = 5;
        for (int i=1; i<=row; i++){
            for (int k=i; k<row; k++){
                System.out.print(" ");
            }

            for (int m=1; m<=2*i-1; m++) {
                if (i == row || m == 1 || m == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();













        }
    }
}


