package day11deneme;

public class C07 {

    public static void main(String[] args) {

        String tv= "$11000";
        String radio= "$1200";
        tv= tv.replace("$", "");
        radio=radio.replace("$", "");

        int t=Integer.valueOf(tv);
        int r= Integer.valueOf(radio);

        System.out.println(t+r);


    }
}
