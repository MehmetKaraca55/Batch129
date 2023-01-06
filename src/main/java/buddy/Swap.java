package buddy;

public class Swap {
    public static void main(String[] args) {

        int a=12;
        int b=5;

        //1. YOL:

        int temp=0;

        temp=a;
        a=b;
        b=temp;

        System.out.println("a: " + a);
        System.out.println("b : " + b);

        //2.YOL:

        a=a+b;//17
        b=a-b;//12
        a=a-b;//5

    }
}
