package day12forloopwhileloop;

    public class ForLoop05 {

        public static void main(String[] args) {

            //Hiç sayı kullanmadan 1'den 100'e kadar olan sayıları console'a yazdırın

            for (int i = 'd' / 'd'; i <= 'd'; i++) {
                System.out.print(i + " ");

            }

            //Note1: Bazı loop'lar hiç çalışmayabilir.. Zero Execution

            for (int i = 1; i < 0; i--) {
                System.out.println("Hi");

                //Note 2: Bazı Loop'lar sonsuz defa çalışabilir.
                // Infinite (Sonsuz) Loop lar genellikle "increment/decrement" kısmında yapılan hatadan kaynaklanır.


                //Note 3: Başka bir "Infinite Loop". Loop u kıran şart koymazsak, olur.
                // Loop oluşturduğunuzda, ikinci kısmını yazmazsanız sonsuz loop olur.
                // for(int i=1;    ;     ){// }
                //System.out.println"(Hi")


            }    }
    }



