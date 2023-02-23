package mini_Projects.BiletRezervasyon;

import java.util.Scanner;

public class BiletRezervasyon {
    public static void main(String[] args) {
        //1-bilet rezervasyonu için otobüs objesi oluşturalım.

        Bus bus = new Bus("34 ASD 78");//"1", "2", ...

    //4-bilet objesi oluşturalım
        Bilet bilet = new Bilet();
        start(bus, bilet);

    }
    public static void start(Bus bus, Bilet bilet){

        Scanner scan=new Scanner(System.in);
        int select;
        do{
            //6-Kullanıcıdan bilgileri alalım
            System.out.println("Bilet Rezervasyon Sistemine Hoşgeldiniz");
            System.out.println("Lütfen gidilecek mesafe bilgisini KM olarak giriniz:");
            double distance=scan.nextDouble();
            System.out.println("Lütfen yolculuk tipini seçiniz:");
            System.out.println("1.Tek Yön");
            System.out.println("2.Gİdiş-Dönüş");
            int type=scan.nextInt();
            System.out.println("Lütfen yaşınızı giriniz:");
            int age=scan.nextInt();
            System.out.println("Koltuk no seçiniz:");
            System.out.println("Tekli koltuk ücreti %20 daha fazladır");
            System.out.println(bus.seats);
            int seat=scan.nextInt();
            //7-seçilen koltuk no yu listeden kaldıralım
            bus.seats.remove(String.valueOf(seat));//"3" -> "1", "2", "4": Koltuk no'larını String olarak alıyoruz
            //8-Kullanıcıdan alınan değerler geçerli mi?
            boolean check=type==1 || type==2;
            if(distance>0 && age>0 && check){
                //9-bilet fiyatınız hesaplayalım
                bilet.distance=distance;
                bilet.typeNo=type;
                bilet.seatNo=seat;
                //getTotal ile bilet price ı set edelim
                bilet.price=getTotal(bilet, age);
                //bileti yazdıralım
                System.out.println("------------------------------------------------------");
                bilet.printBilet(bus);
            }else{
                System.out.println("Hatalı giriş yaptınız!!!");
            }
            System.out.println("Yeni işlem için herhangi bir sayı girin, çıkış için 0 giriniz:");
            select=scan.nextInt();

        }while (select!=0);
        System.out.println("iyi günler dileriz...");
    }
    private static double getTotal(Bilet bilet, int age){
        double dist= bilet.distance;
        int type= bilet.typeNo;
        int seat= bilet.seatNo;
        double total=0;
        switch (type){
            case 1:
                if(seat%3==0){
                    total=dist*1.2;
                }else{
                    total=dist*1;
                }
                System.out.println("Tutar :"+total);
                break;
            case 2:
                if(seat%3==0){
                    total=dist*2.4;
                }else{
                    total=dist*2;
                }
                System.out.println("Tutar :"+total);
                total=total*0.8;
                System.out.println("Çift yön indirimli tutar :"+total);
                break;
        }
        if(age<=12){
            total=total*0.5;
            System.out.println("Yaş İndirimli Tutar :"+total);
        } else if (age>12 && age<24) {
            total=total*0.9;
            System.out.println("Yaş İndirimli Tutar :"+total);
        }else if(age>65){
            total=total*0.7;
            System.out.println("Yaş İndirimli Tutar :"+total);
        }
        return total;
    }
}
