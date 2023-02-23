package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: Time'ı formatlayınız.

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//21:39:07.379739900


        //hh==> 12'lik saat sistemini kullanır.  --- HH==>24'lük saat sistemini kullanır.
        //hh kullandığınızda a.m veya p.m demelisiniz. Bunu demek için, "a" yazmanız yeterlidir.
        //Yani, "hh:mm a"
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh-mm:ss a");

        System.out.println(dtf.format(myTime));;//09-49:43 ÖS



    }
}
