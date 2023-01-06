package Practice.practiceDTNT;

public class HesapMakinesiVarargs {

    public static void main(String[] args) {

        HesapMakinesi işlem = new HesapMakinesi();

        işlem.toplama(3,5,7,8,55,66,88);
        işlem.çıkarma(33,3,22,5,5,6,7);
        işlem.çarpma(3,4,5,6,7,7,88,4);
        işlem.bölme(25,5);

    }
}
