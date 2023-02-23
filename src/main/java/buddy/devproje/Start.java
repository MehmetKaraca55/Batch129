package buddy.devproje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static miniProject.biletBus.Bilet.slowPrint;

public class Start {
    public static void main(String[] args) {
        start();

    }

    public static void start(){
        List<Doktor> doktorListe = new ArrayList<>();
        Doktor doktor1 = new Doktor(10, "elif", "sutcu", "norolog");
        Doktor doktor2 = new Doktor(11, "ahmet", "kaya", "fizyolog");
        Doktor doktor3 = new Doktor(12, "kubra", "aydogdu", "kardiyolog");
        Doktor doktor4 = new Doktor(13, "tuba", "koyuncuoglu", "dahiliye");
        doktorListe.add(doktor1);
        doktorListe.add(doktor2);
        doktorListe.add(doktor3);
        doktorListe.add(doktor4);
        //**************************

        List<Hasta> hastaListe = new ArrayList<>();
        Hasta hasta1 = new Hasta("kemal","has",12,PatientStatus.KIRMIZI_ALAN);
        Hasta hasta2 = new Hasta("kemale","hasin",14,PatientStatus.SARI_ALAN);
        Hasta hasta3 = new Hasta("kamil","hasan",16,PatientStatus.YESIL_ALAN);
        hastaListe.add(hasta1);
        hastaListe.add(hasta2);
        hastaListe.add(hasta3);

        Scanner input = new Scanner(System.in);
        DoktorIslemler doktorIslemler= new DoktorIslemler();
        HastaIslemler hastaIslemler = new HastaIslemler();
        slowPrint("*********Q8 HASTANESINE HOSGELDINIZ********** \n",60);
        int tercih;
        do {
            System.out.println("1-Doktor menusu gidiniz");
            System.out.println("2-Hasta menusuna gidiniz");
            System.out.println("0-Cikis yapiniz");
            System.out.println("Seciminiz:");
            tercih = input.nextInt();
            switch (tercih){
                case 1:
                    doktorIslemler.doktorMenu(doktorListe);
                    break;
                case 2:
                    hastaIslemler.hastaMenu(hastaListe);
                    break;
                case 0:
                    slowPrint("iyi gunler dileriz",30);
                    break;
                default:
                    slowPrint("Hatali giris yaptiniz tekrar deneyin\n",30);
            }
        }while (tercih!=0);
    }




}