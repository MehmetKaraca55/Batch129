package Practice.daytime04;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        /*
            Interwiew Questions
            Kullanicidan toplanmak uzere sayilar isteyin,
            sayi adedi 10'u gecerse veya toplam 500 'u gecerse
            bu kadar sayi yeter
            ".... adet sayi girdiniz , toplami..." yazdirin
 */

        // sayı adedi=sayaç,
        // toplam


        Scanner input=new Scanner(System.in);
        int sayı=0;
        int toplam=0;
        int sayaç=0;

        while(sayaç<11 && toplam <501){

            System.out.println("Lütfen toplanmak üzere bir sayı giriniz...");
            sayı= input.nextInt();//her adımda gözüksün diye loop içinde yazdık.

            toplam+=sayı;

            sayaç++;


        }

        if(toplam>500){
            System.out.println(sayaç + "adet sayı girdiniz. Toplamı" + toplam);

        }else
            System.out.println("Bu kadar sayı yeter." + sayaç + "adet sayı girdiniz. Toplam " + toplam);












    }
}
