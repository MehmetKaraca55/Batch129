package buddy;

public class enKucukSayi {

    public static void main(String[] args) {

         /*
        Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
         */

        int[] sayılar = new int[]{22,45,77};
        int min=sayılar[0];
        int max = sayılar[0];

        for (int i = 0; i < sayılar.length; i++) {
            if(sayılar[i]>max){
                max=sayılar[i];

            }
            if (sayılar[i]<min){
                min=sayılar[i];

            }
        }

        System.out.println("En büyük sayı:" + max);
        System.out.println("En küçük sayı:" + min);


    }
}
