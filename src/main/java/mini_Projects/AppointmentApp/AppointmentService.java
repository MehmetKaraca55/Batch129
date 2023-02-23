package mini_Projects.AppointmentApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3:randevu ile ilgili methodlar
public class AppointmentService {
    Scanner scan=new Scanner(System.in);
    List<Appointment> appointments=new ArrayList<>();

    //5: tarih listesi
    List<LocalDate> dates=new ArrayList<>();

    //6: uygulama başladığında, ertesi günden itibaren 7 günlül bir takvim hazır olmalı

    public AppointmentService() {
        LocalDate day = LocalDate.now();//sistemin kullanıldığı bugunku tarihi gösterir.(17 Şubat)
        for (int i = 0; i < 7; i++) {
            day = day.plusDays(1);//  bu method, mevcut tarihe bir gün ekler--> 18 Şubat
            dates.add(day);
        }
    }

    //7: randevu oluşturabiliriz
    public void getAppointment(){
        //8: randevu takvimi dolu mu
        if(this.dates.isEmpty()){
            System.out.println("Bu hafta tüm randevular dolmuştur. Daha sonra tekrar deneyiniz!!!");

        }else{
            System.out.println("Lütfen isminizi giriniz");
            String name=scan.nextLine();
            System.out.println("Sayın " +name+ "randevu alabileceğiniz tarihler: ");
            for(int i=0; i<this.dates.size();i++){
                System.out.println((i+1)+"-" +this.dates.get(i));
            }
            System.out.println("Randevu almak istediğiniz tarihin numarasını giriniz: ");
            int numberOfDate=scan.nextInt();
            scan.nextLine();

            //9: seçilen tarih no geçerli mi?
            if(numberOfDate>0 && numberOfDate>=this.dates.size()){
                Appointment appointment=new Appointment(name, this.dates.get(numberOfDate-1));
                this.appointments.add(appointment);
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println("Sayın "+name+", RAndevu tarihiniz: "+appointment.getDate());
                System.out.println("Randevu No :"+appointment.getId()+" ile randevunuzu görüntüleyebilirsiniz");
                System.out.println("------------------------------------------------------------------------------------------------------------------");
                this.dates.remove(numberOfDate-1);

            }else{
                System.out.println("Hatalı giriş!!!");
            }

        }
    }

    //10: randevu görüntüleme
    public void printAppointment(){
        System.out.println("RAndevu no giriniz: ");
        boolean isExists=true;
        int appNo=scan.nextInt();
        scan.nextLine();
        for(Appointment appointment: this.appointments){
            if(appointment.getId()==appNo){
                System.out.println("---------------------------------------------------------------------");
                System.out.println(appNo+ "nolu Randevu Bilgileri");
                System.out.println("İsim                   :"+ appointment.getName());
                System.out.println("Randevu tarihi    :"+ appointment.getDate());
                System.out.println("---------------------------------------------------------------------");
                isExists=true;
                break;
            }else{
                isExists=false;
            }
        }
        if(!isExists){
            System.out.println("Randevu bulunamadı!!!");
        }
    }

    //11: Randevuyu iptal etme
    public void cancelAppointment(){
        boolean isExists=true;
        System.out.println("Randevu no giriniz");
        int appNo=scan.nextInt();
        scan.nextLine();

        for(Appointment app: this.appointments){
            if(app.getId()==appNo){
                isExists=true;
                this.dates.add(app.getDate());
                this.appointments.remove(app);
                System.out.println(app.getDate()+"tarihli randevunuz iptal edildi");
                break;
            }else{
                isExists=false;
            }
        }
        if(!isExists){
            System.out.println("Randevu bulunamadı");
        }


    }



}
