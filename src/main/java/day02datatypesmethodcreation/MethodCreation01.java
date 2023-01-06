package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);
        System.out.println(kup);

        int rectangle = getAreaOfRectangle(3,5);
        System.out.println(rectangle);

        int rectanglePerimeter = getPerimeterOfRectangle(8,9);
        System.out.println(rectanglePerimeter);


    }

    public static int add(int a, int b) {return a + b;
    }


        private static int firstTwoMultiplyThirdAdd ( int a, int b, int c){
            return a*b+c;

        }

        static double getCube(double a){
        return a*a*a;

        }


    protected static long multiply(int a, int b){
        return a*b;
    }

    public static int getAreaOfRectangle(int a, int b){
        return a*b;
    }

    private static int getPerimeterOfRectangle(int a, int b){
        return 2*(a+b);

    }


}
