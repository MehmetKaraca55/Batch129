package day29exceptions;

import java.io.FileInputStream;//io==> InputOutput
import java.io.FileNotFoundException;
import java.io.IOException;

        /*
        1) FileNotFoundException ve IOException, Compile Time Exception'lardır, yani kodu yazarken hata alırız.
        2) FileNotFoundException path'ın doğruluğu ve dosya'nın varlığı ile ilgilidir.
            IpException tüm input ve output işlemleri ile ilgilidir.
        3) IOException Class, FileNotFoundException Class'ın parent'ıdır.
        4) Istenirse, FileNotFoundException yerine IOException da kullanılabilir.
        5) IOException CLass ve FileNotFoundException beraber kullanılacaksa, FileNotFoundException üstte,
            IOException altta kullanılmalıdır.


         */

public class Exceptions03 {

    public static void main(String[] args) {

        //BAzı constructorlar parametreli olur, bazıları parametresiz olur.
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day29exceptions\\File01.txt");

            int k = 0;

            while((k=fis.read()) !=-1){

                System.out.println((char)k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Hi!");


    }
}
