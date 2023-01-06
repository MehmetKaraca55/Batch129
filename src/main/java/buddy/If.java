package buddy;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir gün girin");
        String gün=input.next().toLowerCase();

        if(gün.equalsIgnoreCase("Cuma")){
            System.out.println("Müslümanlar için kutsal gün");

        }else if(gün.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler için kutsal gün");

        }else if(gün.equalsIgnoreCase("Pazar")){
            System.out.println("Hristiyanlar için kutsal gün");

        }else{
            System.out.println("Bu gün herhangi bir dini grup için kutsal değil" );
        }








    }
    }



