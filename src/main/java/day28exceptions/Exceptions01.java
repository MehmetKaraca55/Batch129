package day28exceptions;

public class Exceptions01 {

    /*
    1) Exception demek "beklenmedik problem" (Unexpected issue) demektir. Seyehatte benzinin bitmesi, arabanın bozulması gibi...
    2) Gerçek hayatta karşılaştığımız beklenmedik problemler için çözüm yollarımız vardır. Mesela benzin bitince
    yol yardımı ararız.
    Application'larda da beklenmedik problemler için çözüm yolları üretmeliyiz, bu işleme "exception handling" denir.
    3) Exception'lar temel olarak 2'ye ayrılırlar
        i)Compile Time Exception: Siz kod yazarken fark edilir, yazdığınız kodun altı kırmızı çizgi ile çizilir
        ii) Run Time Exception: Siz kod yazarken fark edilmez, ama kodu çalıştırdığınızda, console da hata alırsınız.
    4) Exception'lar dışında "error" diye adlandırdığımız, handle edilemeyen problemler vardır.
        Gerçek hayatta, soförün direksiyon başında hastalanması gibi...handle edilemeyecek durumlar error'dur.
        Application'larda "memory'nin dolması" error'dur.
        İki tür memory var: i) stack memory dolarsa "StackOverFlow Error" alırsınız.
                            ii) Heap memory dolarsa, "OutofMemory Error" alırsınız..
        5) YAzdığımız kod çalışmadığında, problemi bulmak için "Log"lara bakarız
        6) "if else" kullanırsak, oluşabilecek her problemi specific olarak if parantezinin içine yazmamız gerekir.
        Bu da ciddi bir matematik bilgisi gerektirir, ve yazacağımız kodu çok uzatır.
        Ama "try catch"te, Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.



     */

    public static void main(String[] args) {

        int a=12;
        int b=3;

        divide(a,b);
        divide2(a,b);


        //ArithmaticException, yazdığınız kodda matematiksel işlem kullanıyoesanız alınabilecek bir exception'dır.
        //Nasıl handle edileceğini aşağıda yazdık.
    }

    public static void divide(int a, int b){

        try{
        System.out.println(a/b);
    }catch(ArithmeticException e){

            System.out.println("Do not divide by zero");
        }

    }

    //Note: "Exception Hangling"de "If else" kullanılmaz.
    public static void divide2(int a, int b){

        if(b==0){
            System.out.println("Do not divide by zero");
        }else{
            System.out.println(a/b);
        }
    }


}
