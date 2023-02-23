package Practice.practiceDTNT;

public class ButceRunner {

    public static void main(String[] args) {

        Butce baba = new Butce();//Class ismiyle baba objesini oluşturduk

        System.out.println("Maaş öncesi bütçe : " + Butce.butce);//O

        baba.maaşAl(3000);
        System.out.println("Maaş sonrası bütçe : " + Butce.butce);//3000

        baba.harçlıkAl(100);
        baba.harçlıkHarca(20);

        baba.BütçedenHarca(500);
        System.out.println(baba.harçlık);//80
        System.out.println(Butce.butce);//2400

        Butce anne = new Butce();//Anne objesini Class yoluyla oluşturuyoruz
        anne.maaşAl(5000);
        anne.harçlıkAl(500);
        anne.harçlıkHarca(450);
        System.out.println(Butce.butce);//Genel bütçeyi yazdırmak için, Class ismiyle çağırırız.
        System.out.println(anne.harçlık);//50

        Butce çocuk = new Butce();//Çocuk için bir obje oluşturduk
        çocuk.harçlıkAl(100);
        çocuk.harçlıkHarca(30);
        System.out.println(Butce.butce);//6800
        System.out.println(çocuk.harçlık);//70








    }//main
}//class
