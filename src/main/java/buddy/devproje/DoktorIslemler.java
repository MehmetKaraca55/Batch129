package buddy.devproje;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static miniProject.biletBus.Bilet.slowPrint;

public class DoktorIslemler extends AbstractDoktorIslemler1 {
    static Scanner input = new Scanner(System.in);
    public void doktorMenu(List<Doktor> doktorList)  {

           int tercih = 1;
           System.err.println("***********DOKTOR MENUSU******\n" +
                   "\t  1=Doktor Ekleme\n" +
                   "\t  2=Doktor Listesini Yazdir\n" +
                   "\t  3=Unvandan Doktor Bulma\n" +
                   "\t  4=IdDoktor Silme\n" +
                   "\t  5=DoktorMenusuCikis\n");

           tercih = input.nextInt();
           switch (tercih) {
               case 1:
                   addDoctor(doktorList);
                   break;
               case 2:
                   printDoctorList(doktorList);
                   break;
               case 3:
                   findDoctorTitle(doktorList);
                   break;
               case 4:
                   deleteDoctorId(doktorList);
                   break;
               case 5:
                   exitDoctorMenu();
                   break;
               default:
                   System.out.println("lutfen gecerli tercih yapiniz");
           }

    }

    @Override
    public void exitDoctorMenu() {
        System.out.printf("%-10s\n","Ana menuye donmek icin 1' e basiniz" + "\nCikis icin 0' basiniz");
        int secim = input.nextInt();
        if (secim == 1) {
            Start.start();
        } else if (secim == 0) {
            slowPrint("Cikisiniz gerceklesti",20);
        } else {
            slowPrint("Gecerli bir sayi giriniz",20);
            exitDoctorMenu();
        }
    }



    @Override
    public void printDoctorList(List<Doktor> doktorListe) {
        slowPrint("======DoktorMenu======",20);
        System.out.println("===IdNo===" + "\n===ismi===" + "\n===soyismi===" + "\n===unvan===");
        List<Doktor> liste = doktorListe;
        for (Doktor w : liste) {
            System.out.println(w.getId() + " " + w.getIsim() + "  " + w.getSoyisim() + " " + w.getUnvan());
        }
        System.out.println("-----------");
    }
    @Override
    public void addDoctor(List<Doktor> doktorListe) {
        System.out.println("Eklemek istediginiz doktor idyi giriniz");
        int doktorid = input.nextInt();
        System.out.println("Eklemek istediginiz doktor ismi giriniz");
        String isim = input.next();
        System.out.println("Eklemek istediginiz doktor soyismi giriniz");
        String soyisim = input.next();
        System.out.println("Eklemek istediginiz doktor unvani giriniz");
        String unvan = input.next();
        Doktor doktor = new Doktor(doktorid, isim, soyisim, unvan);
        doktorListe.add(doktor);
    }
    @Override
    public Doktor findDoctorTitle(List<Doktor> doktorListe) {
        System.out.println("Aradıgınız unvani giriniz");
        String doktorUnvan = input.next();
        for (Doktor dr : doktorListe) {
            if (dr.getUnvan().equals(doktorUnvan)) {
                System.out.println("Aradıgınız doktor " + dr);
                return dr;
            } else {
                return null;
            }
        }
        return null;
    }
    @Override
    public void deleteDoctorId(List<Doktor> doktorListe) {
        System.out.println("Sileceginiz id'yi giriniz");
        int doktorId = input.nextInt();
        for (Doktor m : doktorListe) {
            if (m.getId() == doktorId) {
                doktorListe.remove(m);
                break;
            }
            System.out.println(m);
        }
    }
}