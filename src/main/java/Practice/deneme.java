package Practice;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        String fullName= "Mehmet Karaca";
        String initialOfFirstName=fullName.trim().substring(0,1).toUpperCase();
        System.out.println("Initial of first name is: " + initialOfFirstName);

        String initialOfLastName= fullName.trim().split(" ")[1].substring(0,1);
        System.out.println("Initial of last name is: " + initialOfLastName);

        System.out.println(initialOfFirstName+initialOfLastName);









        }


  }
