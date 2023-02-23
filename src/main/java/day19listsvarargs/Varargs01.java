package day19listsvarargs;

public class Varargs01 {

    //Varargs lar method oluştururken, parametre sayısında bize esneklik sağlar.

    // Note: Bir methodda 1 den fazla Varargs parametre kullanılamaz çünkü ikincisi "Unreachable Code" olur.

    // "Varargs", Varargs dışındaki parametrelerle kullanılabilir ama "Varargs" her zaman son parametre olmalıdır.
    //Yoksa, kendinden sonra gelen parametreyi "Unreachable Code" yapar.


    public static void main(String[] args) {

        addTwoNumbers(3,5);

        add(4,5,6,7,9,11);


    }

    //İki sayıyı toplayan method oluşturunuz

    public static void addTwoNumbers(int a, int b){
        System.out.println(a+b);
    }

    //İstediğiniz sayıda sayıyı toplamak için bir method oluşturunuz.

    public static void add(int ... a){

        int sum=0;

        for(int w: a){
            sum=sum + w;

        }

        System.out.println(sum);
    }

}
