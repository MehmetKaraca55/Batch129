package day28exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        int a = 16;
        int b = 2;
        String s = "My Java";

        getCharFromString(s, a, b);



    }

    //Note: Coklu exception olma ihtimaline karsı coklu catch kullanabiliriz.
    //Try kısmında birden fazla Exception oluşturma ihtimali olan kod varsa, çoklu catch kullanabilirsiniz.
    //ÇOklu catch kullandığınızda, Exception class'lar arasında, parent-child ilişkisi yoksa, catch'ların sırası
    //önemli değildir. Ama koddaki sıralamaya uymak tavsiye edilir.
    //ÇOklu catch kullandığınızda, Exception class'lar arasında, parent-child ilişkisi varsa, catch'ların sırası
    //önemlidir, child olan class üstte olmalıdır.

    //Exception class'lar arasında, parent-child ilişkisi varsa, ya child class'ı üstte yazarak, child ve parent
    //class'lar için özelleştirilmiş kodlar(Hırsız için 155, Hasta için 112 gibi) veya child' ı hiç kullanmaz,
    //sadece parent ile exception'ları handle etmeye çalışırsınız.
    public static void getCharFromString(String s, int a, int b){

        try {
            int idx = a / b;//==> ArithmeticException

            char ch = s.charAt(idx);//==> StringIndexOutOfBoundException

            System.out.println(ch);//J
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandınız");
        }
    }
}
