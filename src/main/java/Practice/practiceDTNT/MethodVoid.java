package Practice.practiceDTNT;

public class MethodVoid {

    //Void ile Return arasındaki fark.
    // Void: Aynadaki elmayı görmek gibi.
    public static void main(String[] args) {

        //Dİkdörtgen alanını hesaplayan bir kod yazın

        dikdörtgeninAlanı(5,10); //gerçek bir data olmadığı için void, ekleme, çıkarma vb. hiçbir işlem yapamayız.

    }//main

    private static void dikdörtgeninAlanı(int a, int b) {
        System.out.println(a*b);
    }//method
}//class
