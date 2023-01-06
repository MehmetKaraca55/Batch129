package Practice.daytime04;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        /* Interview Question:

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

        int numberOfBananas=165;//4  8  12 .............. 164 ==> geriye 1 muz kaldı

        int survivalDays=1;    // 1  2  3  ..............41 ==> 42.gün öldü

        boolean monkeyAlive=true;

        do{

            System.out.println("**********maymunlar günde 4 muz yer********");
            numberOfBananas-=4; //toplam muz sayısından her gün 4 muz eksiltiriz.
            System.out.println("Kalan muz sayısı " + numberOfBananas);
            survivalDays++;

            if(numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("Bugün " +survivalDays+" .gün yeterli muz kalmadı. Maymun rahmetli");
                System.out.println("Maymun " +survivalDays+" .gün öldü");


            }else{

                System.out.println("Bugün " + survivalDays+" .gün; maymun hala yaşıyor");
            }

        }while (monkeyAlive);











    }
}
