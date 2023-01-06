package Practice.practiceDTNT;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

/*


^
^^
^^^
^^^^
^^^^^
|||
|||
|||
|||
|||


 */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ağacın tac uzunluğunu giriniz");
        int taç= input.nextInt();

        String yaprak= "^";

        for (int i = 0; i < taç; i++) {//satır kontrolu

            yaprak+="^";

            System.out.println(yaprak);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("|||");

        }






    }
}
