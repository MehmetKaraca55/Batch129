package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer değiştirmek
    //1.kap: Potatoes 2. kap: tomatoes ==> 1. kap: tomatoes 2.kap: potatoes

    public static void main(String[] args) {

        int a = 12;
        int b = 5; // Swap ten sonra ==> a=5, b=12

        //önce boş tabak oluşturmak lazım
        int temp = 0;

        System.out.println("a: " + a);
        System.out.println("a: " + b);

        // 1. YOL
        //1.adım
        temp = a;

        //2.adım
        a = b;

        //3.adım
        b = temp;

        System.out.println("a: " + a);
        System.out.println("a: " + b);

        // 2. yol
        int x = 12;
        int y = 5;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x: " + x);
        System.out.println("y: " + y);







    }
}
