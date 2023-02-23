package buddy.devproje;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static miniProject.biletBus.Bilet.slowPrint;

public class HastaIslemler extends AbstractHastaIslemler {
    static Scanner input = new Scanner(System.in);
    public void hastaMenu(List<Hasta> hastaList ){
           int tercih = 1;
           System.err.println("***********HASTA MENUSU******\n" +
                   "\t  1=Hasta Ekleme\n" +
                   "\t  2=Hasta Listesini Yazdir\n" +
                   "\t  3=Id'den Hasta Bulma\n" +
                   "\t  4=Hasta Silme\n" +
                   "\t  5=Hasta durumu\n"+
                   "\t  6=HastaMenusuCikis\n");
           tercih = input.nextInt();
           switch (tercih) {
               case 1:
                   addPatient( hastaList);
                   break;
               case 2:
                   printPatientList(hastaList);
                   break;
               case 3:
                   findPatientById(hastaList);
                   break;
               case 4:
                   deletePatientById(hastaList);
                   break;
               case 5:
                   statusOfPatient(hastaList);
                   break;
               case 6:
                   exitPatientMenu();
                   break;
               default:
                   System.err.println("lutfen gecerli tercih yapiniz");
           }

    }
    @Override
    public void exitPatientMenu() {
        slowPrint("=======Cikis Menusu======",20);
        System.out.println("Ana menuye donmek icin 1' e basiniz" + "\nCikis icin 0' basiniz");
        int secim = input.nextInt();
        if (secim == 1) {
            Start.start();
        } else if (secim == 0) {
            slowPrint("Cikisiniz gerceklesti",20);
        } else {
            slowPrint("Gecerli bir sayi giriniz",20);
            exitPatientMenu();
        }
    }

    @Override
    public void printPatientList(List<Hasta> hastaList) {
        slowPrint("======HastaMenu======",30);
        List<Hasta> liste = hastaList;
        for (Hasta w : liste) {
            System.out.println( w.getIsim() + "  " + w.getSoyisim() + " " + w.getIdNo()+" "+w.getHastaDurum());
        }
        System.out.println("-----------");
    }
    @Override
    public void addPatient(List<Hasta> hastaList) {
        System.out.println("Eklemek istediginiz hastanin ismini giriniz");
        String hastaIsmi = input.next();
        System.out.println("Eklemek istediginiz hasta soyismini giriniz");
        String soyIsim = input.next();
        System.out.println("Eklemek istediginiz hastanin idsini giriniz");
        int idNo = input.nextInt();
        System.out.println("Eklemek istediginiz hastanin durumunu giriniz");
        PatientStatus  durum= PatientStatus.valueOf(input.next());
        Hasta hasta = new Hasta(hastaIsmi,soyIsim,idNo,durum);
        hastaList.add(hasta);
    }
    @Override
    public String findPatientById(List<Hasta> hastaList) {
        System.out.println("Aradıgınız hasta idyi giriniz");
        int hastaId = input.nextInt();
        for (Hasta ht : hastaList) {
            if (ht.getIdNo()==hastaId) {
                System.out.println("Aradiginiz Hasta : "+ht.getIsim()+" "+  ht.getSoyisim()+" "+  ht.getHastaDurum());
                return ht.getIsim() + " "+ ht.getSoyisim()+ " "+ ht.getHastaDurum();
            }
        }
        System.out.println("Aradiginiz hasta bulundu");
        return null;
    }
    @Override
    public void deletePatientById(List<Hasta> hastaList) {
        System.out.println("Sileceginiz hastanin id'sini giriniz");
        int hastaId = input.nextInt();
        for (Hasta m : hastaList) {
            if (m.getIdNo() == hastaId) {
                hastaList.remove(m);
                break;
            }
            System.out.println(m);
        }
    }
    @Override
    public void statusOfPatient(List<Hasta> hastaList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hasta durumu giriniz"+"\n Kritik icin 1'e"+"\n Acil icin 2'e"+"\n Ayakta tedavi 3'e basiniz");
        int hastaDurum = input.nextInt();
        for (Hasta k :hastaList){
            if (k.getHastaDurum().getVal()==hastaDurum){
                System.out.println("Hasta durumu :" + k.getIsim()+ " isimli hasta " + k.getHastaDurum().getDesc());
            }else if (k.getHastaDurum().getVal()==hastaDurum){
                System.out.println("Hasta durumu :"+k.getIsim()+" isimli hasta "+k.getHastaDurum().getDesc());
            }else if (k.getHastaDurum().getVal()==hastaDurum){
                System.out.println("Hasta durumu :"+k.getIsim()+" isimli hasta "+k.getHastaDurum().getDesc());
            }
        }
    }
}