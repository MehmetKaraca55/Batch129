package ssg;

public class NestedLoop02 {
    public static void main(String[] args) {

        /*
          soru 1)  Asagidaki sekil cizen kodu yaziniz

                * * * * 1
                * * *  2
                * *  3
                *  4
                5

         */
        for (int symbol = 1; symbol <= 5; symbol++) {

        // -1*2+5=
            for (int i = 1; i <= (-1 * symbol + 5); i++) {
                System.out.print(". ");
            }
            System.out.println(symbol);
        }



    }


}
