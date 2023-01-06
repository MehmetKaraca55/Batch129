package ssg;

import java.util.Scanner;

public class Swtich02 {
    public static void main(String[] args) {


        // Kullanicidan hangi  ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        String ayIsmi=scan.next();

        switch (ayIsmi){

            case "Mart":
            case "Nisan":
            case "Mayis":
                System.out.println("Ilkbahar");
                break;
            case "Haziran":
            case "temmuz":
            case "Augstos":
                System.out.println("Yaz");
                break;
            case "Eylul":
            case "Ekim":
            case "Kasim":
                System.out.println("Sonbahar");
                break;
            case "Aralik":
            case "Ocak":
            case "Subat":
                System.out.println("Kis");
                break;

            default :
                System.out.println("lutfen gecerli bir ay numarsi girniz");
        }
    }
}
