package Practice.daytime04;

import java.util.Scanner;

public class Co1_ForLoop {

    public static void main(String[] args) {

        //Kullanıcından aldığınız bir String değerde "c" den önceki "a" harfinin String değer içerisinde kaç kez
        //gectiğini bulan kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz ");
        String str =input.nextLine().toLowerCase();

        int sayac=0;

        for (int i = 0; i <str.length(); i++) {

            if(str.charAt(i)=='a'){

                sayac++;

            }else if(str.charAt(i)=='c'){
                break;
            }

        }

        System.out.println(" c oncesi 'a' larin sayisi = " + sayac);

    }
}
