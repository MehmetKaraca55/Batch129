package buddy;

public class sekil01 {

    public static void main(String[] args) {

         /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
         */

        int row=10;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j <=row ; j++) {
                System.out.print("0" + " ");

            }
            System.out.println();

        }



    }
}
