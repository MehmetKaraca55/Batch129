package ssg;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("augost");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;

            default :
                System.out.println("lutfen gecerli bir ay numrasi giriniz");
        }


        if (ayNo == 1) {
            System.out.println("Ocak");
        } else if (ayNo==2){
            System.out.println("Subat");
        }else if (ayNo==3){
            System.out.println("Mart");
        }else if (ayNo==4){
            System.out.println("Nisan");
        }else if (ayNo==5){
            System.out.println("Mayis");
        }else if (ayNo==6){
            System.out.println("Haziran");
        }else if (ayNo==7){
            System.out.println("Temmuz");
        }else if (ayNo==8){
            System.out.println("Agustos");
        }else if (ayNo==9){
            System.out.println("Eylul");
        }else if (ayNo==10){
            System.out.println("Ekim");
        }else if (ayNo==11){
            System.out.println("Kasim");
        }else if (ayNo==12){
            System.out.println("Aralik");
        }else {
            System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }




    }
}
