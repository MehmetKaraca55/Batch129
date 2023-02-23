package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
        String oluşturmak için, String Class var, StringBuilder Class var, ve StringBuffer kullanılabilir.
        1)StringBuffer, Java'nın String üretmek için oluşturduğu ilk classtır. Java 5'te üretilmiştir.
        2) StringBuffer "Synchronized"dır; StringBuilder "Synchronized" değildir.
        3) StringBuffer "thread-safe"dir; StringBuilder "thread-safe" değildir.
        4) StringBuffer ve StringBuilder ikisi de mutable'dır.

        Note1: Immutable String lazım olduğunda, String Class kullanırız.
        Note2: Mutable String lazım olduğunda, StringBuilder veya StringBuffer kullanırız.
        Note3: StringBuffer "Multi-thread" ve "Synchronization" lazım olduğunda tercih edilir.
                StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.

         */
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

        System.out.println(sbf.capacity());//20==> 16'lık kutu var. 4 karakterde Java'dan geldi. Yapısı bu şekilde.








    }
}
