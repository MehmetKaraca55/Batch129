package Practice.practiceDTNT;

public class WhileDoWhileLoop {

    //Ne zaman While Loop, ne zaman DoWhile Loop?


    public static void main(String[] args) {

        //0'dan başlayıp, 3'e kadar birer birer artan kodu yazınız

        int i=0;

        while(i<3){
            System.out.println(i+ " ");//3 data için 4 kontrol yapar.

            i++;
        }

        do{
            System.out.println(i+ " ");//3 data için 3 kontrol yapar.

            i++;

        }while(i<3);





    }//main
}//class
