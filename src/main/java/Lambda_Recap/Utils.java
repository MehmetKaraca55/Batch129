package Lambda_Recap;

public class Utils {
    public static void print(Object a){
        System.out.print(a + " ");
    }

    public static int getSquare(int a){
        return a*a;
    }

    public static int getCube(int a){
        return a*a*a;
    }

public static boolean isEven(String s){
        return s.length()%2==0;
}
}
