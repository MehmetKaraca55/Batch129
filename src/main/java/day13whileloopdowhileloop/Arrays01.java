package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a=12; //bu yapının içinde sadece bir tane data depolanabilir.
                // Ama biz kod yazarken, bir yapının içinde çoklu data depolama ihtiyacı hissederiz.
                // Bir yapının içinde çoklu data depolayabilme için Java "Array" yapısını oluşturmuştur.

            //Array Nasıl Oluşturulur?
            //İLk once, Array in içine hangi tip data koyacağımızı söylemeliyiz.
        // Array elemanlarının "data type" ını ve "eleman sayısını" mutlaka yazılmalıdır.

        String stdNames[] = new String[5];

        //Array console'a nasıl yazdırılır?
        //toString() methodunu kullanmadan sadece array ismi ile yazdırırsanız, Java o array'ın adresini (reference)
        //yazdırır.
        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null]

        //Array'e eleman ekleme nasıl yapılır?

        stdNames[2]="Ajda";
        System.out.println(Arrays.toString(stdNames)); // [null, null, Ajda, null, null]
        stdNames[0]= "Cüneyt";
        stdNames[1]="Kemal";
        stdNames[2]="Ajda";
        stdNames[3]="Ezel";
        stdNames[4]="Beşir";
        System.out.println(Arrays.toString(stdNames));

        // Array'den specific bir elemanı almak,
        System.out.println(stdNames[2]);

        //Example 1: Array'deki her elemanı sonuna "!" işareti koyarak ekrana yazdırınız.

        for (int i = 0; i < stdNames.length;i++){}

        }










}




