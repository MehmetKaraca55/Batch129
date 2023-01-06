package Practice.practiceDTNT;

public class MethodReturn {
    //Bir malzeme verir.
    public static void main(String[] args) {

        int alan=dikdörtgeninAlanı(5,10);
        System.out.println("alan = " + alan);

    }//main

    private static int dikdörtgeninAlanı(int a, int b) {
        return a*b;
    }
}//class
