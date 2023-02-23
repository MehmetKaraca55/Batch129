package day37lambda;

import Lambda_Recap.Utils;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda02 {
    public Lambda02() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        //1) LambdaTExtFile dosyasi içindeki metni console a yazdıran kodu yazınız
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //2) LambdaTExtFile dosyasi içindeki her characteri upperCase yapiniz.
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //3) LambdaTExtFile dosyasi içinde herhangi bir kelimenin var olup olmadıgını gösteren kodu yazınız.
        boolean result1 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).flatMap(Arrays::stream).anyMatch(t -> t.contains("Java"));//true
        //herhangi bir kelime "Java"ise sonuc "true" olur.

        System.out.println(result1); //true

        //4) LambdaTExtFile dosyasi içindeki her kelimenin "a" içerip içermediğini gösteren kodu yazınız.
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).allMatch(t -> t.contains("a"));
        System.out.println(result2);//false
        //Her kelime "a" harfini içerirse, sonuc "true" olur, aksi halde false olur.


    }

    //5) LambdaTExtFile dosyasi içindeki hiç bir kelimenin "x" içermediğini gösteren kodu yazınız.
    boolean result3 = Files.
            lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
            map(t -> t.split(" ")).
            flatMap(Arrays::stream).noneMatch(t -> t.contains("x"));
    //6) LambdaTExtFile dosyasi içinde "r" ile biten kelimeleri sayan kodu yazınız.
    long result4 = (int) Files.
            lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
            map(t -> t.split(" ")).
            flatMap(Arrays::stream).filter(t -> t.endsWith("r")).count();
    //count() yerine ==> colelct(Collectors.toList()).size(); Bu yol tavsite edilmez.
}

