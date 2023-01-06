package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //1) While Loop
        int i=1;

        while(i<1){ //While body hiç çalışmaz. While loop'da Zero Execution mümkündür.
                    //Önce şartı kontrol eder, sonra çalışığ çalışmayacağına karar verir.
                    //Önce düşünür sonra hareket eder.
            System.out.println("Sen bir While Loop'sun");
            i++;
        }

        //2)Do-While Loop

        int k=1;

        do{
            System.out.println("Sen bir Do-While Loop'sun");
            k++;
        }while(k<1); // do-while body çalışır.
                    // do-while kullandığınızda loop body si en az 1 kere çalışır.
                    // do-while da "Zero Execution" mümkün değildir.
                    // Kırmızı ışığa bakmadan geçip, kodu çalıştırır, sonra ışığa bakar.
                    // Önce hareket eder, sonra düşünür.



















    }
}
