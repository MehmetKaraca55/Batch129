package Practice.practiceDTNT;

public class HesapMakinesi {

   public void toplama(int... a){

       int toplam=0;

       for(int w:a){

           toplam+=w;

       }

       System.out.println(toplam);

   }

    public void çıkarma(int... a){

        int fark=0;

        for(int w:a){

            fark-=w;

        }

        System.out.println(fark);


    }


    public void çarpma(int... a) {

        int çarpım = 1;

        for (int w : a) {

            çarpım -= w;

        }

        System.out.println(çarpım);

    }


    public void bölme(int a, int b){
        if(b==0){
            System.out.println("Hiçbir sayı 0'a bölünemez");
        }else{
            System.out.println("Bölme: " + a/b);
        }
   }
}




