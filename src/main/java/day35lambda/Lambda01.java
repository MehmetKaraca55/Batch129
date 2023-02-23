package day35lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    /*
        1)Lambda "Functional programming" dir, digeri "Structured Programming"
        2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
        3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
        4)Lambda, Java'ya "Java 8"de eklendi.

    "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
    "filter()" filtrelemek icin kullanilir.
    "map()" u var olan elemani degistirmek icin kullanilir.
    "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
    Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
    "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
     Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
    "u" ise degerlerini her zaman "stream" den alir.
    get() methodu "Optional Integer"  "Normal Integer"a cevirir.
    sorted() methodu elemanlari kucukten buyuge siralar.
    */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElement2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElement(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMinValue2( nums);
        System.out.println();
        getMinValue5(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);


    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElements1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a
    // space between two consecutive elements.(Functional)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(functional)

    public static void printEvenElement2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    /*
    5) Create a method to print the square of odd list elements on the console in the same line with a
    space between two consecutive elements.
    Bir Listteki tek sayi olan elemanlarin karelerini ayni satirda aralarina bosluk koyarak yazdiran methodu olustur
     */

    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }

    /*
    6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
     Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
     */

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        //Önce elemeyi yaptır, sonra Javaya diğer işleri yaptır.
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }

    /*
       7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

     */

    public static void printSumOfSquareOfDistinctEvenElements(List<Integer> nums) {

        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements

    public static void printProductOfSquareOfDistinctEvenElement(List<Integer> nums) {
        Integer product = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);

        System.out.println(product);


    }

    //9)Create a method to find the "maximum value" from the list elements

    //1.YOL: Java için daha kolay.
    public static void getMaxValue1(List<Integer> nums) {

        //MAximum değeri ararken, Integer.MIN_VALUE kullanmak genel pratiktir.
        //Minimum değeri ararken, Integer.MAX_VALUE kullanmak genel pratiktir.
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.println(max);
    }

    //2.YOL:
    public static void getMaxValue2(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);

        System.out.println(max);

    }

    //3.YOL:
    public static void getMaxValue3(List<Integer> nums){

        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();

        System.out.println(max);

    }
        //10)Create a method to find the "minimum value" from the list elements

    //1.YOL:
    public static void getMinValue1(List<Integer> nums){

        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? t : u);
            System.out.println(min);
        }

        //2.YOL:
        public static void getMinValue2(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t,u)->t>u ? u : t).get();

        }

    //3.YOL
        public static void getMinValue3(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
            System.out.println(min);
        }

        //4.YOL
        public static void getMinValue4(List<Integer> nums){
            Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
            System.out.println(min);
        }

        //5.YOL:
        public static void getMinValue5(List<Integer> nums){
            Integer min = nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
            System.out.println(min);
        }

        //11) Create a nethod to find the minimum value which is greater than 7 and even from the list.
            //7'den büyük, en küçük çift sayı

    public static void getMinGreaterThanSevenEven(List<Integer> nums){

        Integer min = nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();

        System.out.println(min);

    }

}