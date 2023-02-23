package day27encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();//Object i kullanarak variable lara ulaşabiliriz.
                                        //ancak access modifier ı private yaptığımız içn, student classındaki
                                        //variable ı göremeyiz. Encap

        //Student 1;
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2:
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);


        /*

        myStd.setGpa(4.0);
        System.out.println(myStd.getGpa());//4.0
        Student yourStd = new Student();
        System.out.println(yourStd.getGpa());//3.99
         */







    }
}
