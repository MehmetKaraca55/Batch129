package mini_Projects.interface_maas_hesapla;

public class InterfaceRunner {
    /*
    Net maaş hesaplayan bir kod yazınız (Interface kullanınız)

    Maaş kriterleri: Çalışanın toplam çalışma yılına göre her yıl için brüt maaşı 100 dolar arttır.
    Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar arttır.
    10 yıl ve üstü çalışma yılı bulunan çalışanların brüt maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.

     */

    public static void main(String[] args) {

        MaasHesapla maasHesaplaAli = new MaasHesapla();
        System.out.println("maasHesaplaAli.netMaas(10000, 11, 160) = " + maasHesaplaAli.netMaas(10000, 11, 160));

        MaasHesapla maasHesaplaVeli = new MaasHesapla();
        System.out.println("maasHesaplaVeli.netMaas(10000, 2,180) = " + maasHesaplaVeli.netMaas(10000, 2, 180));

        MaasHesapla maasHesaplaAyse = new MaasHesapla();
        System.out.println("maasHesaplaAyse.netMaas(11100,5,150) = " + maasHesaplaAyse.netMaas(11100, 5, 150));


    }
}
