package buddy;

public class arraydeAranan {

    public static void main(String[] args) {

        /*
         yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]


        Aranan Değer:2020
        Beklenen Çıktı:True

        Aranan Değer:2010
        Beklenen Çıktı :False
         */
        int sayılar[]= {1551,1223,1443,1267,1789,1023,2020};
        int aranan=2020;
        boolean varMı=false;


        for(int w: sayılar){
            if(w==aranan){
                varMı=true;
            }



        }
        System.out.println(varMı);



    }
}
