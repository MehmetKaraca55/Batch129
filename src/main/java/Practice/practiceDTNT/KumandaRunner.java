package Practice.practiceDTNT;

public class KumandaRunner {

    public static void main(String[] args) {

        Kumanda tv = new Kumanda(11.5, 7, 9.8 );

        tv.güçDÜğmesi();
        System.out.println(tv.kanalDeğiştirme("B"));
        System.out.println(tv.sesArtırma());
        System.out.println(tv.sesAzaltma());


    }
}
