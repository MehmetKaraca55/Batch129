package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        //Date Class

        Date myDate = new Date();
        System.out.println(myDate);//Sat Jan 07 23:26:51 EET 2023

        myDate.getTime();
        System.out.println(myDate.getTime());//1673123399389==>1 Ocak 1970'den şuana kadar ki mili saniye miktarı

        //İçinde bulunduğumuz an nasıl alınır? (Current Time)

        LocalDate.now();
        System.out.println(LocalDate.now());//2023-01-07

        LocalTime.now();
        System.out.println(LocalTime.now());//23:34:40.335518900

        LocalDateTime.now();
        System.out.println(LocalDateTime.now());//2023-01-07T23:36:19.394740400

        //Dünyanın herhangi bir saat dilimindeki saati nasıl alırız?

        LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")));//2023-01-07T23:40:46.916856800+01:00[Europe/Paris]

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:16.774906500

        //İleriki bir tarihe nasıl gidilir?

        LocalDate.now().plusYears(7);
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geriki tarihe nasıl gidlir?

        LocalDate.now().minusYears(4);
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //İleriki bir zamana nasıl gidilir?

        LocalTime.now().plusHours(3);
        System.out.println( LocalTime.now().plusHours(3));//02:57:29.531622400

        //Geriki bir zamana nasıl gidilir?
        System.out.println( LocalTime.now().minusMinutes(45));
        //Zamanda belli bir bölümü nasıl alırız?,

        //Zamanda belli bir bölümü nasıl alırız?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());

        //Tarih'te belli bir bölümü nasıl alırız?
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getMonthValue());//1:7

        //İki tarih nasıl karşılaştırılır?
        //02/13/2005 - 03/01/2007
        //İki tarihi oluştururuz. "isBefore()" methodu kullanılır. Boolean döndürür. True ya da false.
        boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007, 03, 01));
        System.out.println(result);//true

        //"isBefore()" ve "isAfter()" iki tane tarihi karşılaştırmak için kullanılır.

        //Tarihlerin formatları nasıl değiştirilir?
        //M-->Tek rakamla ay no'sunu yazar.
        //MM--> İki rakamla ay no'sunu yazar.
        //MMM--> Ay isminin ilk üç harfini yazar.
        //MMMM--> Ay isminin tamamını yazar.

        //d--> Tek rakamla gün no'sunu yazar.
        //dd--> İki rakamla gün no'sunu yazar.

        //yy--> Yılın son iki rakamını yazar.
        //yyyy--> Yılın tamamını yazar.

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));//07/01/2023







    }
}
