package day11forloop;

public class ForLoop04 {

    public static void main(String[] args) {

        //Example 1: 5'ten 8'e kadar tamsayıların toplamını veren kodunu yazınız.
        //5+6+7+8=26
        //Toplamayı yaptıktan sonra yepyeni bir değer elde edeceğiz. Bu değeri memory e koymak için yeni bir variable
        //oluşturmalıyız.

        int sum=0;

        for (int i = 5; i < 9; i++) {
            sum=sum+i;

           }
        System.out.println(sum);

        //Example 2: 7'den 9'a kadar tamsayıların çarpımını veren kodunu yazınız.
        //7*8*9==>504

        int multiply=1;
        for (int i = 7; i < 10 ; i++) {
            multiply=multiply*i;

        }
        System.out.println(multiply);


        }
    }

