package ssg;

public class NestedLoop01 {
    public static void main(String[] args) {

        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*

               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^
               ^ ^ ^ ^ ^


         */

        for (int i = 1; i <=5 ; i++) {
            System.out.print("^" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("^" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("^" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("^" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("^" + " ");
        }

        System.out.println();

        System.out.println("=======================");

        /// nested loop  // Outer loop -- Inner loop

        for (int i = 1; i <=5 ; i++) {
            System.out.print("^" + " ");
            for (int j = 1; j <=4 ; j++) {
                System.out.print("^" + " ");

            }
            System.out.println();
        }
    }
}
