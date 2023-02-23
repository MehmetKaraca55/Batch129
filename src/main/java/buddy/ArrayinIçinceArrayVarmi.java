package buddy;

public class ArrayinIçinceArrayVarmi {

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
        int counter=0;

        for(int w: sayılar){
            if(w==aranan){
                counter++;
            }

            }
        if(counter>0){
            System.out.println(aranan + " arrayde " + counter + " defa var");
        }else{
            System.out.println(aranan + " arrayde yok");
        }


    }



    }

