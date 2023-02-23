package mini_Projects.abstraction_alan_hesaplama;

public class AbstractionRunner {
    //Dikdörtgen ve ücgenin alanlarını hesaplayan bir kod yazınız (abstraction kullanın)

    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 4));

        Ucgen ucgen=new Ucgen();
        System.out.println("Ücgenin alanı: " + ucgen.alanHesapla(6, 7));


    }



}
