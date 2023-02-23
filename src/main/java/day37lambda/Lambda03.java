package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1) Tüm "averageScore"ların 91 den büyük olup olmadıgını kontrol eden kodu yazınız
        boolean result1 = coursesList.stream().allMatch(t-> t.getAverageScore()>91);
        System.out.println(result1);//true

        //2) Kurs isimlerinden en az birinin "Turkish" kelimesini içerip içermediğini kontrol eden kodu yazınız.
        boolean result2 = coursesList.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
        System.out.println(result2);//true

        //3) "AverageScore"u en yüksek olan kursun ismini console yazdıran kodu yazınız.
      String name1 =  coursesList.stream().
                                                                 sorted(Comparator.comparing(Course::getAverageScore).
                                                                reversed()).
                                                                findFirst().get().
                                                                 getCourseName();
        System.out.println(name1);//Turkish Night

        //4) Tüm course objectlerini "averageScore"a göre küçükten büyüge diziniz, ve ilk ikisi hariç liste halinde console'a yazdırınız.
        List<Course> myList = coursesList.stream().
                                 sorted(Comparator.comparing(Course::getAverageScore)).
                                skip(2).
                                collect(Collectors.toList());
        System.out.println(myList);

        //5) Tüm course objectlerini averaScore göre küçükten büyüğe diziniz, ve ilk üçünü liste halinde console a yazdırınız.
        List<Course> yourList = coursesList.
                                                                stream().
                                                                sorted(Comparator.comparing(Course::getAverageScore)).
                                                                limit(3).
                                                                collect(Collectors.toList());
        System.out.println(yourList);

        //6) Tüm course objectlerini averaScore göre küçükten büyüğe diziniz, ve üçüncüyü console a yazdırınız.
        Course result5 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                limit(1).findFirst().get();
        System.out.println(result5);


    }

}
