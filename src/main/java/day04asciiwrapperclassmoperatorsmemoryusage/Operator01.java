package day04asciiwrapperclassmoperatorsmemoryusage;

public class Operator01 {

    /*
    1) +, -, *, / işlemleri Java'da matematikte kullanıldığı gibi kullanılır.
        Note 1: int / int = int
        note 2: double + int = double olur. Çünkü Javada matematiksel işlemlerde farklı data typleri kullanılırsa
        //sonuç büyük data type ında olur.


        2)Java'da "logical operator" lar vardır.
    AND ve OR işlemleri "logical operator" lardır.
            i) AND (&&) işleminden true alabilmek için her şey true olmalıdır.
                AND işlemi "perfectionist" tir.
                AND işleminde bir tane false sonucu false yapar.


            ii) OR (||)işleminde sonucun false olması için herşeying false olması lazım.

                 OR işlemi polyanna gibidir.

                iii) NOT (!) operatoru true olanı fals, false olanı true yapar

           3) Karşılaştırma Operatorleri (Comparison Operators)
           <, >, <=, >=, ==, !=
           Note: Karşılaştırma operatorlerini kullandığınızda kesinlikle boolean (true veya false) alırsınız

           Note: Biz AND işlemi için "&&" kullanırız ama "&" kullanım da geçerlidir.
                Farkları nedir?
     */


    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >=19;
        System.out.println(first + "-" + second + "-" + third);
        System.out.println(first && second);
        System.out.println(first || second || third);






    }
}









